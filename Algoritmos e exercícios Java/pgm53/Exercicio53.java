package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para verificar valores em ordem decrescente
 * 
 * @author Willian Gomes
 * @since 09/02/2021
 */
public class Exercicio53 {
	/*
	 * M�todo principal para a execu��o da classe
	 */

	public static void main(String[] args) {

		// Declara��es de vari�veis {
		int A, B, C;

		// leitura dos valores
		A = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
		B = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));
		C = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro valor"));

		// Condicionais compostas e c�lculo
		if ((A < B) && (B < C) && (C > A) && (C > B)) {
			JOptionPane.showMessageDialog(null,
					"A ordem decrescente dos n�meros informados �: " + C + ", " + B + ", " + A);
		} else if ((A < B) && (A < C) && (B > A) && (B > C)) {
			JOptionPane.showMessageDialog(null,
					"A ordem decrescente dos n�meros informados �: " + B + ", " + C + ", " + A);
		} else if ((A > B) && (A < C) && (B < C) && (C > A)) {
			JOptionPane.showMessageDialog(null,
					"A ordem decrescente dos n�meros informados �: " + C + ", " + A + ", " + B);
		} else if ((C < A) && (C < B) && (B > C) && (B > A)) {
			JOptionPane.showMessageDialog(null,
					"A ordem decrescente dos n�meros informados �: " + B + ", " + A + ", " + C);
		} else if ((C < A) && (C < B) && (B < A) && (B > C)) {
			JOptionPane.showMessageDialog(null,
					"A ordem decrescente dos n�meros informados �: " + A + ", " + B + ", " + C);
		} else if ((A > B) && (A > C) && (B < C) && (C < A)) {
			JOptionPane.showMessageDialog(null,
					"A ordem decrescente dos n�meros informados �: " + A + ", " + C + ", " + B);
		}
	}
}