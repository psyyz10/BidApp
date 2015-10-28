<%-- 
    Document   : header
    Created on : Dec 27, 2012, 6:00:47 AM
    Author     : Administrator
--%>

<%@page import="com.auction.entity.Userinfo"%>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        
        <title>BidApp!</title>
        
        <link rel="stylesheet" href="http://code.jquery.com/mobile/1.1.1/jquery.mobile-1.1.1.min.css" />
        <script src="http://code.jquery.com/jquery-1.7.1.min.js"></script>
        <script src="http://code.jquery.com/mobile/1.1.1/jquery.mobile-1.1.1.min.js"></script>
        
        <meta name="viewport" content="width=device-width">
        <meta name = "viewport" content = "user-scalable=no, width=device-width">
        
        <style>
            img.fullscreen {
                max-height: 100%;
                max-width: 100%;
            }
            
            .ui-grid-b img
            {
                width  : 100%;
                height : auto;
            }
            
        </style>
        
    </head>
    <body >
        
        <div data-role="page" id = "homePage" data-add-back-btn="true">
            
            
            <!--Header-->
            
            <header data-role="header" data-position="fixed">
                
                <a data-role="button" data-icon="back" data-rel="back">Back</a>
                
                <h1><a href="home.jsp"><img src="image/Logo1.png" width=80%></a></h1>
                
                <a id ="message" href="message.jsp" data-role="button" data-icon="message">Messages</a>
                
            </header>
            <% Userinfo user = (Userinfo)session.getAttribute("loginUser");
            if (user == null)
            response.sendRedirect("/bidapp/login.jsp");%>
       