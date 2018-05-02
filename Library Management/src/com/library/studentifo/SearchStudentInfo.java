package com.library.studentifo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchStudentInfo
 */
@WebServlet("/SearchStudentInfo")
public class SearchStudentInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SearchStudentInfo() {
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
		out.println("<a href='StudentInformation.jsp'>Add Student</a>");
		out.println("<h1>Student List</h1>");

		String stid = request.getParameter("search");

		List<Student> slist = StudentInfoDao.getSearchRecords(stid);

		out.print("<table border='1' width='100%'");
		out.print(
				"<tr><th>Id</th><th>Student Name</th><th>Roll</th><th>Batch</th><th>Dept.</th><th>Session</th><th>Contact</th><th>Issue Card</th><th>Image</th><th>Edit</th><th>Delete</th></tr>");
		for (Student s : slist) {
			out.print("<tr><td>" + s.getStudentId() + "</td><td>" + s.getName() + "</td><td>" + s.getRoll()
					+ "</td> <td>" + s.getBatch() + "</td><td>" + s.getDept() + "</td><td>" + s.getSession()
					+ "</td><td>" + s.getContact() + "</td><td>" + s.getIssueCard() + "</td><td>" + s.getImage()
					+ "</td><td><a href='EditStudentInfo?id=" + s.getStudentId() + "'>Edit</a></td> "
					+ "<td><a href='DeleteStudentInfo?id=" + s.getStudentId() + "'>Delete</a></td>" + "</tr>");
		}
		out.print("</table>");

		out.close();
	}

}
