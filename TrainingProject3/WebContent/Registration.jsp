<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.0/jquery.validate.js"></script>
<link rel="stylesheet" type="text/css" href="Login.css">
<script type="text/javascript">
	$(document).ready(function(){
	 $('#registration').validate({
		 
		 rules:{
			 FirstName:{
				 
					required:true
			 }
	 			
		 }
	 });
	
	});
</script> 

</head>
<body>
<div class="login-form"> 
		<form action="Registration" method="post" enctype="multipart/form-data" id="registration">
			<h2 class="text-center">Registration</h2> 
			<div class="form-group">
            	<input name="UserName" type="text" class="form-control" placeholder="Username" required="required">
        	</div>
        	<div class="form-group">
            	<input name="FirstName" type="text" class="form-control" placeholder="Firstname" required="required">
        	</div>
        	<div class="form-group">
            	<input name="LastName" type="text" class="form-control" placeholder="Lastname" required="required">
        	</div>
			<div class="form-group">
            	<input name="Password" type="password" class="form-control" placeholder="Password" required="required">
        	</div>
        	<div class="form-group">
            	<input name="ConfirmPassword" type="password" class="form-control" placeholder="Confirm password" required="required">
        	</div>
        	<div class="form-group">
            	<input name="EmailId" type="email" class="form-control" placeholder="Email" required="required">
        	</div>
        	<div class="form-group">
            	<input type="file" name="photo" required="required"/>
        	</div>
        	<div class="form-group">
            	<textarea rows="3" cols="20" name="Company" required="required"></textarea>
        	</div>
			<input type="submit" value="Submit" class="btn btn-primary btn-block">
			<br>
			<p class="text-center">Already have an account? <a href="index.jsp">Login</a></p>
		</form>
</div>


</body>
</html>