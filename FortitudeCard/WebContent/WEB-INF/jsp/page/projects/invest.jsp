<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form"
				uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<!-- <meta charset="utf-8"> -->
<title>Projects</title>
<script src="//code.jquery.com/jquery-2.2.4.min.js"></script>
<%-- 
<spring:url value="../resources/js/jquery-1.9.1.min.js"
	var="jqueryJs" />
 --%><%-- <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/cssAdmin/main-layout.css" /> --%>

<!-- Import Library Files -->
<%-- <script src="${jqueryJs}"></script>
 --%><%-- <script src="${pageContext.request.contextPath}/resources/js/lib/jquery-1.9.1.min.js"/></script> --%>
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
<%@ page session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

			
	<div id="content" class=" container">
		<div class="fortitude-container">
			
			<%-- <c:forEach var="investmentVo" items="${investmentVo}"> --%>
			Total Interest Gained: ${investmentVo.totalInterest}
			<%-- </c:forEach> --%>
		</div>
		<div class="fortitude-container">
			
			User Id : ${investmentVo.userId}
			<%-- <c:forEach var="investmentVo" items="${investmentVo}"> --%>
			
			<%-- </c:forEach> --%>
		</div>
		<div class="fortitude-container">
			
			<%-- <c:forEach var="investmentVo" items="${investmentVo}"> --%>
			Projects : ${investmentVo.projectId}
			
			<%-- </c:forEach> --%>
		</div>
		<div class="fortitude-container">
			
			
			Total Investments Made : ${investmentVo.totalInvestmentsMade}
			<%-- </c:forEach> --%>
		</div>
	</div>
</div>
	<div id="footer">
		<%@ include file="../../common/footer.jsp"%>
	</div>

</body>
</html>