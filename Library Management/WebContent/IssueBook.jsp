<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Library Managment System</title>
<link href="templatemo_style.css" rel="stylesheet" type="text/css" />
</head>

<body>
	<div id="templatemo_site_title_bar_wrapper">
		<div id="templatemo_site_title_bar">

			<div id="site_title">
				<h1>
					<a href="Index.jsp"> <img src="images/library.png"
						alt="Portfolio" /> <span>Library Managment System</span>
					</a>
				</h1>
			</div>

			<div class="menu">
				<ul>
					<li><a href="Index.jsp">Home</a></li>
					<li><a href="">Books</a>
						<ul>
							<li><a href="ReserveBook.jsp">Reserve Book</a></li>
							<li><a href="IssueBook.jsp">Issue Book</a></li>
							<li><a href="ReturnBook.jsp">Return Book</a></li>
							<li><a href="DueBook.jsp">Due Book</a></li>
						</ul></li>
					<li><a href="">Users</a>
						<ul>
							<li><a href="LibraryMember.jsp">Library Member</a></li>
							<li><a href="StudentInformation.jsp">Library Card User</a></li>
						</ul></li>
					<li><a href="">Reports</a>
						<ul>
							<li><a href="ViewStudentInfo">Student Details</a></li>
							<li><a href="ViewReserveBook">Book Details</a></li>
							<li><a href="ViewIssueBook">Issue Books Details</a></li>
						</ul></li>
					<li><a href="">About</a>
						<ul>
							<li><a href="Team.jsp">Team</a></li>
							<li><a href="Contact.jsp">Contact</a></li>
						</ul></li>
					<li><a href="Login.jsp">Logout</a></li>

				</ul>
			</div>
			<!-- end of menu -->

		</div>
		<!-- end of templatemo_site_title_bar -->

	</div>

	<div class="main-body single-service-bg">
		<div class="issue-book-area">
			<div class="formdesign">
			<h2>Issue Book</h2>
				<table>
					<tr>
						<form action="ViewIssueBook" method="get">
							<td><input class="viewissuebook" type="submit"
								value="View Issue Book" name="btn"></td>
						</form>

						<form action="SearchIssueBook" method="get">
							<td><input type="textarea" id="bsearch" name="search"
								placeholder="Search By ID" required="required"></td>
							<td><input class="search" type="submit" value="Search"
								name="btn"></td>
						</form>
					</tr>
					<!-- </div> -->
				</table>
				<table>
					<form action="IssueBook" method="post">
					<tr>
						<td><label for="bookid">Book ID:</label></td>
						<td><input type="text" id="bookid" name="bookid"
							placeholder="Book ID"></td>
					</tr>
					<tr>
						<td><label for="BookName">Book Name:</label></td>
						<td><input type="text" id="BookName" name="bookname"
							placeholder="Book Name"></td>
					</tr>
					<tr>
						<td><label for="studentid">Student ID:</label></td>
						<td><input type="id" id="studentid" name="studentid"
							placeholder="student id"></td>
					</tr>
					<tr>
						<td><label for="studentname">Student Name:</label></td>
						<td><input type="text" id="studentname" name="studentname"
							placeholder="student name"></td>
					</tr>
					<tr>
						<td><label for="issuedate">Issue Date:</label></td>
						<td><input type="date" id="issuedate" name="issuedate"></td>
					</tr>
					<tr>
						<td><label for="returndate">Return Date:</label></td>
						<td><input type="date" id="returndate" name="returndate"></td>
					</tr>

					<tr class="submitclass">
						<td><input type="submit" value="Save"></td>
					</tr>

					</form>
				</table>
				<button class="backbtn">
					<a href="Index.jsp">Back</a>
				</button>

			</div>

		</div>
	</div>
	<div id="templatemo_content_bottom"></div>

	<div id="templatemo_footer_wrapper">
		<div id="templatemo_footer">

			<div class="section_w220">

				<h4>Partners</h4>

				<ul class="footer_list_menu">
					<li><a href="http://www.templatemo.com" target="_parent">CSS
							Templates</a></li>
					<li><a href="http://www.flashmo.com" target="_parent">Free
							Flash Templates</a></li>
					<li><a href="http://www.flashmo.com/store" target="_parent">Premium
							Templates</a></li>
					<li><a href="http://www.webdesignmo.com/blog" target="_parent">Web
							Design Blog</a></li>
					<li><a href="http://www.koflash.com">Best Flash Gallery</a></li>
				</ul>

			</div>

			<div class="section_w220">

				<h4>Explore</h4>

				<ul class="footer_list_menu">
					<li><a href="#">Company</a></li>
					<li><a href="#">Our Blog</a></li>
					<li><a href="#">Portfolio</a></li>
					<li><a href="#">Contact</a></li>
				</ul>

			</div>



			<div class="section_w220">

				<h4>About Our Website</h4>

				<p>Nunc sed diam sed dui iaculis pharetra eu sed elit. Nunc arcu
					sapien, pellentesque at posuere nec, tincidunt dignissim enim. Ut
					sem mauris, aliquet ut sagittis vitae, condimentum eget augue.</p>

			</div>

			<div class="cleaner_h20"></div>

			<div align="center">
				Copyright © Abhi & Toushin (2018) |<a href="#">AT's IT Zone</a>
			</div>

		</div>
		<!-- end of footer -->

		<div class="cleaner"></div>
	</div>
	<!-- end of templatemo_footer_wrapper -->
</html>
