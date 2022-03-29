package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para informar se o valor � positivo ou negativo
 * 
 * @author Willian Gomes
 * @since 09/02/2021
 */
public class Exercicio37 {
	/*
	 * M�todo principal para a execu��o da classe
	 */

	public static void main(String[] args) {
		// Declara��o de vari�vel
		double valor;
		
		//Leitura do valor informado
		valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor:"));

		//Condicional composta para a verifica��o
		if (valor >= 0) {
			JOptionPane.showMessageDialog(null, "O valor informado � positivo");
		} else {
			JOptionPane.showMessageDialog(null, "O valor informado � negativo");
		}

	}

}
