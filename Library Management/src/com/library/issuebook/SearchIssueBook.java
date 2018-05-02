package com.library.issuebook;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchIssueBook
 */
@WebServlet("/SearchIssueBook")
public class SearchIssueBook extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SearchIssueBook() {
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
		out.println("<a href='IssueBook.jsp'>Issue Book</a>");
		out.println("<h1>Issue Book List</h1>");

		String stbookid = request.getParameter("search");
		int inbookid = Integer.parseInt(stbookid);

		List<Issue> ilist = IssueBookDao.getSearchRecords(inbookid);

		out.print("<table border='1' width='100%'");
		out.print(
				"<tr><th>Book Id</th><th>Book Name</th><th>Student Id</th><th>Student Name</th><th>Issue Date</th><th>Return Date</th></tr>");
		for (Issue i : ilist) {
			out.print("<tr><td>" + i.getIssueBookId() + "</td><td>" + i.getIssueBookName() + "</td><td>"
					+ i.getIssueStudentId() + "</td> <td>" + i.getIssueStudentName() + "</td><td>" + i.getIssueDate()
					+ "</td><td>" + i.getReturnDate() + "</td></tr>");
		}
		out.print("</table>");

		out.close();
	}

}
