<%-- 
    Document   : viewReportPage
    Created on : Mar 3, 2013, 4:13:49 PM
    Author     : yxz02u
--%>
<%@page import="com.auction.entity.Userinfo"%>
<%@page import="com.auction.logic.MessageBean"%>
<%@page import="com.auction.entity.Message"%>
<%@page import="com.auction.entity.Message"%>
<%@page import="com.auction.logic.ListingBean"%>
<%@page import="com.auction.entity.Listing"%>
<%@page import="java.util.List"%>
<%@page import="com.auction.logic.UserinfoBean"%>
<%@page import="com.auction.entity.Report"%>
<jsp:include page="aminHeader.jsp" />

<article data-role="content">
    <% 
        // Get the report from the attribute
       Report report = (Report)session.getAttribute("report"); 
       int receiverId = report.getReceiverId();
       int senderId = report.getSenderId();
       
       // Get sender and receiver by id
       Userinfo sender = new UserinfoBean().queryUserinfoByUserid(senderId);
       Userinfo receiver = new UserinfoBean().queryUserinfoByUserid(receiverId);
       
       // Get listing by seller and buyer
       List<Listing> listings = new ListingBean().queryListingByBids(senderId, receiverId);
       Listing listing;
       Message message;

    if(session.getAttribute("banMessage")!=null)
     {
           int followmessage=Integer.parseInt(session.getAttribute("banMessage").toString());
           session.removeAttribute("banMessage");
           if(followmessage==0)
           {%>
           <script type="text/javascript">
               alert("Server is busy, try again later");
           </script>
           <%}else{%>
           <script type="text/javascript">
               alert("Ban success !");
           </script>
           <%}}%>
           
    <script type="text/javascript">
        function setListingId(obj){
            document.myform.listingId.value = obj;
            document.myform.submit();
        }
        
        function displayResult(obj){
            document.myform1.talkerId.value = document.getElementById(obj).value
            document.myform2.who.value = document.getElementById(obj).value
        }
        
        function message(){
            document.myform1.submit();
        }
        
        function ban(){
            document.myform2.submit();
        }
    </script>
    
    <div class="ui-body ui-body-d">
        
        <h1><%=receiver.getUsername() %> Reporting <%=sender.getUsername() %></h1>
        
        <p><em><%=report.getComments() %></em></p>
        
        </hr>
    </div>
    
    </br>
    
    <div class="ui-body ui-body-d">
        
        <h3>Bid History</h3>
        
        <ul data-role="listview" data-filter="true">
            <% for(int i = 0; i < listings.size(); i++){
                listing = listings.get(i); %>
            <li>
                <a href="javascript:setListingId(<%=listing.getId() %>)">
                    <img src="<%=listing.getImagePath() %>">
                    <h1><%=listing.getListingTitle() %></h1>
                </a>
            </li>
            <%} %>
        </ul>
    </div>
    
    </br>
    
    <div class="ui-body ui-body-d">
        <% List<Message> messages = new MessageBean().queryPageByUserid(1, receiverId, senderId); %>
        <h3>Conversation History</h3>
        
        <ul data-role="listview">
            <% for(int i =0; i < messages.size(); i++){ 
                message = messages.get(i); %>
            <li>
                <img src="<%=new UserinfoBean().queryUserinfoByUserid(message.getSenderId()).getPhotoPath()%>" width = 100%>
                <p><%=message.getMessageContent() %></p>
                <p class="ui-li-aside"><strong><%=message.getTimeSent() %></strong></p>
            </li>
            <%}%>
            
        </ul>
        
    </div>
    
    </br>
    
    <div class="ui-body ui-body-d" >
        <label for="<%=receiver.getUserid() %>"><%=receiver.getUsername() %></label>
        <input name="who" id="<%=receiver.getUserid() %>" type="radio" data-theme="e" value="<%=receiver.getUserid() %>" onclick="displayResult(this.value)">
        <label for="<%=sender.getUserid() %>"><%=sender.getUsername() %></label>
        <input name="who" id="<%=sender.getUserid() %>" type="radio" data-theme="e" value="<%=sender.getUserid() %>" onclick="displayResult(this.value)">
    </div>
    
    <div class="ui-body ui-body-b">
        <p>
            <a href="javascript:message()" data-role="button" data-icon="plus">Message User</a>
        </p>
        <p>
            <a href="javascript:ban()" data-role="button" data-icon="delete">Ban User</a>
        </p>
        <p>
            <a href="DeleteReportServlet" data-role="button" data-theme="a" data-icon="delete">Close this report</a>
        </p>
    </div>
        
    <form action="GetReportListingServlet" method="get" name="myform" >  
        <input type="hidden" name="listingId">
    </form>
    
    <form action="GetMessegeServlet" method="get" name="myform1" >  
        <input type="hidden" name="talkerId" value ="<%=receiver.getUserid() %>">
    </form>
    
    <form action="BanUserServlet" method="post" name="myform2" >  
        <input type="hidden" name="who" value ="<%=receiver.getUserid() %>">
    </form>
    
</article>
        
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