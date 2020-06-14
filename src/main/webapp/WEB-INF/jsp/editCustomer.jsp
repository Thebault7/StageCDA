<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Modification du client</title>
</head>
<body>
	<h1>Modification des données du client référencé ${customer.customerCode}</h1>
	<p>${errorMessage}</p>
	<form:form action="validateCustomerModif" method="POST" modelAttribute="customer">
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
		<%-- <div>
			<form:label path="address.id">Adresse</form:label>
			<div>
				<form:select path="address.id">
					<form:options items="${listAddresses}" itemValue="id" itemLabel="addressName" />
				</form:select>
			</div>
		</div>--%>
		<div>
			<ul>
				<c:forEach items="${listcities}" var="c" varStatus="aStatus">
					<li>${c.cityName}</li>
				</c:forEach>
			</ul>
		</div>
	</form:form>
	
	
	
	
 <%-- 	<form:form action="validateNewUser" method="POST" modelAttribute="user">
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
	</form:form>--%>
</body>
</html>