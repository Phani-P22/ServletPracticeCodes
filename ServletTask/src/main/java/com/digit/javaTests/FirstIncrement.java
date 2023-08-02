package com.digit.javaTests;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FirstIncrement")
public class FirstIncrement extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int salary = Integer.parseInt(req.getParameter("salary"));

		int salaryAfterFirstInc = salary + (salary * 23 / 100);

		req.setAttribute("salaryAfterFirstInc", salaryAfterFirstInc);

		RequestDispatcher reqDisp = req.getRequestDispatcher("/SecondIncrement");
		reqDisp.forward(req, resp);
	}
}