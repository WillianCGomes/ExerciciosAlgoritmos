package exercicios;

import javax.swing.JOptionPane;

/**
 * Peso sanduíches
 * 
 * @author Willian Gomes
 * @since 08/02/2021
 */
public class Exercicio29 {

	/*
	 * Método principal para a execução do programa
	 */
	public static void main(String[] args) {
		// Declaração de variáveis
		double qtdsd, vtotal;

		// Leitura do número de sanduíches
		qtdsd = Double.parseDouble(JOptionPane.showInputDialog("Qual a quantidade de sanduíches?"));

		// Cálculo e conversão de gramas para quilogramas
		vtotal = ((qtdsd * 250) / 1000);

		// Impressão em tela
		JOptionPane.showInternalMessageDialog(null,
				"O peso total de queijo, presunto e hambúrguer é: " + vtotal + " kg.");

	}

}
