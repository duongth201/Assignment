
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="create" method="post">
                ID: <input type="text" name="id" required/> 
                <br>
                Department ID: <input type="text" name="departid" required/> 
                <br>
                Name: <input type="text" name="name" required/> 
                <br>
                Age: <input type="number" name="age" required/> 
                <br>
                
                Gender: <input type="radio" name="gender" value="Male"/> Male
                        <input type="radio" name="gender" value="Female" required/> Female
                <br>
                Username: <input type="text" name="username" required/> 
                <br>
                Password: <input type="text" name="password" required/> 
                <br>
                <input type="submit" value="Create" />
                
        </form>
    </body>
</html>
