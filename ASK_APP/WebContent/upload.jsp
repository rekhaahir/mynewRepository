<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
// String id = request.getParameter("userid");
String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "Demo";
String userid = "root";
String password = "p@123";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<%
try{
	String s=request.getParameter("fname");
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
out.print("hi");
String sql ="insert into Login5 values(?)";
PreparedStatement ps = (PreparedStatement) connection.prepareStatement(sql);
ps.setString(1,s);
int a=ps.executeUpdate();

} catch (Exception e) {
e.printStackTrace();
}
%>
</body>
</html>