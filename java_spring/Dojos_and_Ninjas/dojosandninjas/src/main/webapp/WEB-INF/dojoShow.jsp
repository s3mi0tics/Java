<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> <%@ taglib prefix="c"
uri="http://java.sun.com/jsp/jstl/core" %> <%@ taglib prefix="form"
uri="http://www.springframework.org/tags/form" %> <%@ page isErrorPage="true" %>

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
    <title>Edit Dojo</title>
  </head>
  <body>
    <div class="container w-75 card mt-5 p-3">
      <h1><c:out value="${dojo.name}" /> location ninjas:</h1>
      <div>
        <table class="table table-striped">
          <thead>
            <tr>
              <th>First name</th>
              <th>Last name</th>
              <th>Age</th>
            </tr>
          </thead>
          <tbody>
            <c:forEach var="n" items="${dojo.ninjas}">
              <tr>
                <td><c:out value="${n.firstName}" /></td>
                <td><c:out value="${n.lastName}" /></td>
                <td><c:out value="${n.age}" /></td>
              </tr>
            </c:forEach>
          </tbody>
        </table>
      </div>
    </div>
  </body>
</html>
