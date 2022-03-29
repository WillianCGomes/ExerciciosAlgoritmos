package exercicios;

import javax.swing.JOptionPane;

/**
 * Cálculo de maçãs
 * 
 * @author Willian Gomes
 * @since 09/02/2021
 */
public class Exercicio38 {
	/*
	 * Método principal para a execução da classe
	 */

	public static void main(String[] args) {
		// Declaração de variável
		int qtd;

		// Leitura da quantidade de maçãs compradas
		qtd = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade de maçãs compradas?"));

		// Condicionais
		if (qtd >= 12) {
			JOptionPane.showMessageDialog(null, "O valor total será de: " + (qtd * 1.00) + " reais.");
		}

		if (qtd < 12) {
			JOptionPane.showMessageDialog(null, "O valor total será de: " + (qtd * 1.30) + " reais.");
		}

	}

}
