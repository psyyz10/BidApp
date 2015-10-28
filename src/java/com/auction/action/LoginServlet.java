package com.auction.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.auction.dao.UserinfoDAO;
import com.auction.entity.Userinfo;
import com.auction.logic.LoginBean;
import java.io.PrintWriter;

/**
 *
 * @author gp12-mvr2 group
 */

public class LoginServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public LoginServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		String username = request.getParameter("Username");
		String userpwd = request.getParameter("Password");
		LoginBean lbean = new LoginBean();
		boolean falg = lbean.isUser(username, userpwd);
                HttpSession session=request.getSession();
              
		if(falg)
		{
			UserinfoDAO udao = new UserinfoDAO();
			Userinfo loginUser = udao.queryUserinfoByUsername(username);
                        
                        // If the user is banned, give some worning 
			if(loginUser.isBanned())
			{
				session.setAttribute("loginMessage", "Your account has been closed! Please contact the administrator!");
				response.sendRedirect("/bidapp/login.jsp");
				return;
			}
                        else if(loginUser.isAmin())
			{
				session.setAttribute("loginUser", loginUser);
				response.sendRedirect("/bidapp/reportsPage.jsp");
				return;
			}
			
                        session.setAttribute("loginUser", loginUser);
                        response.sendRedirect("/bidapp/home.jsp");
			return;
		}
		session.setAttribute("loginMessage", "User name or password is wrong");
		response.sendRedirect("/bidapp/login.jsp");
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occure
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
