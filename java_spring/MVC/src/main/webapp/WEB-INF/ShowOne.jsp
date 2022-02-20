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
<link rel="stylesheet" href="/css/main.css" />
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script> 
<title>Book</title>
</head>
<body>
<div class="card mx-auto p-5 w-50">
  <div class="card-header">
    <h1>Title: <c:out value= "${book.title}"/></h1>
  </div>
  <div class="card-body">
    <h5 class="card-title">Language:<c:out value= "${book.language}"/></h5>
    <p class="card-text">Description:<c:out value= "${book.description}"/></p>
	<p class="card-text">Number of pages:<c:out value= "${book.numberOfPages}"/></p>
    <a href="/books" class="btn btn-primary">See all books</a>
  </div>
</div>
</body>
</html>