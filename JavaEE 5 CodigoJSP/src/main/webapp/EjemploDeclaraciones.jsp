<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<!-- Ejemplo DECLARACIONES -->
	<h1>Ejemplo de Declaraciones</h1>
	
	<!-- como Clases -->
	<%!
		private int resultado;
		
		public int metodoSuma(int num1, int num2) {
			return num1 + num2;

		}
		
		public int metodoResta(int num1, int num2) {
			return num1 - num2;
	
		}
	
		public int metodoMultiplica(int num1, int num2) {
			return num1 * num2;
		
		}
	%>
	
	El resultado de la sumas es: <%= metodoSuma(7, 5) %> <br>
	El resultado de la resta es: <%= metodoResta(7, 5) %> <br>
	El resultado de la multiplicacion es: <%= metodoMultiplica(7, 5) %> <br>
	
	
	
	<%! //Declaraciones
		public class Diego {
			public String nombre = "Diego";	
		}
	%>
	
	<%  //Scriptlets
		Diego d = new Diego();
	%>
	
	<%= //Expresiones/Asignaciones
		"Mi nombre es: " + d.nombre %>
	

</body>
</html>