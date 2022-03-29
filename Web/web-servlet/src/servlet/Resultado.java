/**
 * 
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Classe respons�vel por demonstrar a utiliza��o de servlet e retornar o resultado para um c�lculo
 * 
 * @author Willian Carlos Gomes
 * @since 23/04/2021
 * @version 1.0
 */
public class Resultado extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// capturando a refer�ncia do objeto de escrita de HTML - objeto resp
		PrintWriter tela = resp.getWriter();

		double valor = Double.parseDouble(req.getParameter("btvalor"));
        double ajuste = Double.parseDouble(req.getParameter("btajuste"));
	   		    	
		
		// desenhando a tela HTML
		tela.println("<html>");
		tela.println("<head>");
		tela.println("<title>Resultado</title>");
		tela.println("</head>");
		tela.println("<body>");
		tela.println("<h1> Resultado do ajuste: </h1>");
		tela.println(valor + (valor*ajuste/100));
		tela.println("<br>");
		tela.println("<a href='http://localhost:8080/web-servlet/'>P�gina Principal</a>");
		tela.println("<br>");
		tela.println("<a href='http://localhost:8080/web-servlet/calculaajuste.html'>Realizar outro c�lculo</a>");
		tela.println("</body>");
		tela.println("</html>");

	}
}
