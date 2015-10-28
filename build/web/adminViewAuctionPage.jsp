<%-- 
    Document   : adminViewAuctionPage
    Created on : Mar 3, 2013, 4:14:04 PM
    Author     : yxz02u
--%>

<%@page import="com.auction.logic.UserinfoBean"%>
<%@page import="com.auction.logic.BidsBean"%>
<%@page import="com.auction.entity.Bids"%>
<%@page import="com.auction.logic.ItemImageBean"%>
<%@page import="com.auction.entity.ItemImage"%>
<%@page import="com.auction.entity.ItemImage"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.auction.entity.Listing"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<jsp:include page="aminHeader.jsp" />
<% 
    // Get a listing from attribute
    Listing listing = (Listing)session.getAttribute("listing");

    // Get a bid with a list id
    Bids bid = new BidsBean().queryListingByHighestPrices(listing.getId());
    double price;
    
    // Get the listing's price
    if (bid != null)
        price = bid.getBidAmount();
    else
        price = listing.getStartPrice();
    
   ArrayList<ItemImage> imageList = (ArrayList)new ItemImageBean().queryItemImageByListingId(listing.getId());
%>

<article data-role="content">
    
    <h1>Viewing Past Auction: <%= listing.getListingTitle() %></h1>
    
    <div class="ui-body ui-body-e">
        <p>Won for: &pound;<%=price %></p>
        <p>Winning Bidder: <%= new UserinfoBean().queryUserinfoByUserid(bid.getUserId()).getUsername() %></p>
    </div>
    
    <br>
    
    <div class="ui-body ui-body-d">
        
        <h1><%= listing.getListingTitle() %></h1>
        
        <h3>Description</h3>
        
        <p><%= listing.getDescription() %></p>
        
        <h3>Images</h3>
        
        <table width = 100%>
            <tr>
                <td width = 100%><img src="<%= listing.getImagePath() %>" width = 100%></td>                  
                </td>
                <td></td>
            </tr>
            <% for (int i = 0; i < imageList.size(); i++){
                if (i%2 == 0){
            %>
            <tr>
                <td width = 50%><img src="<%= imageList.get(i) %>" width = 100%></td>
                    <% }else{ %>
                <td width = 50%><img src="<%= imageList.get(i) %>" width = 100%></td>
            </tr>
            <% }
              if(imageList.size()%2 == 1){ %>
            <td></td> </tr>      
            <% }}%>
        </table>
        
        <footer data-role="footer" data-position="fixed">
            
            <nav data-role="navbar">
                <ul>
                    <li><a data-role="button" data-icon="back" data-rel="back">Back</a></li>
                    <li><a href="reportsPage.jsp" data-icon="grid">More Reports</a></li>
                    <li><a href="LogoutServlet" data-icon="star">Log Out</a></li>
                </ul>
            </nav>
            
        </footer>
        </body>
        </html>
        