<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js">
	
</script>
<meta charset="UTF-8">
<title>Modification du client</title>
</head>
<body>
	<c:choose>
		<c:when test="${customer.customerCode == 'Inconnu'}">
			<h1>Modification des données d'un client</h1>
		</c:when>
		<c:otherwise>
			<h1>Modification des données du client avec la référence
				${customer.customerCode}</h1>
		</c:otherwise>
	</c:choose>

	<p>${errorMessage}</p>
	<form:form action="validateCustomerModif" method="POST"
		modelAttribute="customer" id="editCustomerForm">

		<%@ include file="/WEB-INF/jsp/formCustomer.jsp"%>
		<%@ include file="/WEB-INF/jsp/formAddress.jsp"%>

		<div>
			<button type="submit">Modifier</button>
		</div>
		<div style="display: none">
			<form:input path="id" value="${customer.id}" />
		</div>
	</form:form>

	<div>
		<a href="customers">Annuler</a>
	</div>

	<%@ include file="/WEB-INF/jsp/listCities.jsp"%>

	<script type="text/javascript" src="../js/listCities.js"></script>

</body>
</html>