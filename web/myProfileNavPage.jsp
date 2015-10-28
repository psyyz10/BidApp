<%-- 
    Document   : myProfileNavPage
    Created on : Feb 5, 2013, 10:39:58 PM
    Author     : Administrator
--%>

<%@page import="com.auction.entity.Userinfo"%>
<%@page language="java" pageEncoding="UTF-8"%>
<jsp:include page="header.jsp" />
<article data-role="content">
    
    <p>
    <ul data-role="listview">
        
        <li>
            <a href="myAuctionsPage.jsp">
                My Current Auctions
            </a>
        </li>
        
    </ul>
</p>
</br>
<p>
<ul data-role="listview">
    
    <li>
        <a href="myExpiredAuctionsPage.jsp">
            My Expired Auctions
        </a>
    </li>
    
    <li>
        <a href="myWonBidsPage.jsp">
            My Won Bids
        </a>
    </li>
    
</ul>
</p>
</br>
<p>
<ul data-role="listview">
    <li>
        <a href="profilePage.jsp">
            My Profile
        </a>
    </li>
    <li>
        <a href="accountInfoPage.jsp">
            Account Info
        </a>
    </li>
</ul>
</p>
</br>
<p>
<ul data-role="listview">
    
    <li>
        <a href="LogoutServlet">
            Log Out
        </a>
    </li>
</ul>
</p>
</article>


<jsp:include page="footer.jsp" />