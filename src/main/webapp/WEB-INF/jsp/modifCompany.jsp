<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8>
<title>Modification des données concernant l'entreprise</title>
</head>
<body>
	<h1>Modification des données concernant l'entreprise</h1>

	<p>${errorMessage}</p>
	<form:form action="#" method="POST" modelAttribute="company">
		<div>
			<form:label path="address.addressNumber">Numéro de la rue</form:label>
			<div>
				<form:input path="address.addressNumber"
					value="${company.address.addressNumber}" id="addressNumber" />
			</div>
		</div>
		<div>
			<form:label path="address.addressName">Nom de la rue</form:label>
			<div>
				<form:input path="address.addressName"
					value="${company.address.addressName}" id="addressName" />
			</div>
		</div>
		<div>
			<form:label path="address.city.cityName">Nom de la ville</form:label>
			<div>
				<form:input path="address.city.cityName"
					value="${company.address.city.cityName}" id="cityName" />
			</div>
		</div>
		<div>
			<form:label path="address.city.postCode">Code postal</form:label>
			<div>
				<form:input path="address.city.postCode"
					value="${company.address.city.postCode}" id="postCode" />
			</div>
		</div>
		<div>
			<button type="submit">Enregistrer</button>
		</div>
	</form:form>

	<div>
		<a href="companys">Annuler</a>
	</div>

	<%@ include file="/WEB-INF/jsp/listCities.jsp"%>

	<script type="text/javascript" src="../js/listCities.js"></script>
</body>
</html>