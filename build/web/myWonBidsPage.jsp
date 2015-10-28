<%-- 
    Document   : myWonBidsPage
    Created on : Feb 5, 2013, 11:03:49 PM
    Author     : Administrator
--%>

<%@page import="com.auction.logic.ListingBean"%>
<%@page import="com.auction.entity.Listing"%>
<%@page import="com.auction.logic.BidsBean"%>
<%@page import="com.auction.entity.Bids"%>
<%@page import="java.util.List"%>
<%@page import="com.auction.entity.Userinfo"%>
<%@page language="java" pageEncoding="UTF-8"%>
<jsp:include page="header.jsp" />

<script type="text/javascript">
    function setBidid(obj){
        document.myform.bidId.value = obj;
        document.myform.submit();
    }
</script>

<% List<Bids> bids = new BidsBean().queryBidsByUseridAndWon(((Userinfo)session.getAttribute("loginUser")).getUserid());
%>
<article data-role="content">
    
    <h1>My Won Bids</h1>
    
    <ul data-role="listview" data-filter="true">
        <% for (int i = 0; i < bids.size(); i++){ 
            Listing listing = new ListingBean().queryListingByListingid(bids.get(i).getListingId()); %>   
        <li>
            <a href="javascript:setBidid(<%= bids.get(i).getBidId() %>)">
                <img src="<%=listing.getImagePath() %>">
                <h1>T</h1>
                <span class="ui-li-count">�<%= bids.get(i).getBidAmount() %></span>
            </a>
        </li>
        <%}%>
        
<form action="GetMyWonListingServlet" method="get" name="myform" >  
    <input type="hidden" name="bidId">
</form>

</article>

<jsp:include page="footer.jsp" />
