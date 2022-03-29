package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular horas extras
 * 
 * @author Willian Gomes
 * @since 09/02/2021
 */
public class Exercicio44 {
	/*
	 * Método principal para a execução da classe
	 */

	public static void main(String[] args) {
		// Declarações de variáveis
		double hrt, vhr, hextra, salariop, salarioe;

		// Leitura das horas trabalhadas e valor do salário
		hrt = Double.parseDouble(JOptionPane.showInputDialog("Digite as horas trabalhadas no mês:"));
		vhr = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor das horas:"));

		salariop = (hrt * vhr);

		// Início das condicionais de cálculo
		if (hrt > 160) {
			hextra = (hrt - 160);
			salarioe = (vhr * 0.5 * hextra) + salariop;
			JOptionPane.showMessageDialog(null, "Seu salário será de: " + salarioe);
		} else {
			JOptionPane.showMessageDialog(null, "Seu salário será de: R$" + salariop);
		}
	}

}
