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
import edu.ycp.cs320.GroupAQM.moduleDB.AddData;


public class ModuleDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ModuleController controller = null;
	private Module mod = new Module();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		List<Module> data = null;
		controller = new ModuleController();
	
		
		//This gets the city that we want data for
		String module_name = req.getParameter("module");
		
		
		apiParseData populate = new apiParseData();
		populate.setModel(mod);

		
		try {
		populate.call(module_name);
		}
		catch (Exception e){
			System.out.println("There's been an error adding a new tuple");
		}
		System.out.println(mod.getDate());
		System.out.println(controller.getModuleData(module_name).get(controller.getModuleData(module_name).size() - 1).getDate());
		//now we have a module (mod) that has the new information 
		if (mod.getDate() != controller.getModuleData(module_name).get(controller.getModuleData(module_name).size() - 1).getDate() && mod.getTime() != controller.getModuleData(module_name).get(controller.getModuleData(module_name).size()-1).getTime()) {
			System.out.println(mod.getDate());
			System.out.println(controller.getModuleData(module_name).get(controller.getModuleData(module_name).size() - 1).getDate());
			controller.addData(mod);
		}
		
		data = controller.getModuleData(module_name);
		
		req.setAttribute("data",  data);
		req.setAttribute("moduleName", module_name);
		System.out.println("ModuleData Servlet: doGet");
		
		req.getRequestDispatcher("/_view/moduleData.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("ModuleData Servlet: doPost");
		// Forward to view to render the result HTML document
		req.getRequestDispatcher("/_view/moduleData.jsp").forward(req, resp);
	}
	
}
