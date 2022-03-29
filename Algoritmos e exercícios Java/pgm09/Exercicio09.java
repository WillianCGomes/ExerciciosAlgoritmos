package exercicios;

import javax.swing.JOptionPane;

/**
 * Receber dados e exibir soma
 * 
 * @author Willian Gomes
 * @since 05/02/2002
 */
public class Exercicio09 {

	/*
	 * Método principal para a execução do programa
	 */
	public static void main(String[] args) {
		// declaração das variáveis
		int v1, v2, res;

		// atribuição dos valores às variáveis
		v1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
		v2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));

		// Cálculo
		res = v1 + v2;

		System.out.println("O resultado da operação é: " + res + ".");

	}

}
