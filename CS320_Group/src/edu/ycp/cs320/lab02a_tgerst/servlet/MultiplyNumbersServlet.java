package edu.ycp.cs320.lab02a_tgerst.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.ycp.cs320.lab02a_tgerst.controller.NumbersController;
import edu.ycp.cs320.lab02a_tgerst.model.Numbers;

public class MultiplyNumbersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		System.out.println("MultiplyNumbers Servlet: doGet");	
		
		// call JSP to generate empty form
		req.getRequestDispatcher("/_view/multiplyNumbers.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("MultiplyNumbers Servlet: doPost");
		

		// holds the error message text, if there is any
		String errorMessage = null;

		// result of calculation goes here
		Double result = null;
		
		Numbers model = new Numbers();
		
		NumbersController controller = new NumbersController();
		
		controller.setModel(model);
		
		// decode POSTed form parameters and dispatch to controller
		try {
			Double first = getDoubleFromParameter(req.getParameter("first"));
			Double second = getDoubleFromParameter(req.getParameter("second"));

			// check for errors in the form data before using is in a calculation
			if (first == null || second == null) {
				errorMessage = "Please specify two numbers";
			}
			// otherwise, data is good, do the calculation
			// must create the controller each time, since it doesn't persist between POSTs
			// the view does not alter data, only controller methods should be used for that
			// thus, always call a controller method to operate on the data
			else {
				
				model.setNum1(first);
				System.out.println(model.getNum1());
				model.setNum2(second);
				System.out.println(model.getNum2());
				model.setResult(controller.multiply(first, second));
				System.out.println(model.getResult());
				
			}
		} catch (NumberFormatException e) {
			errorMessage = "Invalid double";
		}
		
		// Add parameters as request attributes
		// this creates attributes named "first" and "second for the response, and grabs the
		// values that were originally assigned to the request attributes, also named "first" and "second"
		// they don't have to be named the same, but in this case, since we are passing them back
		// and forth, it's a good idea
		//req.setAttribute("first", req.getParameter("first"));
		//req.setAttribute("second", req.getParameter("second"));
		
		// add result objects as attributes
		// this adds the errorMessage text and the result to the response
		//req.setAttribute("errorMessage", errorMessage);
		//req.setAttribute("result", model.getResult());
		
		req.setAttribute("info", model);
		
		// Forward to view to render the result HTML document
		req.getRequestDispatcher("/_view/multiplyNumbers.jsp").forward(req, resp);
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