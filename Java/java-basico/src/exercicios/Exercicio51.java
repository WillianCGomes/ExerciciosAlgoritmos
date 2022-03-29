package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para multiplicar os 2 menores valores
 * 
 * @author Willian Gomes
 * @since 09/02/2021
 */
public class Exercicio51 {
	/*
	 * M�todo principal para a execu��o da classe
	 */

	public static void main(String[] args) {

		// Declara��es de vari�veis
		Double v1, v2, v3, mult;

		// Leitura dos valores
		v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor"));
		v2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor"));
		v3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro valor"));

		// Condicionais compostas e c�lculo
		if ((v1 < v2) && (v2 < v3) || (v2 < v1) && (v1 < v3)) {
			mult = (v1 * v2);
			JOptionPane.showMessageDialog(null, "A multiplica��o dos 2 primeiros valores foi de: " + mult);
		} else if ((v3 < v1) && (v1 < v2) || (v1 < v3) && (v3 < v2)) {
			mult = (v1 * v3);
			JOptionPane.showMessageDialog(null, "A multiplica��o do primeiro e �ltimo valor foi de: " + mult);
		} else {
			mult = (v2 * v3);
			JOptionPane.showMessageDialog(null, "A multiplica��o dos 2 �ltimos valores foi de: " + mult);
		}

	}

}
