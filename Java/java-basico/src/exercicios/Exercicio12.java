/**
 * 
 */
package exercicios;

import javax.swing.JOptionPane;

/**
 * Receber valores e realizar a divisão
 * 
 * @author Willian Gomes
 * @since 05/02/2021
 */
public class Exercicio12 {

	/*
	 * Método principal de execução
	 */
	public static void main(String[] args) {

		// Declaração das variáveis
		double v1, v2, res;

		// Atribuição dos valores às variáveis
		v1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
		v2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));

		// Cálculo
		res = v1 / v2;

		// Exibição do resultado
		System.out.println("O resultado da operação é: " + res + ".");
	}

}
