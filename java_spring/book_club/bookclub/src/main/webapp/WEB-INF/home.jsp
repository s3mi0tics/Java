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
    <div class="container p-5 card shadow m-5">
        <div class="d-flex justify-content-between p-3">
            <h2>Welcome, <c:out value="${thisUser.userName}"></c:out></h2>
            <a href="/logout" class="button btn btn-secondary shadow w-25">Logout</a>
        </div>
        <div class="d-flex justify-content-between p-3">
            <h3>Here is a list of all the books:</h3>
            <a href="/books/new" class="button btn btn-primary shadow w-25">+ Add a book</a>
        </div>
        <div>
            <div class="w-100 shadow">
                <table class="table table-striped">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Title</th>
                            <th>Author</th>
                            <th>Posted by</th>
                            <th>Actions</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="b" items="${books}">
                        <c:if test="${b.borrower.id != thisUser.id}">
                            <tr>
                                <td><c:out value="${b.id}" /></td>
                                <td><a href="/books/${b.id}"><c:out value="${b.title}" /></a></td>
                                <td><c:out value="${b.author}" /></td>
                                <td><c:out value="${b.user.userName}"/></td>

                                <c:choose>
                                <c:when test="${b.user.id eq thisUser.id}">
                                <td>
                                    <a href="/books/edit/${b.id}">Edit |</a>
                                    
                                    <form action="/books/delete/${b.id}" method="post" class="form-inline">
                                        <input type="hidden" name="_method" value="delete"> 
                                        <input class="shadow" type="submit" value="Delete">
                                    </form>
                                </td>
                                </c:when>
                                <c:otherwise>
                                    <td>
                                        <form action="/books/borrow/${b.id}" method="POST">
                                            <input type="hidden" name="_method" value="put">
                                            <input type="hidden" name="id" value="${book.id}" />
                                            <input type="submit" value="Borrow" class="shadow">
                                        </form>
                                    </td>
                                </c:otherwise>
                            </c:choose>
                            </tr>
                        </c:if>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
        <div class="d-flex justify-content-between p-3">
            <h3>Here is a list of your borrowed books:</h3>
        </div>
        <div>
            <div class="w-100 shadow">
                <table class="table table-striped">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Title</th>
                            <th>Author</th>
                            <th>Posted by</th>
                            <th>Actions</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="b" items="${books}">
                        <c:if test="${b.borrower.id == thisUser.id}">
                            <tr>
                                <td><c:out value="${b.id}" /></td>
                                <td><a href="/books/${b.id}"><c:out value="${b.title}" /></a></td>
                                <td><c:out value="${b.author}" /></td>
                                <td><c:out value="${b.user.userName}"/></td>
                                <td>
                                    <form action="/books/return/${b.id}" method="POST">
                                        <input type="hidden" name="_method" value="put">
                                        <input type="submit" value="return" class="shadow">
                                    </form>
                                </td>
                            </tr>
                        </c:if>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</body>
</html>