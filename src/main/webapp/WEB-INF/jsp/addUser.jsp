<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Nouvel utilisateur</title>
</head>
<body>
	<h1>Entrer les identifiants</h1>
 	<form:form action="app/validateUser" method="POST" modelAttribute="user">
		<div>
			<form:label path="pseudo">Pseudo</form:label>
			<div>
				<form:input path="pseudo" placeholder="Pseudo..." />
			</div>
		</div>
		<div>
			<form:label path="password">Password</form:label>
			<div>
				<form:password path="password" placeholder="Mot de passe..." />
			</div>
		</div>
		<div>
			<button type="submit">S'inscrire</button>
		</div>
	</form:form>
</body>
</html>