<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Page de connection</title>
</head>
<body>
	<h1>Entrer les identifiants</h1>
	<p>${errorIdentification}</p>
 	<form:form action="validatePassword" method="POST" modelAttribute="user">
		<div>
			<form:label path="pseudo">Pseudo</form:label>
			<div>
				<form:input path="pseudo" placeholder="Pseudo..." />
			</div>
		</div>
		<div>
			<form:label path="password">Password</form:label>
			<div>
				<form:password path="password" />
			</div>
		</div>
		<div>
			<button type="submit">Se connecter</button>
		</div>
		
		<%--<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" /> --%>
	</form:form>
</body>
</html>