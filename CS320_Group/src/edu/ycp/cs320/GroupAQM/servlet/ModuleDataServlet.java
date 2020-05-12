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
		String aqi_message=null;
		String main_pol = null;
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
	
		if (mod.getTimeStamp().equals(controller.getModuleData(module_name).get(controller.getModuleData(module_name).size() - 1).getTimeStamp())) {
			
			
		}else {
			//System.out.println("Added Data " + mod.getTimeStamp());
			//System.out.println("Last date tuple in database " + controller.getModuleData(module_name).get(controller.getModuleData(module_name).size() - 1).getTimeStamp());
			controller.addData(mod);
		}
		
		data = controller.getModuleData(module_name);
		
		aqi_message = controller.aqiMessage(mod.getAQI());
		
		main_pol = controller.mainPol(mod.getMainPol());
		
		req.setAttribute("data",  data);
		req.setAttribute("aqiMessage", aqi_message);
		req.setAttribute("mainPolMessage", main_pol);
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
