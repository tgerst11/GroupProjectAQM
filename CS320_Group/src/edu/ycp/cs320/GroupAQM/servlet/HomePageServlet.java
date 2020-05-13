package edu.ycp.cs320.GroupAQM.servlet;

import java.io.IOException;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.ycp.cs320.GroupAQM.controller.ModuleController;
import edu.ycp.cs320.GroupAQM.controller.adminController;
import edu.ycp.cs320.GroupAQM.model.Admin;
import edu.ycp.cs320.GroupAQM.model.Module;

public class HomePageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Admin model;
	private adminController admincontroller = null;
	private ModuleController controller = null;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		

		List<Module> modules = null;
		
		controller = new ModuleController();
		
		modules = controller.getAllModules();//prints all module in the database
		
		req.setAttribute("modules",  modules);//passes all modules so it can be displayed (radio buttons)
		
		System.out.println("Home Page Servlet: doGet");

		req.getRequestDispatcher("/_view/homePage.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("Home page Servlet: doPost");
		
		
		String errorMessage = null;
		String name         = null;
		String pw           = null;
		boolean validLogin  = false;

		// Decode form parameters and dispatch to controller
		name = req.getParameter("username");
		pw   = req.getParameter("password");
		
		System.out.println("   Name: <" + name + "> PW: <" + pw + ">");			

		if (name == null || pw == null || name.equals("") || pw.equals("")) {
			errorMessage = "Please specify both user name and password";
			System.out.println("Incomplete");
			req.setAttribute("username", req.getParameter("username"));
			req.setAttribute("password", req.getParameter("password"));

			// Add result objects as request attributes
			req.setAttribute("errorMessage", errorMessage);
			
			List<Module> modules = null;
			controller = new ModuleController();
			modules = controller.getAllModules();
			req.setAttribute("modules",  modules);
			
			req.getRequestDispatcher("/_view/homePage.jsp").forward(req, resp);
		} else {
			model      = new Admin();
			admincontroller = new adminController(model);
			validLogin = admincontroller.validateCredentials(name, pw);

			if (!validLogin) {
				System.out.println("Invalid Login");
				errorMessage = "Username and/or password invalid";
				req.setAttribute("username", req.getParameter("username"));
				req.setAttribute("password", req.getParameter("password"));

				// Add result objects as request attributes
				req.setAttribute("errorMessage", errorMessage);
				
				List<Module> modules = null;
				controller = new ModuleController();
				modules = controller.getAllModules();			
				req.setAttribute("modules",  modules);
				
				req.getRequestDispatcher("/_view/homePage.jsp").forward(req, resp);

				return;
			}
		}

		// Add parameters as request attributes
		req.setAttribute("username", req.getParameter("username"));
		req.setAttribute("password", req.getParameter("password"));

		// Add result objects as request attributes
		req.setAttribute("errorMessage", errorMessage);

		// if login is valid, start a session
		if (validLogin) {
			System.out.println("   Valid login - starting session, redirecting to /addModule");

			// store user object in session
			req.getSession().setAttribute("user", name);

			// redirect to /index page
			resp.sendRedirect(req.getContextPath() + "/addModule");

			return;
		}
	
	}
	
	private String getStringFromParameter(HttpServletRequest req, String name) {
		return req.getParameter(name);
	}
	
}
