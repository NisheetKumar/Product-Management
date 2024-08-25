package com.Test;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class TaxDeductionServlet {
 
	public void doget(HttpRequest req,HttpResponse res) throws IOException {
		PrintWriter out =res.getWriter();
		out.println("Your Tax Deduction is:70000");
		out.println("Your Total Net Income is:190000");
	}
}
