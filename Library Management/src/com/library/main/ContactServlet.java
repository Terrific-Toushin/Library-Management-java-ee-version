package com.library.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;


/**
 * Servlet implementation class ContactServlet
 */
@WebServlet("/ContactServlet")
public class ContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String remail = request.getParameter("email");
		String phone = request.getParameter("contact");
		String message = request.getParameter("message");
		
		try
        {
            
                       String from = "schowdhurycse22@gmail.com";
               		   String Spassword = "bgc1422022";
               		   String to = "mdabdullahtoushin@gmail.com";
               		   String sub = "Library Contact";
               		   String msg = "Client name is "+name+"\nClient Email Address "+remail+"\nClient Contact No "+phone+"\nMessage :-"+message+"";
               		   Mailer.send(from, Spassword, to, sub, msg);
               		   out.println("<html><body onload=\"alert('Message send Successfully')\"></body></html>");
               		   request.getRequestDispatcher("Index.jsp").include(request, response);
               		   
               		   
               		
               		   
        }
        catch(Exception ex)
        {
        	out.println("<html><body onload=\"alert('Message Can not send. Warning!! Something Wrong')\"></body></html>"+ex.toString());
        	request.getRequestDispatcher("Contact.jsp").include(request, response);
            
        }
	}

}
