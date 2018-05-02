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
 * Servlet implementation class StudentInfo
 */
@WebServlet("/StudentInfo")
public class StudentInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public StudentInfo() {
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

		String ststudentid = request.getParameter("studentid");
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

		// Invoke FirstServlet's job here.
		int status = StudentInfoDao.save(ststudentid, stname, stroll, stbatch, stdept, stsession, incontact,
				stissuecard, img, fis);
		if (status > 0) {
			writer.println("<html><body onload=\"alert('Welcome!!! your records have successfully inserted!!!')\"></body></html>");
			response.sendRedirect("StudentInformation.jsp");
		} else {
			JOptionPane.showMessageDialog(null, "Database Error!!!");
		}

		writer.close();
	}

}
