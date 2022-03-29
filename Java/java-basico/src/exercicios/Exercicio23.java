package exercicios;

import javax.swing.JOptionPane;

/**
 * Convers�o da unidade de medida de temperatura
 * 
 * @author Willian Gomes
 * @Since 05/02/2021
 */
public class Exercicio23 {

	/*
	 * M�todo principal para a execu��o do programa
	 */

	public static void main(String[] args) {
		// Declara��es das vari�veis
		Double ctemp, ftemp;

		// Leitura dos valores das vari�veis
		ftemp = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em graus Fahrenheit:"));

		// C�lculo da convers�o
		ctemp = (((ftemp - 32) * 5) / 9);

		// Impress�o do resultado em tela
		JOptionPane.showMessageDialog(null, "A convers�o resultou em " + ctemp + " graus Celsius.");
	}

}
