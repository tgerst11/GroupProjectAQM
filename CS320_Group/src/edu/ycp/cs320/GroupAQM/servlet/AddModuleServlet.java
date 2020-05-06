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
		
		System.out.println("ModuleData Servlet: doPost");
		
		List<Module> modules = null;
		
		controller = new ModuleController();
		
		modules = controller.getAllModules();
		
		req.setAttribute("modules",  modules);
		// Forward to view to render the result HTML document
		req.getRequestDispatcher("/_view/homePage.jsp").forward(req, resp);
	}
}
