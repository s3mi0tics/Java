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
	<!-- for local css file -->
	<link rel="stylesheet" type="text/css" href="/css/style.css"/>
	<link rel="stylesheet" type="text/css" href="/css/style.css"/>
	
    <meta charset="UTF-8">
    <title>Joey</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> 
    <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    
</head>
<body>

<!--topnav  -->
<div class="topnav d-flex justify-content-between p-5">
	<div class="logo d-flex align-items-center">
		<h3 class="me-5">Joey</h3> 
		<a href="/home"><h5 class="ms-2">Home |  </h5></a>
		<h5 class="ms-2"> Bundle |  </h5>
		<h5 class="ms-2"> Custom | </h5>
		<h5 class="ms-2"> Marketplace</h5>
	</div>
	<div class= "d-flex">
		<h5 class="me-5">avatar</h5>
		<h5>menu</h5>
	</div>	
</div>
<div>

<!-- Side navigation -->
<div class="sidenav pt-5 px-2">
  <input type="text" placeholder="search" class="search mb-4">
  <h5 class="mb-4">Slider</h5>
  <h5 class="mb-4">Category</h5>
  <h5 class="mb-4">Age Group</h5>
  <h5 class="mb-4">Brand</h5>

</div>
</div>

<!--Main  -->
<div class="main d-flex p-5">
	<div class="sideBar d-flex flex-wrap">
		<div class="product d-flex flex-column p-2">
			<img alt="" src="https://cdn.shopify.com/s/files/1/1149/0150/products/2_69818349-69ce-44b0-898e-4e524dfe0088_400x.png?v=1643835477">
			<hr>
			<span class="product-name mx-auto" itemprop="name" style="font-size: 14px;">2022 Silver Cross Wave Double Stroller - Eclipse Collection</span>
			<span class="product-price mx-auto" itemprop="price" style="font-size: 14px;">$1749.98</span>
		</div>
		<div class="product d-flex flex-column p-2">
			<img alt="" src="https://cdn.shopify.com/s/files/1/1149/0150/products/2_69818349-69ce-44b0-898e-4e524dfe0088_400x.png?v=1643835477">
			<hr>
			<span class="product-name mx-auto" itemprop="name" style="font-size: 14px;">2022 Silver Cross Wave Double Stroller - Eclipse Collection</span>
			<span class="product-price mx-auto" itemprop="price" style="font-size: 14px;">$1749.98</span>
		</div>
		<div class="product d-flex flex-column p-2">
			<img alt="" src="https://cdn.shopify.com/s/files/1/1149/0150/products/2_69818349-69ce-44b0-898e-4e524dfe0088_400x.png?v=1643835477">
			<hr>
			<span class="product-name mx-auto" itemprop="name" style="font-size: 14px;">2022 Silver Cross Wave Double Stroller - Eclipse Collection</span>
			<span class="product-price mx-auto" itemprop="price" style="font-size: 14px;">$1749.98</span>
		</div>
		<div class="product d-flex flex-column p-2">
			<img alt="" src="https://cdn.shopify.com/s/files/1/1149/0150/products/2_69818349-69ce-44b0-898e-4e524dfe0088_400x.png?v=1643835477">
			<hr>
			<span class="product-name mx-auto" itemprop="name" style="font-size: 14px;">2022 Silver Cross Wave Double Stroller - Eclipse Collection</span>
			<span class="product-price mx-auto" itemprop="price" style="font-size: 14px;">$1749.98</span>
		</div>
		<div class="product d-flex flex-column p-2">
			<img alt="" src="https://cdn.shopify.com/s/files/1/1149/0150/products/2_69818349-69ce-44b0-898e-4e524dfe0088_400x.png?v=1643835477">
			<hr>
			<span class="product-name mx-auto" itemprop="name" style="font-size: 14px;">2022 Silver Cross Wave Double Stroller - Eclipse Collection</span>
			<span class="product-price mx-auto" itemprop="price" style="font-size: 14px;">$1749.98</span>
		</div>
		<div class="product d-flex flex-column p-2">
			<img alt="" src="https://cdn.shopify.com/s/files/1/1149/0150/products/2_69818349-69ce-44b0-898e-4e524dfe0088_400x.png?v=1643835477">
			<hr>
			<span class="product-name mx-auto" itemprop="name" style="font-size: 14px;">2022 Silver Cross Wave Double Stroller - Eclipse Collection</span>
			<span class="product-price mx-auto" itemprop="price" style="font-size: 14px;">$1749.98</span>
		</div>
		<div class="product d-flex flex-column p-2">
			<img alt="" src="https://cdn.shopify.com/s/files/1/1149/0150/products/2_69818349-69ce-44b0-898e-4e524dfe0088_400x.png?v=1643835477">
			<hr>
			<span class="product-name mx-auto" itemprop="name" style="font-size: 14px;">2022 Silver Cross Wave Double Stroller - Eclipse Collection</span>
			<span class="product-price mx-auto" itemprop="price" style="font-size: 14px;">$1749.98</span>
		</div>
		<div class="product d-flex flex-column p-2">
			<img alt="" src="https://cdn.shopify.com/s/files/1/1149/0150/products/2_69818349-69ce-44b0-898e-4e524dfe0088_400x.png?v=1643835477">
			<hr>
			<span class="product-name mx-auto" itemprop="name" style="font-size: 14px;">2022 Silver Cross Wave Double Stroller - Eclipse Collection</span>
			<span class="product-price mx-auto" itemprop="price" style="font-size: 14px;">$1749.98</span>
		</div>
		<div class="product d-flex flex-column p-2">
			<img alt="" src="https://cdn.shopify.com/s/files/1/1149/0150/products/2_69818349-69ce-44b0-898e-4e524dfe0088_400x.png?v=1643835477">
			<hr>
			<span class="product-name mx-auto" itemprop="name" style="font-size: 14px;">2022 Silver Cross Wave Double Stroller - Eclipse Collection</span>
			<span class="product-price mx-auto" itemprop="price" style="font-size: 14px;">$1749.98</span>
		</div>
		<div class="product d-flex flex-column p-2">
			<img alt="" src="https://cdn.shopify.com/s/files/1/1149/0150/products/2_69818349-69ce-44b0-898e-4e524dfe0088_400x.png?v=1643835477">
			<hr>
			<span class="product-name mx-auto" itemprop="name" style="font-size: 14px;">2022 Silver Cross Wave Double Stroller - Eclipse Collection</span>
			<span class="product-price mx-auto" itemprop="price" style="font-size: 14px;">$1749.98</span>
		</div>
		<div class="product d-flex flex-column p-2">
			<img alt="" src="https://cdn.shopify.com/s/files/1/1149/0150/products/2_69818349-69ce-44b0-898e-4e524dfe0088_400x.png?v=1643835477">
			<hr>
			<span class="product-name mx-auto" itemprop="name" style="font-size: 14px;">2022 Silver Cross Wave Double Stroller - Eclipse Collection</span>
			<span class="product-price mx-auto" itemprop="price" style="font-size: 14px;">$1749.98</span>
		</div>
		<div class="product d-flex flex-column p-2">
			<img alt="" src="https://cdn.shopify.com/s/files/1/1149/0150/products/2_69818349-69ce-44b0-898e-4e524dfe0088_400x.png?v=1643835477">
			<hr>
			<span class="product-name mx-auto" itemprop="name" style="font-size: 14px;">2022 Silver Cross Wave Double Stroller - Eclipse Collection</span>
			<span class="product-price mx-auto" itemprop="price" style="font-size: 14px;">$1749.98</span>
		</div>
		<div class="product d-flex flex-column p-2">
			<img alt="" src="https://cdn.shopify.com/s/files/1/1149/0150/products/2_69818349-69ce-44b0-898e-4e524dfe0088_400x.png?v=1643835477">
			<hr>
			<span class="product-name mx-auto" itemprop="name" style="font-size: 14px;">2022 Silver Cross Wave Double Stroller - Eclipse Collection</span>
			<span class="product-price mx-auto" itemprop="price" style="font-size: 14px;">$1749.98</span>
		</div>
		<div class="product d-flex flex-column p-2">
			<img alt="" src="https://cdn.shopify.com/s/files/1/1149/0150/products/2_69818349-69ce-44b0-898e-4e524dfe0088_400x.png?v=1643835477">
			<hr>
			<span class="product-name mx-auto" itemprop="name" style="font-size: 14px;">2022 Silver Cross Wave Double Stroller - Eclipse Collection</span>
			<span class="product-price mx-auto" itemprop="price" style="font-size: 14px;">$1749.98</span>
		</div>
		<div class="product d-flex flex-column p-2">
			<img alt="" src="https://cdn.shopify.com/s/files/1/1149/0150/products/2_69818349-69ce-44b0-898e-4e524dfe0088_400x.png?v=1643835477">
			<hr>
			<span class="product-name mx-auto" itemprop="name" style="font-size: 14px;">2022 Silver Cross Wave Double Stroller - Eclipse Collection</span>
			<span class="product-price mx-auto" itemprop="price" style="font-size: 14px;">$1749.98</span>
		</div>
		<div class="product d-flex flex-column p-2">
			<img alt="" src="https://cdn.shopify.com/s/files/1/1149/0150/products/2_69818349-69ce-44b0-898e-4e524dfe0088_400x.png?v=1643835477">
			<hr>
			<span class="product-name mx-auto" itemprop="name" style="font-size: 14px;">2022 Silver Cross Wave Double Stroller - Eclipse Collection</span>
			<span class="product-price mx-auto" itemprop="price" style="font-size: 14px;">$1749.98</span>
		</div>
		<div class="product d-flex flex-column p-2">
			<img alt="" src="https://cdn.shopify.com/s/files/1/1149/0150/products/2_69818349-69ce-44b0-898e-4e524dfe0088_400x.png?v=1643835477">
			<hr>
			<span class="product-name mx-auto" itemprop="name" style="font-size: 14px;">2022 Silver Cross Wave Double Stroller - Eclipse Collection</span>
			<span class="product-price mx-auto" itemprop="price" style="font-size: 14px;">$1749.98</span>
		</div>
		<div class="product d-flex flex-column p-2">
			<img alt="" src="https://cdn.shopify.com/s/files/1/1149/0150/products/2_69818349-69ce-44b0-898e-4e524dfe0088_400x.png?v=1643835477">
			<hr>
			<span class="product-name mx-auto" itemprop="name" style="font-size: 14px;">2022 Silver Cross Wave Double Stroller - Eclipse Collection</span>
			<span class="product-price mx-auto" itemprop="price" style="font-size: 14px;">$1749.98</span>
		</div>
		<div class="product d-flex flex-column p-2">
			<img alt="" src="https://cdn.shopify.com/s/files/1/1149/0150/products/2_69818349-69ce-44b0-898e-4e524dfe0088_400x.png?v=1643835477">
			<hr>
			<span class="product-name mx-auto" itemprop="name" style="font-size: 14px;">2022 Silver Cross Wave Double Stroller - Eclipse Collection</span>
			<span class="product-price mx-auto" itemprop="price" style="font-size: 14px;">$1749.98</span>
		</div>
		<div class="product d-flex flex-column p-2">
			<img alt="" src="https://cdn.shopify.com/s/files/1/1149/0150/products/2_69818349-69ce-44b0-898e-4e524dfe0088_400x.png?v=1643835477">
			<hr>
			<span class="product-name mx-auto" itemprop="name" style="font-size: 14px;">2022 Silver Cross Wave Double Stroller - Eclipse Collection</span>
			<span class="product-price mx-auto" itemprop="price" style="font-size: 14px;">$1749.98</span>
		</div>
		<div class="product d-flex flex-column p-2">
			<img alt="" src="https://cdn.shopify.com/s/files/1/1149/0150/products/2_69818349-69ce-44b0-898e-4e524dfe0088_400x.png?v=1643835477">
			<hr>
			<span class="product-name mx-auto" itemprop="name" style="font-size: 14px;">2022 Silver Cross Wave Double Stroller - Eclipse Collection</span>
			<span class="product-price mx-auto" itemprop="price" style="font-size: 14px;">$1749.98</span>
		</div>
		<div class="product d-flex flex-column p-2">
			<img alt="" src="https://cdn.shopify.com/s/files/1/1149/0150/products/2_69818349-69ce-44b0-898e-4e524dfe0088_400x.png?v=1643835477">
			<hr>
			<span class="product-name mx-auto" itemprop="name" style="font-size: 14px;">2022 Silver Cross Wave Double Stroller - Eclipse Collection</span>
			<span class="product-price mx-auto" itemprop="price" style="font-size: 14px;">$1749.98</span>
		</div>
		<div class="product d-flex flex-column p-2">
			<img alt="" src="https://cdn.shopify.com/s/files/1/1149/0150/products/2_69818349-69ce-44b0-898e-4e524dfe0088_400x.png?v=1643835477">
			<hr>
			<span class="product-name mx-auto" itemprop="name" style="font-size: 14px;">2022 Silver Cross Wave Double Stroller - Eclipse Collection</span>
			<span class="product-price mx-auto" itemprop="price" style="font-size: 14px;">$1749.98</span>
		</div>
		<div class="product d-flex flex-column p-2">
			<img alt="" src="https://cdn.shopify.com/s/files/1/1149/0150/products/2_69818349-69ce-44b0-898e-4e524dfe0088_400x.png?v=1643835477">
			<hr>
			<span class="product-name mx-auto" itemprop="name" style="font-size: 14px;">2022 Silver Cross Wave Double Stroller - Eclipse Collection</span>
			<span class="product-price mx-auto" itemprop="price" style="font-size: 14px;">$1749.98</span>
		</div>
		<div class="product d-flex flex-column p-2">
			<img alt="" src="https://cdn.shopify.com/s/files/1/1149/0150/products/2_69818349-69ce-44b0-898e-4e524dfe0088_400x.png?v=1643835477">
			<hr>
			<span class="product-name mx-auto" itemprop="name" style="font-size: 14px;">2022 Silver Cross Wave Double Stroller - Eclipse Collection</span>
			<span class="product-price mx-auto" itemprop="price" style="font-size: 14px;">$1749.98</span>
		</div>
	</div> 
</div>

<!--Footer  -->

 <div class="footer pt-3 d-flex justify-content-evenly">
 	<div class="d-flex">
 	<div>
 		<h4 class="me-3">Joey</h4>
 	</div>
 	<div class="d-flex flex-column ms-3">
 		<h6 class="mb-3">About Us</h6>
 		<p>Our Mission</p>
 		<p>Become a flyer</p>
 	</div>
 	</div>
 	<div class="d-flex flex-column">
 		<h6 class="mb-3">Connect with us:</h6>
 		<p>facebook icon</p>
 		<p>twitter icon</p>
 	</div>
 	
 </div>
</body>
</html>