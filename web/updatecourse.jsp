

<%@page import="model.Course"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%
        Course cour = (Course) request.getAttribute("cour") ;
        %>
    </head>
    <body>
        <form action="adminupdate" method="post">
            Course ID: <input type="text" name="id" value="<%=cour.getCourseID()%>"  /> 
            <br>
            Doctor ID: <input type="text" name="did" value="<%=cour.getD().getDoctorID()%>" /> 
            <br>
            Doctor Name: <input type="text" name="dname" value="<%=cour.getD().getDoctorName()%>" /> 
            <br>
            Name: <input type="text" name="name" value="<%=cour.getCourseName()%>"/>
            <br>
            Time:
                <input type="text" name="time" value="<%=cour.getCourseTime()%>"/>
            <br>
            Price: <input type="number" name="price" value="<%=cour.getCoursePrice()%>"/>
            <br>
            Img: <input type="text" name="img" value="<%=cour.getCourseImg()%>" readonly/> 
            <br>
            Info: <input type="text" name="info" value="<%=cour.getCourseInfo()%>" /> 
            <br>
            <input type="submit" value="Update" />
            
        </form>
    </body>
</html>
