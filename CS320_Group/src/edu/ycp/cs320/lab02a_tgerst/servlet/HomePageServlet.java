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
		
		//implement when we have the persistant admin data working
		//adminController controller = new adminController(password, password);

		// holds the error message text, if there is any
		String errorMessage = null;

		
		// decode POSTed form parameters and dispatch to controller
	

		
			String username = getStringFromParameter(req,"username");
			String password = getStringFromParameter(req,"password");
			
			System.out.println(username);
			System.out.println(password);
			
			// check for errors in the form data before using is in a calculation
			if (username == null || password == null) {
				errorMessage = "Please specify both the username and password";
			}
			// otherwise, data is good, do the calculation
			// must create the controller each time, since it doesn't persist between POSTs
			// the view does not alter data, only controller methods should be used for that
			// thus, always call a controller method to operate on the data
				
				
			if(username == "admin" && password == "p@ssword")
			{
				req.getRequestDispatcher("/_view/addModule.jsp").forward(req, resp);
				System.out.println("ADMIN PAGE");
			}		
	
		
		// add result objects as attributes
		// this adds the errorMessage text and the result to the response
		//req.setAttribute("errorMessage", errorMessage);
		//req.setAttribute("result", result);
		
		// Forward to view to render the result HTML document
		

		req.getRequestDispatcher("/_view/addModule.jsp").forward(req, resp);
		System.out.println("HOME PAGE");

	}
	
	private String getStringFromParameter(HttpServletRequest req, String name) {
		return req.getParameter(name);
	}
	
}
