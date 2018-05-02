package com.library.member;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditLibraryMember
 */
@WebServlet("/EditLibraryMember")
public class EditLibraryMember extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EditLibraryMember() {
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
		out.println("<h1>Update Library Member</h1>");

		String stid = request.getParameter("id");
		int id = Integer.parseInt(stid);

		Member m = LibraryMemberDao.getRecordById(id);

		out.print("<form action='EditLibraryMember2' method='post'>");
		out.print("<table>");
		out.print("<tr><td></td><td><input type='hidden' name='id' value='" + m.getId() + "'/></td></tr>");
		out.print("<tr><td>Member Name	:</td><td><input type='text' name='name' value='" + m.getName()
				+ "'/></td></tr>");
		out.print("<tr><td>Position		:</td><td><input type='text' name='position' value='" + m.getPosition()
				+ "'/>   </td></tr>");
		out.print("<tr><td>Contact		:</td><td><input type='text' name='contact' value='" + m.getContact()
				+ "'/></td></tr>");
		out.print("<tr><td>Joining Date	:</td><td><input type='text' name='joiningdate' value='" + m.getJoiningDate()
				+ "'/></td></tr>");

		out.print("<tr><td><button><a href='LibraryMember.jsp'>Cancel</a></button></td>");
		out.print("<td><input type='submit' value='Edit & Save'></td></tr>");
		out.print("</table>");
		out.print("</form>");

		out.close();
	}

}
