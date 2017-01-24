<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<!-- <meta charset="utf-8"> -->
<title>Projects</title>
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
		<%@ include file="../common/header.jsp"%>
	</div>

	<div id="content" class=" container">
		<div class="fortitude-container">
			<%@ page session="false"%>
			<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

			<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

			<c:forEach var="project" items="${projects}">
				<div
					class="col-lg-3 col-md-3 col-sm-6 col-xs-12 invest-project-container">
					<div class="invest-title-project-image"
						style="background-image : url(${pageContext.request.contextPath}/resources/img/${project.projectId}.jpg)">
					</div>
					<div class="invest-project-cart-inner-container">
						<div class="link">
							<a id="project4-popover-link" tabindex="0"
								class="invest-title-project-header" role="button"
								data-placement="bottom" data-trigger="focus">${project.projectName}</a>
						</div>
						<div class="invest-project-more-option link">
							<a id="pop-over-operner"
								class="glyphicon glyphicon-option-vertical"
								data-toggle="popover" data-placement="bottom"
								data-trigger="click" data-content="Invest" role="button"></a>
						</div>
					</div>
					<div class="invest-title-project-name invest-project-cart-inner-container">${project.projectCategory}</div>
					<div class="invest-title-project-details invest-project-cart-inner-container">${project.projectDetails}</div>
					<div class="invest-project-cart-inner-container">
						<div class="invest-project-cart-progress-container" >
							<div class="invest-project-cart-progress" style="width:${project.currentInvestment/project.projectCost*100}%"></div>
						</div>
					</div>
					<div
						class="invest-title-project-name invest-project-cart-inner-container">
					</div>
					<form action="https://www.paypal.com/cgi-bin/webscr" method="post"
						target="_top">
						<input type="hidden" name="cmd" value="_s-xclick"> <input
							type="hidden" name="hosted_button_id" value="5RFACH3JF395J">
						<input type="image"
							src="https://www.paypalobjects.com/en_GB/SG/i/btn/btn_buynowCC_LG.gif"
							border="0" name="submit"
							alt="PayPal – The safer, easier way to pay online!"> <img
							alt="" border="0"
							src="https://www.paypalobjects.com/en_GB/i/scr/pixel.gif"
							width="1" height="1">
					</form>
					<%-- <form name="submitForm" method="POST" action="invest.html">
						<input type="hidden" name="projectId" value="${project.projectId}"> 
						<A HREF="javascript:document.submitForm.submit()">Click Me</A>
					</form> --%>
					<%-- <form:form action = "projects.html" method="post" modelAttribute="beanss" id="investForm">
							<form:input type="number" name="investmentAmount" path="investmentAmount"/>
							<form:input type="number" name="interestPerMonth" path="interestPerMonth"/>
							<input type="submit" name="submit" value="Submit">
						</form:form> --%>
					<!--  <a href="invest.html">invest</a>-->
				</div>
			</c:forEach>
		</div>
	</div>
	<div id="footer">
		<%@ include file="../common/footer.jsp"%>
	</div>

</body>
</html>