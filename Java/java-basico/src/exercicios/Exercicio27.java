package exercicios;

import javax.swing.JOptionPane;

/**
 * F�brica de camisetas
 * 
 * @author Willian Gomes
 * @since 08/02/2021
 */
public class Exercicio27 {

	/*
	 * Metodo principal para a execu��o do programa
	 */

	public static void main(String[] args) {
		// Declarando as vari�veis
		double pcamiseta, mcamiseta, gcamiseta, vtotal;

		// Obtendo informa��es do usu�rio
		pcamiseta = Double.parseDouble(JOptionPane.showInputDialog("Digite quantas camisetas pequenas deseja comprar"));
		mcamiseta = Double.parseDouble(JOptionPane.showInputDialog("Digite quantas camisetas m�dias deseja comprar"));
		gcamiseta = Double.parseDouble(JOptionPane.showInputDialog("Digite quantas camisetas grandes deseja comprar"));

		// Atribuindo valores para as vari�veis
		pcamiseta = pcamiseta * 10;
		mcamiseta = mcamiseta * 12;
		gcamiseta = gcamiseta * 15;

		// C�lculo para obter o valor total da compra
		vtotal = pcamiseta + mcamiseta + gcamiseta;

		// Resultado em tela
		JOptionPane.showMessageDialog(null, "O valor total arrecadado foi de R$" + vtotal);

	}

}
