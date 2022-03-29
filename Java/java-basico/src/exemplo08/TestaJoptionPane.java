package exemplo08;

import javax.swing.JOptionPane;

/**
 * Classe para demonstrar a utilização do componente JOptionPane acessando
 * atributos estáticos
 * 
 * @author Willian Carlos Gomes
 * @since 23 de fev. de 2021
 */
public class TestaJoptionPane {

	/**
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		
		

		// Utilizando o JOptionPane com o construtor para exibição de mensagem de erro
//		JOptionPane.showMessageDialog(null, "Conteúdo", "Título", 0); // 0 - Código do ícone de erro

		// Utilizando o JOptionPane com o construtor para exibição de mensagem de informação
		JOptionPane.showMessageDialog(null, Mensagem.sucessoIncluido, Titulo.cadastroUsuario, 1); // 1 - Código do ícone de info

		// Utilizando o JOptionPane com o construtor para exibição de mensagem de advertência
//		JOptionPane.showMessageDialog(null, "Conteúdo", "Título", 2); // 2 - Código do ícone de erro

		// Utilizando o JOptionPane com o construtor para exibição de mensagem de dúvida
//		JOptionPane.showMessageDialog(null, "Conteúdo", "Título", 3); // 3 - Código do ícone de erro
	}

}
