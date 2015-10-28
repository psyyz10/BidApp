/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auction.action;

import com.auction.entity.Listing;
import com.auction.entity.Type;
import com.auction.entity.Userinfo;
import com.auction.logic.IOWorkBean;
import com.auction.logic.ListingBean;
import com.auction.logic.RegisterBean;
import com.auction.logic.TypeBean;
import com.auction.logic.UserinfoBean;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import javax.swing.JOptionPane;

/**
 *
 * @author gp12-mvr2 group
 * This page is used to create a new auction
 */
@MultipartConfig
@WebServlet(name = "CreateAuctionServlet", urlPatterns = {"/CreateAuctionServlet"})
public class CreateAuctionServlet extends HttpServlet {
    
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
        HttpSession session=request.getSession();
        response.setContentType("text/html");
        
        SimpleDateFormat format = new SimpleDateFormat(
                "yyyy-MM-dd HH:mm:ss");
        int uid=((Userinfo)session.getAttribute("loginUser")).getUserid();
        String listingTitle = request.getParameter("name");
        String type = request.getParameter("type");
        double startPrice = Double.parseDouble(request.getParameter("startPrice"));
        double postagePrice = Double.parseDouble(request.getParameter("postage"));
        //double postagePrice = Double.parseDouble(request.getParameter("name"));
        String description = request.getParameter("description");
        
        String startTime = format.format(new Date());
        String endTime = request.getParameter("year") + "-" + request.getParameter("month") + "-" +
                request.getParameter("day") + " 00:00:00";
        //Part filePart = request.getPart("file"); // Retrieves <input type="file" name="file">
        //String clientpath = getFilename(filePart);
        //String servicepath = session.getServletContext().getRealPath("image");
        
        //IOWorkBean io=new IOWorkBean();
        //String photoPath=io.writeImage(servicepath, clientpath);
                
        Listing listing = new Listing();
        
        //listing.setImagePath(photoPath);
        listing.setDescription(description);
        listing.setEndTime(endTime);
        listing.setListingTitle(listingTitle);
        listing.setStartPrice(startPrice);
        listing.setStartTime(startTime);
        listing.setUserId(uid);
        listing.setPostagePrice(postagePrice);
        listing.setTypeId((new TypeBean().queryTypeByTypename(type)).getTid());
        
        int i = saveListing(listing);
        
        if(i>0)
        {
            response.sendRedirect("/bidapp/myAuctionsPage.jsp");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "The server is busy, please try again later!");
            response.sendRedirect("/bidapp/createAuctionPage.jsp");
        }
    }
    
    // This page is used to get file name part
    private static String getFilename(Part part) {
        for (String cd : part.getHeader("content-disposition").split(";")) {
            if (cd.trim().startsWith("filename")) {
                String filename = cd.substring(cd.indexOf('=') + 1).trim().replace("\"", "");
                return filename.substring(filename.lastIndexOf('/') + 1).substring(filename.lastIndexOf('\\') + 1); // MSIE fix.
            }
        }
        return null;
    }
    
    private int saveListing (Listing listing)
    {
        ListingBean lbean = new ListingBean();
        return lbean.save(listing);
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
