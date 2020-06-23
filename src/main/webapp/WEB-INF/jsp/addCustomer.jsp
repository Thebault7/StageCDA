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
	
	<p>${errorMessage}</p>
	<form:form action="validateCustomerModif" method="POST"
		modelAttribute="customer">

		<%@ include file="/WEB-INF/jsp/formCustomer.jsp"%>
		<%@ include file="/WEB-INF/jsp/formAddress.jsp"%>

		<div>
			<button type="submit">Enregistrer</button>
		</div>
	</form:form>

	<div>
		<a href="customers">Annuler</a>
	</div>

	<%@ include file="/WEB-INF/jsp/listCities.jsp"%>

	<script type="text/javascript" src="../js/listCities.js"></script>
</body>
</html>