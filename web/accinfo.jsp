<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

        <title>Profile</title>
        <!-- Bootstrap -->
        <link type="text/css" rel="stylesheet" href="css/bootstrap.min.css"/>


        <!-- Custom stlylesheet -->
        <link rel="stylesheet" type="text/css" href="css/style.css?ts=<?=time()?>" />
        <script>
            function check() {
                var confirm = prompt("Enter your old password");
                var oldpass = document.getElementById("oldpass").value;
                if (oldpass == confirm) {
                    alert("Correct password, changes will be saved");
                    return true;
                } else {
                    alert("Wrong password! Change will not be saved");
                    return false;
                }
            }
        </script>
    </head>
    <body>

        <header class="header">
            <div class="logo">
                <a href="#"><img src="img/logo1.png" alt="THIENHONG"></a>
            </div>
            <nav class="navbar">
                <a href="index.jsp">home</a>
                <a href="course.jsp">courses</a>
                <a href="#about">about</a>
                <a href="#doctors">doctors</a>
                <a href="#book">book</a>
                <a href="#review">review</a>
            </nav>

            <c:if test="${sessionScope.acc.role == 2}">
            <ul class="header-links pull-right" style="list-style-type: none; display: flex;">
                
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
                
            </ul>
            </c:if>
            <div id="menu-btn" class="fas fa-bars"></div>

        </header>
        
        <!-- header -->

        <!-- SECTION -->
        <div class="section" style="margin-top: 150px ">
            <div class="container">
                <!-- row -->
                <div class="row">

                    <div class="col-md-12">
                        <!-- Billing Details -->
                        <div class="billing-details">
                            <form action="profile"  method="post">
                                <div class="section-title">
                                    <h3 class="title text-center">PROFILE</h3>
                                </div>
                                <div class="form-group">
                                    <label>Username</label>
                                    <input type="text" class="form-control" name="id" value="${sessionScope.acc.username}" readonly>
                                </div>
                                <div class="form-group">
                                    <label>Full Name</label>
                                    <input type="text" class="form-control" name="name" value="${requestScope.patient.patientName}">
                                </div>
                                
                                <div class="form-group">
                                    <label>Email</label>
                                    <input type="email" class="form-control" name="email" value="${requestScope.patient.patientEmail}">
                                </div>
                                <div class="form-group">
                                    <label>Phone Number</label>
                                    <input type="text" class="form-control" name="phone" value="${requestScope.patient.patientPhone}">
                                </div>
                                <input type="submit" class="btn" value="Save"/>
<!--                                <div class="form-group">
                                    
                                </div>-->
                            </form>

                        </div>
                    </div>
                </div>
                <!-- /row -->
            </div>
            <!-- /container -->
        </div>
        <!-- /SECTION -->


        <!-- jQuery Plugins -->
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/slick.min.js"></script>
        <script src="js/nouislider.min.js"></script>
        <script src="js/jquery.zoom.min.js"></script>
        <script src="js/main.js"></script>
    </body>
</html>

