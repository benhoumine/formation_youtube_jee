<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>
	
	<c:set var="nom" value="abdelkhalekk" scope="session"/>
	</h1>
	
	<c:catch var="exceptionError">
			<fmt:parseNumber var="entier" value="abdelkhalek"/>
	</c:catch>
	<c:if test="${ not empty exceptionError }">
		<c:out value="Hello from catch"/>
	</c:if>
</body>
</html>