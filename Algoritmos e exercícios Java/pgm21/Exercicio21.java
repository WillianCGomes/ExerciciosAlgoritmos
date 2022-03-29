package exercicios;

import javax.swing.JOptionPane;

/**
 * Custo do veículo
 * 
 * @author Willian Gomes
 * @since 05/02/2021
 */
public class Exercicio21 {

	/*
	 * Método principal para a execução do programa
	 */

	public static void main(String[] args) {
		// Declaração das variáveis
		Double cfab, cporc, cimp, cfinal;

		// Leitura dos valores
		cfab = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de fábrica do veículo: "));

		// Cálculo dos impostos
		cporc = cfab * 0.28;
		cimp = cfab * 0.45;
		cfinal = cfab + cimp + cporc;

		// Impressão em tela
		JOptionPane.showMessageDialog(null, "O custo final do veículo é de: R$" + cfinal);

	}

}
