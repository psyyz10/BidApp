<%-- 
    Document   : myAuctionsPage
    Created on : Feb 5, 2013, 10:42:08 PM
    Author     : Administrator
--%>

<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.auction.entity.Listing"%>
<%@page import="com.auction.logic.ListingBean"%>
<%@page import="com.auction.entity.Userinfo"%>
<%@page language="java" pageEncoding="UTF-8"%>
<jsp:include page="header.jsp" />

<%  Userinfo user=(Userinfo)session.getAttribute("loginUser");
    ListingBean lbean = new ListingBean();
    
    // Get the listing with a user id 
    ArrayList<Listing> listingList = (ArrayList)lbean.queryListingByUserid(user.getUserid());
%>    

<script type="text/javascript">
    function setListingid(obj){
        document.myform.listingId.value = obj;
        document.myform.submit();
    }
</script>

<article data-role="content">
    
    <a href="createAuctionPage.jsp" data-role="button">Create Auction</a>
    
    <h1>My Auctions</h1>
    
    <ul data-role="listview" data-filter="true">
        <% for(int i = 1; i < listingList.size(); i++){ 
            Listing listing = listingList.get(i);
        if (new Date().before(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(listing.getEndTime()))){%>
        
        <li>
            <a href="javascript:setListingid(<%= listing.getId() %>)">
                <img src="<%= listing.getImagePath() %>">
                <h1><%= listing.getListingTitle()  %></h1>
                <p>3 hours remaining</p>
                <span class="ui-li-count">�<%listing.getStartPrice();%></span>
            </a>
        </li>
        <%} } %>
        
    </ul>
    
</article>
<form action="GetMyListingServlet" method="get" name="myform" >  
    <input type="hidden" name="listingId">
</form>
        <jsp:include page="footer.jsp" />