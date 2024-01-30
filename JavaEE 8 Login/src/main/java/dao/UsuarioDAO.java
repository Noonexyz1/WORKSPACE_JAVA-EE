package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import negocio.Negocio;


public class UsuarioDAO {

	private EntityManager entidad;
	
	// Constructor
	public UsuarioDAO() {
		this.entidad = JPAUtil.getFabricaManejadorEntidades().createEntityManager();
	
	}
	
	// buscar cliente
	public UsuarioDTO buscar(int id) {
		UsuarioDTO user = new UsuarioDTO();
		user = entidad.find(UsuarioDTO.class, id);
		JPAUtil.cerrar();
		
		return user;
	}
	
	// obtener usuario buscado
	@SuppressWarnings("unchecked")
	public boolean validarUsuarioDAO(UsuarioDTO usuarioN) {
		String senetenciaSQL = "SELECT * FROM user WHERE usuario LIKE '" + usuarioN.getUsuario() + "' AND contrasena LIKE '" + usuarioN.getContrasena() + "'";
		
		List<UsuarioDTO> users = new ArrayList<>();
		System.out.println("UsuarioDAO.validarUsuarioDAO() + ANTES de QUERY");
		Query q = entidad.createNativeQuery(senetenciaSQL);
		System.out.println("UsuarioDAO.validarUsuarioDAO() + DESPUES de QUERY");
		users = q.getResultList();
		
		if (users != null) {
			return true;
			
		} else {
			return false;
			
		}
		
	}
	
	
	 
	//**************************************************************************
	/*
	/* A momento de instanciar un UsuarioDAO, automaticamente se ejecutara el constructor,
	 * mas el constructor PADRE super() */
	
	/*public UsuarioDAO() {
		super();
		// y con esto ya tenemos inicializado nuestro objeto CON
		// Este constructor puedes ser implicito tambien, cuando se hace Herencia
	} */
	
	
	/*public void validarUsuarioDAO(UsuarioDTO usuarioDTO) {
		// sentencia sql
		String busqueda = "SELECT * FROM usuario WHERE usuario LIKE " + usuarioDTO.getUsuario() + " AND contrasena LIKE " + usuarioDTO.getContrasena();
		System.out.println("UsuarioDAO.validarUsuarioDAO() Sentencia");
		
		// ejecutar la sentencia
		try {
			PreparedStatement sentencia = con.prepareStatement(busqueda);
			ResultSet rs = sentencia.executeQuery();
			
			if (rs.getRow() == 0) {
				System.out.println("UsuarioDAO.validarUsuarioDAO() no existe");
			}
			
		} catch (Exception e) {
			System.out.println("UsuarioDAO.validarUsuarioDAO() DENTRO DEL CATCH");
			
		}
		
		
		
		
	}*/
	
}
