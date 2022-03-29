package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para somar os 2 maiores valores
 * 
 * @author Willian Gomes
 * @since 09/02/2021
 */
public class Exercicio50 {
	/*
	 * M�todo principal para a execu��o da classe
	 */

	public static void main(String[] args) {

		// Declara��es de vari�veis
		Double v1, v2, v3, soma;

		// Leitura dos valores
		v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor"));
		v2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor"));
		v3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro valor"));

		// Condicionais compostas e c�lculo
		if ((v1 > v2) && (v2 > v3) || (v2 > v1) && (v1 > v3)) {
			soma = (v1 + v2);
			JOptionPane.showMessageDialog(null, "A soma dos 2 primeiros valores foi de: " + soma);
		} else if ((v3 > v1) && (v1 > v2) || (v1 > v3) && (v3 > v2)) {
			soma = (v1 + v3);
			JOptionPane.showMessageDialog(null, "A soma do primeiro e �ltimo valor foi de: " + soma);
		} else {
			soma = (v2 + v3);
			JOptionPane.showMessageDialog(null, "A soma dos 2 �ltimos valores foi de: " + soma);
		}
	}

}
