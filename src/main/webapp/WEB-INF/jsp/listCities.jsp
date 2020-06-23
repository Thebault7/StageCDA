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
	<label for="list_cities">Choisir une ville:</label>
	<select name="villes" id="list_cities">
		<option value="">--Choisir une option--</option>
		<c:forEach items="${listCities}" var="c" varStatus="cstatus">
			<option value="${c.cityName}">${c.cityName}</option>
		</c:forEach>
	</select>
	
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
</body>
</html>