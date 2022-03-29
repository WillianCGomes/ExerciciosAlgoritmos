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
	 * Método principal para a execução da classe
	 */

	public static void main(String[] args) {
		// Declarações de variáveis
		double v1, v2;

		// Leitura dos valores
		v1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro valor:"));
		v2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo valor:"));

		// Verificação através de condicionais
		if (v1 < v2) {
			JOptionPane.showMessageDialog(null, "A ordem crescente é: " + v1 + ", " + v2 + "!");
		} else {
			JOptionPane.showMessageDialog(null, "A ordem crescente é: " + v2 + ", " + v1 + "!");
		}
	}

}
