<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Study Material Admin Panel</title>
<link rel="icon" type="image/png" href="jsp/images/techhub.png" />
<!-- Bootstrap CSS CDN -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<!-- Our Custom CSS -->
<link href="/css/AdminPanel.css" rel="stylesheet">
<script src="https://code.jquery.com/jquery-1.12.0.min.js"></script>
<!-- Bootstrap Js CDN -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/modernizr/2.8.3/modernizr.js"></script>

<script>
	$(window).load(function() {
		// Animate loader off screen
		$(".se-pre-con").fadeOut("slow");;
	});
	</script>
	
<script type="text/javascript">
	$(document).ready(function() {
		$('#sidebarCollapse').on('click', function() {
			$('#sidebar').toggleClass('active');
		});
	});
</script>
<style>
.no-js #loader { display: none;  }
.js #loader { display: block; position: absolute; left: 100px; top: 0; }
.se-pre-con {
	position: fixed;
	left: 0px;
	top: 0px;
	width: 100%;
	height: 100%;
	z-index: 9999;
	background: url(https://smallenvelop.com/wp-content/uploads/2014/08/Preloader_11.gif) center no-repeat #fff;



</style>
</head>
<body>
<div class="se-pre-con"></div>
	<div class="wrapper">

		<!-- Logout Button  -->
		<div class="button">
			<button class="btn btn-info active" type="submit"
				style="float: right;">Log Out</button>
		</div>

		<!-- Side Bar Holder -->
		<nav id="sidebar">
			<div class="sidebar-header">
				<h3>
					<a href="dashboard">Welcome Reader</a>
				</h3>
				<strong> <a href="dashboard">SM</a>
				</strong>
				
			</div>

			<!--  Start of Menus -->
			<ul class="list-unstyled components">

				<!-- Clients -->
		  <li class="active"><a href="#ClientMenu" data-toggle="collapse"
					aria-expanded="false"> <i class="glyphicon glyphicon-briefcase">
					</i>Materials
				</a> <!-- Sub Menus for Course -->
					<ul class="collapse list-unstyled" id="ClientMenu">
						<li>
						    <ul>
								<li><a href="dem">Add New Material</a></li>
							</ul>
					   </li>

						<li>
						    <ul>
								<li><a href="viewmaterial">View Material</a></li>
							</ul></li>
							
							<li>
						    <ul>
								<li><a href="studentview">Student View</a></li>
							</ul></li>
					</ul>
			</li>
			
			
			

			<!-- End of Contact Us -->

			</ul>
		</nav>

		<!-- Page Content Holder -->
		<div id="content">
			<nav class="navbar navbar-default">
				<div class="navbar-header">
					<button type="button" id="sidebarCollapse"
						class="btn btn-info navbar-btn">
						<i class="glyphicon glyphicon-align-left"></i>
					</button>
				</div>
			</nav>
		</div>
</body>
</html>