package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProcesaForm
 */
@WebServlet("/procesaForm")
public class ProcesaForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProcesaForm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// request via GET no lo acepto :( 
		 PrintWriter out = response.getWriter(); 
		 out.println("<html><body>"); 
		 
		 	out.println("Solo por POST, amigo..."); 
		 
		 out.println("</body></html>"); 
		 out.close(); 
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
		// obtengo los parametros
		String usr = request.getParameter("usr");
		String pwd = request.getParameter("pwd");
		String otro = request.getParameter("otroParam");
	
		// genero la pagina
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
			
			out.println("--Recibi esto parametros-- </br>");
			out.println("usr = " + usr + "</br>");
			out.println("pwd = " + pwd + "</br>");
			out.println("otroParam = " + otro + "</br>");

		out.println("<html><body>");
		out.close();
	
	}

}
