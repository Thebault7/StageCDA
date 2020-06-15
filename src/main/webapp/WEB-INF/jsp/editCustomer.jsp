<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<meta charset="UTF-8">
<title>Modification du client</title>
</head>
<body>
	<h1>Modification des données du client avec la référence
		${customer.customerCode}</h1>
	<p>${errorMessage}</p>
	<form:form action="validateCustomerModif" method="POST"
		modelAttribute="customer">
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
				<c:forEach items="${listCities}" var="c" varStatus="cStatus">
					<li><a
						href="javascript:loadAddresses(${c.id}, ${customerIndex})">${c.postCode}
							${c.cityName}</a></li>
				</c:forEach>
			</ul>
		</div>
		<div id="list_addresses">
			<%@ include file="/WEB-INF/jsp/listAddresses.jsp" %>
		</div>
	</form:form>

	<script type="text/javascript">
	function loadAddresses(id, index) {
		window.alert("numéro de client: " + index + ", numéro de ville: " + id);
	}
	<%--
		function loadAddresses(id, index) {
			console.log("1a")
			var url = "http://localhost:8080/StageCDA/app/listAddresses/" + index + "/" + id;
			if (window.XMLHttpRequest) {
				console.log("2a")
				requete = new XMLHttpRequest();
				requete.open("GET", url, true);
				requete.onreadystatechange = majIHM;
				requete.send(null);
			} else if (window.ActiveXObject) {
				console.log("3a")
				requete = new ActiveXObject("Microsoft.XMLHTTP");
				if (requete) {
					requete.open("GET", url, true);
					requete.onreadystatechange = majIHM;
					requete.send();
				}
			} else {
				alert("Le navigateur ne supporte pas la technologie AJAX");
			}
		}
		
		
		
		
		
		function loadAddresses(id, index) {
			$.ajax({
				url: "http://localhost:8080/StageCDA/app/listAddresses/" + index + "/" + id,
				data: {}
			}).done(function(response) {
				console.log("SUCCESS";)
			})
		}
		
		
		
		
		
		$.ajax({
            url: "http://localhost/sortie/public/accueil",     {# {{ path(url('accueil')) }}  #}
            data: {'id_site': this.value}
        }).done(function (response) {
            document.getElementById("corps_tableau").innerHTML = response;
        });
		
		
		
		
		function majIHM(response) {
			console.log("4a")
			if (requete.status == 200) {
				// exploitation des données de la réponse
				console.log("5a")
				//document.getElementById("list_addresses").innerHTML = response;
				document.getElementById("list_addresses").
				$( "#here" ).load(window.location.href + " #here" );
			}
		}; --%>
	</script>


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