/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auction.action;

import com.auction.entity.Message;
import com.auction.entity.Userinfo;
import com.auction.logic.MessageBean;
import com.auction.logic.UserinfoBean;
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
 */

@WebServlet(name = "GetMessegeServlet", urlPatterns = {"/GetMessegeServlet"})
public class GetMessegeServlet extends HttpServlet {
    
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
        
        if(session.getAttribute("messagelist")!=null)
            session.removeAttribute("messagelist");
        
        // Query message with sender id and receiver id
        int sid=Integer.parseInt(request.getParameter("talkerId"));
        int uid=((Userinfo)session.getAttribute("loginUser")).getUserid();
        MessageBean messageBean =  new MessageBean();
        Userinfo talker = new UserinfoBean().queryUserinfoByUserid(sid);
    
        // Get the message with certain page
        int page=1;
        int pagecount=messageBean.getPage(uid,sid);
        List<Message> messageList = messageBean.queryPageByUserid(page, sid, uid);
        session.setAttribute("talker", talker);
        
        if(!messageList.isEmpty())
        {
            session.setAttribute("messagepagecount", pagecount);
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
