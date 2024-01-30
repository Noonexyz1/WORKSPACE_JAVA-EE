package dao;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {
	
	// Atributos
	private static final String USERNAME = "root";
	private static final String PASSWORD = "";
	private static final String HOST = "localhost";
	private static final String PORT = "3306";
	private static final String DATABASE = "mis_usuarios";
	private static final String CLASNAME = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DATABASE;;
	
	protected Connection con;
	
	
	// Constructor por Defecto Modificado
	public Conexion() {
		System.out.println("Conexion.Conexion() Hago mi conecxion");
		try {
			Class.forName(CLASNAME);
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			
		} catch (Exception ex) {
			System.out.println("Conexion.Conexion()" + " ERROR");
			
		}
		
	}
	
	
}
