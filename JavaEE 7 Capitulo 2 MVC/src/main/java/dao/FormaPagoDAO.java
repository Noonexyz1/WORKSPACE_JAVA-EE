package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class FormaPagoDAO {

	public List<FormaPagoDTO> getFormasPago() {
		
		//el Query
		String sql = "SELECT * FROM forma_pago";
		
		//ejecutando el Query
		//Class.forName("com.mysql.cj.jdbc.Driver");
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inscripcion", "root", ""); 
			 PreparedStatement pstm = con.prepareStatement(sql);
			 ResultSet rs = pstm.executeQuery() ) {
		
			List<FormaPagoDTO> lst = new ArrayList<>();
			while (rs.next()) {
				FormaPagoDTO dto = new FormaPagoDTO();
				dto.setIdFromaPago(rs.getInt("id_forma_pago"));
				dto.setDescripcion(rs.getString("descripcion"));
				dto.setRecargo(rs.getDouble("recargo"));
				lst.add(dto);
				
			}
			
			return lst;
			
		} catch (Exception e) {
			System.out.println("FormaPagoDAO.getFormasPago()");
			e.printStackTrace();
			throw new RuntimeException(e);
			
		}
		
	}
	
}
