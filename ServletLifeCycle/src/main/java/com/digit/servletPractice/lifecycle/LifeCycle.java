package com.digit.servletPractice.lifecycle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LifeCycle")
public class LifeCycle extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Inside the Service Method");
		System.out.println("Inside the Service Method");
	}

	@Override
	public void destroy() {
		System.out.println("Inside the Destroy Method");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("Inside the Init Method");
	}
	
}
