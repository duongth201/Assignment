<%-- 
    Document   : addcour
    Created on : Mar 16, 2022, 10:54:17 PM
    Author     : ADMIN
--%>

<%--<%@page contentType="text/html" pageEncoding="UTF-8"%>--%>
<!--<!DOCTYPE html>
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
                    <form action="addcourse" method="post">
                        <div class="modal-header">						
                            <h4 class="modal-title">Add Course</h4>
                            <a href="admincourse" type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</a>
                        </div>
                        <div class="modal-body">					
                            <div class="form-group">
                                <label>Course ID</label>
                                <input name="cid" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Doctor ID</label>
                                <input name="did" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Doctor Name</label>
                                <input name="doctorname" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Course Name</label>
                                <input name="courname" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Time</label>
                                <input name="time" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Price</label>
                                <input name="price" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Img</label>
                                <input name="img" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Infor</label>
                                <input name="info" type="text" class="form-control" required>
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