<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script >
function myFunction() {
	  alert("Thank you for visiting W3Schools!");
	}
 </script>
</head>
<body >
<h1>question is:${testPath}</h1>
 <form:form action="ansins"  modelAttribute="aadd" method="GET">  
      Answer <form:input path="Ans" />         
        <br><br>  
        <input type="submit" value="Submit" />      
    </form:form> 

    
    <form>
    
  First Name:<input type="text" name="fname" id="fname"><br><br>
<table id="table" border="1">
 <tr>
                <th>Answer</th>
             <th>likes</th>
            </tr>
           
 
<c:forEach var="ansshow1" items="${anssshow }">
		
			<tr>
				<td>${ansshow1.ans}</td>
				
				<td>${ansshow1.likec} </td>
  
			<td><a href="count/${ansshow1.aid}">like</a>
			 
        <td><a href="correct/${ansshow1.aid}">correct</a></td> 
     
			 
			
			</tr>
		</c:forEach>
		</table>
		 <script >
    
		 var table = document.getElementById('table');

		 for(var i = 1; i < table.rows.length; i++)
		 {
		     table.rows[i].onclick = function()
		     {
		          rIndex = this.rowIndex;
		          
		          var value = parseInt(this.cells[1].innerHTML, 10);
		        value = isNaN(value) ? 0 : value;
		        value++;
		        this.cells[1].innerHTML = value;
		        document.getElementById("fname").value = this.cells[1].innerHTML;
		     };
		 }
		 
		
// function incrementValue()
// {this.cells[0].innerHTML;
//     var value = parseInt(document.getElementById('number').value, 10);
//     value = isNaN(value) ? 0 : value;
//     value++;
//     document.getElementById('number').value = value;
// }
    
    
    </script>
   </form> 

</body>
</html>