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
					<a href="index.jsp"> <img src="images/library.png"
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
	<!-- end of templatemo_site_title_bar_wrapper -->

	<!-- <div id="templatemo_follow_me_wrapper">

	<div id="templatemo_follow_me">
    
    	<span>Follow us on</span>
        <ul class="social_network">
        	<li><a class="twitter" href="#"></a></li>
            <li><a class="facebook" href="#"></a></li>
            <li><a class="linkin" href="#"></a></li>
            <li><a class="flickr" href="#"></a></li>
        </ul>
    
	    <div class="cleaner"></div>
    </div> -->
	<!-- end of templatemo_menu -->

	<!-- </div> <!-- end of templatemo_menu_wrapper -->
	<div class="main-body single-service-bg">
		<div class="return-book-area">
			<div class="formdesign">
			<h2>Return Book</h2>
				<table>
					<form action="ReturnBook" method="get">
					<tr>
						<td><label for="studentid">Student ID:</label></td>
						<td><input type="text" id="studentid" name="studentid"
							placeholder="Student ID"></td>
					</tr>
					<tr>
						<td><label for="bookname">Book Name:</label></td>
						<td><input type="text" id="bookname" name="bookname"
							placeholder="Book Name"></td>
					</tr>

					<tr class="submitclass">
						<td><input type="submit" value="Ok"></td>
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
				Copyright © Abhi & Toushin |<a href="#">AT's IT Zone</a>
			</div>

		</div>
		<!-- end of footer -->

		<div class="cleaner"></div>
	</div>
	<!-- end of templatemo_footer_wrapper -->
</html>
