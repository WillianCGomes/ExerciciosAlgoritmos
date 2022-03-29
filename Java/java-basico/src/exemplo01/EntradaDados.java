
package exemplo01;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar entrada de dados fornecida pelo usu�rios
 * 
 * @author Willian Carlos Gomes
 * @since 05/02/2021
 */
public class EntradaDados {

	/*
	 * M�todo Principal para a execu��o
	 */
	public static void main(String[] args) {
		// declarando vari�veis
		String nome;

		// Atribuindo valor � vari�vel nome
		nome = JOptionPane.showInputDialog("Digite o seu nome");

		// Exibindo dados no console
		System.out.println("Seu nome �: " + nome + ".");
	}

}
