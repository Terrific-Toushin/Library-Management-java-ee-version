package com.library.issuebook;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class IssueBook
 */
@WebServlet("/IssueBook")
public class IssueBook extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public IssueBook() {
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

		String stbookid = request.getParameter("bookid");
		String stbookname = request.getParameter("bookname");
		String ststudentid = request.getParameter("studentid");
		String ststudentname = request.getParameter("studentname");
		String stissuedate = request.getParameter("issuedate");
		String streturndate = request.getParameter("returndate");

		int inbookid = Integer.parseInt(stbookid);

		Issue i = new Issue();

		i.setIssueBookId(inbookid);
		i.setIssueBookName(stbookname);
		i.setIssueStudentId(ststudentid);
		i.setIssueStudentName(ststudentname);
		i.setIssueDate(stissuedate);
		i.setReturnDate(streturndate);

		// Invoke FirstServlet's job here.
		int status = IssueBookDao.save(i);
		if (status > 0) {
			writer.println("<html><body onload=\"alert('Welcome!!! your records have successfully inserted!!!')\"></body></html>");
			response.sendRedirect("IssueBook.jsp");
		} else {
			writer.println("<html><body onload=\"alert('Database Error!!!')\"></body></html>");
		}

		writer.close();

	}

}
