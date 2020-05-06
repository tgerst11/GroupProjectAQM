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


public class ModuleDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ModuleController controller = null;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		List<Module> data = null;
		controller = new ModuleController();
		
		String module_name = req.getParameter("module");
		
		System.out.println(module_name);
		
		data = controller.getModuleData(module_name);
		
		req.setAttribute("data",  data);
		req.setAttribute("moduleName", module_name);
		System.out.println("ModuleData Servlet: doGet");
		System.out.println(module_name);
		
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