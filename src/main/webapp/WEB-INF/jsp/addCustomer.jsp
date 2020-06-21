<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ajout d'un nouveau client</title>
</head>
<body>
	<h1>Ajout d'un nouveau client</h1>
	<form:form action="validateNewCustomer" method="POST" modelAttribute="customer">
		<div>
			<form:label path="sirName">Nom</form:label>
			<div>
				<form:input path="sirName" placeholder="Nom du client..." />
			</div>
		</div>
		<div>
			<form:label path="firstName">Prénom</form:label>
			<div>
				<form:input path="firstName" placeholder="Prénom du client..." />
			</div>
		</div>
		<div>
			<form:label path="gender">Civilité</form:label>
			<div>
				<form:radiobutton path="gender" value="M" />Monsieur
				<form:radiobutton path="gender" value="F" />Madame
			</div>
		</div>
		<div>
			<form:label path="address">Adresse</form:label>
			<div>
				<p>Liste déroulante de villes et d'adresses ici !</p>
			</div>
		</div>
		<div>
			<form:label path="customerCode">Référence client</form:label>
			<div>
				<form:input path="customerCode" placeholder="Référence client..." />
			</div>
		</div>
		<div>
			<form:label path="email">Email</form:label>
			<div>
				<form:input path="email" placeholder="Email du client..." />
			</div>
		</div>
		<div>
			<form:label path="phoneNumber">Numéro de téléphone du client</form:label>
			<div>
				<form:input path="phoneNumber" placeholder="Numéro de téléphone..." />
			</div>
		</div>
		<div>
			<button type="submit">Enregistrer</button>
		</div>
	</form:form>
	<div>
		<a href="customers">Annuler</a>
	</div>
</body>
</html>