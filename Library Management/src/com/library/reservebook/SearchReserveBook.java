package com.library.reservebook;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchReserveBook
 */
@WebServlet("/SearchReserveBook")
public class SearchReserveBook extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SearchReserveBook() {
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
		out.println("<a href='ReserveBook.jsp'>Add New Book</a>");
		out.println("<h1>Search Book List</h1>");

		String stbookid = request.getParameter("search");
		int inbookid = Integer.parseInt(stbookid);

		List<Book> slist = ReserveBookDao.getSearchRecords(inbookid);

		out.print("<table border='1' width='100%'");
		out.print(
				"<tr><th>Book Id</th><th>Book Name</th><th>Author</th><th>Publisher</th><th>Quantity</th><th>Edit</th><th>Delete</th></tr>");
		for (Book b : slist) {
			out.print("<tr><td>" + b.getBookId() + "</td><td>" + b.getBookName() + "</td><td>" + b.getAuthor()
					+ "</td> <td>" + b.getPublisher() + "</td><td>" + b.getQuantity()
					+ "</td><td><a href='EditReserveBook?inbookid=" + b.getBookId()
					+ "'>Edit</a></td> <td><a href='DeleteReserveBook?inbookid=" + b.getBookId()
					+ "'>Delete</a></td></tr>");
		}

		out.print("</table>");

		out.close();
	}

}
