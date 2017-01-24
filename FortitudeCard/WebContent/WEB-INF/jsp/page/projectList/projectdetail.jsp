<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<!DOCTYPE html>
<html>
<head>
<!-- <meta charset="utf-8"> -->
<title>Project Details</title>
<script src="//code.jquery.com/jquery-2.2.4.min.js"></script>
<%-- 
<spring:url value="../resources/js/jquery-1.9.1.min.js"
	var="jqueryJs" />
 --%>
<%-- <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/cssAdmin/main-layout.css" /> --%>

<!-- Import Library Files -->
<%-- <script src="${jqueryJs}"></script>
 --%>
<%-- <script src="${pageContext.request.contextPath}/resources/js/lib/jquery-1.9.1.min.js"/></script> --%>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">


<!-- Import Application Files -->
<script
	src="${pageContext.request.contextPath}/resources/js/app/common-app.js" /></script>
<script
	src="${pageContext.request.contextPath}/resources/js/page/projects.js" /></script>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/pages/projects.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/common/app.css">

</head>
<body>

	<div id="header">
		<%@ include file="../../common/header.jsp"%>
	</div>

	<div id="content" class=" container">
		<div class="fortitude-container">Project Id :
			${projectDto.projectId}</div>
	</div>
	<div id="content" class=" container">
		<div class="fortitude-container">Project Name :
			${projectDto.projectName}</div>
	</div>
	<div id="content" class=" container">
		<div class="fortitude-container">Project Owner :
			${projectDto.projectOwner}</div>
	</div>
	<div id="content" class=" container">
		<div class="fortitude-container">Project Cost :
			${projectDto.projectCost}</div>
	</div>
	<div id="content" class=" container">
		<div class="fortitude-container">Project Details :
			${projectDto.projectDetails}</div>
	</div>
	<div id="content" class=" container">
		<div class="fortitude-container">Project External Link :
			${projectDto.projectExternalLink}</div>
	</div>
	<div id="content" class=" container">
		<div class="fortitude-container">Minimum Amount To Invest :
			${projectDto.minimumAmountToInvest}</div>
	</div>
	<div id="content" class=" container">
		<div class="fortitude-container">Project Start Time :
			${projectDto.projectStartTime}</div>
	</div>
	<div id="content" class=" container">
		<div class="fortitude-container">Project Scheduled End Time :
			${projectDto.projectScheduledEndTime}</div>
	</div>
	<div id="content" class=" container">
		<div class="fortitude-container">Return Promised :
			${projectDto.returnPromised}</div>
	</div>
	<div id="content" class=" container">
		<div class="fortitude-container">Project Type :
			${projectDto.returnType}</div>
	</div>
	<div id="footer">
		<%@ include file="../../common/footer.jsp"%>
	</div>

</body>
</html>