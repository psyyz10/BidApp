<%-- 
    Document   : register
    Created on : Dec 25, 2012, 7:02:50 AM
    Author     : Administrator
--%>

<%@page language="java" pageEncoding="UTF-8"%>
<%@page import = "java.util.GregorianCalendar"%>
<%@page import = "java.util.Calendar"%>
<jsp:include page="LogoutHeader.jsp" />

<script type='text/javascript' src='/bidapp/dwr/interface/registerbean.js'></script>
<script type='text/javascript' src='/bidapp/dwr/engine.js'></script>
<script type='text/javascript' src='/bidapp/dwr/util.js'></script>        
<script type="text/javascript">
var code ;

// Create a random code to be validation code

function createCode()
{
        code = "";
        var codeLength = 4;
        var checkCode = document.getElementById("checkCode");
        var selectChar = new Array(0,1,2,3,4,5,6,7,8,9,'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z');//所有候选组成验证码的字符，当然也可以用中文的
		
        for(var i=0;i<codeLength;i++)
        {
                var charIndex = Math.floor(Math.random()*36);
                code +=selectChar[charIndex];
        }
        // alert(code);
        if(checkCode)
        {
                checkCode.className="code";
                checkCode.value = code;
        }
}
 
 // check whether the input is correct
function validate()
{
	
        var inputCode=document.getElementById("validatecode").value;
        var userName = document.getElementById("userName").value;
        var userpwd = document.getElementById("userpwd").value;
        var userpwd2 = document.getElementById("userpwd2").value;
        var userEmail = document.getElementById("userEmail").value;
        var houseNumber = document.getElementById("houseNumber").value;
                
        var Expression=/\w+([-+.']\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*/;
        var objExp=new RegExp(Expression);
		
        if(userName.length<=0 || userpwd.length<=0 || userpwd2.length<=0 || userEmail.length<=0)
        {
                alert("Please complete\uff01");
        }
        else if(userpwd != userpwd2)
        {
                alert("Two password input inconsistent\uff01");
        }
        else if(objExp.test(userEmail) == false)
        {
                alert("Please enter the correct mailbox!");
        }
        else if (isNaN (houseNumber - 0) ){
                alert("House number should be a number not a word");
        }
        else if(inputCode.length <=0)
        {
                alert("Please enter the verification code\uff01");
        }
        else if(inputCode != code )
        {
                alert("Verification code input errors\uff01");
                createCode();
        }
        else
        {
                document.myform.submit();
        }
}
function setUserpwd(obj)
{
        document.myform.Password.value=obj.value;
}
function setUseremail(obj)
{
        document.myform.EmailAddress.value=obj.value;
}
function setUserName(obj)
{
        document.myform.Username.value=obj.value;
}
function setFirstName(obj)
{
        document.myform.FirstName.value=obj.value;
}
function setLastname(obj)
{
        document.myform.LastName.value=obj.value;
}
function setHouseNumber(obj)
{
        document.myform.HouseNumber.value=obj.value;
}
function setStreetName(obj)
{
        document.myform.StreetName.value=obj.value;
}
function setPostCode(obj)
{
        document.myform.Postcode.value=obj.value;
}
function setCity(obj)
{
        document.myform.City.value=obj.value;
}
function setCounty(obj)
{
        document.myform.County.value=obj.value;
}
function setCountry(obj)
{
        document.myform.Country.value=obj.value;
}
function idcheck()
{
        var user = document.getElementById("userName").value;
        registerbean.isUser(user, mycheck);
}
function mycheck(bb)
{      
        if(bb)
        {
        alert("The user name already exists, please re-enter!");
        document.getElementById("userName").value="";
        document.getElementById("userName").focus();
        }
}
        
function pwdCheck()
{
        if(document.getElementById("userpwd").value.length<=0)
        {
                alert("请先输入密码!");
        }
        else if(document.getElementById("userpwd").value.length>=10)
        {
                alert("Security: high");
        }
        else if(document.getElementById("userpwd").value.length>=6&&document.getElementById("userpwd").value.length<10)
        {
                alert("Security: middle");
        }
        else
        {
                alert("Security: low");
        }
}
</script>
<script type="text/javascript">
    createCode();
</script>

<article data-role="content" >
    <ul data-role="listview">
        
        <li data-role="fieldcontain">
            Username:</br>
            <input type = "text" name = "Username" value = "" size = "20" id="userName" onChange="setUserName(this)" onBlur="idcheck()">
        </li>
        
        <li data-role="fieldcontain">
            Password:</br>
            <input type = "password" name = "Password" value = "" size = "20" id="userpwd" onChange="setUserpwd(this)">
        </li>
        
        <li data-role="fieldcontain">
           Confirm Password:</br>
            <input type = "password"  value = "" size = "20" id="userpwd2" >
        </li>
        
        <li data-role="fieldcontain">
            First Name:</br>
            <input type = "text" name = "FirstName" value = "" size = "20" onChange="setFirstName(this)">
        </li>
        
        <li data-role="fieldcontain">
            Last Name:</br>
            <input type = "text" name = "LastName" value = "" size = "20" onChange="setLastName(this)">
        </li>
        
        <li data-role="fieldcontain">
            House Number:</br>
            <input type = "text" name = "HouseNumber" value = "" size = "20" id ="houseNumber" onChange="setHouseNumber(this)">
        </li>
        
        <li data-role="fieldcontain">
            Street Name:</br>
            <input type = "text" name = "StreetName" value = "" size = "20" onChange="setStreetName(this)">
        </li>
        
        <li data-role="fieldcontain">
            Postcode:</br>
            <input type = "text" name = "Postcode" value = "" size = "20" onChange="setPostCode(this)">
        </li>
        
        <li data-role="fieldcontain">
            City:</br>
            <input type = "text" name = "City" value = "" size = "20" onChange="setCity(this)">
        </li>
        
        <li data-role="fieldcontain">
            County:</br>
            <input type = "text" name = "County" value = "" size = "20" onChange="setCounty(this)">
        </li>
        
        <li data-role="fieldcontain">
            Country:</br>
            <input type = "text" name = "Country" value = "" size = "20" onChange="setCountry(this)">
        </li>
        
        <li data-role="fieldcontain">
            Email Address:</br>
            <input type = "text" name = "EmailAddress" value = "" size = "20" id="userEmail" onChange="setUseremail(this)">
        </li>
        
        <li data-role="fieldcontain">
            Member Since:</br>
            <% Calendar calendar = new GregorianCalendar(); 
                                                String date = calendar.get(Calendar.YEAR) + "-"+ (calendar.get(Calendar.MONTH )+1) + "-" +calendar.get(Calendar.DAY_OF_MONTH); %>
            <input type = "text" name = "MemberSince" value = "<%= date%>" size = "10" readonly="true">
        </li>
        
        <li data-role="fieldcontain">
            Verification code:</br>	
            <input type="text" id="checkCode" class="code" readonly="true" >			
        </li>
        
        <li data-role="fieldcontain">
            <A href="javascript:createCode()"><U>See clearly?Another picture</U></A></br>
            <input name="validatecode" id="validatecode" type="text">
        </li>
        
        <li data-role="fieldcontain">

           <input type = "button" name = "submit" value = "Submit Form"  onClick="validate()"></br>
        </li>
    </ul>
        
    <form action= "RegisterServlet" method="post" name="myform">
        <input type="hidden" name="Username">
        <input type="hidden" name="Password">
        <input type="hidden" name="FirstName">
        <input type="hidden" name="LastName">
        <input type="hidden" name="HouseNumber">
        <input type="hidden" name="StreetName">
        <input type="hidden" name="Postcode">
        <input type="hidden" name="City">
        <input type="hidden" name="County">
        <input type="hidden" name="Country">
        <input type="hidden" name="EmailAddress">
        <input type="hidden" name="MemberSince" value = "<%= date%>">
    </form>
    <jsp:include page="LogoutFooter.jsp" />
</article>
        