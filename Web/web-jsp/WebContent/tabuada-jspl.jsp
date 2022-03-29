<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tabuada - JSTL</title>
</head>
<body>

	<div align="center">
		<h1>Tabuada do 7 - JSTL</h1>
		
		<c:forEach begin="0" end="10" var="i">
			7 x ${i} = ${i*7} <br>
		</c:forEach>
		
		<br> <br>
		<a href="index.jsp">Página Principal</a>

	</div>




</body>
</html>