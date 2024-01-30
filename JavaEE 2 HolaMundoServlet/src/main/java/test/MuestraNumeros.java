package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MuestraNumeros
 */
@WebServlet("/muestraNumeros")
public class MuestraNumeros extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MuestraNumeros() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// los parametros siempre son cadenas
		String sDesde = request.getParameter("desde");
		String sHasta = request.getParameter("hasta");
		
		// convertimos en enteros
		int desde = Integer.parseInt(sDesde);
		int hasta = Integer.parseInt(sHasta);
		
		PrintWriter out = response.getWriter();
		out.println("<html> <body>");
			
			for(int i = desde; i < hasta; i++) {
				out.println(i + "</br>");
				
			}
			
		out.println("</body> </html>");
		out.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
