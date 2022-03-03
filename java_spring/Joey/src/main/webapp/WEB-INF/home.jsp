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
	<!-- for local css file -->
	<link rel="stylesheet" type="text/css" href="/css/style.css"/>
	<link rel="stylesheet" type="text/css" href="/css/style.css"/>
	
    <meta charset="UTF-8">
    <title>Joey</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> 
    <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    
</head>
<body>
<div class=" topnav d-flex justify-content-between p-5">
	<div class="logo d-flex align-items-center">
		<h3 class="me-5">Joey</h3> 
		<h5>Home |  </h5>
		<h5> Bundle |  </h5>
		<h5> Marketplace</h5>
	</div>
	<div class= "d-flex">
		<h5 class="me-5">avatar</h5>
		<h5>menu</h5>
	</div>	
</div>
    <div class="body container p-5 align-items-center justify-content-center">
        <h1 class="mb-5 mx-auto">Welcome to Joey</h1>
        <hr>
        <h3 class="mb-5 mx-auto">An experience created just for you and your most special little one</h3>
        <hr>
        <h3 class="mb-5 mx-auto">We take care of you so you can take care of the most important thing in your life</h3>
        <hr>
        <h3 class="mx-auto">Tell us about you</h3> 
        <a class="btn btn-warning" href= "/aboutyou">About you</a>       
    </div> 
    <hr>
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
</body>
</html>