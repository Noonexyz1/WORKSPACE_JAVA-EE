package dao;


public class Consultas extends Conexion {
	
	// Atributos Consultas
	protected String insertarUsuario = "INSERT INTO usuario(usuario, contrasena) VALUES(?, ?)";
	
}
