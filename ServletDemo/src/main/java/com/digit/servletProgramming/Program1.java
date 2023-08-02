package com.digit.servletProgramming;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Program1 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nameParameter = req.getParameter("name");
		
		PrintWriter writer = resp.getWriter();
		
		writer.println(nameParameter);
	}
}
