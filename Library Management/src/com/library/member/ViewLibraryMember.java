package com.library.member;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ViewLibraryMember
 */
@WebServlet("/ViewLibraryMember")
public class ViewLibraryMember extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ViewLibraryMember() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<a href='LibraryMember.jsp'>Add New Library Member</a>");
		out.println("<h1>Library Member List</h1>");

		List<Member> list = LibraryMemberDao.getAllRecords();

		out.print("<table border='1' width='100%'");
		out.print(
				"<tr><th>Member Id</th><th>Member Name</th><th>Position</th><th>Contact</th><th>Joining Date</th><th>Edit</th><th>Delete</th></tr>");
		for (Member m : list) {
			out.print("<tr><td>" + m.getId() + "</td><td>" + m.getName() + "</td><td>" + m.getPosition() + "</td> <td>"
					+ m.getContact() + "</td><td>" + m.getJoiningDate() + "</td><td><a href='EditLibraryMember?id="
					+ m.getId() + "'>Edit</a></td> "
					// + "<td><a href='DeleteLibraryMember?id=" + m.getId()
					// + "'>Delete</a></td>"
					+ "</tr>");
		}
		out.print("</table>");

		out.close();
	}

}
