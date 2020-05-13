package edu.ycp.cs320.GroupAQM.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.ycp.cs320.GroupAQM.apiConnection.apiParseData;
import edu.ycp.cs320.GroupAQM.controller.ModuleController;
import edu.ycp.cs320.GroupAQM.model.Module;

public class AddModuleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ModuleController controller = null;
	private Module mod = new Module();
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
		
		//if no input and submitted
		if (module_name.equals("") || module_name == null) {
			errorMessage = "Please input a module name";
			req.setAttribute("errorMessage", errorMessage);
		}
		
		//checks to see if the name matches any of the available API cities. Note: There are wayy more than this.
		if (module_name.equals("Allentown") || module_name.equals("Carlisle") || module_name.equals("Erie") || module_name.equals("Johnstown") || 
				module_name.equals("Philadelphia") || module_name.equals("Pittsburgh") || module_name.equals("Reading") || module_name.equals("Scranton") ||
				module_name.equals("State College")) 
		{
			successMessage = "Module has been found and added to database!";
			req.setAttribute("successMessage", successMessage);
			
			controller = new ModuleController();
	
			apiParseData populate = new apiParseData();
			populate.setModel(mod);

			
			try {
				populate.call(module_name);//populates new city module with API data
			}
			catch (Exception e){
				System.out.println("There's been an error adding a new tuple");
			}
			//Testing:
			//System.out.println("Added Data " + mod.getTimeStamp());
			//System.out.println("Last date tuple in database " + controller.getModuleData(module_name).get(controller.getModuleData(module_name).size() - 1).getTimeStamp());
			controller.addModule(mod);//adds populated module to the database
			
		}else {
			errorMessage = "Sorry about that but we only have this site set up for some select cities in PA.  These cities are Allentown, Carlisle, Erie, Johnstown, Philadelphia, Pittsburgh, Reading, Scranton, and State College";
			req.setAttribute("errorMessage", errorMessage);
		}
		
		// Forward to view to render the result HTML document
		req.getRequestDispatcher("/_view/addModule.jsp").forward(req, resp);
	}
}
