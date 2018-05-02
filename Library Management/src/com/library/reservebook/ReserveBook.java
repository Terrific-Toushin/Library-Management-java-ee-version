package com.library.reservebook;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 * Servlet implementation class ReserveBook
 */
@WebServlet("/ReserveBook")
public class ReserveBook extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ReserveBook() {
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
		String stauthor = request.getParameter("author");
		String stpublisher = request.getParameter("publisher");
		String stquantity = request.getParameter("quantity");

		int inbookid = Integer.parseInt(stbookid);
		int inquantity = Integer.parseInt(stquantity);

		Book b = new Book();

		b.setBookId(inbookid);
		b.setBookName(stbookname);
		b.setAuthor(stauthor);
		b.setPublisher(stpublisher);
		b.setQuantity(inquantity);

		// Invoke FirstServlet's job here.
		int status = ReserveBookDao.save(b);
		if (status > 0) {
			writer.println("<html><body onload=\"alert('Welcome!!! your records have successfully inserted!!!')\"></body></html>");
			response.sendRedirect("ReserveBook.jsp");
		} else {
			JOptionPane.showMessageDialog(null, "Database Error!!!");
		}

		writer.close();

	}
}
