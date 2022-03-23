



<%@page import="model.Course"%>

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
        Course cour = (Course) request.getAttribute("cour") ;
        %>
    </head>
    <body>

        <div class="container">
            <div class="modal-dialog">
                <div class="modal-content">
                    <form action="adminupdate" method="post">
                        <div class="modal-header">						
                            <h4 class="modal-title">Update Course</h4>
                            <a href="admincourse" type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</a>
                        </div>
                        <div class="modal-body">					
                            <div class="form-group">
                                <label>Course ID</label> 
                                <input name="id" type="text" class="form-control" value="<%=cour.getCourseID()%>" readonly >
                            </div>
                            <div class="form-group">
                                <label>Doctor ID</label>
                                <input name="did" type="text" class="form-control" value="<%=cour.getD().getDoctorID()%>">
                            </div>
                            <div class="form-group">
                                <label>Doctor Name</label>
                                <input name="dname" type="text" class="form-control" value="<%=cour.getD().getDoctorName()%>">
                            </div>
                            <div class="form-group">
                                <label>Course Name</label>
                                <input name="name" type="text" class="form-control" value="<%=cour.getCourseName()%>">
                            </div>

                            <div class="form-group">
                                <label>Time</label>
                                <input name="time" type="text" class="form-control" value="<%=cour.getCourseTime()%>">
                            </div>
                            <div class="form-group">
                                <label>Price</label>
                                <input name="price" type="text" class="form-control" value="<%=cour.getCoursePrice()%>">
                            </div>
                            <div class="form-group">
                                <label>Img</label><!--khong sua img-->
                                <input name="img" type="text" class="form-control" value="<%=cour.getCourseImg()%>" >
                            </div>
                            <div class="form-group">
                                <label>Infomation</label>
                                <input name="info" type="text" class="form-control" value="<%=cour.getCourseInfo()%>">
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


