<%-- 
    Document   : login
    Created on : Dec 27, 2012, 11:57:53 PM
    Author     : Administrator
--%>

<%@page language="java" pageEncoding="UTF-8"%>
<jsp:include page="LogoutHeader.jsp" />
<!DOCTYPE html>
<script type="text/javascript">
  function subMit()
  {
        var usercardid=document.getElementById("usercardid").value;
        var userpwd=document.getElementById("userpwd").value;
        if(usercardid.length==0)
        {
                alert("User name cannot be empty!");
        }
        else if(userpwd.length==0)
        {
                alert("password cannot be empty!");
        }
        else
        {
                document.myform.Username.value=usercardid;
                document.myform.Password.value=userpwd;
                document.myform.submit();
        }
  }
</script>
<h1>Login</h1>


<form action="LoginServlet" method="post" name="myform">
    <%
     if(session.getAttribute("loginMessage")!=null){
    %>
    <font style="color:red;">
    <%= session.getAttribute("loginMessage").toString()%>
    </font>
    <%
        session.removeAttribute("loginMessage");
    }
    %>         
    <ul data-role="listview">
        
        <li>
            Username:</br>
            <input type="text" name="Username" id="usercardid"/>
        </li>
        
        <li>
            Password:</br>
            <input type="password" name="Password" id="userpwd"/>
        </li>
        
        <li>
            <input type = "button" name = "log in submit" value = "Login" onClick="subMit();">
        </li>
        
    </ul>
    
    
</form>
    <jsp:include page="LogoutFooter.jsp" />