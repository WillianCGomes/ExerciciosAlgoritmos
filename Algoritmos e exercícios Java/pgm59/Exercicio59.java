package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para verificar o valor de frutas e verduras a serem pagos
 * 
 * @author Willian Gomes
 * @since 09/02/2021
 */
public class Exercicio59 {
	/*
	 * Método principal para a execução da classe
	 */
	public static void main(String[] args) {

// Declarações de variáveis
		double mckg, mokg, pre_mc, pre_mo, pre_total, kgtotal;

		// leitura do peso adquirido em maças e morangos
		mokg = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso de morangos comprados (em quilogramas):"));
		mckg = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso de morangos comprados (em quilogramas):"));

		// Condicional para o desconto de frutas acima de 5kg
		if (mckg > 5) {
			pre_mc = (mckg * 2.20);
		} else {
			pre_mc = (mckg * 2.50);
		}

		if (mokg > 5) {
			pre_mo = (mckg * 1.50);
		} else {
			pre_mo = (mckg * 1.80);
		}

		// Cálculo do preço total e peso total
		pre_total = (pre_mc + pre_mo);
		kgtotal = (mckg + mokg);

		// Condicional para o desconto de frutas acima de 8kg ou valor superior a
		// R$25,00
		if ((pre_total > 25) || (kgtotal > 8)) {
			pre_total = (pre_total * 0.90);
		}
		// Impressão em tela
		JOptionPane.showMessageDialog(null, "O valor a ser pago será de: R$" + pre_total + ".");
	}

}
