/**
 * 
 */
package exercicios;

import javax.swing.JOptionPane;

/**
 * Receber valores e realizar a divis�o
 * 
 * @author Willian Gomes
 * @since 05/02/2021
 */
public class Exercicio12 {

	/*
	 * M�todo principal de execu��o
	 */
	public static void main(String[] args) {

		// Declara��o das vari�veis
		double v1, v2, res;

		// Atribui��o dos valores �s vari�veis
		v1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
		v2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));

		// C�lculo
		res = v1 / v2;

		// Exibi��o do resultado
		System.out.println("O resultado da opera��o �: " + res + ".");
	}

}
