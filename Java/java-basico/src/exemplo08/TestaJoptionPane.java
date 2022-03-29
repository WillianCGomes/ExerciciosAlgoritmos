package exemplo08;

import javax.swing.JOptionPane;

/**
 * Classe para demonstrar a utiliza��o do componente JOptionPane acessando
 * atributos est�ticos
 * 
 * @author Willian Carlos Gomes
 * @since 23 de fev. de 2021
 */
public class TestaJoptionPane {

	/**
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		
		

		// Utilizando o JOptionPane com o construtor para exibi��o de mensagem de erro
//		JOptionPane.showMessageDialog(null, "Conte�do", "T�tulo", 0); // 0 - C�digo do �cone de erro

		// Utilizando o JOptionPane com o construtor para exibi��o de mensagem de informa��o
		JOptionPane.showMessageDialog(null, Mensagem.sucessoIncluido, Titulo.cadastroUsuario, 1); // 1 - C�digo do �cone de info

		// Utilizando o JOptionPane com o construtor para exibi��o de mensagem de advert�ncia
//		JOptionPane.showMessageDialog(null, "Conte�do", "T�tulo", 2); // 2 - C�digo do �cone de erro

		// Utilizando o JOptionPane com o construtor para exibi��o de mensagem de d�vida
//		JOptionPane.showMessageDialog(null, "Conte�do", "T�tulo", 3); // 3 - C�digo do �cone de erro
	}

}
