<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cr�ation d'un nouveau compte utilisateur</title>
</head>
<body>
	<h1>Entrez vos nouveaux identifiants</h1>
	<p>${errorPseudoAlreadyTaken}</p>
 	<form:form action="validateNewUser" method="POST" modelAttribute="user">
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
			<form:label path="sirName">Nom</form:label>
			<div>
				<form:input path="sirName" placeholder="Nom..." />
			</div>
		</div>
		<div>
			<form:label path="firstName">Pr�nom</form:label>
			<div>
				<form:input path="firstName" placeholder="Pr�nom..." />
			</div>
		</div>
		<div>
			<form:label path="email">Email</form:label>
			<div>
				<form:input path="email" placeholder="Email..." />
			</div>
		</div>
		<div>			
			<form:label path="company.id">Entreprise</form:label>
			<div>
				<form:select path="company.id">
					<form:options items="${listCompanies}" itemValue="id" itemLabel="companyName"/>
				</form:select>					
			</div>
		</div>
		<div>
			<button type="submit">S'inscrire</button>
		</div>
	</form:form>
</body>
</html>