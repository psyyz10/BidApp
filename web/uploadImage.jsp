<%-- 
    Document   : uploadImage
    Created on : Jan 18, 2013, 4:21:22 AM
    Author     : Administrator
--%>

<%@page language="java" pageEncoding="UTF-8"%>
<jsp:include page="header.jsp" />
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<body>
    <h3>Image Upload:</h3>
    Select a image to upload: <br />
    <form action="UploadImageServlet" method="POST" >
        <input type="file" name="file" id ="file" />
        <br />
        <input type="submit" value="Upload" />
    </form>
</body>
<jsp:include page="footer.jsp" />
