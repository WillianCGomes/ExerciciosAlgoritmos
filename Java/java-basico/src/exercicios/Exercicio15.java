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
	 * M�todo principal de execu��o do programa
	 */

	public static void main(String[] args) {

		// declara��o de vari�veis
		int valor, antecessor;

		// leitura dos valores e atribui��es
		valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
		antecessor = valor - 1;

		// Impress�o do resultado em tela
		JOptionPane.showMessageDialog(null, "O antecessor de " + valor + " �: " + antecessor + ".");

	}

}