package com.library.main;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RetrivePassword")
public class RetrivePassword extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String name = request.getParameter("name");
		String remail = request.getParameter("email");
		Connection con = null;
		Statement stmt = null;
		try {
			con = db.getConnection();
			System.out.println("Connected");
			String query = "select * from registration where email='" + remail + "'";
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			System.out.println("Executed");
			rs.next();
			String username = rs.getString("username");
			String email = rs.getString("email");
			String password = rs.getString("password");
			// Statement st = con.createStatement();

			if (name.equals(username) && remail.equalsIgnoreCase(email)) {

				String from = "schowdhurycse22@gmail.com";
				String Spassword = "bgc1422022";
				String to = email;
				String sub = "Library management admin password";
				String msg = "Your password is (" + password + "). Please change password after login";
				Mailer.send(from, Spassword, to, sub, msg);
				request.getRequestDispatcher("Login.jsp").include(request, response);
				// new Main_Menu();
				out.println("<html><body onload=\"alert('Message send Successfully')\"></body></html>");
        		   // dispose();
			} else {
				out.print("Sorry you have entered wrong name or email");
				request.getRequestDispatcher("NewPassword.jsp").include(request, response);
			}

			// JOptionPane.showMessageDialog(null,"Update Successfully");
			// tf_confirm_newpass.setText("");
		} catch (Exception ex) {

			out.print("Sorry you have entered wrong name or email" + ex.toString());
			request.getRequestDispatcher("NewPassword.jsp").include(request, response);

		}
	}

}
