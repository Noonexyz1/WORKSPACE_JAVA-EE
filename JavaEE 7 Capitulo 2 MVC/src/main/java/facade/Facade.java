package facade;

import java.util.List;
import dao.*;

public class Facade {

	public List<CursoDTO> obtenerCursos() {
		//en el codigo del libro creo esta mal
		CursoDAO dao = new CursoDAO();
		return dao.getCursos();
		
	}
	
	public List<FormaPagoDTO> obtenerFormasPago() {
		//aqui tambien esta mal! (CORREGIR EL LIBRO)
		FormaPagoDAO dao = new FormaPagoDAO();
		return dao.getFormasPago();
		
	}

	//los metodos son servicios
	public int registrarInscripcion(InscripcionDTO dto) {
		//Haciendo uso de mi mi capa de Acceso a Datos
		InscripcionDAO dao = new InscripcionDAO();
		return dao.insertar(dto);
		
	}
	
	
}
