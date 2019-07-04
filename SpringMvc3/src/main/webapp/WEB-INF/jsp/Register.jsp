<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <form:form action="submitForm"  modelAttribute="save" method="post">  
        First name: <form:input path="first_name" />         
        <br><br>  
        Last name: <form:input path="last_name" />  
        <br><br> 
         Email: <form:input type="email" path="email" />         
        <br><br> 
         Contact <form:input path="contact" />         
        <br><br> 
         Company <form:input path="company" />         
        <br><br> 
         UserName <form:input path="userName" />         
        <br><br> 
         PassWord <form:input type="password" path="passWord" />         
        <br><br> 
        Confirm Pass <form:input type="password" path="cPass" />         
        <br><br> 
      
        <input type="submit" value="Submit" />      
    </form:form> 
</body>
</html>