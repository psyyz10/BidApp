<%-- 
    Document   : viewOwnAuction
    Created on : Feb 17, 2013, 11:03:46 PM
    Author     : Administrator
--%>

<%@page import="com.auction.logic.ListingBean"%>
<%@page import="com.auction.entity.Bids"%>
<%@page import="com.auction.logic.ItemImageBean"%>
<%@page import="com.auction.logic.UserinfoBean"%>
<%@page import="com.auction.entity.ItemImage"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.auction.entity.Listing"%>
<jsp:include page="header.jsp" />
<% 
   // Get the won bid
   Bids bid = (Bids)session.getAttribute("bidWon");
   Listing listing = new ListingBean().queryListingByListingid(bid.getListingId());
   
   // Get the image list
   ArrayList<ItemImage> imageList = (ArrayList)new ItemImageBean().queryItemImageByListingId(listing.getId());
%>


<article data-role="content">
    
    <h1><%= listing.getListingTitle() %></h1>
    
    <div class="ui-body ui-body-e">
        <p>You have won this item for &pound;7.03</p>
        <p>
            <a href="payment.jsp" data-role="button" data-icon="check">Make Payment</a> <!--Note: this button should not appear here after payment has been made-->
        </p>
        <p>
            <a href="feedback.jsp" data-role="button" data-icon="check">Give Feedback</a> <!--Note: this button should not appear here after feedback has been given-->
        </p>
    </div>
    
    <br>
    
    <div data-role="controlgroup">
        <a href="conversationPage.jsp" data-role="button" data-icon="plus">Message Seller</a>
        <a href="reportSeller.jsp" data-role="button" data-icon="alert">Report Seller</a>
        <a href="otherProfilePage.jsp" data-role="button" data-icon="star">View Seller</a>
    </div>
    
    <br>
    
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

    
</article>

<jsp:include page="footer.jsp" />
