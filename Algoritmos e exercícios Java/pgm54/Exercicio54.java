package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para verificar se forma um tri�ngulo
 * 
 * @author Willian Gomes
 * @since 09/02/2021
 */
public class Exercicio54 {
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

		// Condicionais para verifica��o
		if ((A < B + C) && (B < A + C) && (C < A + B)) {
			JOptionPane.showMessageDialog(null, "Forma um tri�ngulo.");
		} else
			JOptionPane.showMessageDialog(null, "N�o forma um tri�ngulo.");
	}

}
