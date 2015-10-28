<%-- 
    Document   : createAuctionPage
    Created on : Feb 5, 2013, 11:10:46 PM
    Author     : Administrator
--%>


<%@page import="com.auction.entity.Type"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.auction.logic.TypeBean"%>
<%@page import="com.auction.entity.Userinfo"%>
<%@page language="java" pageEncoding="UTF-8"%>
<jsp:include page="header.jsp" />
<script type="text/javascript">
    
   // check whether the input is correct
    function validate()
{ 
    var startPrice=document.getElementById("startPrice").value;
    var title = document.getElementById("title").value;
    var postage = document.getElementById("postage").value;
    var description = document.getElementById("description").value;
    var file = document.getElementById("file").value;
        
    if(startPrice.length<=0 || title.length<=0 || postage.length<=0 || description.length<=0)
        {
                alert("Please complete\uff01");
        }
        
    else if(isNaN (startPrice - 0))
        {
             alert("Start price should be a number not a word");
        }
    else if(isNaN (postage - 0))
        {
             alert("Postage price should be a number not a word");
        }
    else{
        document.myform.submit();
    }
      
}
</script>
<%!
        TypeBean tbean=new TypeBean();  
        ArrayList<Type> typeList = (ArrayList)tbean.queryAllType();
%>
<article data-role="content">
    
    <h1>Create Auction</h1>
    
    <form action="CreateAuctionServlet" method="POST" name="myform" enctype="multipart/form-data">
        <ul data-role="listview">
            <li data-role="fieldcontain">
                Item Name:
                <input type="text" name="name" value="" id="title"/>
            </li>
            <li data-role="fieldcontain">
                Description:
                <textarea cols="40" rows="10" name="description" id ="description"></textarea>
            </li>
            <li data-role="fieldcontain">
                
                Category
                <select name ="type">
                    <% for(int i = 1; i < typeList.size(); i++){ %>
                    <option value="<%=typeList.get(i).getTypename() %>"><%= typeList.get(i).getTypename() %></option>
                    <%}%>
                </select>
                
            </li>
            
            <li data-role="fieldcontain">
                
                Filename:
                <input type="file" name="file" id="file">
                
            </li>
            
            <li data-role="fieldcontain">
                Starting Price:
                <input type="text" name="startPrice" id="startPrice" value=""/>
            </li>
            
            <li data-role="fieldcontain">
                
                Postage And Packaging Price:
                <input type="text" name="postage" id="postage"/>
                
            </li>
            
            <li data-role="fieldcontain">
                
                Expiry Date <i>(Your auction will expire at midnight on the date you specify)</i>
                
                </br></br>
                
                Day
                <select name="day">
                    <option value="1">1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                    <option value="4">4</option>
                    <option value="5">5</option>
                    <option value="6">6</option>
                    <option value="7">7</option>
                    <option value="8">8</option>
                    <option value="9">9</option>
                    <option value="10">10</option>
                    <option value="11">11</option>
                    <option value="12">12</option>
                    <option value="13">13</option>
                    <option value="14">14</option>
                    <option value="15">15</option>
                    <option value="16">16</option>
                    <option value="17">17</option>
                    <option value="18">18</option>
                    <option value="19">19</option>
                    <option value="20">20</option>
                    <option value="21">21</option>
                    <option value="22">22</option>
                    <option value="23">23</option>
                    <option value="24">24</option>
                    <option value="25">25</option>
                    <option value="26">26</option>
                    <option value="27">27</option>
                    <option value="28">28</option>
                    <option value="29">29</option>
                    <option value="30">30</option>
                    <option value="31">31</option>
                </select >
                
                Month
                <select name="month">
                    <option value="01">January</option>
                    <option value="02">February</option>
                    <option value="03">March</option>
                    <option value="04">April</option>
                    <option value="05">May</option>
                    <option value="06">June</option>
                    <option value="07">July</option>
                    <option value="08">August</option>
                    <option value="09">September</option>
                    <option value="10">October</option>
                    <option value="11">November</option>
                    <option value="12">December</option>
                </select>
                
                Year
                <select name="year">
                    <option value="2011">2014</option>
                    <option value="2011">2013</option>
                    <option value="2011">2012</option>
                    <option value="2011">2011</option>
                    <option value="2010">2010</option>
                    <option value="2009">2009</option>
                    <option value="2008">2008</option>
                    <option value="2007">2007</option>
                    <option value="2006">2006</option>
                    <option value="2005">2005</option>
                    <option value="2004">2004</option>
                </select>
            </li>
            
            <li>
            <legend>Agree to the BidApp! terms and conditions:</legend>
            <input type="checkbox" name="checkbox-agree" id="checkbox-agree" class="custom" />
            <label for="checkbox-agree">I agree</label>
            </li>
            
            <li>
                <input type = "submit" name = "submit" value = "Create"  onClick="validate()"></br>
            </form>
                <form action="myProfileNavPage.jsp">
                    <button type="submit" data-theme="b">Cancel</button>
                </form>
            </li>
            
        </ul>
        
        
        
</article>

<jsp:include page="footer.jsp" />
