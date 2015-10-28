<%-- 
    Document   : conversationPage
    Created on : Dec 28, 2012, 2:35:54 AM
    Author     : Administrator
--%>

<%@page import="java.util.ArrayList"%>
<%@ page import="com.auction.entity.*" %>
<%@ page import="com.auction.logic.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<jsp:include page="header.jsp" />
<%
        //Get the login user from attribute
        Userinfo user=(Userinfo)session.getAttribute("loginUser");
        
        // Get talker from attribute
        Userinfo talker = (Userinfo)session.getAttribute("talker");
        MessageBean mbean = new MessageBean();  
        
        ArrayList list = (ArrayList)mbean.queryByUserid(user.getUserid()); 
%>
<script type="text/javascript">
   // check whether the input is correct
   function constraint(obj)
                {
                        
                        if(document.getElementById("followmessage").value.length<=0)
                        {
                                alert("Message cannot be empty！");
                        }
                        else if(document.getElementById("followmessage").value.length>500)
                        {
                                alert("500 words at most!");
                        }                                         
                        
                        else
                        {
                                document.myform1.submit();
                        }
                }
                function setPagenum(obj)
                {
                        document.myform2.pagenum.value=obj;
                        document.myform2.submit();
                }
                function setFollowmessage(obj)
                {
                        if(obj.value.length<500)
                        {
                                document.myform1.followmessage.value=obj.value;
                        }
                        else
                        {
                                alert("500 words at most!");
                        }
                }
</script>         
<!--Content-->

<article data-role="content">
    
    <h1>Conversation with <a href="otherProfilePage.jsp"><%= talker.getUsername() %></a></h1>
    <%
      if(session.getAttribute("followmessage")!=null)
      {
            int followmessage=Integer.parseInt(session.getAttribute("followmessage").toString());
            session.removeAttribute("followmessage");
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
    <%}}%>
    <table>
        <tr>
            <td>
                <textarea width ="100%"id="followmessage" onBlur="setFollowmessage(this)"></textarea>
            </td>           
        </tr>
        <tr>
            <td>
                <input type="button" value="Send" onclick="constraint()">
            </td>
        </tr>
    </table>
    <%
           int pagenum=1;
           if(session.getAttribute("messagepagenum")!=null)
           {
               pagenum=Integer.parseInt(session.getAttribute("messagepagenum").toString());
               session.removeAttribute("messagepagenum");
           }
           if(session.getAttribute("messagelist")!=null)
               {
                       ArrayList messagelist=(ArrayList)session.getAttribute("messagelist");
                       Message message = new Message();
                   for(int i=0;i<messagelist.size();i++){ %>
    <table width = 100%>
        <% message = (Message)(messagelist.get(i)); %>
        <tr>
            <td width = 15%><img src="<%=new UserinfoBean().queryUserinfoByUserid(message.getSenderId()).getPhotoPath() %>" width = 100%></td>
            <td width = 75%><%=message.getMessageContent() %></td>
            <td width = 10%><i><%=message.getTimeSent() %></i></td>
        </tr>
        
    </table>
    
    <hr>
    <%}
                int pagecount=Integer.parseInt(session.getAttribute("messagepagecount").toString());
                        if(pagenum>1)
                        {%>
    <a href="javascript:setPagenum('<%=pagenum-1 %>')">[Previous page]</a>
    <%}else{%>
    [Previous page]
    <%}
    int[] i=PageBean.getPage(pagenum,pagecount);
    int n=i[0];
    int end=i[1];
    for(;n<=end;n++){
       if(pagenum==n){%>
    
    <font color="red">[<%=n %>]</font>
    
    <%}else{
    %>
    
    <a href="javascript:setPagenum('<%=n %>')" >[<%=n %>]</a>
    
    <%}
}
    if(pagenum<pagecount){%>
    <a href="javascript:setPagenum('<%=pagenum+1 %>')" >[Next page]</a>
    <%}else{%>
    [Next page]
    <%}%>
    [<%=pagecount%> pages]
    <%}%>    
    
    <form action="SendMessageServlet" method="post" name="myform1">
        <input type="hidden" name="followmessage">
        <input type="hidden" name="senderId" value ="<%= user.getUserid() %>">
        <input type="hidden" name="receiverId" value="<%= talker.getUserid() %>">
    </form>
    <form action="ChangeMessagePageServlet" method="post" name="myform2">
        <input type="hidden" name="pagenum">
    </form>
    
</article>
<jsp:include page="footer.jsp" />


<!--</div>-->
