<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<title></title>
</head>
<body>
	<ul>
		<c:forEach items="${listStreets}" var="a" varStatus="aStatus">
			<li>${a.addressNumber} ${a.addressName}</li>
		</c:forEach>
	</ul>
</body>
</html>