/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auction.action;

import com.auction.entity.Userinfo;
import com.auction.logic.IOWorkBean;
import com.auction.logic.UserinfoBean;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

/**
 *
 * @author gp12-mvr2 group
 */

@MultipartConfig
public class UploadImageServlet extends HttpServlet {
    
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
        response.setContentType("text/html;charset=UTF-8");
        //Part filePart = request.getPart("file"); // Retrieves <input type="file" name="file">
        //String clientpath = getFilename(filePart);
        String clientpath=request.getParameter("file");
        //String clientpath=request.getParameter("a");
        HttpSession session=request.getSession();
        String servicepath=session.getServletContext().getRealPath("image");
        
        
        PrintWriter out = response.getWriter();
        
        /* TODO output your page here. You may use following sample code. */
        
        
        try {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet" + clientpath + "++"+ servicepath + " NewServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet NewServlet at " + clientpath + "++"+ servicepath + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
                IOWorkBean io=new IOWorkBean();
                String photoPath=io.writeImage(servicepath, clientpath);
                UserinfoBean userinfoBean = new UserinfoBean();
                Userinfo user = (Userinfo)session.getAttribute("loginUser");
                user.setPhotoPath(photoPath);
                userinfoBean.save(user);
                response.sendRedirect("/bidapp/profilePage.jsp");
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
    
    private static String getFilename(Part part) {
        for (String cd : part.getHeader("content-disposition").split(";")) {
            if (cd.trim().startsWith("filename")) {
                String filename = cd.substring(cd.indexOf('=') + 1).trim().replace("\"", "");
                return filename.substring(filename.lastIndexOf('/') + 1).substring(filename.lastIndexOf('\\') + 1); // MSIE fix.
            }
        }
        return null;
    }
}
