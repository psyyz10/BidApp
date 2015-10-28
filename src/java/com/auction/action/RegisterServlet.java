package com.auction.action;

import java.io.IOException;

import javax.swing.JOptionPane;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.auction.entity.Userinfo;
import com.auction.logic.RegisterBean;
import java.io.PrintWriter;
import javax.servlet.http.HttpSession;

/**
 *
 * @author gp12-mvr2 group
 */

public class RegisterServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public RegisterServlet() {
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
//                PrintWriter out = response.getWriter();
//                out.write("sadf");
//                out.close();
               // System.out.println("asdf");
		Userinfo user = new Userinfo();
		String userName = request.getParameter("Username");
                String password = request.getParameter("Password");
		String firstName = request.getParameter("FirstName");
		String lastName = request.getParameter("LastName");
                String houseNumber = request.getParameter("HouseNumber");
                String streetName = request.getParameter("StreetName");
                String postcode = request.getParameter("Postcode");
                String city = request.getParameter("City");
                String county = request.getParameter("County");
                String country = request.getParameter("Country");
                String emailAddress = request.getParameter("EmailAddress");
                String memberSince = request.getParameter("MemberSince");
                
                user.setUsername(userName);
                user.setUserpwd(userName);
                user.setFirstName(firstName);
                user.setLastName(lastName);
                user.setHouseNumber(Integer.parseInt(houseNumber));
                user.setStreetName(streetName);
                user.setPostcode(postcode);
                user.setCity(city);
                user.setCounty(county);
                user.setCountry(country);
                user.setEmailAddress(emailAddress);
                user.setMemberSince(memberSince);
		
		int i=saveCommonUser(user);
		if(i>0)
		{
			response.sendRedirect("/bidapp/regSuccess.jsp");
                        HttpSession session=request.getSession();
                        session.setAttribute("loginUser", user);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "The server is busy, please try again later!");
			response.sendRedirect("/bidapp/register.jsp");
		}
	}
	public int saveCommonUser(Userinfo user)
	{
		RegisterBean rbean = new RegisterBean();
		return rbean.saveCommonUser(user);
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
