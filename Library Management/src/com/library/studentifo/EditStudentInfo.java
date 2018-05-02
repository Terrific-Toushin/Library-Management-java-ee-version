package com.library.studentifo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditStudentInfo
 */
@WebServlet("/EditStudentInfo")
public class EditStudentInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EditStudentInfo() {
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
		out.println("<h1>Update Student Info</h1>");

		String stid = request.getParameter("id");

		Student s = StudentInfoDao.getRecordById(stid);

		out.print("<form action='EditStudentInfo2' method='post'>");
		out.print("<table>");
		out.print("<tr><td></td><td><input type='hidden' name='id' value='" + s.getStudentId() + "'/></td></tr>");
		out.print("<tr><td>Student Name	:</td><td><input type='text' name='name' value='" + s.getName()
				+ "'/></td></tr>");
		out.print("<tr><td>Roll			:</td><td><input type='text' name='roll' value='" + s.getRoll()
				+ "'/>   </td></tr>");
		out.print("<tr><td>Batch		:</td><td><input type='text' name='batch' value='" + s.getBatch()
				+ "'/></td></tr>");
		out.print("<tr><td>Session		:</td><td><input type='text' name='session' value='" + s.getSession()
				+ "'/></td></tr>");
		out.print(
				"<tr><td>Department	:</td><td><input type='text' name='dept' value='" + s.getDept() + "'/></td></tr>");
		out.print("<tr><td>Contact		:</td><td><input type='text' name='contact' value='" + s.getContact()
				+ "'/></td></tr>");
		out.print("<tr><td>Issue Card	:</td><td><input type='text' name='issuecard' value='" + s.getIssueCard()
				+ "'/></td></tr>");

		out.print("<tr><td><button><a href='StudentInformation.jsp'>Cancel</a></button></td>");
		out.print("<td><input type='submit' value='Edit & Save'></td></tr>");
		out.print("</table>");
		out.print("</form>");

		out.close();
	}

}
