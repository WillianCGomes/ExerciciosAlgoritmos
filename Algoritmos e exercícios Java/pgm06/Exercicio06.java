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
	 * M�todo principal para executar o programa
	 */

	public static void main(String[] args) {

		// Declarando vari�veis
		String nome, celular, cidade;

		// Atribui��es dos valores �s vari�veis
		nome = JOptionPane.showInputDialog("Digite seu nome: ");
		celular = JOptionPane.showInputDialog("Digite seu celular: ");
		cidade = JOptionPane.showInputDialog("Digite sua cidade: ");

		// Impress�o em tela
		System.out.println("Seu nome �: " + nome + ".");
		System.out.println("Seu celular �: " + celular + ".");
		System.out.println("Sua cidade �: " + cidade + ".");

	}

}
