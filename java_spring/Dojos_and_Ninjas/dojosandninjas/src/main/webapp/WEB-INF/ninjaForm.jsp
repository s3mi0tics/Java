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
<title>Edit Dojo</title>
</head>
<body>
	<div class="container mx-auto p-5">
    <div class="d-flex justify-content-end">
    </div>
    <div class="card w-50 p-5 mx-auto m-5">
    <form:form id="dojo-form" action="/ninjas/create" method= "POST" modelAttribute="ninja">
  <div class="form-group">
    <h1 class = "mx-auto">Create Ninja:</h1>
      <div class="form-group">
          <form:label path="dojo" >Dojo:</form:label>
          <form:select path="dojo" class="form-control" id="formDojo">
              <option value="">
                Select a Dojo
              </option>
            <c:forEach var="d" items="${allDojos}">
                <form:option value="${d.id}">
                    <c:out value="${d.name}" />
                </form:option>
            </c:forEach> 
          </form:select>
          <form:errors path="dojo" class="text-danger"/>
        </div> 
      <div class="form-group">
          <form:label path="firstName" >First Name:</form:label>
          <form:input path="firstName" type="text" class="form-control" id="formFirstName"/>
          <form:errors path="firstName" class="text-danger"/>
        </div> 
      <div class="form-group">
          <form:label path="lastName" >Last Name:</form:label>
          <form:input path="lastName" type="text" class="form-control" id="formLastName"/>
          <form:errors path="lastName" class="text-danger"/>
        </div> 
      <div class="form-group">
          <form:label path="age" >Age:</form:label>
          <form:input path="age" type="number" class="form-control" id="formAge"/>
          <form:errors path="age" class="text-danger"/>
        </div> 
      <input type="submit" class="mt-3 btn btn-success" value="Create Ninja"/>
    </form:form>
    </div>
  </div>
</body>
</html>