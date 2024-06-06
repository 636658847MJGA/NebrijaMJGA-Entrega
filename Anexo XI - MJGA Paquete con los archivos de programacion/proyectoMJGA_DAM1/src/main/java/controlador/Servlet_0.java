package controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.ContraseniaEmpresa;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

/**
 * Servlet implementation class Servlet_0
 */
public class Servlet_0 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet_0() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, 
	HttpServletResponse response) 
	throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/* doGet(request, response);
		 * Desactivamos el método GET, puesto que
		 * queremos que todo se mande por POST
		 * dada la confidencialidad de los datos*/
		
		/**The request method obtains data via HTMl formular*/
		String empresaNIF = request.getParameter("empresaNIF");
		String empresaContrasenia = request.getParameter("empresaContrasenia");
		
		/* System.out.println("empresaNIF: "+empresaNIF+
						   " y empresaContrasenia :"+ empresaContrasenia);*/
		
		ContraseniaEmpresa a = new ContraseniaEmpresa (empresaNIF, empresaContrasenia);
		
		try {
			a.insertar();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error de conexión");
		}
		// System.out.println(a.toString());
		
		/** The method response show data in the web */ 
		PrintWriter respuesta = response.getWriter();
		respuesta.print(a.toString());
;	}

}
