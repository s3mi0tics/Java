<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<h1 >You have visited your server <c:out value= "${currentCount}" /> times</h1>
<div>
<a class = "btn btn-success mx-auto m-5 link-dark" href="/your_server">Test another visit</a>
<a class = "btn btn-success mx-auto m-5 link-dark" href="/your_server/delete">Delete</a>
<a class = "btn btn-success mx-auto m-5 link-dark" href="/your_server/add2">visit your server 2 more times but be redirected back to this page!!!!!!</a>
</div>
</body>
</html> 