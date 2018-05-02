<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Library Managment System</title>
<meta name="keywords"
	content="showcase, portfolio, free web templates, css templates" />
<meta name="description"
	content="Portfolio is a free web template for everyone" />
<link href="templatemo_style.css" rel="stylesheet" type="text/css" />
</head>

<body>
	<div id="templatemo_site_title_bar_wrapper">
		<div id="templatemo_site_title_bar">

			<div id="site_title">
				<h1>
					<a href="index.html"> <img src="images/library.png"
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
		<div class="student-info-area">
			<div class="formdesign">
				<h2>Student Information</h2>
				<table>
					
					<tr>
						<form action="ViewStudentInfo" method="get">
						<td><input type="submit" class="viewlibrarycarduser"
							value="View Student"></td>
							</form>

						<td><input type="textarea" id="search" name="search"
							placeholder="search..."></td>
						<form action="SearchStudentInfo" method="get">
						<td><input type="submit" class="search" value="Search">
								</td></form>
					</tr>
					<!-- </div> -->
				</table>
				<table>
					<form action="StudentInfo" method="post">
						<tr>
							<td><label for="studentid">Student ID:</label></td>
							<td><input type="text" id="studentid" name="studentid"
								placeholder="Student ID"></td>
						</tr>
						<tr>
							<td>Choose A Image</td>
							<td><input type="file" name="image"></td>
						</tr>
						<tr>
							<td><label for="name">Name:</label></td>
							<td><input type="text" id="name" name="name"
								placeholder="Name"></td>
						</tr>
						<tr>
							<td><label for="roll">Roll:</label></td>
							<td><input type="id" id="roll" name="roll"
								placeholder="roll"></td>
						</tr>
						<tr>
							<td><label for="batch">Batch:</label></td>
							<td><input type="text" id="batch" name="batch"
								placeholder="batch"></td>
						</tr>
						<tr>
							<td><label for="session">Session:</label></td>
							<td><input type="text" id="session" name="session"
								placeholder="session"></td>
						</tr>
						<tr>
							<td><label for="dept">Dept.:</label></td>
							<td><select type="text" name="dept">
									<option>CSE</option>
									<option>BBA</option>
									<option>LLB</option>
									<option>English</option>
							</select></td>
						</tr>
						<tr>
							<td><label for="contact">Contact:</label></td>
							<td><input type="contact" id="contact" name="contact"
								placeholder="contact"></td>
						</tr>
						<tr>
							<td><label for="issuecard">Issue Card:</label></td>
							<td><input type="text" id="issuecard" name="issuecard"
								placeholder="issuecard"></td>
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
				Copyright © Abhi & Toushin |<a href="#">AT's IT Zone</a>
			</div>

		</div>
		<!-- end of footer -->

		<div class="cleaner"></div>
	</div>
	<!-- end of templatemo_footer_wrapper -->
</body>
</html>
