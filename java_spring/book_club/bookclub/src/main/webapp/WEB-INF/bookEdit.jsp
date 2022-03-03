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
        <div class="d-flex justify-content-between p-3">
          <h1>Change your Entry</h1>
          <a href="/books">Back to the shelves</a>
        </div>
        <div>
          <div class="card w-50 p-5 mx-auto m-5">
            
            <form:form id="book-form" action="/books/edit/${book.id}" method= "post" modelAttribute="book">
              <input type="hidden" name="_method" value="put">
            
              <div class="form-group">
                <form:label path="title" for="title">Title:</form:label>
                <form:errors path="title"/>
                <form:input path="title" type="text" class="form-control" id="title" name="title"/>
              </div>

              <div class="form-group">
                <form:label path="author" for="author">Author:</form:label>
                <form:errors path="author"/>
                <form:input path="author" type="text" class="form-control" id="author" name= "author"/>
              </div>

              <div class="form-group">
                <form:label  path="description" for="description">My thoughts:</form:label>
                <form:errors path="description"/>
                <form:textarea path="description" type="text" class="form-control" id="description" name= "description" row="4"/>
              </div>

              <form:input path="borrower" type="hidden" name="borrower" value="${book.borrower}" />

              <button type="submit" class="mt-3 btn btn-primary">Update Book</button>
              
            </form:form>
      </div>
    </div>
</body>
</html>






