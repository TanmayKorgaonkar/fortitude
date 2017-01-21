<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Projects</title>
<!-- Import Library Files -->

<script
	src="<c:url value ="${pageContext.request.contextPath}/resources/js/jquery-1.9.1.min.js"/>"></script>
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

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/cssAdmin/main-layout.css" />





<!-- Import Application Files -->
<script
	src="${pageContext.request.contextPath}/resources/js/app/common-app.js" /></script>

</head>
<body>

	<div id="header">
		<%@ include file="../../common/header.jsp"%>
	</div>
	<div id="content">
		<form:form id="projectsForm" method="post" action="addProjects.html" commandName="projectsBean">
			<%--modelAttribute="projectsBean">--%>
			<%-- 		<form:label path="id">Enter username</form:label> --%>
			<%-- 		<form:input id="id" name="id" path="id" /> --%>
			<!-- 		<br> -->
			<%-- 		<form:label path="password">Please enter your password</form:label> --%>
			<%-- 		<form:password id="password" name="password" path="password" /> --%>
			<!-- 		<br> -->
			<!-- 		<input type="submit" value="Login" /> -->


			<div class="add-projects">
				<div class="attribute-container">
					<form:input type="text" id="projectId" name="projectId"
						path="projectId" placeholder="Project Id" />
				</div>
				<div class="attribute-container">
					<form:input type="text" id="projectName" name="projectName"
						path="projectName" placeholder="Project Name" />
				</div>
				<div class="attribute-container">
					<form:input type="text" id="projectOwner" name="projectOwner"
						path="projectOwner" placeholder="Project Owner" />
				</div>
				<div class="attribute-container">
					<form:input type="text" id="projectCost" name="projectCost"
						path="projectCost" placeholder="Project Amount" />
				</div>
				<div class="attribute-container">
					<form:select path="projectCategory" id="projectCategory"
						items="${categoryList}" placeholder="Project Category" />
				</div>
				<div class="attribute-container">
					<form:input type="text" id="projectDetails" name="projectDetails"
						path="projectDetails" placeholder="Project Details" />
				</div>
				<div class="attribute-container button-container">
					<input type="submit" value="Create" />
				</div>
			</div>



		</form:form>

	</div>
	<div id="footer">
		<%@ include file="../../common/footer.jsp"%>
	</div>

</body>
</html>