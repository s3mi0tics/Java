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
    <form:form id="dojo-form" action="/dojos/create" method= "POST" modelAttribute="dojo">
  <div class="form-group">
    <h1 class = "mx-auto">Create Dojo: <c:out value="${dojo.name}"/></h1>
      <div class="form-group">
          <form:label path="name" >Dojo:</form:label>
          <form:input path="name" type="text" class="form-control" id="formName"/>
          <form:errors path="name" class="text-danger"/>
        </div> 
      <input type="submit" class="mt-3 btn btn-success" value="Create Dojo"/>
    </form:form>
    </div>
    <h3>View dojos and their ninjas here:</h3>
    <c:forEach var="d" items="${allDojos}">
      <p>
        <a href="/dojos/${d.id}"><c:out value="${d.name}"/></a>
      </p>

    </c:forEach>
  </div>
</body>
</html>