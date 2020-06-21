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
	<h1>Modification des données du client avec la référence
		${customer.customerCode}</h1>
	<p>${errorMessage}</p>
	<form:form action="validateCustomerModif" method="POST"
		modelAttribute="customer" id="editCustomerForm">
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
				<form:radiobutton path="gender" value="M" />Monsieur
				<form:radiobutton path="gender" value="F" />Madame
			</div>
		</div>
<%--		<div>
			<form:label path="address.addressNumber">Numéro de la rue</form:label>
			<div>
				<form:input path="address.addressNumber" value="${customer.address.addressNumber}" id="addressNumber" />
			</div>
		</div>
		<div>
			<form:label path="address.addressName">Nom de la rue</form:label>
			<div>
				<form:input path="address.addressName" value="${customer.address.addressName}" id="addressName" />
			</div>
		</div>
		<div>
			<form:label path="address.city.cityName">Nom de la ville</form:label>
			<div>
				<form:input path="address.city.cityName" value="${customer.address.city.cityName}" id="cityName" />
			</div>
		</div>
		<div>
			<form:label path="address.city.postCode">Code postal</form:label>
			<div>
				<form:input path="address.city.postCode" value="${customer.address.city.postCode}" id="postCode" />
			</div>
		</div>			--%>
		<div>
			<form:label path="email">Email</form:label>
			<div>
				<form:input path="email" type="email" value="${customer.email}" />
			</div>
		</div>
		<div>
			<form:label path="phoneNumber">Téléphone</form:label>
			<div>
				<form:input path="phoneNumber" type="phone" value="${customer.phoneNumber}" />
			</div>
		</div>
		<div>
			<button type="submit">Modifier</button>
		</div>
		<div style="display:none">
			<form:input path="id" value="${customer.id}" />
		</div>
	</form:form>
	
	<div>
		<a href="customers">Annuler</a>
	</div>

	<form:form action="" method="POST" modelAttribute="address">
		<div>
			<form:label path="city.id">Ville</form:label>
			<div>
				<form:select path="city.id" id="list_cities">
					<form:options items="${listCities}" itemValue="id"
						itemLabel="cityName" />
				</form:select>
			</div>
		</div>
	</form:form>
	<ul>
		<c:forEach items="${listAddresses}" var="a" varStatus="aStatus">
			<div class="${a.city.cityName} list_addresses">
				<li>
					<p>
						<a href='javascript:writeAddress(${a.addressNumber}, "${a.addressName}", "${a.city.postCode}", "${a.city.cityName}")'>
							${a.addressNumber} ${a.addressName} ${a.city.postCode} ${a.city.cityName}
						</a>
					</p>
				</li>
			</div>
		</c:forEach>
	</ul>

	<script type="text/javascript">
		function listCities() {
			document.getElementById("list_cities").addEventListener("change",function() {
				var nameCity = document.getElementById("list_cities")
								.options[document.getElementById("list_cities").selectedIndex].text;
				hideListAddresses();
				var listCities = document.getElementsByClassName(nameCity);
				for (var i = 0; i < listCities.length; i += 1){
					listCities[i].style.display = 'block';
				};
			});
		}
		
		function hideListAddresses() {
			var listAddresses = document.getElementsByClassName('list_addresses');
			for (var i = 0; i < listAddresses.length; i += 1) {
				listAddresses[i].style.display = "none";
			};
		}
		
		function writeAddress(number, streetName, postCode, city) {
			document.getElementById("addressNumber").value = number;
			document.getElementById("addressName").value = streetName;
			document.getElementById("cityName").value = city;
			document.getElementById("postCode").value = postCode;
		}
		
		listCities();
		
		hideListAddresses();
	</script>
</body>
</html>