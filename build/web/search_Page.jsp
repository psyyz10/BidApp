<%-- 
    Document   : search_Page
    Created on : Feb 12, 2013, 6:26:41 AM
    Author     : Administrator
--%>

<%@page import="com.auction.logic.UserSearchesBean"%>
<%@page import="com.auction.entity.Userinfo"%>
<%@page import="com.auction.entity.Type"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.auction.logic.TypeBean"%>

<% Userinfo user = (Userinfo)session.getAttribute("loginUser");
            if (user == null){ %>
<jsp:include page="LogoutHeader.jsp" />
<% }else{ %>
<jsp:include page="header.jsp" />
<%}%>

<article data-role="content">
    
    <%!
            TypeBean tbean=new TypeBean();  
            ArrayList<Type> typeList = (ArrayList)tbean.queryAllType();
    %>
    
    <h1>Search BidApp!</h1>
    <form action="SearchServlet" method ="get" >   
        Choose A Category
        <select name="category">
            <option value="all"><%= "All Category"%> </option> 
            
            <% for(int i = 0; i < typeList.size(); i++){           
            %>
            <option value ="<%= (typeList.get(i)).getTypename()%>"><%= (typeList.get(i)).getTypename() %> </option>  
            <%}%>
        </select>
        
        </p>
        <p>
            Choose order:
            <select name ="filter">
                <option value="1">Relevance First</option>
                <option value="3">Higher Price First</option>
                <option value="4">Lower Price First</option>
                <option value="5">Highest Feedback First</option>
            </select>
        </p>
        <input type="search" name="title"  id="search-basic" value="" />
        
        <input value ="Search" type="submit">Search</a>
        
    </form>
</article>       

<% if (user == null){ %>
<jsp:include page="LogoutFooter.jsp" />
<% }else{ %>
<jsp:include page="footer.jsp" />
<%}%>

