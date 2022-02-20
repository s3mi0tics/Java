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
<title>Expenses</title>
</head>
<body>

    <div class="container mx-auto">
        <h1 class="mx-auto">All Expenses</h1>
        <div>
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>Expense</th>
                        <th>Vendor</th>
                        <th>Amount</th>
                        <th>Actions</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="e" items="${expenses}">
                        <tr>
                            <td><a href="/expenses/${e.id}"><c:out value="${e.name}" /></a></td>
                            <td><c:out value="${e.vendor}" /></td>
                            <td>$ <c:out value="${String.format('%.2f', e.amount)}" /></td>
                            <td><a href="espenses"></a></td>
                            <td class="d-flex align-items-center justify-content-evenly">
                                <a href="/expenses/${e.id}/edit" class="btn btn-sm btn-success">Edit</a>
                                <form action="/expenses/${e.id}" method="post">
                                  <input type="hidden" name="_method" value="delete">
                                  <input type="submit" value="Delete" class="btn btn-sm btn-danger fw-bold">
                                </form>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
        </div>
        <div class="card w-50 p-5 mx-auto m-5">
        <form:form id="expense-form" action="/expenses/create" method= "POST" modelAttribute="expense">
      <div class="form-group">
        <h1 class = "mx-auto">Add an Expense <c:out value="${expense.name}"/></h1>
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