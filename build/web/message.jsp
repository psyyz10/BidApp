<%-- 
    Document   : message
    Created on : Dec 28, 2012, 2:37:40 AM
    Author     : Administrator
--%>

<%@page import="com.auction.entity.Userinfo"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.auction.logic.*"%>
<%@page import="com.auction.entity.Message"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--MESSAGES PAGE-->

<!--<div data-role="page" id = "messagesPage" data-add-back-btn="true">-->


<jsp:include page="header.jsp" />
<%
    Userinfo user=(Userinfo)session.getAttribute("loginUser");
    Userinfo talker = new Userinfo();
    MessageBean mbean = new MessageBean();  
    Message message = new Message();
    ArrayList list = (ArrayList)mbean.queryByUserid(user.getUserid()); 
%>

<!--Content-->
<script type="text/javascript">
    function setUserid(obj){
        document.myform.talkerId.value = obj;
        document.myform.submit();
    }
</script>

<article data-role="content">
    
    <h1>Messages</h1>
    
    <ul data-role="listview">
        <% String date="";
        boolean same = false;
        for(int i = 0; i < list.size(); i++){   
            message = (Message)list.get(i);
            if (!date.equals(message.getTimeSent())){
                date = message.getTimeSent().substring(0,10);
                same = false;
            }else{
                same = true;
            }
               if (message.getReceiverId() == user.getUserid())
                   talker = new UserinfoBean().queryUserinfoByUserid(message.getSenderId());
               else
                   talker = new UserinfoBean().queryUserinfoByUserid(message.getReceiverId());
            if (!same){
        %>         
        <li data-role="list-divider"><%= date %>
            <%}%>
        <li>
            <a href="javascript:setUserid(<%= talker.getUserid()%>)">
                
                <h1><%= talker.getUsername() %> </h1>
                <img src= "<%= talker.getPhotoPath() %>">
                <p><%= message.getMessageContent() %></p>
                <input type="hidden" name="username" value =<%= talker.getUsername() %> >
                <p class="ui-li-aside"><strong>6:24</strong>AM</p>
                
            </a>
        </li>
        <% } %>
    </ul>
    <form action="GetMessegeServlet" method="get" name="myform" >  
        <input type="hidden" name="talkerId">
    </form>
    </article>
    <jsp:include page="footer.jsp" />
<!--    
</div>-->