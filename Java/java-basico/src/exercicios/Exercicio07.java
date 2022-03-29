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
	 * Método principal para executar o programa
	 */

	public static void main(String[] args) {

		// Declarando variáveis
		Double altura, peso;
		int idade;

		// Atribuições dos valores às variáveis
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: "));
		peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso: "));

		// Impressão em tela
		System.out.println("Sua idade é: " + idade + ".");
		System.out.println("Sua altura é: " + altura + ".");
		System.out.println("Seu peso: " + peso + ".");

	}

}
