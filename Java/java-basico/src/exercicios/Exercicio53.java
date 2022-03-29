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
	 * Método principal para a execução da classe
	 */

	public static void main(String[] args) {

		// Declarações de variáveis {
		int A, B, C;

		// leitura dos valores
		A = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
		B = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));
		C = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro valor"));

		// Condicionais compostas e cálculo
		if ((A < B) && (B < C) && (C > A) && (C > B)) {
			JOptionPane.showMessageDialog(null,
					"A ordem decrescente dos números informados é: " + C + ", " + B + ", " + A);
		} else if ((A < B) && (A < C) && (B > A) && (B > C)) {
			JOptionPane.showMessageDialog(null,
					"A ordem decrescente dos números informados é: " + B + ", " + C + ", " + A);
		} else if ((A > B) && (A < C) && (B < C) && (C > A)) {
			JOptionPane.showMessageDialog(null,
					"A ordem decrescente dos números informados é: " + C + ", " + A + ", " + B);
		} else if ((C < A) && (C < B) && (B > C) && (B > A)) {
			JOptionPane.showMessageDialog(null,
					"A ordem decrescente dos números informados é: " + B + ", " + A + ", " + C);
		} else if ((C < A) && (C < B) && (B < A) && (B > C)) {
			JOptionPane.showMessageDialog(null,
					"A ordem decrescente dos números informados é: " + A + ", " + B + ", " + C);
		} else if ((A > B) && (A > C) && (B < C) && (C < A)) {
			JOptionPane.showMessageDialog(null,
					"A ordem decrescente dos números informados é: " + A + ", " + C + ", " + B);
		}
	}
}