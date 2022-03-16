<%-- 
    Document   : addcour
    Created on : Mar 16, 2022, 10:54:17 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="addcourse" method="post">
                Course ID: <input type="text" name="cid" required/> 
                <br>
                Doctor ID: <input type="text" name="did" required/> 
                <br>
                Doctor Name: <input type="text" name="doctorname" required/> 
                <br>
                Name: <input type="text" name="courname" required/> 
                <br>
                Time: <input type="text" name="time" required/> 
                <br>
                
                Price: <input type="text" name="price" required/> 
                <br>
                Img: <input type="text" name="img" required/> 
                <br>
                Infor: <input type="text" name="info" required/> 
                <br>
                <input type="submit" value="Create" />
                
        </form>
    </body>
</html>
