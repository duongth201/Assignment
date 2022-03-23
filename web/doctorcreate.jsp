
<%--<%@page contentType="text/html" pageEncoding="UTF-8"%>--%>
<!DOCTYPE html>
<!--<html>
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
</html>-->

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Add</title>

    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link href="css/form.css" rel="stylesheet" type="text/css"/>

<body>
    
    <div class="container">
        <div class="modal-dialog">
            <div class="modal-content">
                <form action="create" method="post">
                    <div class="modal-header">						
                        <h4 class="modal-title">Add Doctor</h4>
                        <a href="doctorlist" type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</a>
                    </div>
                    <div class="modal-body">					
                        <div class="form-group">
                            <label>ID</label>
                            <input name="id" type="text" class="form-control" required>
                        </div>
                        <div class="form-group">
                            <label>Department ID</label>
                            <input name="departid" type="text" class="form-control" required>
                        </div>
                        <div class="form-group">
                            <label>Name</label>
                            <input name="name" type="text" class="form-control" required>
                        </div>

                        <div class="form-group">
                            <label>Age</label>
                            <input name="age" type="text" class="form-control" required>
                        </div>
                        <div class="form-group">
                            <label style="margin-right: 15px">Gender</label>
                            <input type="radio" name="gender" value="Male"/> Male
                            <input type="radio" name="gender" value="Female" required/> Female
                        </div>
                        <div class="form-group">
                            <label>Username</label>
                            <input name="username" type="text" class="form-control" required>
                        </div>
                        <div class="form-group">
                            <label>Password</label>
                            <input name="password" type="text" class="form-control" required>
                        </div>
   

                    </div>
                    <div class="modal-footer">
                        <input type="submit" class="btn btn-success" value="Create" />
                        
                    </div>
                </form>
            </div>
        </div>
    </div>

</body>
</html>
