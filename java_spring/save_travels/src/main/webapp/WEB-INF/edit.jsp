<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>   

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
<title>Edit Expense</title>
</head>
<body>
	<div class="container mx-auto p-5">
    <div class="d-flex justify-content-end">
        <a href="/expenses"><button class="btn btn-primary">Go Back</button></a>
    </div>
    <div class="card w-50 p-5 mx-auto m-5">
    <form:form id="expense-form" action="/expenses/${expense.id}/edit" method= "POST" modelAttribute="expense">
    <input type="hidden" name="_method" value="put">
  <div class="form-group">
    <h1 class = "mx-auto">Edit Expense: <c:out value="${expense.name}"/></h1>
      <div class="form-group">
          <form:label path="name" >Expense:</form:label>
          <form:input path="name" type="text" class="form-control" id="formName"/>
          <form:errors path="name" class="text-danger"/>
        </div> 
      <form:label path="vendor" for="vendor">Vendor:</form:label>
      <form:input path="vendor" class="form-control" id="vendor"/>
      <form:errors path="vendor" class="text-danger"/>
    </div>
    <div class="form-group">
      <form:label  path="amount">Amount</form:label>
      <form:input path="amount" type="double" class="form-control" id="amount"/>
      <form:errors path="amount" class="text-danger"/>
    </div>
    <div class="form-group">
      <form:label path="description">Description</form:label>
      <form:textarea path="description" type="text" class="form-control" id="description" rows="3"/>
      <form:errors path="description" class="text-danger"/>
    </div>
      <input type="submit" class="mt-3 btn btn-success" value="Edit expense"/>
    </form:form>
    </div>
  </div>
</body>
</html>