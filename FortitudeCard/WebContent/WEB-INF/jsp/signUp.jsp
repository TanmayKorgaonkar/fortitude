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
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>

<script>
$('#datepicker').datepicker({ 
    showOn: 'button', 
    buttonImageOnly: true
});
<!-- $(function(){
	$("#datepicker").datepicker({
	prevText:"Click to show previous months",
	nextText:"Click to show next months",
	showOtherMonths:true,
	selectOtherMonths:true
	});
}); -->
</script>


<link href="https://fonts.googleapis.com/css?family=Lato:400,300,700"
	rel='stylesheet' type='text/css'>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/normalize.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/main.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/lib/bootstrap.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/font-awesome.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/owl.carousel.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/responsive.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/style.css">

<!--  -->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/sign-up.css">


</head>
<body>

	<h2>Fill The Form</h2>

	<form:form method="POST" commandName="signUp">


		<div class="sign-up-page ">
			<div class="attribute-container">
				<div class="title-text ">Enter Your Desired User Id</div>
				<div class="separator ">:</div>
				<div class="value-container ">
					<div class="value-text">
						<form:input path="accountId" />
					</div>
					<div class="value-error-text">
						<form:errors path="accountId" cssStyle="color: #ff0000;" />
					</div>
				</div>
			</div>

			<div class="attribute-container">
				<div class="title-text ">Enter Your First Name</div>
				<div class="separator ">:</div>
				<div class="value-container ">
					<div class="value-text">
						<form:input path="accountFirstName" />
					</div>
					<div class="value-error-text">
						<form:errors path="accountId" cssStyle="color: #ff0000;" />
					</div>
				</div>
			</div>

			<div class="attribute-container">
				<div class="title-text ">Enter Your Last Name</div>
				<div class="separator ">:</div>
				<div class="value-container ">
					<div class="value-text">
						<form:input path="accountLastName" />
					</div>
					<div class="value-error-text">
						<form:errors path="accountLastName" cssStyle="color: #ff0000;" />
					</div>
				</div>
			</div>

			<div class="attribute-container">
				<div class="title-text ">Enter Your Nick Name</div>
				<div class="separator ">:</div>
				<div class="value-container ">
					<div class="value-text">
						<form:input path="accountNickName" />
					</div>
					<div class="value-error-text">
						<form:errors path="accountNickName" cssStyle="color: #ff0000;" />
					</div>
				</div>
			</div>

			<div class="attribute-container">
				<div class="title-text ">Enter Your rank</div>
				<div class="separator ">:</div>
				<div class="value-container ">
					<div class="value-text">
						<form:input path="rank" />
					</div>
					<div class="value-error-text">
						<form:errors path="rank" cssStyle="color: #ff0000;" />
					</div>
				</div>
			</div>

			<div class="attribute-container">
				<div class="title-text ">Enter Your Date of birth(YYYY-MM-DD)</div>
				<div class="separator ">:</div>
				<div class="value-container ">
					<div class="value-text">
						<form:input path="dateOfBirth" type="text" id="datePicker" />
					</div>
					<div class="value-error-text">
						<form:errors path="dateOfBirth" cssStyle="color: #ff0000;" />
					</div>
				</div>
			</div>

			<div class="attribute-container">
				<div class="title-text ">Select Your gender(M/F)</div>
				<div class="separator ">:</div>
				<div class="value-container ">
					<div class="value-text">
						<form:select path="gender" items="${genderList}" />
					</div>
					<div class="value-error-text">
						<form:errors path="gender" cssStyle="color: #ff0000;" />
					</div>
				</div>
			</div>
			
			
			<div class="attribute-container">
				<div class="title-text ">Enter Your Mobile Number</div>
				<div class="separator ">:</div>
				<div class="value-container ">
					<div class="value-text">
						<form:input path="mobileNumber" />
					</div>
					<div class="value-error-text">
						<form:errors path="mobileNumber" cssStyle="color: #ff0000;" />
					</div>
				</div>
			</div>

			<div class="attribute-container">
				<div class="title-text ">Enter Your Current Country</div>
				<div class="separator ">:</div>
				<div class="value-container ">
					<div class="value-text">
						<form:input path="country" />
					</div>
					<div class="value-error-text">
						<form:errors path="country" cssStyle="color: #ff0000;" />
					</div>
				</div>
			</div>

			<div class="attribute-container">
				<div class="title-text ">Enter Your Email</div>
				<div class="separator ">:</div>
				<div class="value-container ">
					<div class="value-text">
						<form:input path="email" />
					</div>
					<div class="value-error-text">
						<form:errors path="email" cssStyle="color: #ff0000;" />
					</div>
				</div>
			</div>

			<div class="attribute-container">
				<div class="title-text ">Enter Your LiteCoinAddress</div>
				<div class="separator ">:</div>
				<div class="value-container ">
					<div class="value-text">
						<form:input path="liteCoinAddress" />
					</div>
					<div class="value-error-text">
						<form:errors path="liteCoinAddress" cssStyle="color: #ff0000;" />
					</div>
				</div>
			</div>

			<div class="attribute-container">
				<div class="title-text ">Enter Your Sponsor link</div>
				<div class="separator ">:</div>
				<div class="value-container ">
					<div class="value-text">
						<form:input path="sponsorLink" />
					</div>
					<div class="value-error-text">
						<form:errors path="sponsorLink" cssStyle="color: #ff0000;" />
					</div>
				</div>
			</div>

			<div class="attribute-container">
				<div class="title-text ">Enter Your account password</div>
				<div class="separator ">:</div>
				<div class="value-container ">
					<div class="value-text">
						<form:password path="accountPassword" />
					</div>
					<div class="value-error-text">
						<form:errors path="accountPassword" cssStyle="color: #ff0000;" />
					</div>
				</div>
			</div>

			<div class="attribute-container">
				<div class="title-text ">Confirm your account password</div>
				<div class="separator ">:</div>
				<div class="value-container ">
					<div class="value-text">
						<form:password path="passwordConfirmation" />
					</div>
					<div class="value-error-text">
						<form:errors path="passwordConfirmation"
							cssStyle="color: #ff0000;" />
					</div>
				</div>
			</div>

			<div class="attribute-container">
				<div class="title-text ">Select your account type
					(User/Investor)</div>
				<div class="separator ">:</div>
				<div class="value-container ">
					<div class="value-text">
						<form:select path="userRole" items="${userRole}" />
					</div>
					<div class="value-error-text">
						<form:errors path="userRole" cssStyle="color: #ff0000;" />
					</div>
				</div>
			</div>

			<div class="submit-button-container">
				<input type="submit" class="btn btn-success submit-button"
					name="submit" value="Submit">
			</div>

		</div>

	</form:form>
</body>
</html>