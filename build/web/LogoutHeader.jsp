<%-- 
    Document   : LogoutHeader
    Created on : Feb 12, 2013, 8:29:05 PM
    Author     : Administrator
--%>

<%@page import="com.auction.entity.Userinfo"%>
<html> 
    <head>
        
        <meta name="viewport" content="width=device-width">
        <meta name = "viewport" content = "user-scalable=no, width=device-width">
        
        <title>BidApp!</title>
        
        <link rel="stylesheet" href="http://code.jquery.com/mobile/1.1.1/jquery.mobile-1.1.1.min.css" />
        <script src="http://code.jquery.com/jquery-1.7.1.min.js"></script>
        <script src="http://code.jquery.com/mobile/1.1.1/jquery.mobile-1.1.1.min.js"></script>
        
    </head>
    <style>
        .code
            {
                background-image:url(image/register/td2.BMP);
                text-align:center;
                font-family:Arial;
                font-style:italic;
                border:0px;
                width:80px;
                color:Red;
                font-weight:bold;
            }
    </style>
    
    <body>	
        <div data-role="page" id = "homePage" data-add-back-btn="true">
        <!--Header-->
        
        <header data-role="header" data-position="fixed">
            
            <a data-role="button" data-icon="back" data-rel="back">Back</a>
            
            <h1><a href="index.jsp"><img src="image/Logo1.png" width=80%></a></h1>
            
        </header>
