package edu.ycp.cs320.GroupAQM.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.ycp.cs320.GroupAQM.controller.ModuleController;
import edu.ycp.cs320.GroupAQM.model.Module;

public class AddModuleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ModuleController controller = null;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("Add Module Page Servlet: doGet");
		
		req.getRequestDispatcher("/_view/addModule.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("AddModule Servlet: doPost");
		
		String module_name;
		String errorMessage = null;
		String successMessage = null;
		
		module_name = req.getParameter("moduleName");
		System.out.println(module_name);
		
		if (module_name.equals("") || module_name == null) {
			errorMessage = "Please input a module name";
			req.setAttribute("errorMessage", errorMessage);
		}
		
		// Forward to view to render the result HTML document
		req.getRequestDispatcher("/_view/addModule.jsp").forward(req, resp);
	}
}
