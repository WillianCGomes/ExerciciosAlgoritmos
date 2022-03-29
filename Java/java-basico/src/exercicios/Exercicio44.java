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
	 * M�todo principal para a execu��o da classe
	 */

	public static void main(String[] args) {
		// Declara��es de vari�veis
		double hrt, vhr, hextra, salariop, salarioe;

		// Leitura das horas trabalhadas e valor do sal�rio
		hrt = Double.parseDouble(JOptionPane.showInputDialog("Digite as horas trabalhadas no m�s:"));
		vhr = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor das horas:"));

		salariop = (hrt * vhr);

		// In�cio das condicionais de c�lculo
		if (hrt > 160) {
			hextra = (hrt - 160);
			salarioe = (vhr * 0.5 * hextra) + salariop;
			JOptionPane.showMessageDialog(null, "Seu sal�rio ser� de: " + salarioe);
		} else {
			JOptionPane.showMessageDialog(null, "Seu sal�rio ser� de: R$" + salariop);
		}
	}

}
