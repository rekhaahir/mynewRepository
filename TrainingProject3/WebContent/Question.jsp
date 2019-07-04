<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<title>Insert title here</title>
<style type="text/css">
.ta {
	background-color: #EBEBE4;
	border: 1px solid #ABADB3;
	padding: 2px 1px;
	border: none;
	resize: none;
}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	  <ul class="navbar-nav">
	    <li class="nav-item active">
	      <a class="nav-link" href="Fetch.jsp">HOME</a>
	    </li>
	    <li class="nav-item">
	      <a class="nav-link" href="Question.jsp">Ask Question</a>
	    </li>
	    <li class="nav-item d-flex justify-content-end">
	     <a class="nav-link" href="index.jsp">Logout</a>
	    
	    </li>
	  </ul>
	</nav>
	<form action="AskQuestion" method="post">
	<div class="card mt-3 mb-3" style="width: 45rem; margin-left: 20%">
	<div class="card-body mt-1">
				 <div class="card-body">
				<h4 class="card-title"><a href="">Write your Question?</a></h4>
			
		    </div>
			</div>
			<textarea rows="10" cols="30" class="ml-3 mr-3" style="resize: none;" name="Question"></textarea>
			<div class="card-body mb-1 d-flex justify-content-end">
				<button class="btn btn-primary">Submit</button>
			</div>
	
	</div>

</form>
</body>
</html>