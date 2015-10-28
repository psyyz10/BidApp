package com.auction.action;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import com.auction.entity.Bids;
import com.auction.entity.Listing;
import com.auction.entity.Userinfo;
import com.auction.logic.BidsBean;
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

@WebServlet(name = "BidItemServlet", urlPatterns = {"/BidItemServlet"})
public class BidItemServlet extends HttpServlet {

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
        HttpSession session = request.getSession();
        response.setContentType("text/html");
        //response.sendRedirect("/bidapp/search.jsp");
        //response.sendRedirect("/bidapp/bidPage.jsp");
        double bidValue = Double.parseDouble(request.getParameter("bidValue"));
        //int checkbox[] = Integer.parseInt(request.getParameter("check_box"));
        double proxyValue = Double.parseDouble(request.getParameter("proxyValue"));
        //int follow = Integer.parseInt(request.getParameter("follow"));
        Listing listing = (Listing)session.getAttribute("listing");
        
        Bids bid = new Bids();
        bid.setBidAmount(bidValue);
        bid.setBidTime(new java.sql.Date(Calendar.getInstance().getTimeInMillis()).toString());
        bid.setListingId(listing.getId());
        int i;
        
//        if (proxy > 0)
//            bid.setMaximumBid(proxyValue);
        
        bid.setUserId(((Userinfo)session.getAttribute("loginUser")).getUserid());
        
        BidsBean bbean = new BidsBean();
        Bids maxbid = bbean.queryListingByHighestPrices(listing.getId());
        
        if (maxbid == null){
            i = bbean.save(bid);
        }
        else{
        double maxbidAmount = maxbid.getBidAmount();
        double maxbidProxy = maxbid.getMaximumBid();
        
        //proxy bidding
//        if (proxy > 0){
//            if (maxbidAmount < bidValue){
//                if (maxbidProxy > bidValue){
//                    if (maxbidProxy > proxyValue){
//                        maxbid.setBidAmount(proxyValue + 0.01);
//                        bbean.updateBidAmount(maxbid.getBidId(), bid.getBidAmount());
//                    }else{
//                        bid.setBidAmount(maxbidProxy + 0.01);
//                    }
//                }    
//            }
//        }
        
        i = bbean.save(bid);
        }
        if (i > 0){
            session.setAttribute("bidMessage", 1);
        }else{
            session.setAttribute("bidMessage", 0); 
        }
        
        
       response.sendRedirect("/bidapp/bidPage.jsp");
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
