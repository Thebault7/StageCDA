<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Création d'un nouveau compte utilisateur</title>
</head>
<body>
	<h1>Entrez vos nouveaux identifiants</h1>
	<p>${errorMessage}</p>
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
			<form:label path="firstName">Prénom</form:label>
			<div>
				<form:input path="firstName" placeholder="Prénom..." />
			</div>
		</div>
		<div>
			<form:label path="email">Email</form:label>
			<div>
				<form:input path="email" placeholder="Email..." />
			</div>
		</div>
		<div style="display:block">
			<form:label path="company.id">Entreprise</form:label>
			<div>
				<form:input path="company.id" id="company_id" />
			</div>		
		</div>
		<div>
			<button type="submit">S'inscrire</button>
		</div>
	</form:form>

	<div>
		<label for="list_companies">Choisir une entreprise</label> <select
			name="company" id="list_companies">
			<option value="">--Choisir une option--</option>
			<c:forEach items="${listCompanies}" var="c" varStatus="cstatus">
				<option value="${c.id}">${c.companyName} - ${c.address.city.cityName }</option>
			</c:forEach>
		</select>
	</div>
	
	<script type="text/javascript" src="../js/fillCompany.js"></script>
</body>
</html>