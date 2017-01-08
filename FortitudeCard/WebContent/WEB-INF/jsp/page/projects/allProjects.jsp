<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All Projects</title>

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
		<form:form id="projectsForm" method="post" action="addProjects.html"
			modelAttribute="projectsBean">
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
					<form:input type="text" id="projectAmount" name="projectAmount"
						path="projectAmount" placeholder="Project Amount" />
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