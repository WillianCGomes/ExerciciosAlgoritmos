package exemplo01;

import javax.swing.JOptionPane;

/**
 * Programa para representar concatenação de texto em uma variável String
 * @author Willian Gomes
 * @since 08/02/2021
 */
public class ConcatenarTexto {

	/* 
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		
		// declarando as variáveis
		String auxiliar;
		
		auxiliar = "Bem vindo,";
		auxiliar += " meus queridos";
		auxiliar += " a aula de demonstração";
		auxiliar += " com variável String!";
		
		JOptionPane.showMessageDialog(null, auxiliar);
		

	}

}
