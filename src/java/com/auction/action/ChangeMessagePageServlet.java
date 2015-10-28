/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auction.action;

import com.auction.dao.UserinfoDAO;
import com.auction.entity.Message;
import com.auction.entity.Userinfo;
import com.auction.logic.MessageBean;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author gp12-mvr2 group
 * This servlet is used to change ,message page
 */

@WebServlet(name = "ChangeMessagePageServlet", urlPatterns = {"/ChangeMessagePageServlet"})
public class ChangeMessagePageServlet extends HttpServlet {
    
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
        MessageBean mbean=new MessageBean();
        int pagenum=Integer.parseInt(request.getParameter("pagenum").toString());
        int sid=Integer.parseInt(request.getParameter("sid"));
        int uid=((Userinfo)session.getAttribute("loginUser")).getUserid();
        
        // Get a list of messages with sender id, receiver id and page number
        List<Message> messageList = mbean.queryPageByUserid(pagenum, sid, uid);
        
        // Sent message list to attribute
        if(!messageList.isEmpty())
        {
            session.setAttribute("messagelist", messageList);
            
        }        
        response.sendRedirect("/bidapp/conversationPage.jsp");
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
