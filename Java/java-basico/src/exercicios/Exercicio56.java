package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para informar maior n�mero
 * 
 * @author Willian Gomes
 * @since 09/02/2021
 */
public class Exercicio56 {
	/*
	 * M�todo principal para a execu��o da classe
	 */
	public static void main(String[] args) {

// Declara��es de vari�veis
		int a, b;

		// Leitura dos nomes dos times e placar
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
		b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));

		// Condicionais compostas
		if (a > b) {
			JOptionPane.showMessageDialog(null, "Primeiro � maior!");
		} else if (b > a) {
			JOptionPane.showMessageDialog(null, "Segundo � maior");
		} else
			JOptionPane.showMessageDialog(null, "N�meros iguais!");
	}
}