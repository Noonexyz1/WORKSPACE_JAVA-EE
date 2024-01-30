package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dto.CursoDTO;

public class CursoDAO {
	
	public List<CursoDTO> getCursos() {
		//el Query
		String sql = "SELECT * FROM curso"; 

		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inscripcion", "root", ""); 
			 PreparedStatement pstm = con.prepareStatement(sql); 
			 ResultSet rs = pstm.executeQuery() )
		{	
			List<CursoDTO> lst = new ArrayList<>();
			while (rs.next()) {
				CursoDTO dto = new CursoDTO();
				dto.setIdCurso(rs.getInt("id_curso"));
				dto.setDescripcion(rs.getString("descripcion"));
				dto.setPrecio(rs.getDouble("precio"));
				lst.add(dto);
				
			}
			
			return lst;
			
		} catch (Exception ex) {
			System.out.println("estoy en el cathc");
			ex.printStackTrace();
			throw new RuntimeException(ex);
			
		}
		
	}
	
	
}
