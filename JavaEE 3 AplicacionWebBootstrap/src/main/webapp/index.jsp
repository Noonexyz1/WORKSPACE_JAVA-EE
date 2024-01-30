<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

	<!-- Mi estilo CSS -->
	<link rel="stylesheet" href="css/estilo.css">
	
	<!-- Google Fonts -->
	<link rel="preconnect" href="https://fonts.googleapis.com">
	<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
	<link href="https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,400;0,700;1,500;1,700&display=swap" rel="stylesheet">
    
    <title>Hello, world!</title>


  </head>
  <body>
  
    <!-- Menu -->
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<div class="container">
			
			<!-- logotipo -->
			<a class="navbar-brand"
			   href="index.jsp">

				<img class="logotipo"
					 alt=""
					 src="images/home/Logotipo.png">
			</a>
		
			
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			
			<!-- Mi barra de MenusOpciones -->
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				
				<!-- Mi lista de Opciones -->				
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item">
						<a class="nav-link active"
						   aria-current="page" 
						   href="#">Home</a>
				    </li>
				    
					<li class="nav-item">
						<a class="nav-link" 
						   href="#">Somos</a>
					</li>
					
					<li class="nav-item dropdown">
						<a class="nav-link dropdown-toggle" 
						   href="#" 
						   id="navbarDropdown"
						   role="button" 
						   data-bs-toggle="dropdown" 
						   aria-expanded="false">Servicios </a>
						   
						<ul class="dropdown-menu"
							aria-labelledby="navbarDropdown">
							
							<li><a class="dropdown-item" href="#">Servicio 01</a></li>
							<li><a class="dropdown-item" href="#">Servicio 02</a></li>
							<li><hr class="dropdown-divider"></li>
							<li><a class="dropdown-item" href="#">Servicio 03</a></li>
							
						</ul>
						
					</li>
					
					<li class="nav-item">
						<a class="nav-link"
						   aria-current="page" 
						   href="#">Sucursales</a>
				    </li>
				    
				    <li class="nav-item">
						<a class="nav-link"
						   aria-current="page" 
						   href="#">Contactos</a>
				    </li>
					
					<li>
						<img class="iconos-redes-header" alt="Facebook" src="images/svg/facebook-logo-button.svg">
						<img class="iconos-redes-header" alt="Instagram" src="images/svg/instagram-logo.svg">
						<img class="iconos-redes-header" alt="Twitter" src="images/svg/twitter-logo-button.svg">
					</li>					
					
				</ul>
				
			</div>
			
		</div>
		
	</nav>

	<!-- Slider o Carrusel -->
	<div id="carouselExampleCaptions" class="carousel slide" data-bs-ride="carousel">
		<!-- Los botones de mis indicadores (---) -->
		<div class="carousel-indicators">
			<button type="button"
					data-bs-target="#carouselExampleCaptions"
				    data-bs-slide-to="0" 
				    class="active" 
				    aria-current="true"
				 	aria-label="Slide 1"></button>
				 	
			<button type="button" 
			        data-bs-target="#carouselExampleCaptions"
				    data-bs-slide-to="1" 
				    aria-label="Slide 2"></button>
				    
			<button type="button" 
			   	    data-bs-target="#carouselExampleCaptions"
				    data-bs-slide-to="2" 
				    aria-label="Slide 3"></button>
				    
		</div>
		
		<!-- Carrusel con las imagenes -->
		<div class="carousel-inner">
			<div class="carousel-item active">
				<img src="images/home/slider.jpg" class="d-block w-100" alt="Slider 01">
				
				<div class="carousel-caption d-none d-md-block">
					<h1>Titulo 01</h1>
					<p>Parrafo 01</p>
					<a class="btn btn-light" href="#">
						Descargar
					</a>
					<a class="btn btn-light" href="#">
						Ir a info
					</a>
					
				</div>
				
			</div>
			
			<div class="carousel-item">
				<img src="images/home/slider.jpg" class="d-block w-100" alt="Slider 02">
				
				<div class="carousel-caption d-none d-md-block">
					<h1>Second slide label</h1>
					<p>Some representative placeholder content for the second slide.</p>
				</div>
				
			</div>
			
			<div class="carousel-item">
				<img src="images/home/slider tres.jpg" class="d-block w-100" alt="Slider 03">
				
				<div class="carousel-caption d-none d-md-block">
					<h5>Third slide label</h5>
					<p>Some representative placeholder content for the third slide.</p>
				</div>
			
			</div>
			
		</div>
		
		
		<button class="carousel-control-prev" type="button"
			data-bs-target="#carouselExampleCaptions" data-bs-slide="prev">
			<span class="carousel-control-prev-icon" aria-hidden="true"></span> <span
				class="visually-hidden">Previous</span>
		</button>
		<button class="carousel-control-next" type="button"
			data-bs-target="#carouselExampleCaptions" data-bs-slide="next">
			<span class="carousel-control-next-icon" aria-hidden="true"></span> <span
				class="visually-hidden">Next</span>
		</button>
		
	</div>

	<!-- Contenido Principal -->
	<main>
		<section class="altura-a-b">
			<div class="container">
				<div class="row">
					
					<div class="col-12 col-sm-4 text-center">
						<img class="img-fluid w-100" alt="Banner 01" src="images/home/banners/banner1.jpg">
						<h5>Titulo 01</h5>
						<p>Loren asdfdfss dfsdfsdfsdjkfhalskdjf halskjdfhaslkdjfhklkjs</p>
						
					</div>
					
					<div class="col-12 col-sm-4 text-center">
						<img class="img-fluid w-100" alt="Banner 02" src="images/home/banners/banner2.jpg">
						<h5>Titulo 01</h5>
						<p>Loren asdfdfssdf sdfsdfsdjkfh alskdjfh alskjdfhaslkdjfhklkjs</p>
						
					</div>
					
					<div class="col-12 col-sm-4 text-center">
						<img class="img-fluid" alt="Banner 03" src="images/home/banners/banner3.jpg">
						<h5>Titulo 01</h5>
						<p>Loren asdfdfssdfsdfsdfsdjkfh alskdjfha lskjdfhaslkdjfhklkjs</p>
						
					</div>
					
				</div>
			</div>
		</section>
	</main>
	
	<!-- Banner del Video -->
	<section class="banner-video">
		<a href="#">
			<img class="play" alt="Play" src="images/svg/play-button.svg">
		</a>
	</section>
	
	<!-- Capturas de Pantalla -->
	<section class="altura-a-b">
		<div class="container">
			<div class="row">
				<div class="col-12 col-sm-3">
					<img class="img-fluid shadow-lg" alt="Pantalla 01" src="images/pantallas/pantalla_1.jpg">
				</div>

				<div class="col-12 col-sm-3">
					<img class="img-fluid shadow-lg" alt="Pantalla 02" src="images/pantallas/pantalla_2.jpg">
				</div>
				
				<div class="col-12 col-sm-3">
					<img class="img-fluid shadow-lg" alt="Pantalla 03" src="images/pantallas/pantalla_3.jpg">
				</div>

				<div class="col-12 col-sm-3">
					<img class="img-fluid" alt="Pantalla 04" src="images/pantallas/pantalla_4.jpg">
				</div>
				
			</div>
		
		</div>
		
	</section>
	
	<!-- Descarga tu App -->
	<section class="altura-a-b"> 
		<div class="container">
			<div class="row">
				<div class="col-12 col-sm-6">
					<img class="img-fluid" alt="Pantalla" src="images/home/app-mockup-2.png">
				</div>
				
				<div class="col-12 col-sm-6">
					<h2>Descarga tu App</h2>
					<p>Parrafo asdfasdf sdfsdf sdfsdf sdfsdf sdfsdf Parrafo 
					Parrafo asdfasdf sdfsdf sdfsdf sdfsdf sdfsdf sdfsdf sdfsdf sdfsdf</p>
					
					<div class="row">
						<div class="col-12 col-sm-6">
							<img class="img-fluid" alt="Android" src="images/home/android.png">
						</div>
						
						<div class="col-12 col-sm-6">
							<img class="img-fluid" alt="Apple" src="images/home/apple.png">
						</div>
						
					</div>
					
				</div>
				
			</div>
		</div>
	</section>
	
	<!-- Pie de Pagina -->
	<footer>
		<img class="logotipo" alt="" src="images/home/Logotipo.png">
		</br>
		<img class="iconos-redes-header" alt="Facebook" src="images/svg/facebook-logo-button.svg">
		<img class="iconos-redes-header" alt="Instagram" src="images/svg/instagram-logo.svg">
		<img class="iconos-redes-header" alt="Twitter" src="images/svg/twitter-logo-button.svg">
		<p>Blaasdfasdfasdf asdf asdfasdf woieruwoieru sdflksjdfkl klasdf,asdnf aslkdfjkl laksdfjlkl <br>
		df asdfasdf woieruwoieru sdflksjdfkl klasdf,asdnf aslkdfjkl laksdfjlkl <br>
		df asdfasdf woieruwoieru sdflksjdfkl klasdf,asdnf aslkdfjkl laksdfjlkl</p>
		
	</footer>
	
	
	
	<!-- Optional JavaScript; choose one of the two! -->

    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

    <!-- Option 2: Separate Popper and Bootstrap JS -->
    <!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    -->
    
  </body>
</html>