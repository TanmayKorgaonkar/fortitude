<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html class="no-js" lang="">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <title>Fortitude Group</title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">

	<!--[if lt IE 9]> <script src="js/html5shiv.js"></script> 
	<script src="js/respond.min.js"></script> <![endif]--> 		
        <!-- Place favicon.ico in the root directory -->
		<link href="https://fonts.googleapis.com/css?family=Lato:400,300,700" rel='stylesheet' type='text/css'>
        <link rel="stylesheet" href="../resources/css/normalize.css">
        <link rel="stylesheet" href="../resources/css/main.css">
        <link rel="stylesheet" href="../resources/css/bootstrap.min.css">
        <link rel="stylesheet" href="../resources/css/font-awesome.min.css">
        <link rel="stylesheet" href="../resources/css/owl.carousel.css">
        <link rel="stylesheet" href="../resources/css/responsive.css">
        <link rel="stylesheet" href="../resources/css/style.css">

    </head>
<body>

<header class="main_menu_sec navbar navbar-default navbar-fixed-top">
	<div class="container">
		<div class="row">
			<div class="col-lg-3 col-md-3 col-sm-12">
				<div class="lft_hd">
					<a href="homepage.jsp"><img src="/resources/img/logo.png" alt=""/></a>
				</div>
			</div>			
			<div class="col-lg-9 col-md-9 col-sm-12">
				<div class="rgt_hd">					
					<div class="main_menu">
						<nav id="nav_menu">
							<button aria-controls="navbar" aria-expanded="false" data-target="#navbar" data-toggle="collapse" class="navbar-toggle collapsed" type="button">
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
							</button>	
						<div id="navbar">
							<ul>
								<li><a class="page-scroll" href="homepage.jsp">Home</a></li> 
							<li><a href="#">My Account <i class="fa fa-angle-down"></i></a>
							<ul>
								<li><a class="page-scroll" href="#act_sum_sec">Quick Summary</a></li>
								<li><a class="page-scroll" href="#tstm_sec">Past Records</a></li>
								<li><a class="page-scroll" href="#lts_sec">Latest Deals</a></li>
								<li><a class="page-scroll" href="#pricing_sec">Investments</a></li>
								<li><a class="page-scroll" href="#clt_sec">Our Happy Client</a></li>
							</ul>
							</li> 						

							<li><a href="#">Transfer<i class="fa fa-angle-down"></i></a>
<!-- 							<ul> -->
<!-- 								<li><a class="page-scroll" href="blog.html">Trade</a></li> -->
<!-- 								<li><a class="page-scroll" href="single.html">Single Blog Page</a></li> -->
<!-- 							</ul> -->
							<li><a href="#">Invest<i class="fa fa-angle-down"></i></a>
							<ul>
								<li><a class="page-scroll" href ="/FortitudeCard/listAccounts/accounts.html">Account Summary</a></li>
								<li><a class="page-scroll" href="/InsertAccountController/AddAccounts">Add Account</a></li>
								<li><a class="page-scroll" href="single.html">Single Blog Page</a></li>
							</ul>
							</li> 
							
								<li><a class="page-scroll" href="#abt_sec">Invest</a></li>
								<li><a class="page-scroll" href="#pr_sec">Request</a></li>
								<li><a class="page-scroll" href="#protfolio_sec">Our Portfolio</a></li>
								<li><a class="page-scroll" href="#ctn_sec">Contact Us</a></li>
							</ul>
						</div>		
						</nav>			
					</div>					
						
				</div>
			</div>	
		</div>	
	</div>	
</header>

<!-- start Account Summery Section -->
<section id="act_sum_sec">
	<div class="container">
		<div class="row">
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs12 ">
				<div class="title_sec">
				</div>			
			</div>		
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs12 ">
				<div class="abt">
					<p>This is account summery section</p>
				</div>
				
				<div class="account-summery">
					<div class="row quick-summery">
					  STATISTIC CHART
					</div>
				
					<div class="row">
					<div class="col-md-1"></div>
  					<div class="col-md-2 first-column">Account Number</div>
  					<div class="col-md-2 middle-column">Name</div>
					<div class="col-md-2 middle-column">Mobile Number</div>
					<div class="col-md-2 middle-column" >Email-Address</div>
					<div class="col-md-2 last-column">Total Earnings</div>
					<div class="col-md-1"></div>
					</div>
					
					<div class="row">
					<div class="col-md-1"></div>
  					<div class="col-md-2 first-column">${account.accountId}</div>
  					<div class="col-md-2 middle-column">${account.accountName}</div>
					<div class="col-md-2 middle-column">${account.mobileNumber}</div>
					<div class="col-md-2 middle-column" >${account.email}</div>
					<div class="col-md-2 last-column">${account.totalEarnings}</div>
					<div class="col-md-1"></div>
					</div>
					
				</div>
			</div>			
		</div>
	</div>
</section>
<!-- End Account Summery Section -->

<!-- start footer Section -->
<footer id="ft_sec">
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<div class="ft">						
					<ul>
						<li><a href=""><i class="fa fa-facebook"></i></a></li>
						<li><a href=""><i class="fa fa-twitter"></i></a></li>
						<li><a href=""><i class="fa fa-dribbble"></i></a></li>
						<li><a href=""><i class="fa fa-rss"></i></a></li>
						<li><a href=""><i class="fa fa-flickr"></i></a></li>
						<li><a href=""><i class="fa fa-pinterest"></i></a></li>
						<li><a href=""><i class="fa fa-linkedin"></i></a></li>
						<li><a href=""><i class="fa fa-skype"></i></a></li>
						<li><a href=""><i class="fa fa-google"></i></a></li>
					</ul>					
				</div>
				<ul class="copy_right">
					<li>&copy;FortitudeGroup 2016</li>
					<li>Developed by Fortitude</li>
				</ul>					
			</div>	
		</div>
	</div>
</footer>
<!-- End footer Section -->


</body>
</html>