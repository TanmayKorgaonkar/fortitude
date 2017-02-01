<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MyAccount</title>
<script src="//code.jquery.com/jquery-2.2.4.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>

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
		<%@ include file="../common/header.jsp"%>
	</div>
	
	<div class = "account-page">
	  <div class ="attribute-container">
	    <div class="title-text">User Id</div>
	    <div class="seperator">:</div> 
	    <div class="title-text"><c:out value="${account.accountId}" /></div>  
	  </div>

	  <div class ="attribute-container">
	    <div class="title-text">Account First Name</div>
	    <div class="seperator">:</div> 
	    <div class="title-text"><c:out value="${account.accountFirstName}" /></div>  
	  </div>

	  <div class ="attribute-container">
	    <div class="title-text">Account Last Name</div>
	    <div class="seperator">:</div> 
	    <div class="title-text"><c:out value="${account.accountLastName}" /></div>  
	  </div>

	  <div class ="attribute-container">
	    <div class="title-text">Account Nick Name</div>
	    <div class="seperator">:</div> 
	    <div class="title-text"><c:out value="${account.accountNickName}" /></div>  
	  </div>

	  <div class ="attribute-container">
	    <div class="title-text">Rank</div>
	    <div class="seperator">:</div> 
	    <div class="title-text"><c:out value="${account.rank}" /></div>  
	  </div>

	  <div class ="attribute-container">
	    <div class="title-text">Date Of Birth</div>
	    <div class="seperator">:</div> 
	    <div class="title-text"><c:out value="${account.dateOfBirth}" /></div>  
	  </div>

	  <div class ="attribute-container">
	    <div class="title-text">Gender</div>
	    <div class="seperator">:</div> 
	    <div class="title-text"><c:out value="${account.gender}" /></div>  
	  </div>

	  <div class ="attribute-container">
	    <div class="title-text">Mobile Number</div>
	    <div class="seperator">:</div> 
	    <div class="title-text"><c:out value="${account.mobileNumber}" /></div>  
	  </div>

	  <div class ="attribute-container">
	    <div class="title-text">Country</div>
	    <div class="seperator">:</div> 
	    <div class="title-text"><c:out value="${account.country}" /></div>  
	  </div>

	  <div class ="attribute-container">
	    <div class="title-text">Email</div>
	    <div class="seperator">:</div> 
	    <div class="title-text"><c:out value="${account.email}" /></div>  
	  </div>

	  <div class ="attribute-container">
	    <div class="title-text">Lite Coin Address</div>
	    <div class="seperator">:</div> 
	    <div class="title-text"><c:out value="${account.liteCoinAddress}" /></div>  
	  </div>


	  <div class ="attribute-container">
	    <div class="title-text">Sponsor Link</div>
	    <div class="seperator">:</div> 
	    <div class="title-text"><c:out value="${account.sponsorLink}" /></div>  
	  </div>


	  <div class ="attribute-container">
	    <div class="title-text">Total Earnings</div>
	    <div class="seperator">:</div> 
	    <div class="title-text"><c:out value="${account.totalEarnings}" /></div>  
	  </div>


	  <div class ="attribute-container">
	    <div class="title-text">User Role</div>
	    <div class="seperator">:</div> 
	    <div class="title-text"><c:out value="${account.userRole}" /></div>  
	  </div>
</div>
	<div id="content" class="container"></div>
	<div id="footer">
		<%@ include file="../common/footer.jsp"%>
	</div>
</body>
</html>