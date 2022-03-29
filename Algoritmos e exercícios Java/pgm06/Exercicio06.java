package exercicios;

import javax.swing.JOptionPane;

/**
 * Receber nome, celular e cidade
 * 
 * @author Willian Gomes
 * @since 05/02/2021
 */
public class Exercicio06 {

	/*
	 * Método principal para executar o programa
	 */

	public static void main(String[] args) {

		// Declarando variáveis
		String nome, celular, cidade;

		// Atribuições dos valores às variáveis
		nome = JOptionPane.showInputDialog("Digite seu nome: ");
		celular = JOptionPane.showInputDialog("Digite seu celular: ");
		cidade = JOptionPane.showInputDialog("Digite sua cidade: ");

		// Impressão em tela
		System.out.println("Seu nome é: " + nome + ".");
		System.out.println("Seu celular é: " + celular + ".");
		System.out.println("Sua cidade é: " + cidade + ".");

	}

}
