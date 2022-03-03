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
  <title>Book Club</title>
  <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
  <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
  <script src="/webjars/jquery/jquery.min.js"></script>
  <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
  <div class="container p-5 m-5">
      <div class="d-flex justify-content-between">
        <h1><c:out value="${book.title}"/></h1>
        <a href="/books">Back to the shelves</a>
    </div>
    <h2><c:out value="${book.user.userName}"/> 
      read <c:out value="${book.title}"/> 
      by <c:out value="${book.author}"/>.</h2>
    <h5>Here are <c:out value="${book.user.userName}"/>'s thoughts:</h5>
    <hr class="w-75">
    <c:out value="${book.description}"/>
    <hr class="w-75">
    <c:if test="${book.user.id == thisUser.id}">
      <a href="/books/edit/${book.id}" class="btn btn-primary">Edit</a>
    </c:if>
  </div>
</body>
</html>