
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.mt {
	margin-top: 5%;
	
}
</style>
</head>
<body>
	<CENTER>
<%-- 		<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" --%>
<%-- 			url="jdbc:mysql://localhost/Table1" user="root" password="root" /> --%>


<%-- 		<sql:query dataSource="${db}" var="rs">     --%>
<!-- SELECT * FROM Question1,Login where Question1.L_ID=Login.L_ID; -->
<%-- </sql:query> --%>



<!-- 		<table class="mt"> -->
<!-- 			<tr> -->
<!-- 				<th>NAME</th> -->
<!-- 				<th>Question</th> -->
<!-- 				<th>answer</th> -->
<!-- 				<th>time</th> -->
<!-- 			</tr> -->
<%-- 			<c:forEach var="table" items="${rs.rows}"> --%>
<!-- 				<tr> -->

<%-- 					<td><c:out value="${table.U_NAME}" /></td> --%>
					
<%-- 					<td><a href="/"><c:out value="${table.QUE}" /></a></td> --%>

<%-- 					<td><a href="/"><c:out value="${table.TIME}" /></a></td> --%>
<%-- 					<td><a href="Answer.jsp?itemId=${table.Q_ID}">Answer</a></td> --%>

<!-- 				</tr> -->
<%-- 			</c:forEach> --%>
<!-- 		</table> -->
	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	  <ul class="navbar-nav">
	    <li class="nav-item active">
	      <a class="nav-link" href="#">HOME</a>
	    </li>
	    <li class="nav-item">
	      <a class="nav-link" href="Question.jsp">Ask Question</a>
	    </li>
	    <li class="nav-item d-flex justify-content-end">
	     <a class="nav-link" href="index.jsp">Logout</a>
	    
	    </li>
	  </ul>
	</nav>
		<c:forEach var="table" items="${listuser}">
		<div class="card mt-3 mb-3" style="width: 45rem;margin-left:20px">
			
	    	<div class="card-body">
				<h4 class="card-title"><a href="/"><c:out value="${table.question}" /></h4>
<%-- 				<h6 class="card-subtitle mb-2 text-muted"><c:out value="${table.u_NAME}" />--%> & <c:out value="${table.time}" /></h6> 
				<a href="Answer.jsp?itemId=${table.qid}" class="btn btn-primary ml-5">Your Answer</a>
				
	    	</div>
		</div>
		</c:forEach>
	</CENTER>
</body>
</html>