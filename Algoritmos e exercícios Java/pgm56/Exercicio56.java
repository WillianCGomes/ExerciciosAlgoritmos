package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para informar maior número
 * 
 * @author Willian Gomes
 * @since 09/02/2021
 */
public class Exercicio56 {
	/*
	 * Método principal para a execução da classe
	 */
	public static void main(String[] args) {

// Declarações de variáveis
		int a, b;

		// Leitura dos nomes dos times e placar
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
		b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));

		// Condicionais compostas
		if (a > b) {
			JOptionPane.showMessageDialog(null, "Primeiro é maior!");
		} else if (b > a) {
			JOptionPane.showMessageDialog(null, "Segundo é maior");
		} else
			JOptionPane.showMessageDialog(null, "Números iguais!");
	}
}