
package exemplo01;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar entrada de dados fornecida pelo usuários
 * 
 * @author Willian Carlos Gomes
 * @since 05/02/2021
 */
public class EntradaDados {

	/*
	 * Método Principal para a execução
	 */
	public static void main(String[] args) {
		// declarando variáveis
		String nome;

		// Atribuindo valor à variável nome
		nome = JOptionPane.showInputDialog("Digite o seu nome");

		// Exibindo dados no console
		System.out.println("Seu nome é: " + nome + ".");
	}

}
