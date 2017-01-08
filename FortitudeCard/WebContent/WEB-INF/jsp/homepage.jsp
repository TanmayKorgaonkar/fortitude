<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!doctype html>
<html class="no-js" lang="">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <title>Fortitude Group: Welcome ${loggedInUser}</title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">

	<!--[if lt IE 9]> <script src="js/html5shiv.js"></script> 
	<script src="js/respond.min.js"></script> <![endif]--> 		
        <!-- Place favicon.ico in the root directory -->
		<link href="https://fonts.googleapis.com/css?family=Lato:400,300,700" rel='stylesheet' type='text/css'>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/normalize.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/main.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/font-awesome.min.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/owl.carousel.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/responsive.css">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">

    </head>
<body >
		
<!-- Start Header Section -->
<header class="main_menu_sec navbar navbar-default navbar-fixed-top">
	<div class="container">
		<div class="row">
			<div class="col-lg-3 col-md-3 col-sm-12">
				<div class="lft_hd">
					<a href="homepage.jsp"><img src="${pageContext.request.contextPath}/resources/img/logo.png" alt=""/></a>
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
							<li><a href="/FortitudeCard/listAccounts/account.html">My Account <i class="fa fa-angle-down"></i></a>
							<ul>
								<li><a class="page-scroll" href="#act_sum_sec">View Transaction History</a></li>
								<li><a class="page-scroll" href="#tstm_sec">Bonus Management</a></li>
								<li><a class="page-scroll" href="#lts_sec">Interest Gains</a></li>
								<li><a class="page-scroll" href="#pricing_sec">Genealogy Tree</a></li>
								<li><a class="page-scroll" href="#clt_sec">Buy LTE Coins</a></li>
							</ul>
							</li> 						

							<li><a href="#">Transfer<i class="fa fa-angle-down"></i></a>
<!-- 							<ul> -->
<!-- 								<li><a class="page-scroll" href="blog.html">Trade</a></li> -->
<!-- 								<li><a class="page-scroll" href="single.html">Single Blog Page</a></li> -->
<!-- 							</ul> -->
							<li><a href="#">Invest<i class="fa fa-angle-down"></i></a>
							<ul>
								<li><a class="page-scroll" href ="/FortitudeCard/listAccounts/indexAdmin.html">Account Summary</a></li>
								<li><a class="page-scroll" href="/InsertAccountController/AddAccounts">Add Account</a></li>
								<li><a class="page-scroll" href="single.html">Single Blog Page</a></li>
							</ul>
							</li> 
							
								<li><a class="page-scroll" href="#abt_investment">Invest</a></li>
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
<!-- End Header Section -->

<!-- start slider Section -->
<section id="slider_sec">
	<div class="container">
		<div class="row">
			<div class="slider">
					<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
				  <!-- Indicators -->
				  <ol class="carousel-indicators">
					<li data-target="#carousel-example-generic" data-slide-to="0"></li>
					<li data-target="#carousel-example-generic" data-slide-to="1"></li>
					<li data-target="#carousel-example-generic" data-slide-to="2"></li>
				  </ol>

				  <!-- Wrapper for slides -->
				  <div class="carousel-inner" role="listbox">
					<div class="item active">
						<div class="wrap_caption">
						  <div class="caption_carousel">
							<h1>We Are FortitudeGroup</h1>
							<p>Lifestyle. Investments. Networking</p>
						  </div>						
						</div>
					</div>					
					<div class="item">
						<div class="wrap_caption">
						  <div class="caption_carousel">
							<h1>LifeStyle</h1>
							<p>Explore the luxury and awesomeness with our FortitudeCard</p>
						  </div>						
						</div>
					</div>					
					<div class="item">
						<div class="wrap_caption">
						  <div class="caption_carousel">
							<h1>Investments</h1>
							<p>Invest in hottest projects to earn extra</p>
						  </div>						
						</div>
					</div>			
				  </div>

				  <!-- Controls -->
				  <a class="left left_crousel_btn" href="#carousel-example-generic" role="button" data-slide="prev">
					<i class="fa fa-angle-left"></i>
					<span class="sr-only">Previous</span>
				  </a>
				  <a class="right right_crousel_btn" href="#carousel-example-generic" role="button" data-slide="next">
					<i class="fa fa-angle-right"></i>
					<span class="sr-only">Next</span>
				  </a>
				</div>
			</div>	
		</div>			
	</div>	
</section>
<!-- End slider Section -->

<!-- start about Section -->
<section id="abt_sec">
	<div class="container">
		<div class="row">
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs12 ">
				<div class="title_sec">
					<h1>ABOUT</h1>
					<h2>We are investment management and lifestyle firm from Singapore</h2>
				</div>			
			</div>		
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs12 ">
				<div class="abt">
					<p>Our Fortitude Card offers exclusive oppurtunities to explore the unseen. Our investment platform helps individuals invest their hard earned bucks to earn more!</p>
				</div>
			</div>			
		</div>
	</div>
</section>
<!-- End About Section -->

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
  					<div class="col-md-2 first-column">View Transaction History</div>
  					<div class="col-md-2 middle-column">Bonus Management</div>
					<div class="col-md-2 middle-column">Interest Gains</div>
					<div class="col-md-2 middle-column" >Genealogy tree</div>
					<div class="col-md-2 last-column">Buy Lite Coins</div>
					<div class="col-md-1"></div>
					</div>
					
				</div>
			</div>			
		</div>
	</div>
</section>
<!-- End Account Summery Section -->


<!-- start Counting section-->
<section id="counting_sec">
<div class="container">
	<div class="row">	

		<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
			<div class="counting_sl">
			<i class="fa fa-user"></i>
			<h2 class="counter">43,753</h2>
			<h4>Happy Subscribers</h4>	
			</div>
		</div>			
		<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
			<div class="counting_sl">
			<i class="fa fa-desktop"></i>
			<h2 class="counter">20,210</h2>
			<h4>Total deals</h4>	
			</div>
		</div>			
		<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
			<div class="counting_sl">
			<i class="fa fa-ticket"></i>
			<h2 class="counter">9,000,000</h2>
			<h4>Total money invested</h4>	
			</div>
		</div>			
		<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
			<div class="counting_sl">
			<i class="fa fa-clock-o"></i>
			<h2 class="counter">2,000,000</h2>
			<h4>Total returns given</h4>	
			</div>
		</div>										
	</div>					
</div>
</section>


<!-- start progress bar Section -->
<section id="skill_sec">
	<div class="container">
		<div class="row">
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs12 ">
				<div class="title_sec">
					<h1>Our Skill diagram</h1>
					<h2>We manage your money like none can</h2>
				</div>			
			</div>			
		  <div class="skills progress-bar1">		  
				<ul class="col-md-6 col-sm-12 col-xs-12 wow fadeInLeft">
					  <li class="progress">
							<div class="progress-bar" data-width="85">
								  Wordpress 85%
							</div>
					  </li>
					  <li class="progress">
							<div class="progress-bar" data-width="65">
								  Graphic Design 65%
							</div>
					  </li>
					  <li class="progress">
							<div class="progress-bar" data-width="90">
								  HTML/CSS Design 90%
							</div>
					  </li>
					  <li class="progress">
							<div class="progress-bar" data-width="60">
								  SEO 60%
							</div>
					  </li>
				</ul>
				<ul class="col-md-6 col-sm-12 col-xs-12 wow fadeInRight">
					  <li class="progress">
							<div class="progress-bar" data-width="75">
								  Agencying 75%
							</div>
					  </li>
					  <li class="progress">
							<div class="progress-bar" data-width="95">
								  App Development 95%
							</div>
					  </li>
					  <li class="progress">
							<div class="progress-bar" data-width="70">
								  IT Consultency 70%
							</div>
					  </li>
					  <li class="progress">
							<div class="progress-bar" data-width="90">
								  Theme Development 90%
							</div>
					  </li>
				</ul>
		  </div>
                     
		
		</div>
	</div>
</section>
<!-- End progress bar Section -->

<div id="abt_investment" style="height:100px"></div>
<!-- start Invest Section -->
<section id="sec_investment">
	<div class="container">
		<div class="row">
		
			<div  style="margin: 20px;" class="col-lg-12 col-md-12 col-sm-12 col-xs12 ">
				<div class="invest-main-title" >
					Investment
				</div>
				<div class="invest-title" >
					Fortitude Membership
				</div>	
				<div class="invest-title-header" >
						<div class="invest-title-header-item">BUY</div>
						<div class="invest-title-header-item">
							<div>$3,300 SGD</div>
							<div class="invest-title-details" >20% dividend on per month</div>
						</div>
				</div>			
			</div>
			

			<div class="col-lg-12 col-md-12 col-sm-12 col-xs12 ">
			
				<div class="invest-title-project-main-header" >	Card fund Business	</div>	
			
				<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
					<div class="invest-title-project-image" style="background-image: url(resources/img/proj1.jpeg);">
					</div>
					<a id="project1-popover-link" tabindex="0" class="invest-title-project-header" role="button" data-placement="bottom" data-trigger="focus">Real Estate Biz</a>
					<div class="invest-title-project-name">La Refugio</div>
				<div class="invest-title-project-details">Nuestra primera colaboraci�n (: Vasijas de cer�mica �nicas y protectoras, intervenidas a mano por cuatro artistas mexicanos
				</div>
				</div>
				
				<div id="project1-popover-content" class="hidden invest-title-project-popover-container">
					<div class="invest-title-project-popover-panels">
						<div class="invest-title-project-popover-title">Project Cost</div>
						<div  class="invest-title-project-popover-cost">15000$</div>
					</div>
						<button type="button" class="btn btn-success invest-title-project-popover-button">Invest</button>
				</div>
				
				
				<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
					<div class="invest-title-project-image" style="background-image: url(resources/img/proj2.jpg);">
					</div>
					<a id="project2-popover-link" tabindex="0" class="invest-title-project-header" role="button" data-placement="bottom" data-trigger="focus">Real Estate Biz</a>
					<div class="invest-title-project-name">T�tem Gallery</div>
				<div class="invest-title-project-details">The first concept gallery in Mexico City. An exhibition space for the best proposals of art, fashion and design in Mexico City</div>
				</div>
				
				<div id="project2-popover-content" class="hidden invest-title-project-popover-container">
					<div class="invest-title-project-popover-panels">
						<div class="invest-title-project-popover-title">Project Cost</div>
						<div  class="invest-title-project-popover-cost">18000$</div>
					</div>
						<button type="button" class="btn btn-success invest-title-project-popover-button">Invest</button>
				</div>
				
				
				<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
					<div class="invest-title-project-image" style="background-image: url(resources/img/proj3.jpg);">
					</div>
					<a id="project3-popover-link" tabindex="0" class="invest-title-project-header" role="button" data-placement="bottom" data-trigger="focus">Tuti, mu�ecas artesanales.</a>
					<div class="invest-title-project-name">Ernesto Olivera Almanza</div>
				<div class="invest-title-project-details">Tuti, que en totonaca significa hermana menor, es una marca de mu�ecas de tela nacidas en un peque�o taller de la Ciudad de M�xico.</div>
				</div>
				
				<div id="project3-popover-content" class="hidden invest-title-project-popover-container">
					<div class="invest-title-project-popover-panels">
						<div class="invest-title-project-popover-title">Project Cost</div>
						<div  class="invest-title-project-popover-cost">21000$</div>
					</div>
						<button type="button" class="btn btn-success invest-title-project-popover-button">Invest</button>
				</div>
				
				
				<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
					<div class="invest-title-project-image" style="background-image: url(resources/img/proj4.jpg);">
					</div>
					<a id="project4-popover-link" tabindex="0" class="invest-title-project-header" role="button" data-placement="bottom" data-trigger="focus">VNGRAVITY A VIRTUAL GALLERY.</a>
					<div class="invest-title-project-name">txt.ure</div>
				<div class="invest-title-project-details">Help us preserve a pre-Hispanic technique headed to extinction! Let's build the first tule-weaving artisanal workshop!</div>
				</div>
				
				<div id="project4-popover-content" class="hidden invest-title-project-popover-container">
					<div class="invest-title-project-popover-panels">
						<div class="invest-title-project-popover-title">Project Cost</div>
						<div  class="invest-title-project-popover-cost">25000$</div>
					</div>
						<button type="button" class="btn btn-success invest-title-project-popover-button">Invest</button>
				</div>
				
				
				
				
				
				
				
				
				
				
			</div>
		
		</div>
	</div>
</section>
<!-- End Invest Section -->

<!-- start Service Section -->
<section id="pr_sec">
	<div class="container">
		<div class="row">
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs12 ">
				<div class="title_sec">
					<h1>OUR Service</h1>
					<h2>From investments to lifestyle we provide all kind of services</h2>
				</div>			
			</div>		
			<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
				<div class="service">						
					<i class="fa fa-globe"></i>
					<h2>web Development</h2>
					<div class="service_hoverly">
						<i class="fa fa-globe"></i>
						<h2>web Development</h2>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Tempore ab odio quas  , voluptate aspernatur!</p>
					</div>
				</div>
			</div>				
			<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
				<div class="service">						
					<i class="fa fa-paper-plane"></i>
					<h2>E-mail marketing</h2>
					<div class="service_hoverly">
						<i class="fa fa-paper-plane"></i>
						<h2>E-mail marketing</h2>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Tempore ab odio quas  , voluptate aspernatur!</p>
					</div>
				</div>
			</div>				
			<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
				<div class="service">						
					<i class="fa fa-wordpress"></i>
					<h2>WordPress</h2>
					<div class="service_hoverly">
						<i class="fa fa-wordpress"></i>
						<h2>WordPress</h2>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Tempore ab odio quas  , voluptate aspernatur!</p>
					</div>
				</div>
			</div>				
			<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
				<div class="service">						
					<i class="fa fa-paint-brush"></i>
					<h2>Graphic Design</h2>
					<div class="service_hoverly">
						<i class="fa fa-paint-brush"></i>
						<h2>Graphic Design</h2>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Tempore ab odio quas  , voluptate aspernatur!</p>
					</div>
				</div>
			</div>			
		</div>
	</div>
</section>
<!-- End Service Section -->

<!-- start portfolio Section -->
<section id="protfolio_sec">
	<div class="container">
		<div class="row">
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs12 ">
				<div class="title_sec">
					<h1>Portfolio</h1>
					<h2>We are present in a number of industries and sectors</h2>
				</div>			
			</div>		
			<div class="col-lg-12">
				<div class="portfolio-filter text-uppercase text-center">
				<ul class="filter">
				<li class="active" data-filter="*">All</li>
				<li data-filter=".web-design">Investments</li>
				<li data-filter=".graphic">Real Estate</li>
				<li data-filter=".photography">Travel and Tourism</li>
				<li data-filter=".motion-video">Events</li>
				</ul>
				</div>
				 
				<div class="all-portfolios">
					<div class="col-sm-12  col-lg-12 col-md-12 col-xs-12 ">
					<div class="single-portfolio web-design">
					<img class="img-responsive" src="http://showwp.com/demos/porton/default/upload/p_06.jpg" alt="">
					</div>				
					</div>				
					<div class="col-sm-12  col-lg-12 col-md-12 col-xs-12 ">
					<div class="single-portfolio web-design">
					<img class="img-responsive" src="http://showwp.com/demos/porton/default/upload/p_01.jpg" alt="">
					</div>				
					</div>					
					<div class="col-sm-12  col-lg-12 col-md-12 col-xs-12 ">
					<div class="single-portfolio web-design">
					<img class="img-responsive" src="http://showwp.com/demos/porton/default/upload/p_02.jpg" alt="">
					</div>				
					</div>					
					<div class="col-sm-12  col-lg-12 col-md-12 col-xs-12 ">
					<div class="single-portfolio graphic">
					<img class="img-responsive" src="http://showwp.com/demos/porton/default/upload/p_03.jpg" alt="">
					</div>				
					</div>					
					<div class="col-sm-12  col-lg-12 col-md-12 col-xs-12 ">
					<div class="single-portfolio web-design">
					<img class="img-responsive" src="http://showwp.com/demos/porton/default/upload/p_04.jpg" alt="">
					</div>				
					</div>					
					<div class="col-sm-12  col-lg-12 col-md-12 col-xs-12 ">
					<div class="single-portfolio photography">
					<img class="img-responsive" src="http://showwp.com/demos/porton/default/upload/p_05.jpg" alt="">
					</div>				
					</div>				
					<div class="col-sm-12  col-lg-12 col-md-12 col-xs-12 ">
					<div class="single-portfolio web-design">
					<img class="img-responsive" src="http://showwp.com/demos/porton/default/upload/p_07.jpg" alt="">
					</div>				
					</div>				
					<div class="col-sm-12  col-lg-12 col-md-12 col-xs-12 ">
					<div class="single-portfolio web-design">
					<img class="img-responsive" src="http://showwp.com/demos/porton/default/upload/p_08.jpg" alt="">
					</div>				
					</div>				
					<div class="col-sm-12  col-lg-12 col-md-12 col-xs-12 ">
					<div class="single-portfolio photography">
					<img class="img-responsive" src="http://showwp.com/demos/porton/default/upload/p_08.jpg" alt="">
					</div>				
					</div>				
					<div class="col-sm-12  col-lg-12 col-md-12 col-xs-12 ">
					<div class="single-portfolio web-design">
					<img class="img-responsive" src="http://showwp.com/demos/porton/default/upload/p_08.jpg" alt="">
					</div>				
					</div>					
					<div class="col-sm-12  col-lg-12 col-md-12 col-xs-12 ">
					<div class="single-portfolio web-design">
					<img class="img-responsive" src="http://showwp.com/demos/porton/default/upload/p_09.jpg" alt="">
					</div>				
					</div>			
					<div class="col-sm-12  col-lg-12 col-md-12 col-xs-12 ">
					<div class="single-portfolio photography">
					<img class="img-responsive" src="http://showwp.com/demos/porton/default/upload/p_08.jpg" alt="">
					</div>				
					</div>
				</div>


			</div>
				<div class="post_btn">
					<div class="hover_effect_btn" id="hover_effect_btn">
						<a href="#hover_effect_btn" data-hover="view more post"><span>view more post</span></a>
					</div>
				</div>	
			</div>			
		</div>
</section>
<!-- End Portfolio Section -->

<!-- start our team Section -->
<section id="tm_sec">
	<div class="container">
		<div class="row">
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs12 ">
				<div class="title_sec">
					<h1>Our Team</h1>
					<h2>WE’RE BRANDING & DIGITAL STUDIO FROM VIET NAM</h2>
				</div>			
			</div>		
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs12">
				<div class="all_team">
					<div class="sngl_team">						
						<img src="http://wedesignthemes.com/themes/dt-mountcool/wp-content/uploads/2015/10/img-1.png" alt=""/>	
						<h3> Jamie Catllahan <span>Designer</span></h3>
						<p>Lorem ipsum dolor sit amet, consecttur adipisicing elit. Laudant</p>						
					</div>					
					<div class="sngl_team">						
						<img src="http://wedesignthemes.com/themes/dt-mountcool/wp-content/uploads/2015/10/img-2.png" alt=""/>	
						<h3>Lisa Kudrow <span> Manager </span></h3>
						<p>Lorem ipsum dolor sit amet, consecttur adipisicing elit. Laudant</p>						
					</div>				
					<div class="sngl_team">						
						<img src="http://wedesignthemes.com/themes/dt-mountcool/wp-content/uploads/2015/10/img-3.png" alt=""/>	
						<h3> John Clarance <span>   Senior Manager   </span></h3>
						<p>Lorem ipsum dolor sit amet, consecttur adipisicing elit. Laudant</p>						
					</div>				
					<div class="sngl_team">						
						<img src="http://wedesignthemes.com/themes/dt-mountcool/wp-content/uploads/2015/10/img-4.png" alt=""/>	
						<h3>Sheena Maya<span> Developer </span></h3>
						<p>Lorem ipsum dolor sit amet, consecttur adipisicing elit. Laudant</p>						
					</div>					
					<div class="sngl_team">						
						<img src="http://wedesignthemes.com/themes/dt-mountcool/wp-content/uploads/2015/10/img-1.png" alt=""/>	
						<h3> Jamie Catllahan <span>Designer</span></h3>
						<p>Lorem ipsum dolor sit amet, consecttur adipisicing elit. Laudant</p>						
					</div>					
					<div class="sngl_team">						
						<img src="http://wedesignthemes.com/themes/dt-mountcool/wp-content/uploads/2015/10/img-2.png" alt=""/>	
						<h3>Lisa Kudrow <span> Manager </span></h3>
						<p>Lorem ipsum dolor sit amet, consecttur adipisicing elit. Laudant</p>						
					</div>				
					<div class="sngl_team">						
						<img src="http://wedesignthemes.com/themes/dt-mountcool/wp-content/uploads/2015/10/img-3.png" alt=""/>	
						<h3> John Clarance <span>   Senior Manager   </span></h3>
						<p>Lorem ipsum dolor sit amet, consecttur adipisicing elit. Laudant</p>						
					</div>				
					<div class="sngl_team">						
						<img src="http://wedesignthemes.com/themes/dt-mountcool/wp-content/uploads/2015/10/img-4.png" alt=""/>	
						<h3>Sheena Maya<span> Developer </span></h3>
						<p>Lorem ipsum dolor sit amet, consecttur adipisicing elit. Laudant</p>						
					</div>				
					<div class="sngl_team">						
						<img src="http://wedesignthemes.com/themes/dt-mountcool/wp-content/uploads/2015/10/img-1.png" alt=""/>	
						<h3> Jamie Catllahan <span>Designer</span></h3>
						<p>Lorem ipsum dolor sit amet, consecttur adipisicing elit. Laudant</p>						
					</div>					
					<div class="sngl_team">						
						<img src="http://wedesignthemes.com/themes/dt-mountcool/wp-content/uploads/2015/10/img-2.png" alt=""/>	
						<h3>Lisa Kudrow <span> Manager </span></h3>
						<p>Lorem ipsum dolor sit amet, consecttur adipisicing elit. Laudant</p>						
					</div>				
					<div class="sngl_team">						
						<img src="http://wedesignthemes.com/themes/dt-mountcool/wp-content/uploads/2015/10/img-3.png" alt=""/>	
						<h3> John Clarance <span>   Senior Manager   </span></h3>
						<p>Lorem ipsum dolor sit amet, consecttur adipisicing elit. Laudant</p>						
					</div>				
					<div class="sngl_team">						
						<img src="http://wedesignthemes.com/themes/dt-mountcool/wp-content/uploads/2015/10/img-4.png" alt=""/>	
						<h3>Sheena Maya<span> Developer </span></h3>
						<p>Lorem ipsum dolor sit amet, consecttur adipisicing elit. Laudant</p>						
					</div>													
				</div>			
			</div>
		</div>
	</div>
</section>
<!-- End our team Section -->

<!-- start our teastimonial Section -->
<section id="tstm_sec">
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<div class="all_tstm">
					
				<div class="clnt_tstm">
					<div class="sngl_tstm">
						<i class="fa fa-quote-right"></i>
						<h3>what people say?</h3>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Pariatur sequi accusamus voluptatum rem itaque alias deleniti nostrum aperiam fugiat voluptates debitis praesentium incidunt accusantium distinctio,</p>
						<h6>- jhon deo</h6>					
					</div>
				</div>						
				
				<div class="clnt_tstm">
					<div class="sngl_tstm">
						<i class="fa fa-quote-right"></i>
						<h3>Clien Design</h3>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Pariatur sequi accusamus voluptatum rem itaque alias deleniti nostrum aperiam fugiat voluptates debitis praesentium incidunt accusantium distinctio,</p>
						<h6>- shura deo</h6>					
					</div>
				</div>				
				<div class="clnt_tstm">
					<div class="sngl_tstm">
						<i class="fa fa-quote-right"></i>
						<h3>Awesome Support SIMA</h3>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Pariatur sequi accusamus voluptatum rem itaque alias deleniti nostrum aperiam fugiat voluptates debitis praesentium incidunt accusantium distinctio,</p>
						<h6>- kumara deo</h6>					
					</div>
				</div>				
				<div class="clnt_tstm">
					<div class="sngl_tstm">
						<i class="fa fa-quote-right"></i>
						<h3>Theme Feature great</h3>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Pariatur sequi accusamus voluptatum rem itaque alias deleniti nostrum aperiam fugiat voluptates debitis praesentium incidunt accusantium distinctio,</p>
						<h6>- dhera deo</h6>					
					</div>
				</div>				
				<div class="clnt_tstm">
					<div class="sngl_tstm">
						<i class="fa fa-quote-right"></i>
						<h3>Non conflict</h3>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Pariatur sequi accusamus voluptatum rem itaque alias deleniti nostrum aperiam fugiat voluptates debitis praesentium incidunt accusantium distinctio,</p>
						<h6>- jhon deo</h6>					
					</div>
				</div>	
					
				</div>
			</div>	
		</div>
	</div>
</section>
<!-- End our teastimonial Section -->


<!-- start Latest post Section -->
<section id="lts_sec">
	<div class="container">
		<div class="row">
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs12 ">
				<div class="title_sec">
					<h1>Our Latest Blog</h1>
					<h2></h2>
				</div>			
			</div>		
			<div class="col-lg-4 col-md-4 col-sm-12">
				<div class="lts_pst">						
					<img src="http://cdn.shopify.com/s/files/1/1039/5466/files/blog-img2.jpg?10828543012475550494" alt=""/>
					<h2>How to fix your bug</h2>
					<p>Nullam metus arcu, pharetra eu tempor vel, consectetur nec metus. Praesent malesuada, purus et euismod rutrum, augue nisi facilisis diam, vitae auctor nisl libero nec eros. Vivamus vitae pulvinar augue. Nulla facilisi. Quisque rutrum ante interdum</p>
					<a href="single.html">Read more <i class="fa fa-long-arrow-right"></i></a>					
				</div>
			</div>			
			<div class="col-lg-4 col-md-4 col-sm-12">
				<div class="lts_pst">						
					<img src="http://cdn.shopify.com/s/files/1/1039/5466/files/blog-img3.jpg?16122351990094232768" alt=""/>
					<h2>Pellentesque nibh libero</h2>
					<p>Nullam metus arcu, pharetra eu tempor vel, consectetur nec metus. Praesent malesuada, purus et euismod rutrum, augue nisi facilisis diam, vitae auctor nisl libero nec eros. Vivamus vitae pulvinar augue. Nulla facilisi. Quisque rutrum ante interdum</p>
					<a href="">Read more <i class="fa fa-long-arrow-right"></i></a>					
				</div>
			</div>		
			<div class="col-lg-4 col-md-4 col-sm-12">
				<div class="lts_pst">						
					<img src="http://cdn.shopify.com/s/files/1/1039/5466/files/blog-img1.jpg?1960436319992241823" alt=""/>
					<h2>pharetra eu tempor vel</h2>
					<p>Nullam metus arcu, pharetra eu tempor vel, consectetur nec metus. Praesent malesuada, purus et euismod rutrum, augue nisi facilisis diam, vitae auctor nisl libero nec eros. Vivamus vitae pulvinar augue. Nulla facilisi. Quisque rutrum ante interdum</p>
					<a href="">Read more <i class="fa fa-long-arrow-right"></i></a>					
				</div>
			</div>
			<div class="post_btn">
				<div class="hover_effect_btn" id="hover_effect_btn">
					<a href="#hover_effect_btn" data-hover="view more post"><span>view more post</span></a>
				</div>
			</div>			

		</div>
	</div>
</section>
<!-- End Latest post Section -->

<!-- start pricing Section -->
<section id="pricing_sec">
	<div class="container">
		<div class="row">
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs12 ">
				<div class="title_sec">
					<h1>Our Pricing Plan</h1>
					<h2>We Are Fortitude. Investment group from Singapore</h2>
				</div>			
			</div>		
			<div class="col-lg-4 col-md-4 col-sm-12">
				<div class="sngl_pricing">											
					<h2 class="title_bg_1">Basic</h2>
					<h3><span class="currency">$</span>200<span class="monuth">/  mo</span></h3>
					<ul>
						<li>Incentives</li>
						<li>Incentives</li>
						<li>Incentives</li>
						<li>Incentives</li>
						<li><a href="" class="btn pricing_btn">Send</a></li>
						
					</ul>		
				</div>
			</div>			
			<div class="col-lg-4 col-md-4 col-sm-12">
				<div class="sngl_pricing">											
					<h2 class="title_bg_2">Standard</h2>
					<h3><span class="currency">$</span>3000<span class="monuth">/  mo</span></h3>
					<ul>
						<li>Incentives</li>
						<li>Incentives</li>
						<li>Incentives</li>
						<li>Incentives</li>
						<li><a href="" class="btn pricing_btn">Send</a></li>
					</ul>		
				</div>
			</div>			
			<div class="col-lg-4 col-md-4 col-sm-12">
				<div class="sngl_pricing">											
					<h2 class="title_bg_3">Extended</h2>
					<h3><span class="currency">$</span>3500<span class="monuth">/  mo</span></h3>
					<ul>
						<li>Incentives</li>
						<li>Incentives</li>
						<li>Incentives</li>
						<li>Incentives</li>
						<li><a href="" class="btn pricing_btn">Send</a></li>
					</ul>		
				</div>
			</div>	
		</div>
	</div>
</section>
<!-- End pricing Section -->


<!-- start Happy Client Section -->
<section id="clt_sec">
	<div class="container">	
		<div class="row">
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs12 ">
				<div class="title_sec">
					<h1>Our Happy Clients</h1>
					<h2>We Are Fortitude. Investment group from Singapore</h2>
				</div>			
			</div>		
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs12">
				<div class="al_clt">						
					<div class="sngl_clt">
						<a href=""><img src="http://showwp.com/demos/porton/default/upload/client_03.png" alt=""/></a>
					</div>				
					<div class="sngl_clt">
						<a href=""><img src="http://showwp.com/demos/porton/default/upload/client_03.png" alt=""/></a>
					</div>				
					<div class="sngl_clt">
						<a href=""><img src="http://showwp.com/demos/porton/default/upload/client_04.png" alt=""/></a>
					</div>				
					<div class="sngl_clt">
						<a href=""><img src="http://showwp.com/demos/porton/default/upload/client_05.png" alt=""/></a>
					</div>				
					<div class="sngl_clt">
						<a href=""><img src="http://showwp.com/demos/porton/default/upload/client_01.png" alt=""/></a>
					</div>					
					<div class="sngl_clt">
						<a href=""><img src="http://showwp.com/demos/porton/default/upload/client_03.png" alt=""/></a>
					</div>				
					<div class="sngl_clt">
						<a href=""><img src="http://showwp.com/demos/porton/default/upload/client_04.png" alt=""/></a>
					</div>				
					<div class="sngl_clt">
						<a href=""><img src="http://showwp.com/demos/porton/default/upload/client_05.png" alt=""/></a>
					</div>				
					<div class="sngl_clt">
						<a href=""><img src="http://showwp.com/demos/porton/default/upload/client_01.png" alt=""/></a>
					</div>					

				</div>
			</div>	
		</div>
	</div>
</section>
<!-- End Happy Client  Section -->

<!-- start contact us Section -->
<section id="ctn_sec">
	<div class="container">
		<div class="row">
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs12 ">
				<div class="title_sec">
					<h1>Contact Info</h1>
					<h2>We are Investment and lifestyle firm from Singapore</h2>
				</div>			
			</div>		
			<div class="col-sm-6"> 
				<div id="cnt_form">
					<form id="contact-form" class="contact" name="contact-form" method="post" action="send-mail.php">
						<div class="form-group">
						<input type="text" name="name" class="form-control name-field" required="required" placeholder="Your Name">
						</div>
						<div class="form-group">
							<input type="email" name="email" class="form-control mail-field" required="required" placeholder="Your Email">
						</div> 
						<div class="form-group">
							<textarea name="message" id="message" required="required" class="form-control" rows="8" placeholder="Message"></textarea>
						</div> 
						<div class="form-group">
							<button type="submit" class="btn btn-primary">Send</button>
						</div>
					</form> 
				</div>
			</div>
			<div class="col-lg-6 col-md-6 col-sm-6">
				<div class="cnt_info">
					<ul>
						<li><i class="fa fa-facebook"></i><p>Singapore</p></li>
						<li><i class="fa fa-envelope"></i><p>xxx@xxx.com</p></li>
						<li><i class="fa fa-phone"></i><p></p></li>
					</ul>
				</div>
			</div>			
		</div>
	</div>
</section>
<!-- End contact us  Section -->

<!-- start located map Section -->
<section id="ltd_map_sec">
<div class="container">
	<div class="row">
		<div class="col-lg-12">
			<div class="map">						
			<h1>locate on THE MAP</h1><a href="#slidingDiv" class="show_hide" rel="#slidingDiv"><i class="fa fa-angle-up"></i></a>
			<div id="slidingDiv">
				<div class="map_area">
					<div id="googleMap" style="width:100%;height:300px;"></div>
				</div>
			</div>	
			</div>
		</div>
	</div>
</div>
</section>

<!-- End located map  Section -->
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

<script src="<c:url value ="http://code.jquery.com/jquery-1.9.1.min.js"/>"></script>
<script src="<c:url value ="/resources/js/jquery-1.11.3.min.js"/>"></script>
<script src="<c:url value="/resources/js/jquery-ui.js"/>"></script>
<script src="<c:url value="/resources/js/jquery.counterup.min.js"/>"></script>
<script src="<c:url value= "/resources/js/jquery.nicescroll.min.js"/>"></script>
<script src="<c:url value="/resources/js/jquery.easing.min.js"/>"></script>

<script src="<c:url value ="/resources/js/isotope.pkgd.min.js"/>"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
<script src="<c:url value="/resources/js/appear.js"/>"></script>
<script src="<c:url value="/resources/js/waypoints.min.js"/>"></script>
<script src="<c:url value="/resources/js/owl.carousel.min.js"/>"></script>
<script src="<c:url value="/resources/js/showHide.js"/>"></script>
<script src="<c:url value="/resources/js/scrolling-nav.js"/>"></script>
<script src="<c:url value="/resources/js/plugins.js"/>"></script>
<!-- Google Map js -->
        <script src="https://maps.googleapis.com/maps/api/js"></script>
		<script>
			function initialize() {
			  var mapOptions = {
				zoom: 14,
				scrollwheel: false,
				center: new google.maps.LatLng(41.092586000000000000, -75.592688599999970000)
			  };
			  var map = new google.maps.Map(document.getElementById('googleMap'),
				  mapOptions);
			  var marker = new google.maps.Marker({
				position: map.getCenter(),
				animation:google.maps.Animation.BOUNCE,
				icon: '/resources/img/map-marker.png',
				map: map
			  });
			}
			google.maps.event.addDomListener(window, 'load', initialize);
		</script>
<script src="<c:url value="/resources/js/main.js" />"></script>

<script src="<c:url value="/resources/js/showHide.js" />"></script>

<script type="text/javascript">

$(document).ready(function(){


   $('.show_hide').showHide({			 
		speed: 1000,  // speed you want the toggle to happen	
		easing: '',  // the animation effect you want. Remove this line if you dont want an effect and if you haven't included jQuery UI
		changeText: 1, // if you dont want the button text to change, set this to 0
		showText: 'View',// the button text to show when a div is closed
		hideText: 'Close' // the button text to show when a div is open
					 
	}); 


});

</script>
<script>
    jQuery(document).ready(function( $ ) {
        $('.counter').counterUp({
            delay: 10,
            time: 1000
        });
    });
</script>

<script>

  //Hide Overflow of Body on DOM Ready //
$(document).ready(function(){
    $("body").css("overflow", "hidden");
});

// Show Overflow of Body when Everything has Loaded 
$(window).load(function(){
    $("body").css("overflow", "visible");        
    var nice=$('html').niceScroll({
	cursorborder:"5",
	cursorcolor:"#00AFF0",
	cursorwidth:"3px",
	boxzoom:true, 
	autohidemode:true
	});

});
</script>



    </body>
</html>
