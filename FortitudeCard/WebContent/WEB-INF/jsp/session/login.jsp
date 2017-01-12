<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>

<!doctype html>
<html class="no-js" lang="">
<head>
<meta charset="utf-8">
<meta http-equiv="x-ua-compatible" content="ie=edge">
<title>Login</title>
<meta name="description" content="">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!--[if lt IE 9]> <script src="js/html5shiv.js"></script> 
	<script src="js/respond.min.js"></script> <![endif]-->
<!-- Place favicon.ico in the root directory -->
<link href="https://fonts.googleapis.com/css?family=Lato:400,300,700"
	rel='stylesheet' type='text/css'>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/normalize.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/main.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/font-awesome.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/owl.carousel.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/responsive.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/style.css">
	
<script src="${pageContext.request.contextPath}/resources/js/app/signup-app/signup.js"/></script>
	

<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/login.css">

</head>

<body onload='document.loginForm.username.focus();'>
	<form name='loginForm'
			action="<c:url value='/j_spring_security_check' />" method='POST'>
<%-- 		<form:label path="id">Enter username</form:label> --%>
<%-- 		<form:input id="id" name="id" path="id" /> --%>
<!-- 		<br> -->
<%-- 		<form:label path="password">Please enter your password</form:label> --%>
<%-- 		<form:password id="password" name="password" path="password" /> --%>
<!-- 		<br> -->
<!-- 		<input type="submit" value="Login" /> -->


         		<div class="login-page">
         		
         				<c:if test="${not empty error}">
			<div class="error">${error}</div>
		</c:if>
		<c:if test="${not empty msg}">
			<div class="msg">${msg}</div>
		</c:if>
         		
         		
         			<div class="main-container">
	         			<div class="attribute-container">
	<%--          				<form:input id="id" name="id" path="id" placeholder="e-mail address"/> --%>
	         				<input type='text' name='username' path="id" path="id" placeholder="e-mail address"/>
	         			</div >
	         			<div class="attribute-container">
	         				<input type='password' name='password' path="password" placeholder="password"/>
	         			</div>
	         			<div class="attribute-container button-container">
	         				<input name="submit" type="submit"
						value="submit" />
	         			</div>
	         		</div>
	         		<div class="link-container">
         				<a href="signUp.html">Sign up</a>
         			</div>
         			<!-- 
         			Will not work currently. Tanmay has to do. 
         			        			<div class="attribute-container button-container">
         				<input type="submit" value="SignUp" name="signupButton" onclick="redirectToSignUpPage('signUp.html')"/>
         			</div>
         			 -->
         		</div>

			<input type="hidden" name="${_csrf.parameterName}"
				value="${_csrf.token}" />

	</form>
</body>
</html>