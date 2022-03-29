package exercicios;

import javax.swing.JOptionPane;

/**
 * C�lculo de reajuste
 * 
 * @author Willian Gomes
 * @since 05/02/2021
 */

public class Exercicio19 {
	/*
	 * M�todo principal de execu��o
	 */

	public static void main(String[] args) {
		// Declara��es das vari�veis
		Double salario, percentualreaj, salarionovo, totalreajuste;

		// Leitura e atribui��es das vari�veis
		salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do sal�rio: "));
		percentualreaj = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de reajuste: "));

		// C�lculo do reajuste
		salarionovo = salario * percentualreaj / 100;
		totalreajuste = salario + salarionovo;

		// Exibi��o em tela
		JOptionPane.showMessageDialog(null, "O sal�rio com o reajuste � de: " + totalreajuste + ".");
	}
}
