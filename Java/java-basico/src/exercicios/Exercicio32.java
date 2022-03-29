package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular quantidade de refrigerante
 * 
 * @author Willian Gomes
 * @since 08/02/2021
 */
public class Exercicio32 {

	/*
	 * M�todo principal para a execu��o do programa
	 */
	public static void main(String[] args) {
		// Declara��es de vari�veis
		double r350, r600, r2000, rtotal;

		// Leitura do n�mero de refrigerantes de cada categoria
		r350 = Double
				.parseDouble(JOptionPane.showInputDialog("Informe a quantidade comprada de refrigerantes de 350ml:"));
		r600 = Double
				.parseDouble(JOptionPane.showInputDialog("Informe a quantidade comprada de refrigerantes de 600ml:"));
		r2000 = Double.parseDouble(
				JOptionPane.showInputDialog("Informe a quantidade comprada de refrigerantes de 2 litros:"));

		// C�lculo e convers�o para litros
		rtotal = ((r350 * 350) / 1000) + ((r600 * 600) / 1000) + (r2000 * 2);

		// Impress�o em tela
		JOptionPane.showMessageDialog(null, "A quantidade de litros comprada foi de: " + rtotal + " litros.");

	}

}
