package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class InscripcionDAO {

	public int insertar(InscripcionDTO dto) {
		//el query para obtener la secuencia
		String s1 = "SELECT MAX(id_inscripcion) + 1 FROM inscripcion";
		
		//Para hacer el insert del nuevo registro
		String s2 = "INSERT INTO inscripcion VALUES (?, ?, ?, ?, ?)";

		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inscripcion", "root", ""); 
			PreparedStatement ps1 = con.prepareStatement(s1);
			ResultSet rs = ps1.executeQuery();
				
			PreparedStatement ps2 = con.prepareStatement(s2); ) {
		
			//revisar este codigo!
			int max = rs.getRow();
			System.out.println("InscripcionDAO.insertar() valor de MAX es: " + max);
			
			max = max + 1;
			System.out.println("InscripcionDAO.insertar() valor de MAX es: " + max);
			
			if (rs.next()) { 
				ps2.setInt(1, max); 
				ps2.setString(2, dto.getNombre()); 
				ps2.setString(3, dto.getTelefono()); 
				ps2.setInt(4, dto.getIdCurso()); 
				ps2.setInt(5, dto.getIdFormaPago()); 
				
				if (ps2.executeUpdate() != 1) {
					throw new RuntimeException("Error...");
					
				}
				
				
			}
			
			return max;
			
		} catch (Exception e) {
			System.out.println("InscripcionDAO.insertar()");
			e.printStackTrace();
			throw new RuntimeException(e);
			
		}
		
		
	}
	
}
