package com.digit.javaTests;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SecondIncrement")
public class SecondIncrement extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String empId = req.getParameter("empid");
		String empname = req.getParameter("empname");
		String userName = req.getParameter("username");
		String password = req.getParameter("password");
		int salary = Integer.parseInt(req.getParameter("salary"));
		String experience = req.getParameter("experience");

		int salaryAfterFirstInc = (int) req.getAttribute("salaryAfterFirstInc");
		int salaryAfterSecondInc = salaryAfterFirstInc + (salaryAfterFirstInc * 6 / 100);

		PrintWriter writer = resp.getWriter();
		writer.println("-- Personal Details --");
		writer.println("EmpID: " + empId);
		writer.println("EmpName: " + empname);
		writer.println("UserName: " + userName);
		writer.println("Experience: " + experience);
		writer.println("\n\n");

		writer.println("-- Salary Increments --");
		writer.println("Salary: " + salary);
		writer.println("Salary After First Increment: " + salaryAfterFirstInc);
		writer.println("Salary After Second Increment: " + salaryAfterSecondInc);
	}
}
