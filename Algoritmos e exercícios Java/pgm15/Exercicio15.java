package exercicios;

import javax.swing.JOptionPane;

/**
 * Exibir o antecessor
 * 
 * @author Willian Gomes
 * @since 05/02/2021
 */

public class Exercicio15 {
	/*
	 * Método principal de execução do programa
	 */

	public static void main(String[] args) {

		// declaração de variáveis
		int valor, antecessor;

		// leitura dos valores e atribuições
		valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
		antecessor = valor - 1;

		// Impressão do resultado em tela
		JOptionPane.showMessageDialog(null, "O antecessor de " + valor + " é: " + antecessor + ".");

	}

}