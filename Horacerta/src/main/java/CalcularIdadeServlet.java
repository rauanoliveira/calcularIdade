import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calcularIdade")
public class CalcularIdadeServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            int anoNascimento = Integer.parseInt(request.getParameter("anoNascimento"));
            String fezAniversario = request.getParameter("fezAniversario");

            int anoAtual = LocalDate.now().getYear();

            if ("nao".equals(fezAniversario)) {
                anoAtual -= 1;
            }

            int idade = anoAtual - anoNascimento;

            out.println("<html>");
            out.println("<head>");
            out.println("<title>Idade</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Idade Calculada:</h1>");
            out.println("<p>Ano de Nascimento: " + anoNascimento + "</p>");
            out.println("<p>Fez aniversário este ano? " + fezAniversario + "</p>");
            out.println("<p>Idade Atual: " + idade + " anos</p>");
            out.println("</body>");
            out.println("</html>");
        } catch (NumberFormatException e) {
            out.println("<p>Por favor, insira um ano de nascimento válido.</p>");
        } finally {
            out.close();
        }
    
}
}
