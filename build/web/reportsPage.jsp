<%-- 
    Document   : reportsPage
    Created on : Mar 3, 2013, 4:12:56 PM
    Author     : yxz02u
--%>

<%@page import="com.auction.logic.UserinfoBean"%>
<%@page import="com.auction.logic.ReportBean"%>
<%@page import="com.auction.entity.Report"%>
<%@page import="java.util.List"%>
<jsp:include page="aminHeader.jsp" />

<article>
    <script type="text/javascript">
    function setReportId(obj){
        document.myform.reportId.value = obj;
        document.myform.submit();
    }
    </script>
    
    <h1>Reports</h1>
    <% // Get all reports
       List<Report> reportList = new ReportBean().queryAll();
       Report report;
    %>
    <ul data-role="listview">
        <% for (int i = 0; i < reportList.size(); i++){ 
            report = reportList.get(i);
        %>
        
        <li data-role="list-divider"><%=report.getTimeSent() %></li>
        
        <li>
            <a href="javascript:setReportId(<%=report.getReportId() %>)">
                <h3><%= new UserinfoBean().queryUserinfoByUserid(report.getSenderId()).getUsername() %></h3>
                <p><%=report.getComments() %></p>
            </a>
        </li>
        
        <%}%>
        
    </ul>
</article>
<form action="GetRportServlet" method="get" name="myform" >  
    <input type="hidden" name="reportId">
</form>

<footer data-role="footer" data-position="fixed">
    
    <nav data-role="navbar">
        <ul>
            <li><a data-role="button" data-icon="back" data-rel="back">Back</a></li>
            <li><a href="LogoutServlet" data-icon="star">Log Out</a></li>
        </ul>
    </nav>
    
</footer>
</body>
</html>