<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<!-- Escribiendo SCRIPTS con java llamados Scriplets -->
	<h1>Ejemplo de Scriplet</h1>
	
	<%
		for(int i = 0; i < 10; i++) {
			out.println("<br> Este es el mensaje " + i); 
			
		}
	%>
	

</body>
</html>