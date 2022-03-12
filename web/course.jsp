

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Courses Page</title>
        <link rel="stylesheet" href="css/course.css" type="text/css" />
        <link href="css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <header class="header">
            <div class="logo">
                <a href="#"><img src="img/logo1.png" alt="THIENHONG"></a>
            </div>

            <nav class="navbar">
                <a href="index.jsp">Home</a>
                <a href="#services">Services</a>
                <a href="#about">About</a>
                <a href="#doctors">Doctors</a>
                <a href="#book">Book</a>
                <a href="#review">Review</a>
            </nav>
            
            <div class="right">
                <c:if test="${sessionScope.acc == null}">

                    <div class="navbar" style="border: 1px solid #ca4012;padding: 1rem 1rem;">
                        <a href="login.jsp" class="login" style="margin: 0 1rem;"> <i class="fas fa-user"></i>Sign in</a>
                    </div>

                </c:if>
                
                <%--<c:if test="${sessionScope.account != null}">--%>
                    <ul class="header-links pull-right" style="list-style-type: none; display: flex;">
                        <c:if test="${sessionScope.acc.role == 2}">
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
                <%--</c:if>--%>
            </div>
            
            
            <div id="menu-btn" class="fas fa-bars"></div>

        </header>
        
        <header class="row tm-welcome-section" style="margin-top: 130px">
            <h2 class="col-12 text-center tm-section-title">Welcome to Courses</h2>
            <p class="col-12 text-center">Here are useful courses tailored to each 
                purpose you're looking for. Find out and sign up for courses of your choice.</p>
        </header>
        
        <div class="container">
            <div class="row content-info">
              <div class="col-lg-3">
                  <img src="img/psy1.jpg" alt="Image" class="tm-intro-img" />
              </div>
              <div class="col-lg-9">
                <div class="tm-intro-text-container">
                    <h2 class="">Introduction</h2>
                    <p class="">
                      The Town is simple CSS template built on Bootstrap v4.1.3 
                      and this is a little parallax layout that you can use for your websites.
                    </p>
                    <p class="">
                      Please tell your friends about our site 
                      <a rel="nofollow" href="https://templatemo.com">templatemo</a>. Thank you.
                      Curabitur dapibus tristique enim a imperdiet. Etiam
                  tristique sem sed condimentum posuere. </p>
                    <div class="tm-next">
                      <a href="#work" class="tm-intro-text tm-btn-primary">Read More</a>
                    </div>
                </div>
              </div>
            </div>
            
            <div class="row content-info">
              <div class="col-lg-3">
                  <img src="img/psy1.jpg" alt="Image" class="tm-intro-img" />
              </div>
              <div class="col-lg-9">
                <div class="tm-intro-text-container">
                    <h2 class="">Introduction</h2>
                    <p class="">
                      The Town is simple CSS template built on Bootstrap v4.1.3 
                      and this is a little parallax layout that you can use for your websites.
                    </p>
                    <p class="">
                      Please tell your friends about our site 
                      <a rel="nofollow" href="https://templatemo.com">templatemo</a>. Thank you.
                      Curabitur dapibus tristique enim a imperdiet. Etiam
                  tristique sem sed condimentum posuere. </p>
                    <div class="tm-next">
                      <a href="#work" class="tm-intro-text tm-btn-primary">Read More</a>
                    </div>
                </div>
              </div>
            </div>
            
            <div class="row content-info">
              <div class="col-lg-3">
                  <img src="img/psy1.jpg" alt="Image" class="tm-intro-img" />
              </div>
              <div class="col-lg-9">
                <div class="tm-intro-text-container">
                    <h2 class="">Introduction</h2>
                    <p class="">
                      The Town is simple CSS template built on Bootstrap v4.1.3 
                      and this is a little parallax layout that you can use for your websites.
                    </p>
                    <p class="">
                      Please tell your friends about our site 
                      <a rel="nofollow" href="https://templatemo.com">templatemo</a>. Thank you.
                      Curabitur dapibus tristique enim a imperdiet. Etiam
                  tristique sem sed condimentum posuere. </p>
                    <div class="tm-next">
                      <a href="#work" class="tm-intro-text tm-btn-primary">Read More</a>
                    </div>
                </div>
              </div>
            </div>
        </div>
            
            <!-- footer starts  -->
        <section class="footer">
            <div class="box-container">

                <div class="box">
                    <h3>About us</h3>
                    <a href="#"> <i class="fas fa-chevron-right"></i> healthy lift </a>
                    <a href="#services"> <i class="fas fa-chevron-right"></i> services </a>
                    <a href="#doctors"> <i class="fas fa-chevron-right"></i> doctor </a>
                    <a href="#review"> <i class="fas fa-chevron-right"></i> feedback </a>
                </div>

                <div class="box">
                    <h3>Info</h3>
                    <a href="#"> <i class="fas fa-phone"></i> +111-222-3333 </a>
                    <a href="#"> <i class="fas fa-envelope"></i> thienhong.dt@gmail.com </a>
                    <a href="#"> <i class="fas fa-map-marker-alt"></i> dai tu, thai nguyen - 21000 </a>
                    <a href="#"> <i class="fas fa-clock"></i> 8h-20h (Monday-Sunday) </a>
                
                </div>

                <div class="box">
                    <h3>Follow us</h3>
                    <a href="#"> <i class="fab fa-facebook-f"></i> facebook </a>
                    <a href="#"> <i class="fab fa-twitter"></i> twitter </a>
                    <a href="#"> <i class="fab fa-instagram"></i> instagram </a>
                    <a href="#"> <i class="fas fa-envelope"></i> gmail </a>
                </div>
        </section>
        <!-- footer ends -->
    </body>
</html>
