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
<link rel="stylesheet" href="/css/main.css" />
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<title>Ninja Gold</title>
</head>
<body>
	<div class="container">
		<div class="text-center mt-5 ">
			<h1>Ninja Gold!</h1>
		</div>
		<div>
			Your gold:
			<c:out value="${totalGold}"/>
		</div>
		<div class="row justify-content-between">
			<div class="col-md-3 mx-auto">
				<div class="card mt-2 mx-auto p-4 bg-light">
					<div class="card-body bg-light">
						<div class="container">
							<h2>Farm</h2>
							<h5>Earns 10-20 gold!</h5>
							<form id="cave" action="/ninjagold/processgold" method="post">
								<div class="col-md-12">
									<input type="hidden" name="start" value=10> 
									<input type="hidden" name="end" value=20> 
									<input type="hidden" name="isGambling" value=0> 
										<input type="submit" class="btn btn-success btn-send pt-2 btn-block "
										value="Find gold!">
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-3 mx-auto">
				<div class="card mt-2 mx-auto p-4 bg-light">
					<div class="card-body bg-light">
						<div class="container">
							<h2>Cave</h2>
							<h5>Earns 5-10 gold!</h5>
							<form id="cave" action="/ninjagold/processgold" method="post">
								<div class="col-md-12">
									<input type="hidden" name="start" value=5> 
									<input type="hidden" name="end" value=10> 
									<input type="hidden" name="isGambling" value=0> 
									<input type="submit" class="btn btn-success btn-send pt-2 btn-block "
										value="Find gold!">
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-3 mx-auto">
				<div class="card mt-2 mx-auto p-4 bg-light">
					<div class="card-body bg-light">
						<div class="container">
							<h2>House</h2>
							<h5>Earns 2-5 gold!</h5>
							<form id="cave" action="/ninjagold/processgold" method="post">
								<div class="col-md-12">
									<input type="hidden" name="start" value=2> 
									<input type="hidden" name="end" value=5>
									<input type="hidden" name="isGambling" value=0> 
									<input type="submit" class="btn btn-success btn-send pt-2 btn-block "
										value="Find gold!">
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-3 mx-auto">
				<div class="card mt-2 mx-auto p-4 bg-light">
					<div class="card-body bg-light">
						<div class="container">
							<h2>Casino</h2>
							<h5>Earns or takes 0-50 gold!</h5>
							<form id="cave" action="/ninjagold/processgold" method="post">
								<div class="col-md-12">
									<input type="hidden" name="start" value=-50> 
									<input type="hidden" name="end" value=50> 
									<input type="hidden" name="isGambling" value=1> 
									<input type="submit" class="btn btn-success btn-send pt-2 btn-block "
										value="Find gold!">
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>