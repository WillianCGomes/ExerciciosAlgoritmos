package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular valor em reais
 * 
 * @author Willian Gomes
 * @since 08/02/2021
 */
public class Exercicio33 {

	/*
	 * M�todo principal para a execu��o do programa
	 */
	public static void main(String[] args) {
		// Declara��es de vari�veis
		double ucent, cicent, dcent, vincent, cincent, ureal, vtotal;

		ucent = Double.parseDouble(JOptionPane.showInputDialog("Qual a quantidade de moedas de 1 centavo?"));
		cicent = Double.parseDouble(JOptionPane.showInputDialog("Qual a quantidade de moedas de 5 centavos?"));
		dcent = Double.parseDouble(JOptionPane.showInputDialog("Qual a quantidade de moedas de 10 centavos?"));
		vincent = Double.parseDouble(JOptionPane.showInputDialog("Qual a quantidade de moedas de 25 centavos?"));
		cincent = Double.parseDouble(JOptionPane.showInputDialog("Qual a quantidade de moedas de 50 centavo?"));
		ureal = Double.parseDouble(JOptionPane.showInputDialog("Qual a quantidade de moedas de 1 real?"));

		// C�lculo do valor total e convers�o dos centavos para real
		vtotal = ((ucent * 1) / 100) + ((cicent * 5) / 100) + ((dcent * 10) / 100) + ((vincent * 25) / 100)
				+ ((cincent * 50) / 100) + (ureal * 1);

		// Impress�o em tela
		JOptionPane.showMessageDialog(null, "O valor economizado foi de: R$" + vtotal);
	}

}
