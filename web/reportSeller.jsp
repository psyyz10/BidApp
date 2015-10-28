<%-- 
    Document   : reportSeller
    Created on : Feb 24, 2013, 11:33:05 PM
    Author     : Administrator
--%>

<%@page import="com.auction.entity.Userinfo"%>
<jsp:include page="header.jsp" />
<%
   // Check the talker from attribute
   Userinfo talker = (Userinfo)session.getAttribute("talker");
    %>
<article data-role="content">
    <form action="ReportServlet" method ="post" >
    <h1>Report <a href="otherProfilePage.jsp"><%= talker.getUsername() %></a></h1>
    
    <p>
        Please tell bidApp why you wish to report this user - our investigators will get back to you as soon as possible.
    </p>
    <p>
        <textarea name="reportReason" id="textarea"></textarea>
    </p>
    <input type="submit" data-icon="alert" value ="Send Report"  name = "submit">
    </form>
</article>

<jsp:include page="footer.jsp" />
