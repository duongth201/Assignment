<%@page import="java.util.ArrayList"%>
<%@page import="model.Doctor"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<%@page import="java.text.SimpleDateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Doctor</title>
        <%
        Doctor d = (Doctor) request.getAttribute("d") ;
        %>
    </head>
    <body>
        <form action="update" method="post">
            DoctorID: <input type="text" name="id" value="<%=d.getDoctorID()%>"  /> 
            <br>
            DepartmentID: <input type="text" name="did" value="<%=d.getDepartmentID()%>" /> 
            <br>
            Name: <input type="text" name="name" value="<%=d.getDoctorName()%>"/>
            <br>
            Gender:
                <input type="radio" name="gender" value= "male"<%if (d.isDoctorGender()) {%>
                       checked
                       <%}%>> Male
                <input type="radio" name="gender" value= "female"<%if (d.isDoctorGender() == false) {%>
                       checked
                       <%}%>> Female
            <br>
            Age: <input type="number" name="age" value="<%=d.getDoctorAge()%>"/>
            <br>
            Account: <input type="text" name="account" value="<%=d.getAccount().getUsername()%>" readonly/> 
            <br>
            Password: <input type="text" name="password" value="<%=d.getAccount().getPassword()%>" /> 
            <br>
            <input type="submit" value="Update" />
            
        </form>
    </body>
</html>
