/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auction.action;

import com.auction.entity.Message;
import com.auction.logic.MessageBean;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Calendar;
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
 */

@WebServlet(name = "SendMessageServlet", urlPatterns = {"/SendMessageServlet"})
public class SendMessageServlet extends HttpServlet {
    
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
        String followMessage=request.getParameter("followmessage");
        int senderId = Integer.parseInt(request.getParameter("senderId"));
        int receiverId = Integer.parseInt(request.getParameter("receiverId"));
        int i = save(senderId, receiverId, followMessage);
        
        // check whether save success
        if(i>0)
        {
            session.setAttribute("followmessage", 1);
            MessageBean messageBean =  new MessageBean();
            
            // Get a page from a message
            int page=1;
            int pagecount = messageBean.getPage(senderId,receiverId);
            List<Message> messageList = messageBean.queryPageByUserid(page, senderId, receiverId);
            
            if(!messageList.isEmpty())
            {
                session.setAttribute("messagepagecount", pagecount);
                session.setAttribute("messagelist", messageList);               
            }
        }
        else
        {
            session.setAttribute("followmessage", 0);
        }
        
        response.sendRedirect("/bidapp/conversationPage.jsp");
    }
    
    // save message to database
    public int save(int senderId, int receiverId,String content)
    {
        MessageBean mbean = new MessageBean();
        Message message = new Message();
        message.setSenderId(senderId);
        message.setReceiverId(receiverId);
        message.setMessageContent(content);
        message.setTimeSent(new java.sql.Date(Calendar.getInstance().getTimeInMillis()).toString());
        
        return mbean.save(message);
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
