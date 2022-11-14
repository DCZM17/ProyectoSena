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
				<form class="login100-form" action="newPassword" method="POST">
					<span class="login100-form-title p-b-43">
						Reestablecer Contraseña
					</span>
					<div class="wrap-input100">
						<label class="label">Nueva Contraseña</label>
						<input class="input100" type="text" name="password" placeholder="&#xf084; &nbsp; Nueva Contrseña">
					</div>
					<div class="wrap-input100">
						<label class="label">Confirmar Contraseña</label>
						<input class="input100" type="password" name="confPassword"placeholder="&#xf084; &nbsp; Confirmar Nueva Contraseña>
					</div>

                        <div class="container-login100-form-btn">
							<input class="login100-form-btn" type="submit" value="Reestablecer" >
					</div>
				</form>

				<div class="login100-more" style="background-image: url('views/assets/img/login/images.jpeg');">
				</div>
			</div>
		</div>
	</div>

	
	
</body>
</html>