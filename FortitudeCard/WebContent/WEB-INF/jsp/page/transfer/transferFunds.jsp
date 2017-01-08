<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Transfer Funds</title>

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/cssAdmin/main-layout.css" />

<!-- Import Library Files -->
<script
	src="${pageContext.request.contextPath}/resources/js/lib/jquery.min.js" /></script>



<!-- Import Application Files -->
<script
	src="${pageContext.request.contextPath}/resources/js/app/common-app.js" /></script>

</head>
<body>
	<div id="header">
		<%@ include file="../../common/header.jsp"%>
	</div>
	<div id="content">
		<form:form id="transferForm" method="post" action="transferFunds.html"
			modelAttribute="transferBean">
			<%-- 		<form:label path="id">Enter username</form:label> --%>
			<%-- 		<form:input id="id" name="id" path="id" /> --%>
			<!-- 		<br> -->
			<%-- 		<form:label path="password">Please enter your password</form:label> --%>
			<%-- 		<form:password id="password" name="password" path="password" /> --%>
			<!-- 		<br> -->
			<!-- 		<input type="submit" value="Login" /> -->


			<div class="transfer-funds">
				<div class="attribute-container">
					<form:input type="text" id="toAccountId" name="toAccountId" path="toAccountId"
						placeholder="To Account Id" />
				</div>
				<div class="attribute-container">
					<form:input type="text" id="message" name="message"
						path="message" placeholder="Message" />
				</div>
				<div class="attribute-container button-container">
					<input type="submit" value="Transfer" />
				</div>
			</div>
		</form:form>

	</div>
	<div id="footer">
		<%@ include file="../../common/footer.jsp"%>
	</div>

</body>
</html>