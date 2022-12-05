<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html lang="esp">
<head>
	<title>Inicio - AcarreosGutierrez</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="views/assets/img/login/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="views/assets/vendor/login/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="views/assets/vendor/login/animate/animate.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="views/assets/vendor/login/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="views/assets/vendor/login/animsition/css/animsition.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="views/assets/vendor/login/select2/select2.min.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="views/assets/vendor/login/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="views/assets/css/styleLogin.css">
<!--===============================================================================================-->
</head>
<body style="background-color: #666666;"  oncontextmenu='return false' class='snippet-body'>
	
	<div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100">
				<form class="login100-form" action="forgotPassword" method="POST">
					<span class="login100-form-title p-b-43">
						 ¿Olvido su contraseña?
					</span>
					<p>Cambie su contraseña en tres pasos.</p>
					<ol class="list-unstyled">
						<li><span class="text-primary text-medium">1. </span>Ingrese su correo electronico en la parte inferior</li>
						<li><span class="text-primary text-medium">2. </span>Nuestro sistema le enviara un codigo a su correo</li>
						<li><span class="text-primary text-medium">3. </span>Ingrese el codigo en la siguiente pagina</li>
					</ol>
					<input type="hidden" value="login" name="action" id="action">
					<br>
					<label for="email-for-pass">Ingrese su correo electronico</label>
					<div class="wrap-input100">
						<input class="input100" type="text" name="email" id="email-for-pass" required="">
					</div>
                        <div class="container-login100-form-btn">
								<button class="login100-form-btn" style="background-color: #0064d0;" type="submit">Obtener codigo</button>
					</div>
				</form>

				<div class="login100-more" style="background-image: url('views/assets/img/login/images.jpeg');">
				</div>
			</div>
		</div>
	</div>
	
</body>
</html>