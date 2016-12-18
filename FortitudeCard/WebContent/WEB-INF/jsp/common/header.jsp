<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/common/header.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/lib/bootstrap.min.css" />

<!-- Import Library Files -->
<script src="${pageContext.request.contextPath}/resources/js/lib/bootstrap.min.js"/></script>


<!-- Import Application Files -->
<script src="${pageContext.request.contextPath}/resources/js/app/header.js"/></script>

</head>
<body>

<div class="header-container container">
  <nav class="navbar navbar-inverse">
    <div class="navbar-header">
    	<button class="navbar-toggle" type="button" data-toggle="collapse" data-target=".js-navbar-collapse">
			<span class="sr-only">Toggle navigation</span>
			<span class="icon-bar"></span>
			<span class="icon-bar"></span>
			<span class="icon-bar"></span>
		</button>
		<a class="navbar-brand" href="#">Fotritude</a>
	</div>
	
	<div class="collapse navbar-collapse js-navbar-collapse">
	
		<!-- Main menu middle section start -->
		<ul class="nav navbar-nav">
			<li class="dropdown mega-dropdown">
				<a href="#" class="dropdown-toggle" data-toggle="dropdown">My Account<span class="caret"></span></a>				
					<ul class="dropdown-menu ">
						<li><a href="#">View Transaction HIstory</a></li>
						<li><a href="#">Bonus Management</a></li>
	                    <li><a href="#">Interest Gains</a></li>
	                    <li><a href="#">Geneology Tree</a></li>
						<li><a href="#">Buy LTE Coins</a></li>
					</ul>
			</li>
			
			<li class="dropdown mega-dropdown">
				<a href="#" class="dropdown-toggle" data-toggle="dropdown">Transfer</a>				
			</li>
			
			<li class="dropdown mega-dropdown">
				<a href="#" class="dropdown-toggle" data-toggle="dropdown">Invest<span class="caret"></span></a>				
				<ul class="dropdown-menu ">
					<li><a href="#">Account Summery</a></li>
					<li><a href="#">Add account</a></li>
                    <li><a href="#">Single blog page</a></li>
				</ul>
			</li>
			
			<li class="dropdown mega-dropdown">
				<a href="#" class="dropdown-toggle" data-toggle="dropdown">Our Portfolio</a>				
			</li>
			
			<li class="dropdown mega-dropdown">
				<a href="#" class="dropdown-toggle" data-toggle="dropdown">Contact Us</a>				
			</li>
			
  		</ul>
  		<!-- Main menu middle section End-->
  		
  		
 <!-- Main menu middle section End-->
       <ul class="nav navbar-nav navbar-right">
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">My account <span class="caret"></span></a>
          <ul class="dropdown-menu" role="menu">
            <li><a href="#">Action</a></li>
            <li><a href="#">Another action</a></li>
            <li><a href="#">Something else here</a></li>
            <li class="divider"></li>
            <li><a href="#">Separated link</a></li>
          </ul>
        </li>
      </ul>
      <!-- Main menu middle section End-->
	</div><!-- /.nav-collapse -->
  </nav>
</div>








</body>
</html>