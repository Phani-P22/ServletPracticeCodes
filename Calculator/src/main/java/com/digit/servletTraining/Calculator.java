package com.digit.servletTraining;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Calculator extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int number1 = Integer.parseInt(req.getParameter("Number-1"));
		int number2 = Integer.parseInt(req.getParameter("Number-2"));

		PrintWriter writer = resp.getWriter();

		writer.println("Addition of " + number1 + " and " + number2 + " is " + (number1 + number2));
		writer.println("Subtraction of " + number1 + " and " + number2 + " is " + (number1 - number2));
		writer.println("Multiplication of " + number1 + " and " + number2 + " is " + (number1 * number2));
	}
}
