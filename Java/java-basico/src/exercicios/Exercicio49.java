package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para verificar o menor entre 3 valores
 * 
 * @author Willian Gomes
 * @since 09/02/2021
 */
public class Exercicio49 {
	/*
	 * Método principal para a execução da classe
	 */

	public static void main(String[] args) {

		// Declarações de variáveis
		int v1, v2, v3;

		// leitura dos valores
		v1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
		v2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));
		v3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro valor"));

		// Verificações com condicionais compostas
		if ((v1 < v2) && (v1 < v3)) {
			JOptionPane.showMessageDialog(null, "O menor valor é: " + v1 + ".");
		}

		else if (v2 < v3) {
			JOptionPane.showMessageDialog(null, "O menor valor é: " + v2 + ".");
		}

		else {
			JOptionPane.showMessageDialog(null, "O menor valor é: " + v3 + ".");
		}

	}
}
