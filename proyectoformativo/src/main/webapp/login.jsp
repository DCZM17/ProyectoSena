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
<body style="background-color: #666666;">
	
	<div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100">
				<form class="login100-form" action="login" method="POST">
					<span class="login100-form-title p-b-43">
						INICIA SESIÓN
					</span>
					
					<input type="hidden" value="login" name="action" id="action">
					<div class="wrap-input100">
						<label class="label">CORREO ELECTRONICO</label>
						<input class="input100" type="email" name="correoUsuario" id="correoUsuario" required>
					</div>
					<div class="wrap-input100">
						<label class="label">CONTRASEÑA</label>
						<input class="input100" type="password" name="contrasena" id="contrasena" required>

					</div>

					<div class="flex-sb-m w-full p-t-3 p-b-32" >
						<div>
							<a href="#" class="txt1">
								¿Olvidaste tu contraseña?
							</a>
						</div>
					</div>

                        <div class="container-login100-form-btn">
							<button class="login100-form-btn" style="background-color: #0064d0;">
								Iniciar Sesión
						</button>
					</div>
				</form>

				<div class="login100-more" style="background-image: url('views/assets/img/login/images.jpeg');">
				</div>
			</div>
		</div>
	</div>

	
	
</body>
</html>