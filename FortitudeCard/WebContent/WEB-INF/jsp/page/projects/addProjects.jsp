<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Projects</title>
<!-- Import Library Files -->

<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>





<%-- <script
	src="<c:url value ="${pageContext.request.contextPath}/resources/js/jquery-1.9.1.min.js"/>"></script> --%>
<link href="https://fonts.googleapis.com/css?family=Lato:400,300,700"
	rel='stylesheet' type='text/css'>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/lib/bootstrap.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/font-awesome.min.css">

<script>
	$('#datepicker').datepicker({
		dateFormat : "YYYY-MM-DD",
		showOn : 'button',
		buttonImageOnly : true
	});
</script>


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
			<%--modelAttribute="projectsBean">--%>
			<%-- 		<form:label path="id">Enter username</form:label> --%>
			<%-- 		<form:input id="id" name="id" path="id" /> --%>
			<!-- 		<br> -->
			<%-- 		<form:label path="password">Please enter your password</form:label> --%>
			<%-- 		<form:password id="password" name="password" path="password" /> --%>
			<!-- 		<br> -->
			<!-- 		<input type="submit" value="Login" /> -->
			<%-- <c:set var="now" value="<%=new java.util.Date()%>" /> --%>

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
					<form:input type="number" id="projectCost" name="projectCost"
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
				<div class="attribute-container">
					<form:input type="text" id="projectExternalLink"
						name="projectExternalLink" path="projectExternalLink"
						placeholder="Project ExternalLink" />
				</div>
				<div class="attribute-container">
					<form:input type="number" id="minimumAmountToInvest"
						name="minimumAmountToInvest" path="minimumAmountToInvest"
						placeholder="minimumAmountToInvest" />
				</div>
				<%-- 	<div class="attribute-container">
					<form:input type="date" id="datePicker" name="projectStartTime"
						path="projectStartTime" placeholder="Project Start Time" />
				</div> --%>
				 <div class="attribute-container">
					<form:input type="date" id="datePicker"
						name="projectScheduledEndTime" path="projectScheduledEndTime"
						placeholder="Project Scheduled End Time" />
				</div>
				<div class="attribute-container">
					<form:input type="date" id="datePicker" name="projectActualEndTime"
						path="projectActualEndTime" placeholder="Project Actual End Time" />
				</div> 
				<%--  <div class="attribute-container">
					<form:radiobutton id="isTargetMet" name="isTargetMet"
						path="isTargetMet" value = "false" placeholder="isTargetMet" />
				</div>   --%>
				<div class="attribute-container">
					<form:input type="text" id="returnPromised" name="returnPromised"
						path="returnPromised" placeholder="Return Promised" />
				</div>
				<div class="attribute-container">
					<form:select path="returnType" id="returnType"
						items="${returnTypeList}" placeholder="Return Type" />
				</div>
				<div class="attribute-container button-container">
					<input type="submit" value="Create" />
				</div>
			</div>
			<spring:message message="${error}" />

		</form:form>

	</div>
	<div id="footer">
		<%@ include file="../../common/footer.jsp"%>
	</div>

</body>
</html>