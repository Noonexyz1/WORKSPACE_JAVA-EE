<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
	<link href="css/estilologin.css" rel="stylesheet">
	
	<title>Login</title>
	
</head>
<body>
	
	<!-- login -->
	<div class="container">
		<div class="row align-items-center formulario-fondo">
			<div class="col">
		    	<!-- mi carrusel Control -->
				<div id="carouselExampleControls" class="carousel slide" data-bs-ride="carousel">
					<div class="carousel-inner radio-border">
						<div class="carousel-item active">
							<img src="imagenes/imagenCarrusel/imagen1.jpg" class="d-block w-100" alt="Slider 01">
						</div>
						<div class="carousel-item">
							<img src="imagenes/imagenCarrusel/imagen2.jpg" class="d-block w-100" alt="Slider 02">
						</div>
						<div class="carousel-item">
							<img src="imagenes/imagenCarrusel/imagen3.jpg" class="d-block w-100" alt="Slider 03">
						</div>
					</div>
					
					<button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="prev">
						<span class="carousel-control-prev-icon" aria-hidden="true"></span>
						<span class="visually-hidden">Anterior</span>
					</button>
					
					<button class="carousel-control-next" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="next">
						<span class="carousel-control-next-icon" aria-hidden="true"></span>
						<span class="visually-hidden">Siguiente</span>
					</button>
					
				</div>
	
			</div>
		    
		    <div class="col formulario ">
				<h1>Hola!</h1>
				
				<!-- mi formulario -->
				<div class="row">
					<form action="posLogin" method="post">
						<div class="mb-3">
							<input name="usuario" type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Usuario">
						</div>
						
						<div class="mb-3">
							<input name="contrasena" type="password" class="form-control" id="exampleInputPassword1" placeholder="Contraseña">
						</div>
							
						<button type="submit" class="btn btn-primary">Login</button>
						
					</form>
				
				</div>
				
				<br>
				<a href="#" >Has olvidado tu contraseña?</a>	

			</div>
			
		</div>
		
	</div>
	
	
	
	
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>		
</body>
</html>