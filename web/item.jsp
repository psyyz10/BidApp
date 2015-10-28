<%-- 
    Document   : item
    Created on : Dec 28, 2012, 2:39:39 AM
    Author     : Administrator
--%>

<%@page import="com.auction.logic.BidsBean"%>
<%@page import="com.auction.logic.BidsBean"%>
<%@page import="com.auction.entity.Bids"%>
<%@page import="com.auction.entity.Userinfo"%>
<%@page import="com.auction.logic.UserinfoBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.auction.logic.ItemImageBean"%>
<%@page import="com.auction.entity.ItemImage"%>
<%@page import="com.auction.entity.Listing"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--ITEM PAGE (Toaster)-->

<!--<div data-role="page" id = "toasterListingPage" data-add-back-btn="true">-->


<% Userinfo user = (Userinfo)session.getAttribute("loginUser");
            if (user == null){ %>
<jsp:include page="LogoutHeader.jsp" />
<% }else{ %>
<jsp:include page="header.jsp" />
<%}%>

<% Listing listing = (Listing)session.getAttribute("listing");
    Bids bid = new BidsBean().queryListingByHighestPrices(listing.getId());
    double price;
    if (bid != null)
        price = bid.getBidAmount();
    else
        price = listing.getStartPrice();
    
   ArrayList<ItemImage> imageList = (ArrayList)new ItemImageBean().queryItemImageByListingId(listing.getId());
   session.setAttribute("talker", new UserinfoBean().queryUserinfoByUserid(listing.getUserId()));
%>

<script type="text/javascript">
    
 function setPagenum(obj)
 {
        document.myform.pagenum.value=obj;
        document.myform.submit();
 }
                
 function changeHref()
{
        document.getElementById("1").href = "login.jsp";
        document.getElementById("2").href = "login.jsp";
        document.getElementById("3").href = "login.jsp";
        document.getElementById("4").href = "login.jsp";
}
               
</script>
<!--Content-->

<article data-role="content">
    <%
      if(session.getAttribute("followItem")!=null)
      {
            int followItem = Integer.parseInt(session.getAttribute("followItem").toString());
            session.removeAttribute("followItem");
            if(followItem==0)
            {%>
    <script type="text/javascript">
            alert("The item is in the follow list！");
    </script>
    <%} else
	  	{%>
    <script type="text/javascript">
            alert("Follow success！");
    </script>
    <%}
 }
    %>           
    
    <h1><%= listing.getListingTitle() %></h1>
    
    <img src="<%=listing.getImagePath()%>" alt="gallery thumbnail" width="100%"/>
    
    <br><br>
    
    <div class="ui-grid-a">
        <div class="ui-block-a"><div class="ui-bar ui-bar-e" style="height:50px">End Time: <%=listing.getEndTime() %></div></div>
        <div class="ui-block-b"><div class="ui-bar ui-bar-e" style="height:50px">Current Bid: &pound;<%= price%></div></div>
        <div class="ui-block-a"><div class="ui-bar ui-bar-e" style="height:50px"><input type="text" name="bidValue" value= "&pound;5.57"></div></div>
        <div class="ui-block-b"><div class="ui-bar ui-bar-e" style="height:50px"><a href="bidPage.jsp" data-role="arrow-r" data-icon="check" id="4">Make Bid</a></div></div>
    </div>
    
    <br>
    
    <div data-role="controlgroup">
        <a href="FollowItemServlet" data-role="button" data-icon="check" id ="1">Add to Followed Items</a>
        <a href="otherProfilePage.jsp" data-role="button" data-icon="star" id ="2">View Seller</a>
        <a href="conversationPage.jsp" data-role="button" data-icon="plus" id ="3">Ask A Question</a>
    </div>
    
    <br>
    
    <h3>Description</h3>
    
    <p><%= listing.getDescription()%></p>
    
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
    
    <% if (user == null){ %>
    <jsp:include page="LogoutFooter.jsp" />
    <script type="text/javascript">
                changeHref();
    </script>
    <% }else{ %>
    <jsp:include page="footer.jsp" />
    <%}%>
</article>  
<!--</div>-->
