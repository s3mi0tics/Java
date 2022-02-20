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
<title>Omikuji Form</title>
</head>
<body>
	<div class="container">
		<div class=" text-center mt-5 ">
			<h1>Send an Omikuji!</h1>
		</div>
		<div class="row ">
			<div class="col-lg-7 mx-auto">
				<div class="card mt-2 mx-auto p-4 bg-light">
					<div class="card-body bg-light">
						<div class="container">
							<form id="omikuji-form" role="form" action="/omikuji/create" method="POST">
								<div class="controls">
									<div class="row">
										<div class="col-md-6">
											<div class="form-group">
												<label for="form_number">Pick any number between 5 and 25</label> 
												<select id="form_number" name="number"
													class="form-control" required="required"
													data-error="Number is required.">
													<option>1</option>
													<option>2</option>
													<option>3</option>
													<option>4</option>
													<option>5</option>
													<option>6</option>
													<option>7</option>
													<option>8</option>
													<option>9</option>
													<option>10</option>
													<option>11</option>
													<option>12</option>
													<option>13</option>
													<option>14</option>
													<option>15</option>
													<option>16</option>
													<option>17</option>
													<option>18</option>
													<option>19</option>
													<option>20</option>
													<option>21</option>
													<option>22</option>
													<option>23</option>
													<option>24</option>
													<option>25</option>
												</select>
											</div>
										</div>
										<div class="col-md-6">
											<div class="form-group">
												<label for="form_city">Enter the name of any city:</label> <input
													id="form_city" type="text" name="city" class="form-control"
													placeholder="Example: San Francisco" required="required"
													data-error="City is required.">
											</div>
										</div>
									</div>
									<div class="row">
										<div class="col-md-6">
											<div class="form-group">
												<label for="form_name">Enter the name of any real
													person</label> <input id="form_name" type="text" name="name"
													class="form-control" placeholder="Example:Bob Dylan"
													required="required" data-error="Name is required.">
											</div>
										</div>
										<div class="col-md-6">
											<div class="form-group">
												<label for="form_name">Enter an occupation or hobby:</label>
												<input id="form_occupation" type="text" name="occupation"
													class="form-control"
													placeholder="Example: selling oragamis" required="required"
													data-error="Occupation or hobby is required.">
											</div>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-md-6">
										<div class="form-group">
											<label for="form_thing">Enter any type of living
												thing:</label> <input id="form_thing" type="text" name="thing"
												class="form-control" placeholder="Example: ferret"
												required="required" data-error="A living thing is required.">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<label for="form_message">Say something nice to
												someone:</label>
											<textarea id="form_message" name="message"
												class="form-control" placeholder="Write your message here."
												rows="4" required="required"
												data-error="You wouldnt want the hear what we have to say without this."></textarea>
										</div>
									</div>
									<div class="col-md-12">
										<input type="submit"
											class="btn btn-success btn-send pt-2 btn-block "
											value="Send Message">
									</div>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
			<!-- /.8 -->
		</div>
		<!-- /.row-->
	</div>

</body>
</html>