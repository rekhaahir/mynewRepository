<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- <link rel="stylesheet" type="text/css"  href="jsp/sty.css" media="all" /> -->
<style type="text/css">
statusmsg{
    font-size: 12px; /* Set message font size  */
    padding: 3px; /* Some padding to make some more space for our text  */
    background: #EDEDED; /* Add a background color to our status message   */
    border: 1px solid #DFDFDF; /* Add a border arround our status message   */
}
#new
{
background:#65C370;
color:#FFF;
text-transform:uppercase;
}

body{ 
 

font-family:montserrt,arial,verdana;
}
html{

height:100%;
background:liner-gradient(rgba(196,102,0,0.6),rgba(155,89,182,0.6));
}

#msform
{
background-color:gainsboro;
width:500px;
margin:50px auto;
text-align:center;
text-color:red;
position:relative;
box-shadow:0 0 15px 1px rgba(0,0,0,4);
padding:20px 30px;
box-sizing:bordr-box;

}
#msform1
{

background-color:gainsboro;
width:400px;
margin:50px auto;
text-align:center;
text-color:red;
position:relative;
box-shadow:0 0 15px 1px rgba(0,0,0,4);
padding:20px 30px;
box-sizing:bordr-box;

}

#msform fieldset
{

background:lightgrey;
border:0 none;
border-radius:3px;
box-shadow: 0 0 15px 1px rgba(0,0,0,0.4);
padding:20px 30 px;
box-sizing:border-box;
width:80%;
margin:0 10%;position:relative;
}


  </style> 
      

</head>
<body>
 <form:form  id="msform" action="submitForm"  modelAttribute="save" method="post">
	  <table align="center" id="msform1" border="1px solid black" >
<fieldset><h2>REGISTRATION</h2></fieldset>
	 <tr><th>
<fieldset>
	 First Name*
	  </th></tr>
	<tr><th><fieldset>
	 <form:input path="first_name" />  
	  </th></tr>
<tr><th><fieldset>
	  Last Name*
	  </th></tr><tr><th><fieldset>
	  <form:input path="last_name" />
	  </th></tr>
	  
	<tr><th><fieldset>
	 Email:*
	  </th></tr><tr><th><fieldset>
	 <form:input type="email" path="email" /> 
	</th></tr>
	  
	  &nbsp
	  &nbsp
<tr><th><fieldset>
	  	 Contact*
	  </th></tr><tr><th><fieldset>
 <form:input path="contact" /> 
	</th></tr>
<tr><th><fieldset>
	 Company*
	  </th></tr><tr><th><fieldset>
	  <form:input path="company" /> 
	
	</th></tr>
<tr><th><fieldset>
	  UserName*
	  </th></tr><tr><th>
	   <form:input path="userName" />  
	</th></tr>
          &nbsp
	  &nbsp
<tr><th><fieldset>
	  Password*
	  </th></tr><tr><th><fieldset>
	   PassWord <form:input type="password" path="passWord" /> 
	</th></tr>

<tr><th><fieldset>
	 Confirm password*
	  </th></tr><tr><th>
	  Confirm Pass <form:input type="password" path="cPass" />
	</th></tr>


	  <tr>
	  <th ><fieldset>
	     <input type="submit" value="Submit" /> </th></tr>
  
</table>
	 

<%--    <form:form action="submitForm"  modelAttribute="save" method="post">   --%>
<%--         First name: <form:input path="first_name" />          --%>
<!--         <br><br>   -->
<%--         Last name: <form:input path="last_name" />   --%>
<!--         <br><br>  -->
<%--          Email: <form:input type="email" path="email" />          --%>
<!--         <br><br>  -->
<%--          Contact <form:input path="contact" />          --%>
<!--         <br><br>  -->
<%--          Company <form:input path="company" />          --%>
<!--         <br><br>  -->
<%--          UserName <form:input path="userName" />          --%>
<!--         <br><br>  -->
<%--          PassWord <form:input type="password" path="passWord" />          --%>
<!--         <br><br>  -->
<%--         Confirm Pass <form:input type="password" path="cPass" />          --%>
<!--         <br><br>  -->
      
<!--         <input type="submit" value="Submit" />       -->
    </form:form> 
</body>
</html>