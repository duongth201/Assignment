<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<%@page import="java.util.ArrayList"%>
<%@page import="model.Doctor"%>
<%--<%@page import="DAL.AccountDAO"%>--%>
<%@page import="model.Account"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Detail Doctor Page</title>
        <link rel="stylesheet" href="css/detail.css" type="text/css" />
        <link href="css/bootstrap.min.css" rel="stylesheet">

        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
        
    </head>
    <body>
        <header class="header">
            <div class="logo">
                <a href="#"><img src="img/logo1.png" alt="THIENHONG"></a>
            </div>

            <nav class="navbar">
                <a href="#">Home</a>
                <a href="#">Services</a>
                <a href="#">About</a>
                <a href="#">Doctors</a>
                <a href="#">Review</a>
            </nav>

            <ul class="header-links pull-right" style="list-style-type: none; display: flex;">
                <c:if test="${sessionScope.acc.role == 0}">
                    <li>
                        <a href="#" style="border: 1px solid #ca4012;padding: 1rem 1rem;">
                            <i class="fas fa-user"></i>${sessionScope.acc.username}
                        </a>
                    </li>
                    <li>
                        <a href="logout" class="login" style="margin: 0 1rem; color: #ca4012; border: 1px solid #ca4012;padding: 1rem 1rem;"> 
                            Log out
                        </a>
                    </li>
                </c:if>

            </ul>
<!--            <div class="navbar" style="border: 1px solid #ca4012;padding: 1rem 1rem;">
                <a href="#"></a>
                <a href="index.jsp" class="login" style="margin: 0 1rem;"> <i class="fas fa-user"></i>Sign out</a>
            </div>-->
            
            <div id="menu-btn" class="fas fa-bars"></div>

        </header>
        
        <div class="container-lg ">
            <div class="container" style="margin-top: 140px">
                <div class="table-wrapper">
                    <div class="table-title">
                        <div class="row">
                            <div class="col-sm-8"><h2>Employee <b>Details</b> <a href="doctorlist">Doctor</a></h2></div> 
                            <div class="col-sm-4" style=" text-align: center">
                                <!--<form action="create">-->
                                    <button type="submit" class="btn btn-info add-new" style="background: #ca4012; border-color: #ca4012;">
                                        <i class="fa fa-plus"></i> <a href="addcourse">Add New</a>
                                    </button>
                                <!--</form>-->
                            </div>
                        </div>
                    </div>
                    <table class="table table-bordered">
                        <thead>
                            <tr>
                                <th>CourseID</th>
                                <th>DoctorID</th>
                                <th style="width: 167px;" >Name</th>
                                <th>Time</th>
                                <th>Price</th>
                                <th style="width: 190px;">Img</th>
                                <th>Infomation</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="s" items="${requestScope.course}">
                                <tr>
                                    <td>
                                        ${s.courseID}
                                    </td> 
                                    <td>
                                        ${s.d.getDoctorName()}
                                    </td>
                                    <td>
                                        ${s.courseName}
                                    </td>
                                    <td>
                                        ${s.courseTime}
                                    </td>             
                                    <td>
                                        ${s.coursePrice}
                                    </td>
                                    <td>
                                        <input type="text" value="${s.courseImg}" /> 
                                    </td>
                                    <td>  
                                        ${s.courseInfo}
                                    </td>

                                    <td> 
                                    <a href="adminupdate?id=${s.courseID}"> Update</a>
                                    <a href="#" onclick = "Delete('${s.courseID}')">Delete</a>
                                    </td>

                                </tr>
                            </c:forEach>
  
                        </tbody>
                    </table>
                </div>
            </div>
        </div>     
    </body>
    
    <script>
       function Delete(courseID){
//           console.log(doctorID);
           var option = confirm('Are you sure you want to delete?');
           if(option === true) {
               window.location.href = 'deletecourse?courseID=' + courseID;
           }
           
       }
       
   </script>
</html>
