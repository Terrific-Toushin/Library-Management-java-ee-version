package com.library.duebook;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.library.issuebook.Issue;
import com.library.issuebook.IssueBookDao;

/**
 * Servlet implementation class ViewDueBook
 */
@WebServlet("/ViewDueBook")
public class ViewDueBook extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ViewDueBook() {
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
		out.println("<a href='Index.jsp'>Back</a>");
		out.println("<h1>Due Book List</h1>");

		List<Issue> list = IssueBookDao.getAllRecords();

		out.print("<table border='1' width='100%'");
		out.print(
				"<tr><th>Book Id</th><th>Book Name</th><th>Student Id</th><th>Student Name</th><th>Issue Date</th><th>Return Date</th></tr>");
		for (Issue i : list) {
			out.print("<tr><td>" + i.getIssueBookId() + "</td><td>" + i.getIssueBookName() + "</td><td>"
					+ i.getIssueStudentId() + "</td> <td>" + i.getIssueStudentName() + "</td><td>" + i.getIssueDate()
					+ "</td><td>" + i.getReturnDate() + "</td></tr>");
		}
		out.print("</table>");

		out.close();
	}

}
