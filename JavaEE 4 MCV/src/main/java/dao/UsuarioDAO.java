package dao;

import java.sql.PreparedStatement;

public class UsuarioDAO extends Consultas {
	
	// Metodos
	public void insertarUsuarioNuevo(UsuarioDTO nuevoUsuario) {
		
		try {
			PreparedStatement sentencia = con.prepareStatement(insertarUsuario);
			//sentencia.setInt(1, nuevoUsuario.getId());
			sentencia.setString(1, nuevoUsuario.getUsuario());
			sentencia.setString(2, nuevoUsuario.getContrasena());
			
			if (sentencia.executeUpdate() != 1) {
				System.out.println("UsuarioDAO.insertarUsuarioNuevo()" + "if()" + "ERROR");

			}
			
		} catch (Exception e) {
			System.out.println("UsuarioDAO.insertarUsuarioNuevo()" + "ERROR");
			
		}
		
	}
	
	
}
