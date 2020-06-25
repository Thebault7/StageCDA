<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!doctype html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Page d'accueil</title>
<link href="css/index.css" rel="stylesheet">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
<body>
	<div class="container-fluid">
		<div class="row">
			<div id="logo_stage" class="col-9 d-flex justify-content-center">
				<div id="logo_version_stage">
					<img src="img/herculepro_logo_modif.png"
						alt="Logo de HerculePro Stage" id="logo"> <img
						src="img/version stage.png" alt="#" id="version_stage">
				</div>
			</div>
			<div class="col-3 flex-column row" id="connect_section">
				<div id="connexion" class="row">
					<form action="app/connection" method="get">
						<input type="submit" value="Connexion">
					</form>
				</div>
				<div id="new_account" class="row">
					<form action="app/addUser" method="get">
						<input type="submit" value="Création d'un compte">
					</form>
				</div>
			</div>
		</div>
	</div>
	<div class="container-fluid">
		<div class="row">
			<div class="col-9 d-flex justify-content-center">
				<img src="img/menuiserie.png" alt="Image d'un atelier de menuiserie"
					id="img_workshop">
			</div>
			<div class="col-3 d-flex justify-content-center">
				<div class="d-flex align-items-start flex-column">
					<div>gdshtsh</div>
					<div>fdhdshtgf</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>