<%-- 
    Document   : search
    Created on : Jan 19, 2013, 2:46:53 AM
    Author     : Administrator
--%>

<%@page import="com.auction.logic.BidsBean"%>
<%@page import="com.auction.entity.Bids"%>
<%@page import="com.auction.entity.Userinfo"%>
<%@page import="com.auction.logic.PageBean"%>
<%@page import="com.auction.entity.Listing"%>
<%@page import="com.auction.entity.Listing"%>
<%@page import="com.auction.entity.Type"%>
<%@page import="com.auction.logic.TypeBean"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% Userinfo user = (Userinfo)session.getAttribute("loginUser");
            if (user == null){ %>
<jsp:include page="LogoutHeader.jsp" />
<% }else{ %>
<jsp:include page="header.jsp" />
<%}%>

<%!
        TypeBean tbean=new TypeBean();  
        ArrayList<Type> typeList = (ArrayList)tbean.queryAllType();
%>
<script type="text/javascript">
    function setListingid(obj){
        document.myform.listingId.value = obj;
        document.myform.submit();
    }
    function setPagenum(obj)
                {
                        document.myform1.pagenum.value=obj;         
                        document.myform1.submit();
                }
</script>

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
        <option value="2">Shortest Time First</option>
        <option value="3">Higher Price First</option>
        <option value="4">Lower Price First</option>
        <option value="5">Highest Feedback First</option>
    </select>
</p>
<input type="search" name="title"  id="search-basic" value="" />

<input value ="Search" type="submit">Search</a>

</form>
<h1>Here's your search results...</h1>

<p>
    
<ul data-role="listview" data-filter="true">
    <% int pagenum=1;
    
       // Get the now page number
       if(session.getAttribute("listingpagenum")!=null)
       {
           pagenum=Integer.parseInt(session.getAttribute("listingpagenum").toString());
           session.removeAttribute("listingpagenum");
       }
    
       
       if(session.getAttribute("listingList")!=null)
           {
                   // get the listing list
                   ArrayList listinglist=(ArrayList)session.getAttribute("listingList");
                   Listing listing = new Listing();
                   
                   for(int i = 0; i < listinglist.size(); i++){     
                       listing = (Listing)listinglist.get(i);
                       
                       // Get from the highest prices
                       Bids bid = new BidsBean().queryListingByHighestPrices(listing.getId());
                       double price;
                       if (bid == null)
                            price = listing.getStartPrice();
                        else
                            price = bid.getBidAmount();
    %>
    <li>
        <a href="javascript:setListingid(<%= listing.getId() %>)">
            <img src="<%= listing.getImagePath() %>">
            <h1><%= listing.getListingTitle() %></h1>
            <p>End Time: <%=listing.getEndTime() %></p>
            <span class="ui-li-count"><%= price %></span>
        </a>
    </li>
    <%}%>
    
</ul>

<hr>
<%
            int pagecount=Integer.parseInt(session.getAttribute("listingpagecount").toString());
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
<%}else{%>

No Results   

<%}%>    

<form action="ChangeListingPageServlet" method="get" name="myform1">
    <input type="hidden" name="pagenum">
</form>

<form action="GetListingServlet" method="get" name="myform" >  
    <input type="hidden" name="listingId">
</form>


<% if (user == null){ %>
<jsp:include page="LogoutFooter.jsp" />
<% }else{ %>
<jsp:include page="footer.jsp" />
<%}%>
