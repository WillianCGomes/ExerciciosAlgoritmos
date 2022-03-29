package exercicios;

import javax.swing.JOptionPane;

/**
 * Sal�rio final do vendedor
 * 
 * @author Willian Gomes
 * @since 05/02/2021
 */
public class Exercicio22 {

	/*
	 * M�todo principal para a execu��o do programa
	 */

	public static void main(String[] args) {
		// Declara��o das vari�veis
		double sfixo, cfixa, nvendas, vveiculos, porcentagem, comisfinal, somaperc, sfinal;

		// Atribui��o da comiss�o de vendas
		porcentagem = 0.05;

		// Leitura e atribui��es das vari�veis
		sfixo = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de sal�rio fixo: "));
		nvendas = Double
				.parseDouble(JOptionPane.showInputDialog("Informe o n�mero de carros vendidos pelo funcion�rio: "));
		cfixa = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor fixo de comiss�o: "));
		vveiculos = Double.parseDouble(
				JOptionPane.showInputDialog("Informe o valor total dos ve�culos vendidos pelo funcion�rio: "));

		// C�lculo das comiss�es
		comisfinal = nvendas * cfixa;
		somaperc = porcentagem * vveiculos;

		// Calculo do sal�rio final
		sfinal = comisfinal + somaperc + sfixo;

		// Impress�o em tela
		JOptionPane.showMessageDialog(null, "O sal�rio final do vendedor �: R$" + sfinal + ".");
	}

}
