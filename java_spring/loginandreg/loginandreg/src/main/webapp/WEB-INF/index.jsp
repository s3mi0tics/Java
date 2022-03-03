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
    <title>Login and Registration</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
    <div class="container p-5">
        <h1>Welcome</h1>
        <h3>Join our growing community</h3>
        <div class="d-flex justify-content-around gap-3">

            <!-- Register Form -->
            <div class="card p-3 w-75">
                <h2>Register</h2>
                <form:form action="/register" method= "POST" modelAttribute="newUser">
                    <div class="form-group">
                        <div class="form-group">
                            <form:label path="userName">User Name:</form:label>
                            <form:input path="userName" class="form-control" />
                            <form:errors path="userName" class="text-danger" />
                        </div>
                        <div class="form-group">
                            <form:label path="email">Email:</form:label>
                            <form:input path="email" class="form-control" />
                            <form:errors path="email" class="text-danger" />
                        </div>
                        <div class="form-group mb-3">
                            <form:label path="password">Password:</form:label>
                            <form:password path="password" class="form-control" />
                            <form:errors path="password" class="text-danger" />
                        </div>
                        <div class="form-group mb-3">
                            <form:label path="confirm">Confirm Password:</form:label>
                            <form:password path="confirm" class="form-control" />
                            <form:errors path="confirm" class="text-danger" />
                        </div>
                        <input type="submit" value="Register" class="btn btn-success" />
                    </div>
                </form:form>

                <!-- Login Form -->
                </div>
                <div class="card p-3 w-75">
                    <h2>Login</h2>
                    <form:form action="/login" method="post" modelAttribute="newLogin">
                    <div class="form-group mb-3">
                        <form:label path="email">Email:</form:label>
                        <form:input path="email" class="form-control" />
                        <form:errors path="email" class="text-danger" />
                    </div>
                    <div class="form-group mb-3">
                        <form:label path="password">Password:</form:label>
                        <form:password path="password" class="form-control" />
                        <form:errors path="password" class="text-danger" />
                    </div>
                    <input type="submit" value="Login" class="btn btn-success mb-3" />
                </form:form>
            </div>
    
</body>
</html>