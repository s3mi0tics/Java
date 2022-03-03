<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. -->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) -->
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<!-- for local css file -->
<link rel="stylesheet" type="text/css" href="/css/style.css" />
<link rel="stylesheet" type="text/css" href="/css/style.css" />

<meta charset="UTF-8">
<title>About You</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/main.css">
<!-- change to match your file/naming structure -->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="topnav d-flex justify-content-between align-items-center ps-3">
		<div class="logo d-flex align-items-center">
			<h3 class="me-5">Joey</h3>
			<h5>Home |</h5>
			<h5>Bundle |</h5>
			<h5>Custom</h5>
		</div>
		<div class="d-flex align-items-center pe-3">
			<h5 class="me-5">avatar</h5>
			<h5>menu</h5>
		</div>
	</div>
	<div>
	<div class="sidenav"></div>
		<div class="main container p-5 m-3">

		</div>
		<div class="row ">
			<div class="col-lg-7 mx-auto">
				<div>
					<div>
						<div class="container">
							<form id="omikuji-form" role="form" action="/omikuji/create"
								method="POST">
								<div class="row">
									<div class="col-md-6">
										<div class="form-group"></div>
									</div>

									<div class="form-group">
										<label for="form_garage">Do you own a garage?</label> <input
											id="form_garage" type="text" name="garage"
											class="form-control" required="required"
											data-error="City is required.">
									</div>
										<div class="form-group">
											<label for="form_name">Do you hike or run?</label> <input
												id="form_name" type="text" name="name" class="form-control"
												required="required" data-error="Name is required.">
										</div>
										<div class="form-group">
											<label for="form_name">Do you fly often?</label> <input
												id="form_occupation" type="text" name="occupation"
												class="form-control" required="required"
												data-error="Occupation or hobby is required.">
										</div>
								</div>
									<div class="form-group">
										<label for="form_thing">Do you plan on co-sleeping?</label> 
											<input id="form_thing" type="text" name="thing"
											class="form-control" required="required"
											data-error="A living thing is required.">
									</div>
									<div class="form-group mb-3">
										<label for="form_message">Write something that you
											want your baby to know about you</label>
										<textarea id="form_message" name="message"
											class="form-control" placeholder="Write your message here."
											rows="4" required="required"
											data-error="You wouldnt want the hear what we have to say without this."></textarea>
									</div>
									<div class="col-md-12">
										<input type="submit"
											class="btn btn-success btn-send pt-2 btn-block "
											value="Send Message">
									</div>
							</form>
						</div>
					</div>
				</div>
			</div>
			<!-- /.8 -->
		</div>
	</div>
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