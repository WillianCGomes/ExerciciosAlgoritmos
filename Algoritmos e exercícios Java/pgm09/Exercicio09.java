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
	 * M�todo principal para a execu��o do programa
	 */
	public static void main(String[] args) {
		// declara��o das vari�veis
		int v1, v2, res;

		// atribui��o dos valores �s vari�veis
		v1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
		v2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));

		// C�lculo
		res = v1 + v2;

		System.out.println("O resultado da opera��o �: " + res + ".");

	}

}
