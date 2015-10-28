<%@ page contentType="text/html;charset=UTF-8" %>
<html>
    <head>
        <meta charset="utf-8" />
	<title>BidApp!</title>
	<link rel="stylesheet" href="http://code.jquery.com/mobile/1.2.0/jquery.mobile-1.2.0.min.css" />
	<meta name = "viewport" content = "width-device-width, initial-scale=1, maximum-scale=1" />
<script type="text/javascript">
function jump()
{
	i--;
	if(i==0)
	{
		clickme.click();
	}
	document.getElementById('time').value=i;
	setTimeout("jump()",1000);
}
var i=6;
</script>
<link type="text/css" rel="stylesheet" href="css/regSuccess.css">
    </head>
    <body onLoad="jump()">
        <p> <font style="font-size:20px;color:#FFFF00"> Successful registration </font><p>
        <p><input type="text" id="time" style="border:none;" size="1" readonly="true"> seconds automatically jump login page!</p>
        If not jump<a href="index.jsp" id="clickme">click here</a>
    </body>
</html>