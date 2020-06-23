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
		<form:label path="address.addressNumber">Numéro de la rue</form:label>
		<div>
			<form:input path="address.addressNumber"
				value="${customer.address.addressNumber}" id="addressNumber" />
		</div>
	</div>
	<div>
		<form:label path="address.addressName">Nom de la rue</form:label>
		<div>
			<form:input path="address.addressName"
				value="${customer.address.addressName}" id="addressName" />
		</div>
	</div>
	<div>
		<form:label path="address.city.cityName">Nom de la ville</form:label>
		<div>
			<form:input path="address.city.cityName"
				value="${customer.address.city.cityName}" id="cityName" />
		</div>
	</div>
	<div>
		<form:label path="address.city.postCode">Code postal</form:label>
		<div>
			<form:input path="address.city.postCode"
				value="${customer.address.city.postCode}" id="postCode" />
		</div>
	</div>
</body>
</html>