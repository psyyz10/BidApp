<%-- 
    Document   : followedItemsPage
    Created on : Feb 5, 2013, 11:00:38 PM
    Author     : Administrator
--%>
<%@page import="com.auction.logic.BidsBean"%>
<%@page import="com.auction.entity.Bids"%>
<%@page import="com.auction.logic.ListingBean"%>
<%@page import="com.auction.entity.Listing"%>
<%@page import="com.auction.logic.FollowItemBean"%>
<%@page import="com.auction.entity.FollowItem"%>
<%@page import="java.util.List"%>
<%@page import="com.auction.entity.Userinfo"%>
<%@page language="java" pageEncoding="UTF-8"%>
<jsp:include page="header.jsp" />
<script type="text/javascript">
    function setListingid(obj){
        document.myform.listingId.value = obj;
        document.myform.submit();
    }
    
    function deleteFollow(obj){
        document.myform1.listingId.value = obj;
        document.myform1.submit();
    }
</script>

<%
      if(session.getAttribute("deleteFollow")!=null)
      {
            int followmessage=Integer.parseInt(session.getAttribute("deleteFollow").toString());
            session.removeAttribute("deleteFollow");
            if(followmessage==0)
            {%>
<script type="text/javascript">
        alert("Server is busy, please try again latter！");
</script>
<%} else
	  	{%>
<script type="text/javascript">
        alert("Delete success！");
</script>
<%}
}
%>


<%  Userinfo user = (Userinfo)session.getAttribute("loginUser");
    List<FollowItem> follows = new FollowItemBean().queryFollowsByUserId(user.getUserid());
    FollowItem followItem = new FollowItem();
    Listing listing = new Listing();
  
%>
<article data-role="content">
    
    <h1>Followed Items</h1>
    
    <ul data-role="listview" data-filter="true">
        <% for (int i = 0; i < follows.size(); i++ ){ 
                followItem = follows.get(i);
                listing = new ListingBean().queryListingByListingid(followItem.getListingId());
         Bids bid = new BidsBean().queryListingByHighestPrices(listing.getId());
   double price;
   
   if (bid == null)
       price = listing.getStartPrice();
   else
       price = bid.getBidAmount();%>
        <li>
            <a href="javascript:setListingid(<%= listing.getId() %>)">
                <img src="<%=listing.getImagePath() %>">
                <h1><%= listing.getListingTitle() %></h1>
                <p>3 hours remaining</p>
                <span class="ui-li-count">�<%= price %></span>
            </a>
            <a href="javascript:deleteFollow(<%= listing.getId() %>)" data-icon="delete"></a>
        </li>
        <%}%>
    </ul>
    
    <form action="GetListingServlet" method="get" name="myform" >  
        <input type="hidden" name="listingId">
    </form>
    
    <form action="DeleteFollowServlet" method="post" name="myform1" >  
        <input type="hidden" name="listingId">
    </form>
</article>

<jsp:include page="footer.jsp" />
