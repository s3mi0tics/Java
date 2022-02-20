<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css" />
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script> 
<title>Book Form</title>
</head>
<body>
<div class="card w-50 p-5 mx-auto m-5">
<form:form id="book-form" action="/api/books" method= "post" modelAttribute="book">
  <div class="form-group">
  <h1 class = "mx-auto">Create a new book</h1>
    <form:label path="title" for="title">Title:</form:label>
    <form:errors path="title"/>
    <form:input path="title" type="text" class="form-control" id="title" name="title"/>
    
  </div>
  <div class="form-group">
    <form:label path="description" for="description">Description:</form:label>
    <form:errors path="description"/>
    <form:input path="description" class="form-control" id="description" name= "description"/>
  </div>
  <div  path="language"class="form-group">
    <form:label  path="language" for="language">Language:</form:label>
    <form:errors path="pages"/>
    <form:input path="language" class="form-control" id="language" name= "language"/>
  </div>
  <div class="form-group">
    <form:label  path="pages" for="pages">Pages</form:label>
    <form:errors path="pages"/>
    <form:input path="pages" type="number" class="form-control" id="pages" name="pages"/>
  </div>
  <button type="submit" class="mt-3 btn btn-primary">Create Book</button>
</form:form>
</div>
</body>
</html>