package exercicios;

import javax.swing.JOptionPane;

/**
 * �rea do ret�ngulo
 * 
 * @author Willian Gomes
 * @since 05/02/2021
 *
 */
public class Exercicio16 {

	/*
	 * M�todo padr�o de execu��o
	 */

	public static void main(String[] args) {

		// Declara��o das vari�veis
		Double base, altura, area;

		// Leitura e atribui��es
		base = Double.parseDouble(
				JOptionPane.showInputDialog("Digite o valor da base do ret�ngulo sem a unidade de medida: "));
		altura = Double.parseDouble(
				JOptionPane.showInputDialog("Digite o valor da altura do ret�ngulo sem a unidade de medida: "));

		// C�lculo da �rea
		area = base * altura;

		// Impress�o em tela
		JOptionPane.showMessageDialog(null, "A �rea do ret�ngulo (na respectiva unidade de medida) �: " + area + ".");
	}
}
