package exercicios;

import javax.swing.JOptionPane;

/**
 * Convers�o de d�lar para real
 * 
 * @author Willian Gomes
 * @since 05/02/2021
 */
public class Exercicio20 {

	/*
	 * M�todo principal para a execu��o do programa
	 */
	public static void main(String[] args) {
		// Declara��o das vari�veis
		Double vconvertido, vinicio;

		// Leitura do valor
		vinicio = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor em d�lar: "));
		vconvertido = vinicio * 6.61;

		// Impress�o em tela
		JOptionPane.showMessageDialog(null, "O valor informado em d�lar equivale a R$" + vconvertido + ".");
	}

}
