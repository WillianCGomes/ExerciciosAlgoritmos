package exercicios;

import javax.swing.JOptionPane;

/**
 * C�lculo de ma��s
 * 
 * @author Willian Gomes
 * @since 09/02/2021
 */
public class Exercicio38 {
	/*
	 * M�todo principal para a execu��o da classe
	 */

	public static void main(String[] args) {
		// Declara��o de vari�vel
		int qtd;

		// Leitura da quantidade de ma��s compradas
		qtd = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade de ma��s compradas?"));

		// Condicionais
		if (qtd >= 12) {
			JOptionPane.showMessageDialog(null, "O valor total ser� de: " + (qtd * 1.00) + " reais.");
		}

		if (qtd < 12) {
			JOptionPane.showMessageDialog(null, "O valor total ser� de: " + (qtd * 1.30) + " reais.");
		}

	}

}
