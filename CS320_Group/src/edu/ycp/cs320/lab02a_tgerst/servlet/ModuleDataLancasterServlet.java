package edu.ycp.cs320.lab02a_tgerst.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ModuleDataLancasterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		ArrayList<String> Location = new ArrayList();
		Location.add("35.6762° N");
		Location.add("139.6503° E");
		Location.add("5,000 feet");
		
		ArrayList<String> Reading = new ArrayList();
		Reading.add("0.04%");
		Reading.add("78%");
		Reading.add("21%");
		Reading.add("0.9%");
		Reading.add("0.000187%");
		Reading.add("0.0018%");
		Reading.add("0.0005%");
		Reading.add("0.0001%");
		

		
		req.setAttribute("location0", Location.get(0));
		req.setAttribute("location1", Location.get(1));
		req.setAttribute("location2", Location.get(2));
		
		req.setAttribute("reading0", Reading.get(0));
		req.setAttribute("reading1", Reading.get(1));
		req.setAttribute("reading2", Reading.get(2));
		req.setAttribute("reading3", Reading.get(3));
		req.setAttribute("reading4", Reading.get(4));
		req.setAttribute("reading5", Reading.get(5));
		req.setAttribute("reading6", Reading.get(6));
		req.setAttribute("reading7", Reading.get(7));


		System.out.println("ModuleData Servlet: doGet");	
		
		// call JSP to generate empty form
		req.getRequestDispatcher("/_view/moduleDataLancaster.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("ModuleData Servlet: doPost");
		

		// holds the error message text, if there is any
		String errorMessage = null;

		// result of calculation goes here
		Double result = null;
		
		
		// Add parameters as request attributes
		// this creates attributes named "first" and "second for the response, and grabs the
		// values that were originally assigned to the request attributes, also named "first" and "second"
		// they don't have to be named the same, but in this case, since we are passing them back
		// and forth, it's a good idea
		req.setAttribute("second", req.getParameter("second"));
		req.setAttribute("third", req.getParameter("third"));
		
		
		// add result objects as attributes
		// this adds the errorMessage text and the result to the response
		req.setAttribute("errorMessage", errorMessage);
		//req.setAttribute("result", model.getResult());
		
		// Forward to view to render the result HTML document
		req.getRequestDispatcher("/_view/moduleDataLancaster.jsp").forward(req, resp);
	}

	// gets double from the request with attribute named s
	private Double getDoubleFromParameter(String s) {
		if (s == null || s.equals("")) {
			return null;
		} else {
			return Double.parseDouble(s);
		}
	}
}
