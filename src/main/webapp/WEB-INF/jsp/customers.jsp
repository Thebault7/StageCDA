<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Affichage des clients</title>
</head>
<body>
	<p><a href="addCustomer">Ajouter un nouveau client</a></p>
	<h1>Affichage des clients</h1>
	<table>
		<tr>
			<th>Nom</th>
			<th>Prénom</th>
			<th>Civilité</th>
			<th>Adresse</th>
			<th>Email</th>
			<th>Téléphone</th>
			<th>Référence client</th>
			<th></th>
		</tr>
		<c:forEach items="${listCustomers}" var="c" varStatus="cStatus">
			<tr>
				<td>${c.sirName}</td>
				<td>${c.firstName}</td>
				<td>${c.gender}</td>
				<td>${c.address.addressNumber} ${c.address.addressName}<br />${c.address.city.postCode} ${c.address.city.cityName}</td>
				<td>${c.email}</td>
				<td>${c.phoneNumber}</td>
				<td>${c.customerCode}</td>
				<td><a href="editCustomer?index=${c.id}">Editer</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>