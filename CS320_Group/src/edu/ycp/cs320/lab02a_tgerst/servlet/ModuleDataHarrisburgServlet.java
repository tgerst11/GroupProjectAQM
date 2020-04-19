package edu.ycp.cs320.lab02a_tgerst.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import edu.ycp.cs320.lab02a_tgerst.apiConnection.apiParseData;
import edu.ycp.cs320.lab02a_tgerst.model.Module;


public class ModuleDataHarrisburgServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		Module mod = new Module();
		
		apiParseData controller = new apiParseData();
		
		controller.setModel(mod);
		//populate the model with API data
		try {
		controller.call();
		} 
		catch (Exception e){
			System.out.println("There has been an error populating your model");
		}
		
		req.setAttribute("module", mod);
		
		System.out.println("ModuleData Servlet: doGet");	
		
		req.getRequestDispatcher("/_view/moduleDataHarrisburg.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("ModuleData Servlet: doPost");
		
		
		// Forward to view to render the result HTML document
		req.getRequestDispatcher("/_view/moduleDataHarrisburg.jsp").forward(req, resp);
	}
	
}
