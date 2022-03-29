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
	 * Método principal para a execução do programa
	 */
	public static void main(String[] args) {
		// Declarações de variáveis
		double r350, r600, r2000, rtotal;

		// Leitura do número de refrigerantes de cada categoria
		r350 = Double
				.parseDouble(JOptionPane.showInputDialog("Informe a quantidade comprada de refrigerantes de 350ml:"));
		r600 = Double
				.parseDouble(JOptionPane.showInputDialog("Informe a quantidade comprada de refrigerantes de 600ml:"));
		r2000 = Double.parseDouble(
				JOptionPane.showInputDialog("Informe a quantidade comprada de refrigerantes de 2 litros:"));

		// Cálculo e conversão para litros
		rtotal = ((r350 * 350) / 1000) + ((r600 * 600) / 1000) + (r2000 * 2);

		// Impressão em tela
		JOptionPane.showMessageDialog(null, "A quantidade de litros comprada foi de: " + rtotal + " litros.");

	}

}
