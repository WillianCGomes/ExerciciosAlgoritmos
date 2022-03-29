package exercicios;

import javax.swing.JOptionPane;

/**
 * Receber e exibir o salario e vr
 * 
 * @author Willian Gomes
 * @since 05/02/2021
 */
public class Exercicio08 {

	/*
	 * Método principal para executar o programa
	 */

	public static void main(String[] args) {

		// Declarando variáveis
		Double salario, vr;


		// Atribuições dos valores às variáveis
		salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salário: "));
		vr = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do seu vale refeição: "));
		
		// Impressão em tela
		System.out.println("Seu salário é: " + salario + ".");
		System.out.println("Seu vale refeição é: " + vr + ".");

	}

}
