<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />

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
	href="${contextPath}/resources/img/favicon.png">

<title>Login Page 2 | Creative - Bootstrap 3 Responsive Admin
	Template</title>

<!-- Bootstrap CSS -->
<link href="${contextPath}/resources/css/bootstrap.min.css"
	rel="stylesheet">
<!-- bootstrap theme -->
<link href="${contextPath}/resources/css/bootstrap-theme.css"
	rel="stylesheet">
<!--external css-->
<!-- font icon -->
<link href="${contextPath}/resources/css/elegant-icons-style.css"
	rel="stylesheet" />
<link href="${contextPath}/resources/css/font-awesome.css"
	rel="stylesheet" />
<!-- Custom styles -->
<link href="${contextPath}/resources/css/style.css" rel="stylesheet">
<link href="${contextPath}/resources/css/style-responsive.css"
	rel="stylesheet" />

<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<script src="https://unpkg.com/gijgo@1.9.13/js/gijgo.min.js"
	type="text/javascript"></script>
<link href="https://unpkg.com/gijgo@1.9.13/css/gijgo.min.css"
	rel="stylesheet" type="text/css" />
	

<style type="text/css">
  span.error{
    color: red;
    margin-left: 5px;
  }
</style>

<!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script> -->

<script type="text/javascript">

function saveRegistrationDtls() {
	/* alert("form submit") */
	
	if(validateform()){

	/*  Submit form using Ajax */
	$.ajax({
			url : 'saveRegistration',
			data : $('form[name=myRegForm]').serialize(),
			type: 'post',
			success : function(res) {
				 $("#jsonResp").text(JSON.stringify(res.regJSON)); 
				if(res.validated){
					//Set response
					 $('#resultContainer pre code').text(JSON.stringify(res.regJSON));
					$('#resultContainer').show();
					
					alert(res.regJSON.name + " :  User Added Successfully" )
					
					window.location.href='login';
					
				}else{
					//Set error messages
					$.each(res.errorMessages,function(key,value){
						$('input[name='+key+']').after('<span class="error">'+value+'</span>');
					});
				}
			},
			
			error: function(error){
				alert(error +" : User Not Added. Please try again..");
			}
	
		
		});
	
	}
	
	return false;
}

	function validateform() {
		var name 			= document.myRegForm.name.value;
		var email 			= document.myRegForm.email.value;
		var mobileNumber 	= document.myRegForm.mobileNumber.value;
		var userName 		= document.myRegForm.userName.value;
		var password 		= document.myRegForm.password.value;
		var cnfrmPassword 	= document.myRegForm.cnfrmPassword.value;
		var dob 			= document.myRegForm.dob.value;
		var gender 			= document.myRegForm.gender.value;
		/* var password		=document.myform.password.value; */

		if (name == null || name == "") {
			alert("Name can't be blank");
			return false;
		} else if (name.length < 3) {
			alert("Name must be greter than or equal to 3 letters");
			return false;
		} else if (name.length > 20) {
			alert("Name should not be greater than 20 letters");
			return false;
		} else if (email == null || email == "") {
			alert("Email can't be blank");
			return false;
		} else if (mobileNumber == null || mobileNumber == "") {
			alert("Mobile Number can't be blank");
			return false;
		}else if (userName == null || userName == "") {
			alert("User Name can't be blank");
			return false;
		}
		else if (password.length < 4) {
			alert("Password must be at least 4 characters long.");
			return false;
		}else if (cnfrmPassword == null || cnfrmPassword == "") {
			alert("Confirm password");	
			return false;
		}else if (cnfrmPassword != password) {
			alert("Conferm password must be same as Password inserted.");
			return false;
		}
		else if (dob == "") {
			alert("Select Date of Birth")
			return false;
		}else if (gender == 0) {
			alert("Select Gender");
			return false;
		}
		return true;
	}
</script>

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
				<a href="./registration" class="logo">Jai <span class="lite">Shanker</span></a>
				<!--logo end-->

			</header>
			<!--header end-->
			<form:form class="login-form" method="post" name="myRegForm" onsubmit="return saveRegistrationDtls()" >
				<div class="login-wrap">
					<h1 align="center"
						style="font-style: oblique; font-weight: bold; font-family: sans-serif; color: #0B95BD; font-size: 40px;">Sign
						Up</h1>

					<p class="login-img">
						<i class="icon_lock_alt"></i>
					</p>


					<div class="input-group">
						<form:input path="name" class="form-control" placeholder="Name" autofocus="true" maxlength="20"/>
						</div>
						
					<div class="input-group">
						<form:input path="email" class="form-control" placeholder="Email" autofocus="true" maxlength="40" />
					</div>
					
					<div class="input-group">
							<form:input path="mobileNumber" class="form-control" placeholder="Mobile" autofocus="true" maxlength="10" />
					</div>

					<div class="input-group">
							<form:input path="userName" class="form-control" placeholder="User Name" autofocus="true" maxlength="10"/>
					</div>
					
					<div class="input-group">
						<form:input path="password" class="form-control" placeholder="Password" autofocus="true"  type="password" maxlength="10"/>
					</div>

					<div class="input-group">
						<form:input path="cnfrmPassword" class="form-control" placeholder="Confirm Password" autofocus="true" type="password" maxlength="10"/>
					</div>

					<div>
						<form:input id="datepicker" width="276" placeholder="Date of Birth" path="dob" />
					</div>

					<div class="input-group">
						<form:select style="height: 40px; width: 180px;" path="gender">
							<option value="0">Select Gender</option>
							<option value="1">Male</option>
							<option value="2">Female</option>
							<option value="3">Trigender</option>
						</form:select>
					</div>
					<div style="height: 50px;"></div>

					<div style="height: 60px;" class="input-group">
						<button class="btn btn-primary btn-lg btn-block" type="submit">
							<b style="font-size: 17px;">Sign Up</b>
						</button>
					</div>

					<div align="center">
						Already sign up. Click here to <a href="./login"
							style="font-style: italic; font-weight: bold; font-size: 20px;">login</a>.
					</div>


				</div>
			</form:form>
			<div class="text-right">
				<div class="credits">
					<!--
            All the links in the footer should remain intact.
            You can delete the links only if you purchased the pro version.
            Licensing information: https://bootstrapmade.com/license/
            Purchase the pro version form: https://bootstrapmade.com/buy/?theme=NiceAdmin
          -->
					<div style="height: 40px;"></div>
					Designed by <a href="https://bootstrapmade.com/">Jai Shanker</a>
				</div>
			</div>
		</div>

	</section>

	<script>
		$('#datepicker').datepicker({
			uiLibrary : 'bootstrap4'
		});
	</script>

</body>

</html>
