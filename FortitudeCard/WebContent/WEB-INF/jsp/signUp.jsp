<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!doctype html>
<html class="no-js" lang="">
<head>
<meta charset="utf-8">
<meta http-equiv="x-ua-compatible" content="ie=edge">
<title>Sign Up</title>
<meta name="description" content="">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!--[if lt IE 9]> <script src="js/html5shiv.js"></script> 
	<script src="js/respond.min.js"></script> <![endif]-->
<!-- Place favicon.ico in the root directory -->
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>

<script>
  $( function() {
    $( "#datepicker" ).datepicker();
  } );
  </script>

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

</head>
<body>

	<h2>Fill The Form</h2>
	
	<form:form method="POST" commandName="signUp">
		<table>
			<tr>
				<td>Enter Your Desired User Id:</td>
				<td><form:input path="accountId" /></td>
				<td><form:errors path="accountId" cssStyle="color: #ff0000;"/></td>
			</tr>
			<tr>
				<td>Enter Your First Name:</td>
				<td><form:input path="accountFirstName"/></td>
				<td><form:errors path="accountId" cssStyle="color: #ff0000;"/></td>
			</tr>
			<tr>
				<td>Enter Your Last Name:</td>
				<td><form:input path="accountLastName" /></td>
				<td><form:errors path="accountLastName" cssStyle="color: #ff0000;"/></td>
			</tr>
			<tr>
				<td>Enter Your Desired NickName:</td>
				<td><form:input path="accountNickName" /></td>
				<td><form:errors path="accountNickName" cssStyle="color: #ff0000;"/></td>
			</tr>
			<tr>
				<td>Enter Your rank:</td>
				<td><form:input path="rank" /></td>
				<td><form:errors path="rank" cssStyle="color: #ff0000;"/></td>
			</tr>
			<tr>
				<td>Enter Your Date of birth(YYYY-MM-DD):</td>
				<td><form:input path="dateOfBirth" type="text" id="datePicker"/></td>
				<td><form:errors path="dateOfBirth" cssStyle="color: #ff0000;"/></td>
			</tr>
			<tr>
				<td>Enter Your gender:</td>
				<td><form:input path="gender" /></td>
				<td><form:errors path="gender" cssStyle="color: #ff0000;"/></td>
			</tr>
			<tr>
				<td>Enter Your Mobile Number:</td>
				<td><form:input path="mobileNumber" /></td>
				<td><form:errors path="mobileNumber" cssStyle="color: #ff0000;"/></td>
			</tr>
			<tr>
				<td>Enter Your Current Country:</td>
				<td><form:input path="country" /></td>
				<td><form:errors path="country" cssStyle="color: #ff0000;"/></td>
			</tr>
			<tr>
				<td>Enter Your Email:</td>
				<td><form:input path="email" /></td>
				<td><form:errors path="email" cssStyle="color: #ff0000;"/></td>
			</tr>
			<tr>
				<td>Enter Your LiteCoinAddress:</td>
				<td><form:input path="liteCoinAddress" /></td>
				<td><form:errors path="liteCoinAddress" cssStyle="color: #ff0000;"/></td>
			</tr>
			<tr>
				<td>Enter Your Sponsor link:</td>
				<td><form:input path="sponsorLink" /></td>
				<td><form:errors path="sponsorLink" cssStyle="color: #ff0000;"/></td>
			</tr>
			<tr>
				<td>Enter Your account password:</td>
				<td><form:input path="accountPassword" /></td>
				<td><form:errors path="accountPassword" cssStyle="color: #ff0000;"/></td>
			</tr>
			<tr>
				<td>Confirm your account password:</td>
				<td><form:input path="passwordConfirmation" /></td>
				<td><form:errors path="passwordConfirmation" cssStyle="color: #ff0000;"/></td>
			</tr>
			<tr>
				<td>Select your account type (User/Investor)</td>
				<td><form:input path="userRole" /></td>
				<td><form:errors path="userRole" cssStyle="color: #ff0000;"/></td>
			</tr>
			<tr>
				<td><input type="submit" name="submit" value="Submit"></td>
			</tr>
		</table>	
	</form:form>
</body>
</html>