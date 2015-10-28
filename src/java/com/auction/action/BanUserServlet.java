/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auction.action;

import com.auction.entity.Userinfo;
import com.auction.logic.UserinfoBean;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author gp12-mvr2 group
 * This servlet is used to ban the user
 */

@WebServlet(name = "BanUserServlet", urlPatterns = {"/BanUserServlet"})
public class BanUserServlet extends HttpServlet {

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
        int userId = Integer.parseInt(request.getParameter("who"));
        
        Userinfo user = new UserinfoBean().queryUserinfoByUserid(userId);
        user.setBanned(true);
        
        // Set the user's isBanned attribute to true
        int i = new UserinfoBean().merge("isBanned", "true", user.getUserid());
        
        // Check whether ban succuessful or not
        if (i > 0){
            session.setAttribute("banMessage", 1);
        }else{
            session.setAttribute("banMessage", 0); 
        }
        
        response.sendRedirect("/bidapp/viewReportPage.jsp");
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
