package com.Test;

import java.io.IOException;





public class CalculatorServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		String FirstName=req.getParameter("f_name");
		String LastName=req.getParameter("l_name");
		// out.println(FirstName+" "+LastName   );
	
		RequestDispatcher tax=req.getRequestDispatcher("test.html");
		tax.forward(req, res);	
	}
}
