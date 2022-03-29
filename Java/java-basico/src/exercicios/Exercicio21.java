package exercicios;

import javax.swing.JOptionPane;

/**
 * Custo do ve�culo
 * 
 * @author Willian Gomes
 * @since 05/02/2021
 */
public class Exercicio21 {

	/*
	 * M�todo principal para a execu��o do programa
	 */

	public static void main(String[] args) {
		// Declara��o das vari�veis
		Double cfab, cporc, cimp, cfinal;

		// Leitura dos valores
		cfab = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de f�brica do ve�culo: "));

		// C�lculo dos impostos
		cporc = cfab * 0.28;
		cimp = cfab * 0.45;
		cfinal = cfab + cimp + cporc;

		// Impress�o em tela
		JOptionPane.showMessageDialog(null, "O custo final do ve�culo � de: R$" + cfinal);

	}

}
