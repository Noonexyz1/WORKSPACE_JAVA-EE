package modelo;

import dao.UsuarioDAO;
import dao.UsuarioDTO;

public class Modelo {
	
	// Atributos
	
	// Metodos
	public void insertarUsuario(String nombreUsuario, String contrasena) {
		// generar el Usuario 
		UsuarioDTO usuarioNuevo = new UsuarioDTO();
		//usuarioNuevo.setId(id);
		usuarioNuevo.setUsuario(nombreUsuario);
		usuarioNuevo.setContrasena(contrasena);
		
		// insertar usuario
		UsuarioDAO usuarioNuevoDao = new UsuarioDAO();
		usuarioNuevoDao.insertarUsuarioNuevo(usuarioNuevo);
		
	}
	
	
}
