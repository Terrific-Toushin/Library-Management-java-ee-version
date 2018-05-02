package com.library.studentifo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 * Servlet implementation class EditStudentInfo2
 */
@WebServlet("/EditStudentInfo2")
public class EditStudentInfo2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EditStudentInfo2() {
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

		String ststudentid = request.getParameter("id");
		String stname = request.getParameter("name");
		String stroll = request.getParameter("roll");
		String stbatch = request.getParameter("batch");
		String stsession = request.getParameter("session");
		String stdept = request.getParameter("dept");
		String stcontact = request.getParameter("contact");
		String stissuecard = request.getParameter("issuecard");

		String stimage = request.getParameter("image");

		File img = null;
		FileInputStream fis = null;

		int incontact = Integer.parseInt(stcontact);

		img = new File(stimage);

		fis = new FileInputStream(img);

		if (JOptionPane.showConfirmDialog(null, "Are you sure want to Update this 'RECORD' ?", "WARNING",
				JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
			int status = StudentInfoDao.update(ststudentid, stname, stroll, stbatch, stdept, stsession, incontact,
					stissuecard, img, fis);
			if (status > 0) {
				response.sendRedirect("ViewStudentInfo");
			} else {
				writer.println("Sorry! unable to update record");
			}
		} else {
			response.sendRedirect("ViewStudentInfo");
		}

		writer.close();
	}

}
