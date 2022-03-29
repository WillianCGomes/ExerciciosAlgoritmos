package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para informar se o valor � maior ou n�o que dez
 * 
 * @author Willian Gomes
 * @since 09/02/2021
 */
public class Exercicio36 {
	/*
	 * M�todo principal para a execu��o do programa
	 */

	public static void main(String[] args) {
		// Declara��es de vari�veis
		int valor;

		// In�cio das modifica��es
		valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor:"));

		if (valor > 10) {
			// Exibi��o em tela
			JOptionPane.showMessageDialog(null, "O valor informado � maior que dez!");
		} else {
			// Exibi��o em tela
			JOptionPane.showMessageDialog(null, "O valor informado n�o � maior que dez!");
		}
	}
}
