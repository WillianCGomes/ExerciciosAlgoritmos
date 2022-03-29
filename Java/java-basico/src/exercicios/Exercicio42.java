package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para escrever valores em ordem crescente
 * 
 * @author Willian Gomes
 * @since 09/02/2021
 */
public class Exercicio42 {
	/*
	 * M�todo principal para a execu��o da classe
	 */

	public static void main(String[] args) {
		// Declara��es de vari�veis
		double v1, v2;

		// Leitura dos valores
		v1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro valor:"));
		v2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo valor:"));

		// Verifica��o atrav�s de condicionais
		if (v1 < v2) {
			JOptionPane.showMessageDialog(null, "A ordem crescente �: " + v1 + ", " + v2 + "!");
		} else {
			JOptionPane.showMessageDialog(null, "A ordem crescente �: " + v2 + ", " + v1 + "!");
		}
	}

}
