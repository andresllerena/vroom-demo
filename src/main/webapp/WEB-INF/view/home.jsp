<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<style>
		td {padding: 0 15px;}
	</style>
	<meta charset="ISO-8859-1">
	<title>Vroom Demo</title>
</head>
<body>
	<h2>WESCO - Pizzas</h2>
	
	<table>
		<c:forEach items="${pizzas}" var="pizza">
	    	<tr>
	    		<td><img src="${pizza.imageURL}" ></td>
	    		<td>${pizza.name}</td>
	    		<td>$${pizza.price}</td>
	    	</tr>
		</c:forEach>
	</table>
</body>
</html>