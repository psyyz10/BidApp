<%-- 
    Document   : accountInfoPage
    Created on : Feb 5, 2013, 10:56:19 PM
    Author     : Administrator
--%>

<%@page import="com.auction.entity.Userinfo"%>
<%@page language="java" pageEncoding="UTF-8"%>
<jsp:include page="header.jsp" />
<article data-role="content">
    <%
    
    //Get login user
     Userinfo user = (Userinfo)session.getAttribute("loginUser");
    
    %> 
    <h1>My Profile</h1>
    
    <article data-role="content">
        
        <h1>My Profile</h1>
        
        <form action ="changAccountServlet" method="post">
            <ul data-role="listview">
                <li data-role="fieldcontain">
                    <label for="name">First Name:</label>
                    <input type="text" name="name" id="name" value="<%= user.getFistName() %>"  />
                </li>
                <li data-role="fieldcontain">
                    <label for="name">Last Name:</label>
                    <input type="text" name="name" id="name" value="<%= user.getLastName() %>"  />
                </li>
                <li data-role="fieldcontain">
                    <label for="textarea">My Public Seller Description:</label>
                    <textarea cols="40" rows="8" name="textarea" id="textarea"></textarea>
                </li>
                <li data-role="fieldcontain">
                    <fieldset data-role="controlgroup">
                        <legend>Just an example of the stuff we can do here...</legend>
                        <input type="checkbox" name="checkbox-1a" id="checkbox-1a" class="custom" />
                        <label for="checkbox-1a">this</label>
                        
                        <input type="checkbox" name="checkbox-2a" id="checkbox-2a" class="custom" />
                        <label for="checkbox-2a">that</label>
                        
                        <input type="checkbox" name="checkbox-3a" id="checkbox-3a" class="custom" />
                        <label for="checkbox-3a">them</label>
                        
                        <input type="checkbox" name="checkbox-4a" id="checkbox-4a" class="custom" />
                        <label for="checkbox-4a">there</label>
                    </fieldset>
                </li>
                
                <li data-role="fieldcontain">
                    <fieldset data-role="controlgroup">
                        <legend>And some more if we want:</legend>
                        <input type="radio" name="radio-choice-1" id="radio-choice-1" value="choice-1" checked="checked" />
                        <label for="radio-choice-1">Just</label>
                        
                        <input type="radio" name="radio-choice-1" id="radio-choice-2" value="choice-2"  />
                        <label for="radio-choice-2">For</label>
                        
                        <input type="radio" name="radio-choice-1" id="radio-choice-3" value="choice-3"  />
                        <label for="radio-choice-3">Show</label>
                    </fieldset>
                </li>
                
                <li data-role="fieldcontain">
                    <label for="select-choice-1" class="select">Choose shipping method:</label>
                    <select name="select-choice-1" id="select-choice-1">
                        <option value="standard">7 days</option>
                        <option value="rush">5 days</option>
                        <option value="express">Tomorrow</option>
                    </select>
                </li>
                
                <li data-role="fieldcontain">
                    <label for="select-choice-3" class="select">Your country:</label>
                    <select name="select-choice-3" id="select-choice-3">
                        <option value="AL">China</option>
                        <option value="AZ">The secret holy land of Tom</option>
                        <option value="AK">United Kingdom</option>
                        <option value="AK">Scotland lol.</option>
                    </select>
                </li>
                
                <li data-role="fieldcontain">
                    <label for="select-choice-a" class="select">Choose shipping method:</label>
                    <select name="select-choice-a" id="select-choice-a" data-native-menu="false">
                        <option>Shipping Method</option>
                        <option value="standard">Standard: 7 day</option>
                        <option value="rush">Rush: 3 days</option>
                        <option value="express">Express: next day</option>
                        <option value="overnight">Overnight</option>
                    </select>
                </li>
                
                <li class="ui-body ui-body-b">
                    <fieldset class="ui-grid-a">
                        <div class="ui-block-a"><button type="cancel" data-theme="d">Cancel</button></div>
                        <div class="ui-block-b"><button type="submit" data-theme="a">Submit</button></div>
                    </fieldset>
                </li>
                
            </ul>
            
        </form>
        
    </article>
    
    
    
</article>
                    <jsp:include page="footer.jsp" />