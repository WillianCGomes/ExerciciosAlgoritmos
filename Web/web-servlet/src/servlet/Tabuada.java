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
 * Classe responsável por demonstrar a utilização de servlet e criar uma tela de tabuada
 * @author Willian Carlos Gomes
 * @since 23/04/2021
 * @version 1.0
 */
public class Tabuada extends HttpServlet {

		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			// capturando a referência do objeto de escrita de HTML - objeto resp
			PrintWriter tela = resp.getWriter();

			// desenhando uma tela HTML
			tela.println("<html>");
			tela.println("<head>");
			tela.println("<title>Tabuada</title>");
			tela.println("</head>");
			tela.println("<body>");
			tela.println("<h1> Tabuada do 7 </h1> <br>");
			
			for (int i = 0; i <= 10; i++) {
				tela.print("7 x " + i + " = " + (i*7) + "<br>");
			}
			
			tela.println("<br>");
			tela.println("<a href='http://localhost:8080/web-servlet/'>Página Principal</a>");

			tela.println("</body>");
			tela.println("</html>");
		
		}
}
