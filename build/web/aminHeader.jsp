<%-- 
    Document   : aminHeader
    Created on : Mar 4, 2013, 9:54:51 AM
    Author     : yxz02u
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html> 
	<head>
		
		<meta name="viewport" content="width=device-width">
		<meta name = "viewport" content = "user-scalable=no, width=device-width">
		
		<title>BidApp!</title>
				
		<link rel="stylesheet" href="http://code.jquery.com/mobile/1.1.1/jquery.mobile-1.1.1.min.css" />
		<script src="http://code.jquery.com/jquery-1.7.1.min.js"></script>
		<script src="http://code.jquery.com/mobile/1.1.1/jquery.mobile-1.1.1.min.js"></script>
		
		<style>
			img.fullscreen {
				max-height: 100%;
				max-width: 100%;
			}
		</style>
		
		<style>
			.ui-grid-b img
			{
				width  : 100%;
				height : auto;
			}
		</style>
		
	</head>
	
	<body>
	
	
	<!--HOME PAGE-->
		
		<div data-role="page" id = "homePage">

		<!--Header-->
			
			<header data-role="header" data-position="fixed">
				
				<h1><a href="#homePage"><img src="image/Logo1.png" width=80%></a></h1>
				
			</header>