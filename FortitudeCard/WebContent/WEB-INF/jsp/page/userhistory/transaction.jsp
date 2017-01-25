<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Investments Summary</title>
<script src="//code.jquery.com/jquery-2.2.4.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
<script src="http://code.highcharts.com/highcharts.js"></script>
<script
	src="${pageContext.request.contextPath}/resources/js/page/transaction.js" /></script>

<%-- <script
	src="<c:url value ="${pageContext.request.contextPath}/resources/js/jquery-1.9.1.min.js"/>"></script>
 --%>
<%-- <link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/cssAdmin/main-layout.css" /> --%>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/sign-up.css">
<!-- Import Library Files -->



<!-- Import Application Files -->
<script
	src="${pageContext.request.contextPath}/resources/js/app/common-app.js" /></script>
</head>
<body>

	<div id="header">
		<%@ include file="../../common/header.jsp"%>
	</div>
	<!-- <div id="container" style="height: 400px"></div> -->
	<div>
	<table>
		<tr>
			<td align = "center">
			<div id = "outerDiv" style = "width:100%">
			<div id="placeholder"></div>
			</div>
			</td>
		</tr>
	</table>
	</div>
	
	<div id="footer">
		<%@ include file="../../common/footer.jsp"%>
	</div>
</body>
</html>