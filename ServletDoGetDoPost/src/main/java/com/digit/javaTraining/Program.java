package com.digit.javaTraining;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletOps")
public class Program extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		writer.println("Output from DoGet");
		writer.println(req.getParameter("cname"));
		writer.println(req.getParameter("id"));
		writer.println(req.getParameter("hike_percent"));
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		writer.println("Output from DoPost");
		writer.println(req.getParameter("cname"));
		writer.println(req.getParameter("id"));
		writer.println(req.getParameter("hike_percent"));
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		writer.println("Output from Service");
		writer.println(req.getParameter("cname"));
		writer.println(req.getParameter("id"));
		writer.println(req.getParameter("hike_percent"));
	}

}
