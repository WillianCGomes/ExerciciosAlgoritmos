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
	 * M�todo principal para a execu��o da classe
	 */

	public static void main(String[] args) {

		// Declara��es de vari�veis
		int v1, v2, v3;

		// leitura dos valores
		v1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
		v2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));
		v3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro valor"));

		// Verifica��es com condicionais compostas
		if ((v1 < v2) && (v1 < v3)) {
			JOptionPane.showMessageDialog(null, "O menor valor �: " + v1 + ".");
		}

		else if (v2 < v3) {
			JOptionPane.showMessageDialog(null, "O menor valor �: " + v2 + ".");
		}

		else {
			JOptionPane.showMessageDialog(null, "O menor valor �: " + v3 + ".");
		}

	}
}
