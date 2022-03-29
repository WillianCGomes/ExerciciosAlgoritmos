package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para informar se o valor é maior ou não que dez
 * 
 * @author Willian Gomes
 * @since 09/02/2021
 */
public class Exercicio36 {
	/*
	 * Método principal para a execução do programa
	 */

	public static void main(String[] args) {
		// Declarações de variáveis
		int valor;

		// Início das modificações
		valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor:"));

		if (valor > 10) {
			// Exibição em tela
			JOptionPane.showMessageDialog(null, "O valor informado é maior que dez!");
		} else {
			// Exibição em tela
			JOptionPane.showMessageDialog(null, "O valor informado não é maior que dez!");
		}
	}
}
