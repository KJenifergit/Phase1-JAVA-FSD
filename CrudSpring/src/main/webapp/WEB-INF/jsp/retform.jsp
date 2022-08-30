<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Edit Employee</h1>  
       <form:form method="GET" action="retrieve">    
           Enter ID:  <form:input  path="id" name="id" />  
           <input type="submit" value="retrieve" /> 
       </form:form>   
</body>
</html>