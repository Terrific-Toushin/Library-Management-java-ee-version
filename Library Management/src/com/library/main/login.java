package com.library.main;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public login() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String name = request.getParameter("username");
		String password = request.getParameter("password");

		Connection con = null;
		PreparedStatement pstmt = null;

		try {

			con = db.getConnection();
			pstmt = con.prepareStatement("select * from registration where username =?");

			pstmt.setString(1, name);

			ResultSet rs = pstmt.executeQuery();
			System.out.println("Executed");
			rs.next();

			String un = rs.getString("username");
			String pw = rs.getString("password");
			

			if (name.equals(un) && password.equals(pw)) {
				request.getRequestDispatcher("Index.jsp").include(request, response);
			} else {
				out.print("<html><body onload=\"alert('Sorry you have entered wrong name or passord')\"></body></html>");
				request.getRequestDispatcher("Login.jsp").include(request, response);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			out.println("<h2>SQL Connection Error : server problem</h2>");
			out.println("<a href=Login.jsp>Try Again</a>");
			e.printStackTrace();
		}
	}
}
