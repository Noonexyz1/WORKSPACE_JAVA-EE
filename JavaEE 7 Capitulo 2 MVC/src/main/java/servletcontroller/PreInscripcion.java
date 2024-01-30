package servletcontroller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CursoDTO;
import dao.FormaPagoDTO;
import facade.Facade;

/**
 * Servlet implementation class PreInscripcion
 */
@WebServlet("/preInscripcion")
public class PreInscripcion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PreInscripcion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// obtengo el Facade
		Facade f = new Facade();
		
		// obtengo las colecciones
		List<CursoDTO> cursos = f.obtenerCursos();
		List<FormaPagoDTO> formasPago = f.obtenerFormasPago();
		System.out.println("PreInscripcion.doGet()");
		
		// adjunto las colecciones al request
		request.setAttribute("cursos", cursos);
		request.setAttribute("formasPago", formasPago);
		
		// redirecciono el request a la pagina JSP
		request.getRequestDispatcher("inscripcion.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
