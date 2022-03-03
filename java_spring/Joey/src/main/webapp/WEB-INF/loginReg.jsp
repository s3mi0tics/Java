<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Joey!</title>
    	<link rel="stylesheet" type="text/css" href="/css/style.css"/>
	<link rel="stylesheet" type="text/css" href="/css/style.css"/>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<div class=" topnav d-flex justify-content-between p-5">
	<div class="logo d-flex align-items-center">
		<h3 class="me-5">Welcome to Joey!</h3> 
		<h5>Home |  </h5>
		<h5> Bundle |  </h5>
		<h5> Marketplace</h5>
	</div>
	<div class= "d-flex">
		<h5 class="me-5">avatar</h5>
		<h5>menu</h5>
	</div>	
</div>
	<div class="d-flex">
	<div class="sidenav"></div>
    <div class="container main">
        <div class="d-flex justify-content-right gap-3">
            <!-- Register Form -->
            <div class="p-3 w-75">
                <h2>Register</h2>
                <form:form action="/register" method= "POST" modelAttribute="newUser">
                    <div class="form-group">
                        <div class= "form-group">
                            <form:input path="userName" class="mb-3" type="text" placeholder="Name"/>
                            <form:errors path="userName" class="text-danger" />
                        </div>
                        <div class="form-group">
                            <form:input path="email" class="mb-3" type="text" placeholder="Email" />
                            <form:errors path="email" class="text-danger" />
                        </div>
                        <div class="form-group mb-3">
                           <form:password class="mb-3" path="password" placeholder="Password" />
                            <form:errors path="password" class="text-danger" />
                        </div>
                        <div class="form-group mb-3">
                            <form:password path="confirm" class="mb3" placeholder="Confirm Password" />
                            <form:errors path="confirm" class="text-danger" />
                        </div>
                        <input type="submit" value="Register" class="btn btn-success" />
                    </div>
                </form:form>

                <!-- Login Form -->
                </div>
                <div class="p-3 w-75">
                    <h2>Login</h2>
                    <form:form action="/login" method="post" modelAttribute="newLogin">
                    <div class="form-group mb-3">
                        <form:input path="email" class="mb-3" type="text" placeholder="Email"  />
                        <form:errors path="email" class="text-danger" />
                    </div>
                    <div class="form-group mb-3">
                        <form:password path="password" class="mb-3" placeholder="password" />
                        <form:errors path="password" class="text-danger" />
                    </div>
                    <input type="submit" value="Login" class="btn btn-success mb-3" />
                </form:form>
            </div>
    </div>
    </div>
    <!--Footer  -->

 <div class="footer pt-3 d-flex justify-content-evenly">
 	<div class="d-flex">
 	<div>
 		<h4 class="me-3">Joey</h4>
 	</div>
 	<div class="d-flex flex-column ms-3">
 		<h6 class="mb-3">About Us</h6>
 		<p>Our Mission</p>
 		<p>Become a flyer</p>
 	</div>
 	</div>
 	<div class="d-flex flex-column">
 		<h6 class="mb-3">Connect with us:</h6>
 		<p>facebook icon</p>
 		<p>twitter icon</p>
 	</div>
 	
 </div>
    </div>
</body>
</html>