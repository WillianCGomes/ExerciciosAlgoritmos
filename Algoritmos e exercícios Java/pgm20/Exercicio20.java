package exercicios;

import javax.swing.JOptionPane;

/**
 * Conversão de dólar para real
 * 
 * @author Willian Gomes
 * @since 05/02/2021
 */
public class Exercicio20 {

	/*
	 * Método principal para a execução do programa
	 */
	public static void main(String[] args) {
		// Declaração das variáveis
		Double vconvertido, vinicio;

		// Leitura do valor
		vinicio = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor em dólar: "));
		vconvertido = vinicio * 6.61;

		// Impressão em tela
		JOptionPane.showMessageDialog(null, "O valor informado em dólar equivale a R$" + vconvertido + ".");
	}

}
