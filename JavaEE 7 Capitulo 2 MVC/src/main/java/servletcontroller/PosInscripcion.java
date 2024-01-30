package servletcontroller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.InscripcionDTO;
import facade.Facade;

/**
 * Servlet implementation class PosInscripcion
 */
@WebServlet("/posInscripcion")
public class PosInscripcion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PosInscripcion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// obtengo los datos del formulario
		String nombre = request.getParameter("nombre");
		String telefono = request.getParameter("telefono");
		
		// los parametros siempre son cadenas
		int idCurso = Integer.parseInt(request.getParameter("idCurso"));
		int idFormaPago= Integer.parseInt(request.getParameter("idFormaPago"));

		// instancio el DTO  y le asigno los datos
		InscripcionDTO dto = new InscripcionDTO();
		dto.setIdCurso(idCurso);
		dto.setNombre(nombre);
		dto.setTelefono(telefono);
		dto.setIdFormaPago(idFormaPago);
		
		// ivoco al facade para procesar la inscripcion
		Facade f = new Facade();
		int idInsc = f.registrarInscripcion(dto);
		
		// adjunto el resultado como atributo en el request
		request.setAttribute("idInsc", idInsc);
		
		// redirecciono a la siguiente vista, es decir: hacia su servlet de pre-procesamiento
		request.getRequestDispatcher("/preConfirmacion").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
