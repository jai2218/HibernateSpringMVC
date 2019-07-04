<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description"
	content="Creative - Bootstrap 3 Responsive Admin Template">
<meta name="author" content="GeeksLabs">
<meta name="keyword"
	content="Creative, Dashboard, Admin, Template, Theme, Bootstrap, Responsive, Retina, Minimal">
<link rel="shortcut icon"
	href="${pageContext.request.contextPath}/resources/img/favicon.png">

<title>Login Page 2 | Creative - Bootstrap 3 Responsive Admin
	Template</title>

<!-- Bootstrap CSS -->
<link
	href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css"
	rel="stylesheet">
<!-- bootstrap theme -->
<link
	href="${pageContext.request.contextPath}/resources/css/bootstrap-theme.css"
	rel="stylesheet">
<!--external css-->
<!-- font icon -->
<link
	href="${pageContext.request.contextPath}/resources/css/elegant-icons-style.css"
	rel="stylesheet" />
<link
	href="${pageContext.request.contextPath}/resources/css/font-awesome.css"
	rel="stylesheet" />
<!-- Custom styles -->
<link href="${pageContext.request.contextPath}/resources/css/style.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/resources/css/style-responsive.css"
	rel="stylesheet" />

<!-- HTML5 shim and Respond.js IE8 support of HTML5 -->
<!--[if lt IE 9]>
    <script src="js/html5shiv.js"></script>
    <script src="js/respond.min.js"></script>
    <![endif]-->

<!-- =======================================================
      Theme Name: NiceAdmin
      Theme URL: https://bootstrapmade.com/nice-admin-bootstrap-admin-html-template/
      Author: BootstrapMade
      Author URL: https://bootstrapmade.com
    ======================================================= -->
</head>

<body class="login-img3-body">

	<section id="container" class="">
		<div class="container">

			<header class="header dark-bg">
				<div class="toggle-nav">
					<div class="icon-reorder tooltips"
						data-original-title="Toggle Navigation" data-placement="bottom">
						<i class="icon_menu"></i>
					</div>
				</div>

				<!--logo start-->
				<a href="./login" class="logo">Jai <span class="lite">Shanker</span></a>
				<!--logo end-->

			</header>
			<!--header end-->



			<form class="login-form" action="login">
				<h2 align="center"
					style="font-style: oblique; font-weight: bold; font-family: sans-serif; color: #0B95BD">Login</h2>
				<div class="login-wrap">
					<p class="login-img">
						<i class="icon_lock_alt"></i>
					</p>
					<div class="input-group">
						<span class="input-group-addon"><i class="icon_profile"></i></span>
						<input type="text" class="form-control" placeholder="Username"
							autofocus>
					</div>
					<div class="input-group">
						<span class="input-group-addon"><i class="icon_key_alt"></i></span>
						<input type="password" class="form-control" placeholder="Password">
					</div>
					<label class="checkbox"> <input type="checkbox"
						value="remember-me"> Remember me <span class="pull-right">
							<a href="#"> Forgot Password?</a>
					</span>
					</label>
					<button class="btn btn-primary btn-lg btn-block" type="submit">Login</button>
					<button class="btn btn-info btn-lg btn-block" type="submit"><a href="registration"> Sign Up</a></button>
				</div>
			</form>



			<div class="text-right">
				<div class="credits">
					<!--
            All the links in the footer should remain intact.
            You can delete the links only if you purchased the pro version.
            Licensing information: https://bootstrapmade.com/license/
            Purchase the pro version form: https://bootstrapmade.com/buy/?theme=NiceAdmin
          -->
					<div style="height: 70px;"></div>
					Designed by <a href="https://bootstrapmade.com/">Jai Shanker</a>
				</div>
			</div>
		</div>

	</section>

</body>


</html>
