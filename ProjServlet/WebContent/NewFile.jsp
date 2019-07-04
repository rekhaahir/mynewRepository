<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="login-form"> 
		<form id="form1" action="serv" method="post">
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