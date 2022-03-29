package exercicios;

import javax.swing.JOptionPane;

/**
 * Receber idade, altura e peso
 * 
 * @author Willian Gomes
 * @since 05/02/2021
 */
public class Exercicio07 {

	/*
	 * M�todo principal para executar o programa
	 */

	public static void main(String[] args) {

		// Declarando vari�veis
		Double altura, peso;
		int idade;

		// Atribui��es dos valores �s vari�veis
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: "));
		peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso: "));

		// Impress�o em tela
		System.out.println("Sua idade �: " + idade + ".");
		System.out.println("Sua altura �: " + altura + ".");
		System.out.println("Seu peso: " + peso + ".");

	}

}
