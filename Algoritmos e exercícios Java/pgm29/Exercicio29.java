package exercicios;

import javax.swing.JOptionPane;

/**
 * Peso sandu�ches
 * 
 * @author Willian Gomes
 * @since 08/02/2021
 */
public class Exercicio29 {

	/*
	 * M�todo principal para a execu��o do programa
	 */
	public static void main(String[] args) {
		// Declara��o de vari�veis
		double qtdsd, vtotal;

		// Leitura do n�mero de sandu�ches
		qtdsd = Double.parseDouble(JOptionPane.showInputDialog("Qual a quantidade de sandu�ches?"));

		// C�lculo e convers�o de gramas para quilogramas
		vtotal = ((qtdsd * 250) / 1000);

		// Impress�o em tela
		JOptionPane.showInternalMessageDialog(null,
				"O peso total de queijo, presunto e hamb�rguer �: " + vtotal + " kg.");

	}

}
