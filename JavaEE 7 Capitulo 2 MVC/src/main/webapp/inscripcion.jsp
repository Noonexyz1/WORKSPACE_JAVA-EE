<%@page import="java.util.List"
		import="dao.CursoDTO"
		import="dao.FormaPagoDTO"
%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%
	List<CursoDTO> cursos;
	List<FormaPagoDTO> formasPago;
	
	// obtengo los atributos que llegan en el request
	cursos = (List) request.getAttribute("cursos");
	formasPago = (List) request.getAttribute("formasPago");

%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<meta charset="utf-8">
    	<meta name="viewport" content="width=device-width, initial-scale=1">
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
		
		<title>Mi Titulo de Web</title>
		
	</head>
	<body>
		<div class="container">
			<div class="row">
				<form action="posInscripcion">
					<div class="mb-3">
						<label for="exampleInputEmail1" class="form-label">Nombre:</label>
						<input type="text" class="form-control" name="nombre">
					</div>
					
					<div class="mb-3">
						<label for="exampleInputPassword1" class="form-label">Telefono:</label>
						<input type="text" class="form-control" name="telefono">
					</div>
			
					<div class="mb-3">
						<label for="exampleInputEmail1" class="form-label">Cursos:</label>
						<select class="form-select" aria-label="Default select example" name="idCurso">
							<option selected>Selecciona un Curso</option>
							<%
							for(CursoDTO dto: cursos) {
							%>							
								<option value="<%= dto.getIdCurso()%>"> <%= dto.getDescripcion()%> </option>
							<%
							}
							%>		
						</select>
					</div>
					
					<div class="mb-3">
						<label for="exampleInputEmail1" class="form-label">Formas de Pago:</label>
						<select class="form-select" aria-label="Default select example" name="idFormaPago">
							<option selected>Selecciona una Forma de Pago</option>
							<%
							for(FormaPagoDTO dto: formasPago) {
							%>							
								<option value="<%= dto.getIdFromaPago()%>"> <%= dto.getDescripcion()%> </option>
							<%
							}
							%>
						</select>
					</div>					
					
					<button type="submit" class="btn btn-primary">Enviar</button>
		
				</form>
				
			</div>
		</div>

	
  		
	
	
	


		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>	
	</body>
</html>