<%-- 
    Document   : home
    Created on : Feb 12, 2013, 8:12:57 PM
    Author     : Administrator
--%>

<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.auction.logic.BidsBean"%>
<%@page import="com.auction.entity.Bids"%>
<%@page import="com.auction.logic.ListingBean"%>
<%@page import="com.auction.entity.Listing"%>
<%@page import="com.auction.logic.UserSearchesBean"%>
<%@page import="java.util.List"%>
<%@page import="com.auction.entity.UserSearches"%>
<%@page import="com.auction.entity.Userinfo"%>
<%@page language="java" pageEncoding="UTF-8"%>
<jsp:include page="header.jsp" />
<!DOCTYPE html>
<script language="javascript" src="js/index.js"></script>
<% Userinfo user = (Userinfo)session.getAttribute("loginUser");
   List<UserSearches> searches = new UserSearchesBean().queryByUserId(user.getUserid());
   Listing listing = null;
   double price = 0;
   if (searches != null){
        String searchText = searches.get(((int)Math.floor(Math.random()*searches.size()))).getSearchText();
        List<Listing> listings = new ListingBean().queryListingByListingTitle(searchText);
        if (listings != null && listings.size() != 0){
            listing = listings.get(((int)Math.floor(Math.random()*listings.size())));
            Bids bid = new BidsBean().queryListingByHighestPrices(listing.getId());
            if (bid == null)
               price = listing.getStartPrice();
            else
               price = bid.getBidAmount();
                                             }
   }
%>
<script type="text/javascript">
    function setListingid(obj){
        document.myform.listingId.value = obj;
        document.myform.submit();
    }
    function refreshpage()
    {
    window.location.reload();
    }
</script>

Content

<article data-role="content">
    <% if (listing == null) {
         List<Listing> listings = new ListingBean().queryAllListing();
         listing = listings.get((int)Math.floor(Math.random()*listings.size()));
         while (new Date().after(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(listing.getEndTime()))){
             listing = listings.get((int)Math.floor(Math.random()*listings.size()));;
         }
}%>
    <div class="ui-body ui-body-e">
        <p>End Time: <%=listing.getEndTime() %></p>
        <p>Current Bid: &pound;<%=price %></p>
    </div>
    <form action="home.jsp">
    <input type="submit" value="Show me something else!" data-theme="e">
    </form>
    
    <table bgcolor = #F5F6CE>
        <tr>
            <td rowspan = 3>
                <img src="<%=listing.getImagePath() %>">
            </td>
            <td>
                <strong><%=listing.getListingTitle() %></strong>
            </td>
        </tr>
        <tr>
            <td>
                <%=listing.getDescription() %>
            </td>
        </tr>
        <tr>
            <td>
                <a href="javascript:setListingid(<%= listing.getId() %>)" data-role="button" data-theme="e">Bid</a>
            </td>
        </tr>
    </table>
    <form action="GetListingServlet" method="get" name="myform" >  
        <input type="hidden" name="listingId">
    </form>
</article>
<jsp:include page="footer.jsp" />


