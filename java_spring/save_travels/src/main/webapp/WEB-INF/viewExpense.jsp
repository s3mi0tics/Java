<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> <%@ taglib prefix="c"
uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
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
      <div class="d-flex justify-content-between">
        <h1>Expense Details</h1>
        <div>
          <a href="/expenses"
            ><button class="btn btn-primary">Go Back</button></a
          >
          <td>
            <a href="/expenses/${expense.id}/edit"
              ><button class="btn btn-success">Edit</button></a
            >
          </td>
        </div>
      </div>
      <div class="card w-50 p-5 mx-auto m-5">
        <h3>Expense Name: <c:out value="${expense.name}" /></h3>
        <hr />
        <h3>Expense Description: <c:out value="${expense.description}" /></h3>
        <hr />
        <h3>Expense Vendor: <c:out value="${expense.vendor}" /></h3>
        <hr />
        <h3>Expense Amount spent: <c:out value="${expense.amount}" /></h3>
      </div>
    </div>
  </body>
</html>
