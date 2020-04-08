package edu.ycp.cs320.lab02a_tgerst.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.ycp.cs320.lab02a_tgerst.controller.adminController;
import edu.ycp.cs320.lab02a_tgerst.model.Admin;

public class HomePageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	adminController controller;
	String username;
	String password;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("Home Page Servlet: doGet");
		
		req.getRequestDispatcher("/_view/homePage.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("Home page Servlet: doPost");
		

		// holds the error message text, if there is any
		String errorMessage = null;

		
		// decode POSTed form parameters and dispatch to controller
	
		if (req.getParameter("submit") != null) {
			username = getInitParameter(req.getParameter("username"));
			password = getInitParameter(req.getParameter("password"));
			System.out.println(username);
			System.out.println(password);
			System.out.println("IMPORTED");
		}
		// check for errors in the form data before using is in a calculation
		if (username == null || password == null) {
			errorMessage = "Please specify both the username and password";
		}
		// otherwise, data is good, do the calculation
		// must create the controller each time, since it doesn't persist between POSTs
		// the view does not alter data, only controller methods should be used for that
		// thus, always call a controller method to operate on the data
		else {
			controller = new adminController(username, password);
			
			if(controller.checkUsername() == true && controller.checkPassword())
			{
				req.getRequestDispatcher("/_view/adminPage.jsp").forward(req, resp);
				System.out.println("ADMIN PAGE");
			}
		}		
		
		req.setAttribute("username", req.getParameter("username"));
		req.setAttribute("password", req.getParameter("password"));
		
		// add result objects as attributes
		// this adds the errorMessage text and the result to the response
		//req.setAttribute("errorMessage", errorMessage);
		//req.setAttribute("result", result);
		
		// Forward to view to render the result HTML document
		
		req.getRequestDispatcher("/_view/homePage.jsp").forward(req, resp);
		System.out.println("HOME PAGE");
	}
}
