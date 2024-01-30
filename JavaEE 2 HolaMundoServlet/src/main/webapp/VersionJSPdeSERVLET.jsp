<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<%
	// aqui programamos en Java
	String sDesde = request.getParameter("desde");
	String sHasta = request.getParameter("hasta");

	int desde = Integer.parseInt(sDesde);
	int hasta = Integer.parseInt(sHasta);	
	
%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%  // volvemos a programar
		for(int i = desde; i < hasta; i++){
	%>
			<%=
				i
			%><br>	
		
	<%
		}
	%>	
	

</body>
</html>