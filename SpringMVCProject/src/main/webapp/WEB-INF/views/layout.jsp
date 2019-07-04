<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <title><tiles:insertAttribute name="title" ignore="true" /></title>
  <meta content="width=device-width, initial-scale=1.0" name="viewport">
  <meta content="" name="keywords">
  <meta content="" name="description">

  <!-- Favicons -->
  <link href="<%=request.getContextPath() %>/resources/img/favicon.png" rel="icon">
  <link href="<%=request.getContextPath() %>/resources/img/apple-touch-icon.png" rel="apple-touch-icon">

  <!-- Google Fonts -->
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,700,700i|Roboto:100,300,400,500,700|Philosopher:400,400i,700,700i" rel="stylesheet">

  <!-- Bootstrap css -->
  <!-- <link rel="stylesheet" href="css/bootstrap.css"> -->
  <link href="<%=request.getContextPath() %>/resources/lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Libraries CSS Files -->
  <link href="<%=request.getContextPath() %>/resources/lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">
  <link href="<%=request.getContextPath() %>/resources/lib/owlcarousel/assets/owl.theme.default.min.css" rel="stylesheet">
  <link href="<%=request.getContextPath() %>/resources/lib/font-awesome/css/font-awesome.min.css" rel="stylesheet">
  <link href="<%=request.getContextPath() %>/resources/lib/animate/animate.min.css" rel="stylesheet">
  <link href="<%=request.getContextPath() %>/resources/lib/modal-video/css/modal-video.min.css" rel="stylesheet">

  <!-- Main Stylesheet File -->
  <link href="<%=request.getContextPath() %>/resources/css/style.css" rel="stylesheet">

  <!-- =======================================================
    Theme Name: eStartup
    Theme URL: https://bootstrapmade.com/estartup-bootstrap-landing-page-template/
    Author: BootstrapMade.com
    License: https://bootstrapmade.com/license/
  ======================================================= -->
</head>

<body>
<tiles:insertAttribute name="header" />
<tiles:insertAttribute name="menu" />
<tiles:insertAttribute name="body" />
<tiles:insertAttribute name="footer" />
<a href="#" class="back-to-top"><i class="fa fa-chevron-up"></i></a>

  <!-- JavaScript Libraries -->
  <script src="<%=request.getContextPath() %>/resources/lib/jquery/jquery.min.js"></script>
  <script src="<%=request.getContextPath() %>/resources/lib/jquery/jquery-migrate.min.js"></script>
  <script src="<%=request.getContextPath() %>/resources/lib/bootstrap/js/bootstrap.bundle.min.js"></script>
  <script src="<%=request.getContextPath() %>/resources/lib/superfish/hoverIntent.js"></script>
  <script src="<%=request.getContextPath() %>/resources/lib/superfish/superfish.min.js"></script>
  <script src="<%=request.getContextPath() %>/resources/lib/easing/easing.min.js"></script>
  <script src="<%=request.getContextPath() %>/resources/lib/modal-video/js/modal-video.js"></script>
  <script src="<%=request.getContextPath() %>/resources/lib/owlcarousel/owl.carousel.min.js"></script>
  <script src="<%=request.getContextPath() %>/resources/lib/wow/wow.min.js"></script>
  <!-- Contact Form JavaScript File -->
  <script src="<%=request.getContextPath() %>/resources/contactform/contactform.js"></script>

  <!-- Template Main Javascript File -->
  <script src="<%=request.getContextPath() %>/resources/js/main.js"></script>
</body>
</html>