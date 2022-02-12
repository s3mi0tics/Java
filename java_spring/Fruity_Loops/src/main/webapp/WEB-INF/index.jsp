<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<title>Fruity Loops</title>
</head>

<body>
	<div>
	<div class="container justify-content-center m-3 mx-auto col-3">
	<h1 class= "text-info">Fruit Store</h1>
		<div class= "border border-5 border-info">
		<table class= "table table-striped">
			<thead>
				<tr>
					<th>Type</th>
					<th>Price</th>
				</tr>
			<tbody>
				<c:forEach var="fruit" items="${fruitsArray}">
					<tr>
						<td><c:out value = "${fruit.name}"/></td>
						<td><c:out value = "${fruit.price}"/></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
</div>

	</div>
</div>
</body>
</html>