package exercicios;

import javax.swing.JOptionPane;

/**
 * Salário final do vendedor
 * 
 * @author Willian Gomes
 * @since 05/02/2021
 */
public class Exercicio22 {

	/*
	 * Método principal para a execução do programa
	 */

	public static void main(String[] args) {
		// Declaração das variáveis
		double sfixo, cfixa, nvendas, vveiculos, porcentagem, comisfinal, somaperc, sfinal;

		// Atribuição da comissão de vendas
		porcentagem = 0.05;

		// Leitura e atribuições das variáveis
		sfixo = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de salário fixo: "));
		nvendas = Double
				.parseDouble(JOptionPane.showInputDialog("Informe o número de carros vendidos pelo funcionário: "));
		cfixa = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor fixo de comissão: "));
		vveiculos = Double.parseDouble(
				JOptionPane.showInputDialog("Informe o valor total dos veículos vendidos pelo funcionário: "));

		// Cálculo das comissões
		comisfinal = nvendas * cfixa;
		somaperc = porcentagem * vveiculos;

		// Calculo do salário final
		sfinal = comisfinal + somaperc + sfixo;

		// Impressão em tela
		JOptionPane.showMessageDialog(null, "O salário final do vendedor é: R$" + sfinal + ".");
	}

}
