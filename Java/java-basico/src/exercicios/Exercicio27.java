package exercicios;

import javax.swing.JOptionPane;

/**
 * Fábrica de camisetas
 * 
 * @author Willian Gomes
 * @since 08/02/2021
 */
public class Exercicio27 {

	/*
	 * Metodo principal para a execução do programa
	 */

	public static void main(String[] args) {
		// Declarando as variáveis
		double pcamiseta, mcamiseta, gcamiseta, vtotal;

		// Obtendo informações do usuário
		pcamiseta = Double.parseDouble(JOptionPane.showInputDialog("Digite quantas camisetas pequenas deseja comprar"));
		mcamiseta = Double.parseDouble(JOptionPane.showInputDialog("Digite quantas camisetas médias deseja comprar"));
		gcamiseta = Double.parseDouble(JOptionPane.showInputDialog("Digite quantas camisetas grandes deseja comprar"));

		// Atribuindo valores para as variáveis
		pcamiseta = pcamiseta * 10;
		mcamiseta = mcamiseta * 12;
		gcamiseta = gcamiseta * 15;

		// Cálculo para obter o valor total da compra
		vtotal = pcamiseta + mcamiseta + gcamiseta;

		// Resultado em tela
		JOptionPane.showMessageDialog(null, "O valor total arrecadado foi de R$" + vtotal);

	}

}
