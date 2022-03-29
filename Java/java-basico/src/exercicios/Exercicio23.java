package exercicios;

import javax.swing.JOptionPane;

/**
 * Conversão da unidade de medida de temperatura
 * 
 * @author Willian Gomes
 * @Since 05/02/2021
 */
public class Exercicio23 {

	/*
	 * Método principal para a execução do programa
	 */

	public static void main(String[] args) {
		// Declarações das variáveis
		Double ctemp, ftemp;

		// Leitura dos valores das variáveis
		ftemp = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em graus Fahrenheit:"));

		// Cálculo da conversão
		ctemp = (((ftemp - 32) * 5) / 9);

		// Impressão do resultado em tela
		JOptionPane.showMessageDialog(null, "A conversão resultou em " + ctemp + " graus Celsius.");
	}

}
