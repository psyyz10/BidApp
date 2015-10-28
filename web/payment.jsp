<%-- 
    Document   : payment
    Created on : Feb 24, 2013, 12:46:31 AM
    Author     : Administrator
--%>
<%@page import="com.auction.entity.ItemImage"%>
<%@page import="com.auction.logic.ItemImageBean"%>
<%@page import="com.auction.logic.ListingBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.auction.entity.Listing"%>
<%@page import="com.auction.entity.Bids"%>

<jsp:include page="header.jsp" />
<% Bids bid = (Bids)session.getAttribute("bidWon");
   Listing listing = new ListingBean().queryListingByListingid(bid.getListingId());
   ArrayList<ItemImage> imageList = (ArrayList)new ItemImageBean().queryItemImageByListingId(listing.getId());
%>

<article data-role="content">
    
    <h2>Payment</h2>
    
    <p>Let's begin by reminding you what you were told you were getting</p>
    
    <div class="ui-body ui-body-d">
        
        <h3>Toaster</h3>
        
        <h4>Description</h4>
        
        <p>The Metropolis Collection by De'Longhi is designed to offer the ultimate in both style and practicality. Boldly combining the strong expressionist shapes of the 1940s and 1950s with inimitable classic Italian style, the Metropolis toaster--with matching kettle available--really is the essence of good design.</p>
        
        <h4>Images</h4>
        
        <table width = 100%>
            <tr>
                <td width = 50%><img src="PowerCable.jpg" width = 100%></td><td width = 50%><img src="Toast.jpg" width = 100%></td>
            </tr>
            <tr>
                <td><img src="Toaster.jpg" alt="gallery thumbnail" width="100%"/></td><td></td>
            </tr>
        </table>
        
    </div>
    
    <p>Please fill out the form below to pay for this item. You may later give feedback for the service you recieved.</p>
    
    <p>
        Card Number:
        <input type="text" name="bidValue">
    </p>
    <p>
        Expiry Date:
    </p>
    <p>
        Month:
        <select name="expiry-month">
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
        </select>
    </p>
    <p>
        Year:
        <select name="expiry-year">
            <option value="13">13</option>
            <option value="14">14</option>
            <option value="15">15</option>
            <option value="16">16</option>
            <option value="17">17</option>
            <option value="18">18</option>
            <option value="19">19</option>
            <option value="20">20</option>
        </select>
    </p>
    <p>
        Security Code:
        <input type="text" name="bidValue">
    </p>
    
    <p>
        <strong>By pressing 'Make Payment' you are confirming your payment of ?7.03 for this item.</strong>
    </p>
    
    <a href="#wonItemPage" data-role="button" data-theme="e" data-icon="check">Make Payment</a>
    
</article>
<jsp:include page="footer.jsp" />