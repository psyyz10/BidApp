<%-- 
    Document   : userinfo.jsp
    Created on : Dec 27, 2012, 10:27:00 PM
    Author     : Administrator
--%>

<%@page import="com.auction.logic.UserinfoBean"%>
<%@page import="com.auction.entity.Feedback"%>
<%@page import="java.util.List"%>
<%@page import="com.auction.logic.FeedbackBean"%>
<%@page import="com.auction.entity.Listing"%>
<%@page import="com.auction.logic.ListingBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.auction.entity.Userinfo"%>
<%@page language="java" pageEncoding="UTF-8"%>
<jsp:include page="header.jsp" />

<script type="text/javascript">
    function setListingid(obj){
        document.myform.listingId.value = obj;
        document.myform.submit();
    }
</script>
<!--Content-->

<article data-role="content">
    <%
    // Get login user
    Userinfo user=(Userinfo)session.getAttribute("loginUser");
    
    // Get the listings with user id
    ArrayList<Listing> listingList = (ArrayList)new ListingBean().queryListingByUserid(user.getUserid());
    FeedbackBean feedbackBean = new FeedbackBean();
    
    int userId = user.getUserid();
    int score = 0;
    
    
    // Get the feedbacl with userId
    Feedback feedback;
    List<Feedback> feedbacks = feedbackBean.queryListingByReceiverId(userId);
    
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
    
    <h1><%=user.getUsername() %></h1>
    
    <table width = 100%>				
        <tr>
            <td rowspan = 2 width = 30%><a href="uploadImage.jsp"> <img src="<%=user.getPhotoPath() %>" width = 100%> </a></td>
            <td width = 70% align = center><img src="image/Star.gif" width = 30%>
                <% for(int j = 0; j < score; j++) {%>
                <img src="image/Star.gif" width = 30%>
                <%}%></td>
        </tr>
        <tr>
            <td align = center>Member Since: <i><%=user.getMemberSince() %></i></td>
        </tr>
    </table>
    
    <div data-role="controlgroup">
        <a href="sellerReviewsPage.jsp" data-role="button" data-icon="star">Seller Reviews</a>
    </div>
    
    <h2><%=user.getUsername() %>'s Items For Sale</h2>
    
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
</article>

<form action="GetMyListingServlet" method="get" name="myform" >  
    <input type="hidden" name="listingId">
</form>
<jsp:include page="footer.jsp" />
