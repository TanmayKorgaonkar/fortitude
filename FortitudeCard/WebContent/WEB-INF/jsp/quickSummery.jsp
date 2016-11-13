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

</body>
</html>