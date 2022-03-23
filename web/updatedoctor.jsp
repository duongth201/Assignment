
<%@page import="java.util.ArrayList"%>
<%@page import="model.Doctor"%>
<%@page import="java.text.SimpleDateFormat"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Update </title>

        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link href="css/form.css" rel="stylesheet" type="text/css"/>

        <%
            Doctor d = (Doctor) request.getAttribute("d");
        %>
    </head>
    <body>

        <div class="container">
            <div class="modal-dialog">
                <div class="modal-content">
                    <form action="update" method="post">
                        <div class="modal-header">						
                            <h4 class="modal-title">Update Doctor</h4>
                            <a href="doctorlist" type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</a>
                        </div>
                        <div class="modal-body">					
                            <div class="form-group">
                                <label>DoctorID</label> <!--khong sua doctorid-->
                                <input name="id" type="text" class="form-control" value="<%=d.getDoctorID()%>" >
                            </div>
                            <div class="form-group">
                                <label>Department ID</label>
                                <input name="did" type="text" class="form-control" value="<%=d.getDepartmentID()%>">
                            </div>
                            <div class="form-group">
                                <label>Name</label>
                                <input name="name" type="text" class="form-control" value="<%=d.getDoctorName()%>">
                            </div>

                            <div class="form-group">
                                <label>Gender</label>
                                <input type="radio" name="gender"  value= "male"<%if (d.isDoctorGender()) {%>
                                       checked
                                       <%}%>> Male
                                <input type="radio" name="gender"  value= "female"<%if (d.isDoctorGender() == false) {%>
                                       checked
                                       <%}%>> Female
                            </div>
                            <div class="form-group">
                                <label>Age</label>
                                <input name="age" type="text" class="form-control" value="<%=d.getDoctorAge()%>">
                            </div>
                            <div class="form-group">
                                <label>Account</label><!--khong sua account-->
                                <input name="account" type="text" class="form-control" value="<%=d.getAccount().getUsername()%>" >
                            </div>
                            <div class="form-group">
                                <label>Password</label>
                                <input name="password" type="text" class="form-control" value="<%=d.getAccount().getPassword()%>">
                            </div>


                        </div>
                        <div class="modal-footer">
                            <input type="submit" class="btn btn-success" value="Update" />

                        </div>
                    </form>
                </div>
            </div>
        </div>

    </body>
</html>

