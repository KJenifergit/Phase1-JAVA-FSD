<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
	<h1>Employees List</h1>  
	<table border=1 cellpadding=10 cellspacing=0>  
	<tr><th>Id</th><th>Name</th><th>Salary</th><th>Designation</th><th>Edit</th></tr>  
	   <c:set var="ret" value="${obj}"> </c:set>  
	   <tr>  
	   <td>${ret.id}</td>  
	   <td>${ret.name}</td>  
	   <td>${ret.salary}</td>  
	   <td>${ret.designation}</td>  
	   <td><a href="editemp/${ret.id}">Edit</a></td>  
	   
	   </tr>  
	     
	</table>  
	
</body>
</html>