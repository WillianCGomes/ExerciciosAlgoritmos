package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para informar se o valor é positivo ou negativo
 * 
 * @author Willian Gomes
 * @since 09/02/2021
 */
public class Exercicio37 {
	/*
	 * Método principal para a execução da classe
	 */

	public static void main(String[] args) {
		// Declaração de variável
		double valor;
		
		//Leitura do valor informado
		valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor:"));

		//Condicional composta para a verificação
		if (valor >= 0) {
			JOptionPane.showMessageDialog(null, "O valor informado é positivo");
		} else {
			JOptionPane.showMessageDialog(null, "O valor informado é negativo");
		}

	}

}
