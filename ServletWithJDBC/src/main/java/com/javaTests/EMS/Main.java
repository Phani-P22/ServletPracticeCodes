package com.javaTests.EMS;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/employee")
public class Main extends HttpServlet {

	public static Connection conn;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int empID = Integer.parseInt(req.getParameter("empID"));
		getConnection();
		
		try {
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM EMPLOYEE WHERE empID = ?");
			ps.setInt(1, empID);
			
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				resp.sendRedirect("/ServletWithJDBC/Success.html");
			} else {
				resp.sendRedirect("/ServletWithJDBC/Failure.html");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ems", "root", "Phani@123");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
