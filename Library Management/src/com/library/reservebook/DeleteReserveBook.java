package com.library.reservebook;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 * Servlet implementation class DeleteReserveBook
 */
@WebServlet("/DeleteReserveBook")
public class DeleteReserveBook extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DeleteReserveBook() {
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
		String stbookid = request.getParameter("inbookid");

		int inbookid = Integer.parseInt(stbookid);

		if (JOptionPane.showConfirmDialog(null, "Are you sure want to Delete this 'RECORD' ?", "WARNING",
				JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
			ReserveBookDao.delete(inbookid);
		}

		response.sendRedirect("ViewReserveBook");
	}

}
