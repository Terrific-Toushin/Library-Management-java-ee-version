<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.library.main.db, com.library.issuebook.*, java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Library Management System</title>
</head>
<body>
	<!-- <h1>Due Book List</h1>
 -->
	<%
		//response.sendRedirect("DueBook");
		/* List<Issue> list = IssueBookDao.getAllRecords();
		request.setAttribute("list", list); */
		response.setContentType("text/html");
		//PrintWriter out = response.getWriter();
		
		out.println("<h1>Due Book List</h1>");

		List<Issue> list = IssueBookDao.getAllRecords();

		out.print("<table border='1' width='100%'");
		out.print(
				"<tr><th>Book Id</th><th>Book Name</th><th>Student Id</th><th>Student Name</th><th>Issue Date</th><th>Return Date</th></tr>");
		for (Issue i : list) {
			out.print("<tr><td>" + i.getIssueBookId() + "</td><td>" + i.getIssueBookName() + "</td><td>"
					+ i.getIssueStudentId() + "</td> <td>" + i.getIssueStudentName() + "</td><td>" + i.getIssueDate()
					+ "</td><td>" + i.getReturnDate() + "</td></tr>");
		}
		out.print("</table>");
		
		out.println("<a href='Index.jsp'>Back</a>");
		out.close();
	%>

	<%-- <table>
		<tr>
			<th>Book Id</th>
			<th>Book Name</th>
			<th>Student Id</th>
			<th>Student Name</th>
			<th>Issue Date</th>
			<th>Return Date</th>
		</tr>

		<c:forEach items="${list}" var="i">
			<tr>
				<td>${i.getIssueBookId()}</td>
				<td>${i.getIssueBookName()}</td>
				<td>${i.getIssueStudentId()}</td>
				<td>${i.getIssueStudentName()}</td>
				<td>${i.getIssueDate()}</td>
				<td>${i.getReturnDate()}</td>
				<td><a href="editform.jsp?id=${u.getId()}">Edit</a></td>
				<td><a href="deleteuser.jsp?id=${u.getId()}">Delete</a></td>
			</tr>
		</c:forEach>
	</table> --%>
	<br />
	<!-- <a href="Index.jsp">Back</a> -->
</body>
</html>