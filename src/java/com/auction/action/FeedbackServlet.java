/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auction.action;

import com.auction.entity.Bids;
import com.auction.entity.Feedback;
import com.auction.entity.Listing;
import com.auction.entity.Userinfo;
import com.auction.logic.BidsBean;
import com.auction.logic.FeedbackBean;
import com.auction.logic.ListingBean;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author gp12-mvr2 group
 */

@WebServlet(name = "FeedbackServlet", urlPatterns = {"/FeedbackServlet"})
public class FeedbackServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        HttpSession session=request.getSession();
        int uid=((Userinfo)session.getAttribute("loginUser")).getUserid();
        int score = Integer.parseInt(request.getParameter("radio-choice").toString());
        int bidId = Integer.parseInt(request.getParameter("bidId").toString());      
        String comment = request.getParameter("comment").toString();
        
        Bids bid = new BidsBean().queryBidsByBidid(bidId);
        
        Listing listing = new ListingBean().queryListingByListingid(bid.getListingId());
        
        Feedback feedback = new Feedback();
        feedback.setComments(comment);
        feedback.setFeedbackScore(score);
        feedback.setSenderId(bid.getUserId());
        feedback.setReceiverId(listing.getUserId());
        feedback.setListingId(listing.getId());
        feedback.setTimeSent(new java.sql.Date(Calendar.getInstance().getTimeInMillis()).toString());
        
        int i = new FeedbackBean().save(feedback);
        
        if (i > 0){
            session.setAttribute("sendFeedback", 1);
        }else
        {
            session.setAttribute("sendFeedback", 0);
        }
        
        response.sendRedirect("/bidapp/viewWonAuction.jsp");
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
