package com.library.member;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 * Servlet implementation class LibraryMember
 */
@WebServlet("/LibraryMember")
public class LibraryMember extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LibraryMember() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter writer = response.getWriter();
		response.setContentType("text/html");

		String stid = request.getParameter("id");
		String stname = request.getParameter("name");
		String stposition = request.getParameter("position");
		String stcontact = request.getParameter("contact");
		String stjoiningdate = request.getParameter("joiningdate");

		int inid = Integer.parseInt(stid);

		Member m = new Member();

		m.setId(inid);
		m.setName(stname);
		m.setPosition(stposition);
		m.setContact(stcontact);
		m.setJoiningDate(stjoiningdate);

		// Invoke FirstServlet's job here.
		int status = LibraryMemberDao.save(m);
		if (status > 0) {
			JOptionPane.showMessageDialog(null, "Welcome!!! your records have successfully inserted!!!");
			response.sendRedirect("LibraryMember.jsp");
		} else {
			JOptionPane.showMessageDialog(null, "Database Error!!!");
		}

		writer.close();
	}

}
