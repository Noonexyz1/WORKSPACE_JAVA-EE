package negocio;

import dao.UsuarioDAO;
import dao.UsuarioDTO;

public class Negocio {
	
	private boolean estado;
	
	public void validarUsuario(String usuario, String contrasena) {
		// construir mi objeto DTO Usuario
		UsuarioDTO usuarioDTO = new UsuarioDTO();
		usuarioDTO.setUsuario(usuario);
		usuarioDTO.setContrasena(contrasena);
		System.out.println("Negocio.validarUsuario()" + usuarioDTO.toString());
		
		//enviamos el objetos a la capa de DAOS
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		estado = usuarioDAO.validarUsuarioDAO(usuarioDTO);
		System.out.println("Negocio.validarUsuario() estado: " + estado);
		
	}
	
	public boolean isSecionExitosa() {
		System.out.println("Negocio.isSecionExitosa() El estado es: " + estado);
		
		return this.estado;
	}
	
	
}
