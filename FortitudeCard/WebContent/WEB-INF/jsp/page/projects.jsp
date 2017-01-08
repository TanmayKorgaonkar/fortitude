<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/cssAdmin/main-layout.css" />

<!-- Import Library Files -->
<script src="${pageContext.request.contextPath}/resources/js/lib/jquery-1.9.1.min.js"/></script>



<!-- Import Application Files -->
<script src="${pageContext.request.contextPath}/resources/js/app/common-app.js"/></script>

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/pages/projects.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/common/app.css">

</head>
<body>

<div id="header">
	<%@ include file="../common/header.jsp" %>
</div>

<div id="content" class=" container">
	<div class="fortitude-container">
		<%@ page session="false"%>
		<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
		<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
		<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
		<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
		
		<c:forEach var="project" items="${projects}">
		
			<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
				<div class="invest-title-project-image" style="background-image : url(${pageContext.request.contextPath}/resources/img/${project.projectId}.jpg)">
				</div>
				<a id="project4-popover-link" tabindex="0" class="invest-title-project-header" role="button" data-placement="bottom" data-trigger="focus">${project.projectName}</a>
				<div class="invest-title-project-name">${project.projectCategory}</div>
				<div class="invest-title-project-details">${project.projectDetails}</div>
			</div>
		
		</c:forEach>
	</div>
</div>
<div id="footer">
	<%@ include file="../common/footer.jsp" %>
</div>

</body>
</html>