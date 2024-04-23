

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class RecuperaraDados
 */
public class RecuperaraDados extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RecuperaraDados() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String idade = request.getParameter("idade");
		String [] escolas = request.getParameterValues("ondeestuda");
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Olá " + nome +"</h1>");
		out.println("<h2>Você tem " + idade + " anos</h2>");
		out.println("<img src='https://media.tenor.com/c_jwHyCNwwQAAAAM/what-the-hell.gif'>");
		for(int x = 0; x < escolas.length;x++) {
			out.println("<p> Vc estuda na  " + escolas[x] + "</p>");
			if(escolas[x] == "USP") {
				out.println("Que inteligente");
			}
		}
		out.println("</body>");
		out.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
