<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<div>
		<form:label path="firstName">Prénom</form:label>
		<div>
			<form:input path="firstName" value="${customer.firstName}" />
		</div>
	</div>
	<div>
		<form:label path="sirName">Nom</form:label>
		<div>
			<form:input path="sirName" value="${customer.sirName}" />
		</div>
	</div>
	<div>
		<form:label path="gender">Civilité</form:label>
		<div>
			<form:radiobutton path="gender" value="M" />
			Monsieur
			<form:radiobutton path="gender" value="F" />
			Madame
		</div>
	</div>

	<div>
		<form:label path="email">Email</form:label>
		<div>
			<form:input path="email" type="email" value="${customer.email}" />
		</div>
	</div>
	<div>
		<form:label path="phoneNumber">Téléphone</form:label>
		<div>
			<form:input path="phoneNumber" type="phone"
				value="${customer.phoneNumber}" />
		</div>
	</div>
	<div>
		<form:label path="customerCode">Référence client</form:label>
		<div>
			<form:input path="customerCode" value="${customer.customerCode}" />
		</div>
	</div>

</body>
</html>