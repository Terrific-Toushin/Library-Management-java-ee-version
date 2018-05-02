package com.library.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 * Servlet implementation class DeleteLibraryMember
 */
@WebServlet("/DeleteLibraryMember")
public class DeleteLibraryMember extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DeleteLibraryMember() {
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
		String stid = request.getParameter("id");
		String stname = request.getParameter("name");

		int inid = Integer.parseInt(stid);

		if (JOptionPane.showConfirmDialog(null, "Are you sure want to Delete this 'RECORD' ?", "WARNING",
				JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
			LibraryMemberDao.delete(inid, stname);
		}

		response.sendRedirect("DeleteMember.jsp");
	}

}
