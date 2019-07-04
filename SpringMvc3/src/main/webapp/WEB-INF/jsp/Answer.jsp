<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


<script>
function myFunction() {
  document.getElementById("demo").innerHTML = "Hello World";
}
</script>
</head>
<body>
<h1>question is:${testPath}</h1>
 <form:form action="ansins"  modelAttribute="aadd" method="GET">  
      Answer <form:input path="Ans" />         
        <br><br>  
        <input type="submit" value="Submit" />      
    </form:form> 
    
    
    <form:form action="ans"  modelAttribute="add" method="GET">
    
  
<table border="1">
	<tr>Answers:</tr>
	

 
<c:forEach var="ansshow1" items="${anssshow }">
		
			<tr>
				<td>${ansshow1.ans}</td>
				<td><button onclick="myFunction()">Click me</button></td>
				<td><input type="button" name="like" value="count" "/>
			</tr>
		</c:forEach>
		</table>
   </form:form> 

</body>
</html>