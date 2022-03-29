package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para verificar se forma um triângulo
 * 
 * @author Willian Gomes
 * @since 09/02/2021
 */
public class Exercicio54 {
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

		// Condicionais para verificação
		if ((A < B + C) && (B < A + C) && (C < A + B)) {
			JOptionPane.showMessageDialog(null, "Forma um triângulo.");
		} else
			JOptionPane.showMessageDialog(null, "Não forma um triângulo.");
	}

}
