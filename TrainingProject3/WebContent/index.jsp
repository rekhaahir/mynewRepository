<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.0/jquery.validate.js"></script>
<link rel="stylesheet" type="text/css" href="Login.css">
<script type="text/javascript" src="LoginValidation.js"></script>
<meta charset="UTF-8">
<title>Insert title here</title>	
</head>
<body>
<!-- 	<form id="form1" action="LoginDetails" method="post"> -->
<!-- 		Username:<input type="text" name="Uname"><br><br> -->
<!-- 		Password:<input type="password" name="pwd"><br><br>  -->
<!-- 		<a href="Registration.jsp">Registration</a> -->
<!-- 		<input type="submit" value="Submit"> -->
<!-- 	</form> -->
	<div class="login-form"> 
		<form id="form1" action="LoginDetails" method="post">
			<h2 class="text-center">Log in</h2> 
			<div class="form-group">
            	<input name="Uname" type="text" class="form-control" placeholder="Username" required="required">
        	</div>
			<div class="form-group">
            	<input name="pwd" type="password" class="form-control" placeholder="Password" required="required">
        	</div>
			<input type="submit" value="Submit" class="btn btn-primary btn-block">
			<br>
			<p class="text-center">Not a member? <a href="Registration.jsp">Register now</a></p>
		</form>
	</div>
</body>


</html>