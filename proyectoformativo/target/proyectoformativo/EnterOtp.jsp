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
				<form class="login100-form" id="register-form" action="ValidateOtp" role="form" autocomplete="off" class="form" method="post">
					<span class="login100-form-title p-b-43">
						Ingrese Codigo
					</span>
					<%
		  			if(request.getAttribute("message")!=null)
		  			{
		  				out.print("<p class='text-danger ml-1'>"+request.getAttribute("message")+"</p>");
		  			}
		  
		  %>
					<div class="wrap-input100">
						<span class="input-group-addon"><i
							class="glyphicon glyphicon-envelope color-blue"></i></span>
							 <input id="opt" name="otp" placeholder="Ingrese Codigo" class="input100" type="text" required="required">
					</div>
                        <div class="container-login100-form-btn">
							<input name="recover-submit" class="login100-form-btn" value="Verificar Codigo" type="submit">
					</div>
					<input type="hidden" class="hide" name="token" id="token" value="">
				</form>

				<div class="login100-more" style="background-image: url('views/assets/img/login/images.jpeg');">
				</div>
			</div>
		</div>
	</div>

	
	
</body>
</html>