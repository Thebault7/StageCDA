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
			<div id="logo_stage" class="col-9">
				<div id="logo_version_stage">
					<img src="img/herculepro_logo_modif.png"
						alt="Logo de HerculePro Stage" id="logo"> <img
						src="img/version stage.png" alt="" id="version_stage">
				</div>
			</div>
			<div class="col-3 flex-column row" id="connect_section">
				<div id="connexion" class="row col-6">
					<form action="app/connection" method="get">
						<input type="submit" value="Connexion" class="btn btn-primary">
					</form>
				</div>
				<div id="new_account" class="row col-6">
					<form action="app/addUser" method="get">
						<input type="submit" value="Création d'un compte"
							class="btn btn-primary">
					</form>
				</div>
			</div>
		</div>
	</div>
	<div class="container-fluid">
		<div class="row">
			<div id="central_img" class="col-9">
				<img src="img/menuiserie.png" alt="Image d'un atelier de menuiserie"
					id="img_workshop">
			</div>
			<div id="side_section" class="col-3 flex-column row">
				<div id="info_section">
					<div id="info">
						<p>
							<span>Lorem ipsum</span> dolor sit amet, consectetur adipiscing elit.
							Suspendisse ultricies fringilla mauris, eget egestas risus
							pulvinar ut. Sed nec nunc ex. Sed faucibus non ante a ornare.
							Etiam tortor tellus, sagittis in est non, vehicula pharetra
							ligula. Pellentesque ut arcu at arcu mollis tempus. <br>
						</p>
						<p>Etiam ligula libero, cursus vulputate sapien at, mattis
							pretium nulla. Donec tempor mi id congue molestie. Curabitur
							tempus luctus dolor a dignissim. Suspendisse ac molestie felis.
							Fusce consequat orci quis volutpat dignissim. Sed pretium mollis
							erat vel rhoncus.</p>
					</div>
				</div>
				<div id="adv_section">
					<div>
						<img id="ad_img" src="img/Claw-hammer.jpg" alt="Publicité" />
						<p id="ad_index">publicité</p>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>