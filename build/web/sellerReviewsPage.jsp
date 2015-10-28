<%-- 
    Document   : sellerReviewsPage
    Created on : Feb 17, 2013, 10:46:45 PM
    Author     : Administrator
--%>
<%@page import="com.auction.logic.UserinfoBean"%>
<%@page import="com.auction.entity.Feedback"%>
<%@page import="java.util.List"%>
<%@page import="com.auction.logic.FeedbackBean"%>
<%@page import="com.auction.entity.Userinfo"%>

<jsp:include page="header.jsp" />
<%  Userinfo user=(Userinfo)session.getAttribute("talker");
    FeedbackBean fb = new FeedbackBean();
    int userId = user.getUserid();
    List<Feedback> feedbackList = fb.queryListingByReceiverId(userId);
    int numberOfFeedback = feedbackList.size();
    Feedback feedback;
    if (numberOfFeedback == 0){
        numberOfFeedback = 1;
    }
    
%>
<article data-role="content">
    
    <h1>Reviews of <a href="otherProfilePage.jsp"><%= user.getUsername() %></a></h1>
    
    <table width=100%>
        <tr>
            <td width=20%>5 Star</td> <!--This width must remain fixed.-->
            <%%>
            <td bgcolor=#000000 width=<%= 60 * fb.queryNumberOfScoreByReceiverId(userId, 5) / numberOfFeedback%>%> <!--Widths are adjusted according to weighting.
                                                                            For example the percentage of this column is
                                                                            equal to the percentage of people rating 5 stars.
                                                                            However, so that there is room to show the number
                                                                            of rankings to the right of the bar,
                                                                            the maximum width of this bar is 60%. For example, if
                                                                            100% of the seller rankings were 5 stars then the width
                                                                            of this bar would be set to 60%. If only 50% ranked
                                                                            this seller at 5 stars then this would be 30%, and so on.-->		
            </td>
            
            <td width=<%= 60 * fb.queryNumberOfScoreByReceiverId(userId, 5) / numberOfFeedback%>%> <!--This width should be the remaining width percentage.-->
                
                (<%= fb.queryNumberOfScoreByReceiverId(userId, 5) %>) <!--This value should display the number of people who ranked this user at 5 stars.-->
            </td>
        </tr>
    </table>
    
    <table width=100%>
        <tr>
            <td width=20%>4 Star</td>
            
            <td bgcolor=#000000 width=<%= 60 * fb.queryNumberOfScoreByReceiverId(userId, 4) / numberOfFeedback%>%>	
            </td>
            
            <td width=<%= 60 * fb.queryNumberOfScoreByReceiverId(userId, 4) / numberOfFeedback%>%>
                (<%= fb.queryNumberOfScoreByReceiverId(userId, 4) %>)
            </td>
        </tr>
    </table>
    
    <table width=100%>
        <tr>
            <td width=20%>3 Star</td>
            
            <td bgcolor=#000000 width=<%= 60 * fb.queryNumberOfScoreByReceiverId(userId, 3) / numberOfFeedback %>%>	
            </td>
            
            <td width=<%= 60 * fb.queryNumberOfScoreByReceiverId(userId, 3) / numberOfFeedback %>%>
                (<%= fb.queryNumberOfScoreByReceiverId(userId, 3) %>)
            </td>
        </tr>
    </table>
    
    <table width=100%>
        <tr>
            <td width=20%>2 Star</td>
            
            <td bgcolor=#000000 width=<%= 60 * fb.queryNumberOfScoreByReceiverId(userId, 2)/ numberOfFeedback %>%>	
            </td>
            
            <td width=<%= 60 * fb.queryNumberOfScoreByReceiverId(userId, 2) / numberOfFeedback%>%>
                (<%= fb.queryNumberOfScoreByReceiverId(userId, 2) %>)
            </td>
        </tr>
    </table>
    
    <table width=100%>
        <tr>
            <td width=20%>1 Star</td>
            
            <td bgcolor=#000000 width=<%= 60 * fb.queryNumberOfScoreByReceiverId(userId, 1) / numberOfFeedback%>%>	
            </td>
            
            <td width=<%= 60 * fb.queryNumberOfScoreByReceiverId(userId, 1) / numberOfFeedback%>%>
                (<%= fb.queryNumberOfScoreByReceiverId(userId, 1) %>)
            </td>
        </tr>
    </table> 
    <% for(int i=0;i<feedbackList.size();i++){ %>        
    <table width = 100%>
        <% feedback = (Feedback)(feedbackList.get(i)); %>
        <tr>
            <td width = 15%><img src="<%=new UserinfoBean().queryUserinfoByUserid(feedback.getSenderId()).getPhotoPath() %>" width = 100%></td>
            <td width = 75%><%=feedback.getComments() %></td>
            <td width = 10%><i><%=feedback.getTimeSent() %></i></td>
        </tr><hr>
   <% }%>     
    </table>
    </font>
    
</article>

    <jsp:include page="footer.jsp" />