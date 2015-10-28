<%-- 
    Document   : feedback
    Created on : Feb 24, 2013, 12:46:18 AM
    Author     : Administrator
--%>

<%@page import="com.auction.entity.ItemImage"%>
<%@page import="com.auction.logic.ItemImageBean"%>
<%@page import="com.auction.logic.ListingBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.auction.entity.Listing"%>
<%@page import="com.auction.entity.Bids"%>
<jsp:include page="header.jsp" />
<% // Get the won bid
   Bids bid = (Bids)session.getAttribute("bidWon");
   
   // Get the won bid auction
   Listing listing = new ListingBean().queryListingByListingid(bid.getListingId());
   ArrayList<ItemImage> imageList = (ArrayList)new ItemImageBean().queryItemImageByListingId(listing.getId());
%>


<!--Content-->

<article data-role="content">
    <form action="FeedbackServelet" method ="post">
       
    <h2>Feedback</h2>
    
    <p>Let's begin by reminding you what you were told you were getting</p>
    
    <div class="ui-body ui-body-d">
        
        <h3><%= listing.getListingTitle() %></h3>
        
        <h4>Description</h4>
        
        <p><%= listing.getDescription() %></p>
        
        <h4>Images</h4>
        
        <table width = 100%>
                    <% for (int i = 0; i < imageList.size(); i++){
            if (i % 2 == 0){
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
        
    </div>
    
    <p>How accurate was this description to what you recieved? Was the item delivered in an appropriate time? Now it's time to star your seller, please give 5 stars for an impressive service that you were satisfied with, and 1 star for a bad service.</p>
    
    <fieldset data-role="controlgroup">
        
        <legend>Rank this seller's service:</legend>
        <input type="radio" name="radio-choice" id="5" value="5" />
        <label for="5">
            <img src="Star.gif" width = 10%>
            <img src="Star.gif" width = 10%>
            <img src="Star.gif" width = 10%>
            <img src="Star.gif" width = 10%>
            <img src="Star.gif" width = 10%>
        </label>
        
        <input type="radio" name="radio-choice" id="4" value="4" />
        <label for="4">
            <img src="Star.gif" width = 10%>
            <img src="Star.gif" width = 10%>
            <img src="Star.gif" width = 10%>
            <img src="Star.gif" width = 10%>
        </label>
        
        <input type="radio" name="radio-choice" id="3" value="3" />
        <label for="3">
            <img src="Star.gif" width = 10%>
            <img src="Star.gif" width = 10%>
            <img src="Star.gif" width = 10%>
        </label>
        
        <input type="radio" name="radio-choice" id="2" value="2" />
        <label for="2">
            <img src="Star.gif" width = 10%>
            <img src="Star.gif" width = 10%>
        </label>
        
        <input type="radio" name="radio-choice" id="1" value="1" />
        <label for="1">
            <img src="Star.gif" width = 10%>
        </label>
    </fieldset>
    
    <p>Now's your chance to add any praise or disapproval.</p>
    
    <label for="textarea-a">Write any comments you would like to make about this seller here:</label>
    <textarea name="comment" id="textarea-a"></textarea>
    <input type="hidden" name="bidId" value="<%= bid.getBidId() %>">
    
    <a href="FeedbackServlet" data-role="button" data-theme="e" data-icon="check">Give Feedback</a>
    </form>
</article>

<jsp:include page="footer.jsp" />
