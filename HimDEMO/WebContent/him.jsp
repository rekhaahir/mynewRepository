<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="https://cdn.jsdelivr.net/npm/jquery-validation@1.19.0/dist/jquery.validate.min.js"></script>
<script type="text/javascript">
/*  $(document).ready(function(){
	$("#registration").validate(
			{
				rules:{
					name:{
						reuired:true
					}
				}
			})
});  */
function validateForm() {
	  var x = document.forms["myForm"]["name"].value;
	  if (x == "") {
	    alert("Name must be filled out");
	    return false;
	  }
	}
</script>
</head>
<body>

<form action="Ready.jsp" method="get" id="registration" name="myForm">
<table>
<tr>
	<td>Name:</td>
	<td><input type="text" name="name" onsubmit="return validateForm()">
	</td>
</tr>
<tr>
	<td><input type="submit"></td>
	</tr>
</table>
</form>

</body>
</html>