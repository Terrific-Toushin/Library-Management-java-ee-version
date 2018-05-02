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
 * Servlet implementation class ViewReserveBook
 */
@WebServlet("/EditReserveBook2")
public class EditReserveBook2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EditReserveBook2() {
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

		String stbookid = request.getParameter("inbookid");
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

		if (JOptionPane.showConfirmDialog(null, "Are you sure want to Update this 'RECORD' ?", "WARNING",
				JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
			int status = ReserveBookDao.update(b);
			if (status > 0) {
				response.sendRedirect("ViewReserveBook");
			} else {
				writer.println("Sorry! unable to update record");
			}
		} else {
			response.sendRedirect("ViewReserveBook");
		}

		writer.close();

	}

}
