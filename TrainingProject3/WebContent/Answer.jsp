
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

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
</head>
<body>
	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
		<ul class="navbar-nav">
			<li class="nav-item active"><a class="nav-link" href="Fetch.jsp">HOME</a>
			</li>
			<li class="nav-item"><a class="nav-link" href="Question.jsp">Ask
					Question</a></li>
		</ul>
	</nav>
	<div class="card-body">
		<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"
			url="jdbc:mysql://localhost/Table1" user="root" password="root" />


		<sql:query dataSource="${db}" var="rs">  
		SELECT * from Answer A,Login l where A.L_ID in(
select distinct(l.L_ID) from Login) AND A.Q_ID=<%=request.getParameter("itemId")%>;
		</sql:query>
		<form action="Answer" method="post">
			<div class="card mt-3 mb-3" style="width: 45rem; margin-left: 20%">
				<div class="card-body">
					<h4 class="card-title">
						<%
							String id = request.getParameter("itemId");
							Class.forName("com.mysql.jdbc.Driver");
							Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/Table1", "root",
									"root");

							String sql = "select * from Question1 where Q_ID='" + id + "'";
							PreparedStatement ps = con.prepareStatement(sql);
							ResultSet rs = ps.executeQuery();
							while (rs.next()) {
						%>
						<a href=""> <%
 	out.print(rs.getString(3));
 %>
						</a>
						<%
							}
						%>
						<input type="text" value=<%=request.getParameter("itemId")%>
							name="id" hidden>
					</h4>

				</div>
				<div class="card-body mt-1">
					<a href="Answer2.jsp" class="btn btn-primary disabled">Write
						Your Answer</a>
				</div>
				<textarea rows="10" cols="30" class="ml-3 mr-3"
					style="resize: none;" name="answer"></textarea>
				<div class="card-body mb-1 d-flex justify-content-end">
					<button class="btn btn-primary">Submit</button>
				</div>
		</form>
		<table width="100%">
			<tr>
				<th>L_ID</th>
				<th>Answer</th>
				<th>TIME</th>
				<th>Reply</th>
				<th>View Reply</th>
			</tr>
			<c:forEach var="table" items="${rs.rows}">
				<tr>

					<td><c:out value="${table.U_NAME}" /></td>
					<td><a href="/"><c:out value="${table.ANS}" /></a></td>

					<td><a href="/"><c:out value="${table.TIME}" /></a></td>
				</tr>
			</c:forEach>

		</table>

	</div>
	</div>

</body>
</html>
