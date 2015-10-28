<%-- 
    Document   : userinfo.jsp
    Created on : Dec 27, 2012, 10:27:00 PM
    Author     : Administrator
--%>

<%@page import="java.util.List"%>
<%@page import="com.auction.logic.FeedbackBean"%>
<%@page import="com.auction.entity.Feedback"%>
<%@page import="com.auction.logic.ListingBean"%>
<%@page import="com.auction.entity.Listing"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.auction.entity.Userinfo"%>
<%@page language="java" pageEncoding="UTF-8"%>
<jsp:include page="header.jsp" />
<!DOCTYPE html>
<script type="text/javascript">
    function setListingid(obj){
        document.myform.listingId.value = obj;
        document.myform.submit();
    }
</script>
<!--Content-->

<article data-role="content">
    <%
   Userinfo talker = (Userinfo)session.getAttribute("talker");
   int userId = talker.getUserid();
   ArrayList<Listing> listingList = (ArrayList)new ListingBean().queryListingByUserid(userId);
   int score = 0;
   Feedback feedback;
    List<Feedback> feedbacks = new FeedbackBean().queryListingByReceiverId(userId);
    int size = feedbacks.size();
    
    for (int i = 0; i < size; i++){
       feedback = feedbacks.get(i);
       score += feedback.getFeedbackScore() ;
    }     
    
    if (size == 0){
        score = 0 ;
           }
       else{
        score /= size ;
       }
    %>
    <%
      if(session.getAttribute("reportMessage")!=null)
      {
            int followmessage=Integer.parseInt(session.getAttribute("reportMessage").toString());
            session.removeAttribute("reportMessage");
            if(followmessage==0)
            {%>
    <script type="text/javascript">
            alert("Server is busy, please try again latter！");
    </script>
    <%} else
	  	{%>
    <script type="text/javascript">
            alert("Send success！");
    </script>
    <%}
}
    %>
    <h1><%=talker.getUsername() %></h1>
    
    <table width = 100%>				
        <tr>
            <td rowspan = 2 width = 30%> <img src="<%=talker.getPhotoPath() %>" width = 100%> </a></td>
            <td width = 70% align = center>
            <% for(int j = 0; j < score; j++) {%>
            <img src="image/Star.gif" width = 30%>
            <%}%></td>
        </tr>
        <tr>
            <td align = center>Member Since:<i><%=talker.getMemberSince() %></i></td>
        </tr>
    </table>
    
    <div data-role="controlgroup">
        <a href="sellerReviewsPage.jsp" data-role="button" data-icon="star">Seller Reviews</a>
        <a href="conversationPage.jsp" data-role="button" data-icon="plus">Message Member</a>
        <a href="reportSeller.jsp" data-role="button" data-icon="alert">Report Member</a>
    </div>
    
    <h2><%=talker.getUsername() %>'s Items For Sale</h2>
    
    <ul data-role="listview">
        <% Listing listing = new Listing();
        for(int i = 0; i < listingList.size(); i++){     
                       listing = (Listing)listingList.get(i); %>    
        <li>
            <a href="javascript:setListingid(<%= listing.getId() %>)">
                <h1><%= listing.getListingTitle() %></h1>
                <img src="<%= listing.getImagePath() %>">
                <p><%= listing.getDescription() %></p>
            </a>
        </li>
        
        <% } %>
        
    </ul>
    
    <form action="GetListingServlet" method="get" name="myform" >  
        <input type="hidden" name="listingId">
    </form>
</article>
<jsp:include page="footer.jsp" />
