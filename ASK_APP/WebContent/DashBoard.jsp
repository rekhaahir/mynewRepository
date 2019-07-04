<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource
        var="myDS"
        driver="com.mysql.jdbc.Driver"
        url="jdbc:mysql://localhost:3306/Demo"
        user= "root" password= "p@123"
    />
      <sql:query var="listUsers"   dataSource="${myDS}" sql=" SELECT * FROM LOGIN;">
     
    </sql:query>
    
    <div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>List of users</h2></caption>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Email</th>
              
            </tr>
            <c:forEach var="user" items="${listUsers.rows}">
                
 <tr>

                    <td><c:out value="${user.L_ID}" /></td>
                    <td><c:out value="${user.U_NAME}" /></td>
                    <td><c:out value="${user.PASS}" /></td>
                            </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>