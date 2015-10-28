<%-- 
    Document   : bidPage
    Created on : Dec 28, 2012, 2:29:44 AM
    Author     : Administrator
--%>

<%@page import="com.auction.logic.BidsBean"%>
<%@page import="com.auction.entity.Bids"%>
<%@page import="com.auction.logic.ItemImageBean"%>
<%@page import="com.auction.entity.ItemImage"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.auction.entity.Listing"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!--<div data-role="page" id = "toasterMakeBidPage" data-add-back-btn="true">-->

<jsp:include page="header.jsp" />
<% 
   // Get listing from attribute
   Listing listing = (Listing)session.getAttribute("listing");
   Bids bid = new BidsBean().queryListingByHighestPrices(listing.getId());
   
   //Get listing's price
   double price;
   if (bid == null)
       price = listing.getStartPrice();
   else
       price = bid.getBidAmount();
   
   // Get image's list
   ArrayList<ItemImage> imageList = (ArrayList)new ItemImageBean().queryItemImageByListingId(listing.getId());
   
     if(session.getAttribute("bidMessage")!=null)
     {
           int followmessage=Integer.parseInt(session.getAttribute("bidMessage").toString());
           session.removeAttribute("bidMessage");
           if(followmessage==0)
           {%>
<script type="text/javascript">
        alert("Server is busy, please try again latter！");
</script>
<%} else
	  	{%>
<script type="text/javascript">
        alert("Bid success！");
</script>
<%}}%>
<script type="text/javascript">
  // This function is to check whether the the input is correct
  function constraint(obj)
              {
                      
                        if(document.getElementById("bidValue").value < <%= listing.getStartPrice() %>)
                        {
                                alert("Your bid cannot be less than current bid");
                        }
                        else if(document.getElementById("proxyValue").value <　document.getElementById("bidValue").value)
                        {
                                alert("The maximum bid cannot be less than your bid");
                        }     
                        else if(isNaN (document.getElementById("bidValue").value - 0) || isNaN ( document.getElementById("proxyValue").value  - 0)){
                            alert("House number should be a number not a word");
                        }
                        else
                        {       document.myform.bidValue.value =document.getElementById("bidValue").value;
                                document.myform.proxy = document.getElementById("proxy").value;
                                document.myform.proxyValue.value=document.getElementById("proxyValue").value;
                                document.myform.follow=document.getElementById("follow").value;
                                
                                document.myform.submit();
                        }
              }
</script>                   
<!--Content-->

<article data-role="content"> 
    <h1><%= listing.getListingTitle() %></h1>
    <ul data-role="listview">
        
        <li>
            <a href="item.jsp">
                <h1><%= listing.getListingTitle() %></h1>
                <img src="<%=listing.getImagePath()%>">
                <p>End time : <%=listing.getEndTime() %></p>
            </a>
        </li>
    </ul>
    
    <br><br>
    
    <div class="ui-grid-e" align = center>
        <div class="ui-bar ui-bar-e" width=100%>Current Bid: &pound;<%= price %></div>
        <div class="ui-bar ui-bar-e" width=100%>My Bid: &pound;<input type="text" name="bidValue" value= "" id="bidValue"></div>
    </div>
    
    <br>
    
    <div class="ui-grid-e" align = center>
        <div class="ui-bar ui-bar-e" width=100%>
            
            <label><input type="checkbox" name="check_box[]" id="proxy" />Enable Proxy Bidding </label>
            
        </div>
        <div class="ui-bar ui-bar-e" width=100%>Enter Max Bid: &pound; <input type="text" name="proxyValue" value= "" id="proxyValue"></div>
    </div>
    
    <label><input type="checkbox" name="check_box[]" id ="follow"/>Add To Followed Items</label>
    
    <button onClick="constraint()" type="button" data-theme="e"lass="ui-btn-hidden">Done</button>
    
    <form action="BidItemServlet" method="post" name="myform" >  
        <input type="hidden" name="bidValue">
        <input type="hidden" name="proxy">
        <input type="hidden" name="proxyValue">
        <input type="hidden" name="listingId">       
    </form>
    
</article>
<jsp:include page="footer.jsp" />    
<!--</div>-->
