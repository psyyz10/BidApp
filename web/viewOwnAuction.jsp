<%-- 
    Document   : viewOwnAuction
    Created on : Feb 17, 2013, 11:03:46 PM
    Author     : Administrator
--%>

<%@page import="com.auction.logic.ItemImageBean"%>
<%@page import="com.auction.logic.UserinfoBean"%>
<%@page import="com.auction.entity.ItemImage"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.auction.entity.Listing"%>
<jsp:include page="header.jsp" />
<% Listing listing = (Listing)session.getAttribute("listing");
   ArrayList<ItemImage> imageList = (ArrayList)new ItemImageBean().queryItemImageByListingId(listing.getId());
%>
<article data-role="content">
    
    <h1><%= listing.getListingTitle() %></h1>
    
    <div class="ui-grid-a">
        <div class="ui-block-a"><div class="ui-bar ui-bar-e" style="height:50px">End Time: <%=listing.getEndTime() %></div></div>
        <div class="ui-block-b"><div class="ui-bar ui-bar-e" style="height:50px">Current Bid: &pound;<%= listing.getStartPrice() %></div></div>
    </div>
    
    <br>
    
    <div data-role="controlgroup">
        <a href="message.jsp" data-role="button" data-icon="star">View My Messages</a>
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
