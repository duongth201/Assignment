<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="tag" uri="WEB-INF/tlds/tag.tld" %>
<%@page import="util.HtmlHelper"%>
<%@page import="model.Course"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">

        <title>Profile</title>
        <link type="text/css" rel="stylesheet" href="css/style.css"/>
        <link type="text/css" rel="stylesheet" href="css/accinfo.css"/>
        <!-- Bootstrap -->
        <link type="text/css" rel="stylesheet" href="css/bootstrap.min.css"/>

        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">


    </head>
    <body>

        <header class="header">
            <div class="logo">
                <a href="#"><img src="img/logo1.png" alt="THIENHONG"></a>
            </div>
            <nav class="navbar">
                <a href="index.jsp">home</a>
                <a href="course">courses</a>
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
                    <ul class="info">
                        <li>INFORMATION:</li>
                        <li><a href="profile">Profile</a></li>
                        <li> / </li>
                        <li><a href="pcourse.jsp">Course</a></li>
                    </ul>
                    <div class="col-md-12">
                        <!-- Billing Details -->
                        <div class="billing-details">
                            <form action="profile"  method="post">
                                <div class="section-title">
                                    <h3 class="title text-center">COURSE</h3>
                                </div>
                                <div class="form-group">
                                    <label>Username</label>
                                    <input type="text" class="form-control" name="id" value="${sessionScope.acc.username}" readonly>
                                </div>

                                <c:forEach var="c" items="${requestScope.numbercourse}">
                                    <div class="container">
                                        <div class="row content-info">
                                            <div class="col-lg-3">
                                                <img src="${c.courseImg}" alt="Image" class="tm-intro-img" />  <!--img -->
                                            </div>
                                            <div class="col-lg-9">
                                                <div class="tm-intro-text-container">
                                                    <h2 class="">${c.courseName}</h2>
                                                    <h4>
                                                        Price: ${c.coursePrice}$ - Time: ${c.courseTime} - Doctor: ${c.getD().getDoctorName()}
                                                    </h4>
                                                    <p class="">
                                                        ${c.courseInfo}
                                                    </p>
                                                    <div class="tm-next enroll">
                                                        <a href="#" class="">ENROLL</a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>   
                                </c:forEach>
                            </form>

                        </div>
                    </div>
                </div>
                <!-- /row -->
            </div>
            <!-- /container -->
        </div>
        <!-- /SECTION -->


    </body>
</html>

