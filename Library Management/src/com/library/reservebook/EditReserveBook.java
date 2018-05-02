package com.library.reservebook;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditResreveBook
 */
@WebServlet("/EditReserveBook")
public class EditReserveBook extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EditReserveBook() {
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
		out.println("<h1>Update Reserve Book</h1>");

		String stbookid = request.getParameter("inbookid");
		int inbookid = Integer.parseInt(stbookid);

		Book b = ReserveBookDao.getRecordById(inbookid);

		out.print("<form action='EditReserveBook2' method='post'>");
		out.print("<table>");
		out.print("<tr><td></td><td><input type='hidden' name='inbookid' value='" + b.getBookId() + "'/></td></tr>");
		out.print("<tr><td>Book Name	:</td><td><input type='text' name='bookname' value='" + b.getBookName()
				+ "'/></td></tr>");
		out.print("<tr><td>Author		:</td><td><input type='text' name='author' value='" + b.getAuthor()
				+ "'/>   </td></tr>");
		out.print("<tr><td>Publisher	:</td><td><input type='text' name='publisher' value='" + b.getPublisher()
				+ "'/></td></tr>");
		out.print("<tr><td>Quantity	:</td><td><input type='text' name='quantity' value='" + b.getQuantity()
				+ "'/></td></tr>");

		out.print(
				"<tr><td><button><a href='ReserveBook.jsp'>Cancel</a></button></td><td><input type='submit' value='Edit & Save'/></td></tr>");
		out.print("</table>");
		out.print("</form>");

		out.close();

	}

}
