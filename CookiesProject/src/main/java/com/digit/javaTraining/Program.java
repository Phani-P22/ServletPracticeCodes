package com.digit.javaTraining;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cook")
public class Program extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userName = req.getParameter("userName");
		String password = req.getParameter("password");
		
		Cookie c1 = new Cookie("UserName", userName);
		Cookie c2 = new Cookie("Password", password);
		
		resp.addCookie(c2);
		resp.addCookie(c1);
		
		resp.getWriter().println("Saved");
	}
}
