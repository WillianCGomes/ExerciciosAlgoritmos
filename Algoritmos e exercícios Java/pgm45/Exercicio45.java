package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular o salário do vendedor
 * 
 * @author Willian Gomes
 * @since 09/02/2021
 */
public class Exercicio45 {
	/*
	 * Método principal para a execução da classe
	 */

	public static void main(String[] args) {
		// Declarações de variáveis
		double salario, vendas, salarioc, tsalario, vfvendas;

		// Leitura do salário e comissão
		salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salario, por favor: "));
		vendas = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor total de vendas: "));

		// Cálculo e condicional composta
		if (vendas > 1500) {
			salarioc = (vendas * 0.03);
			vfvendas = ((vendas - 1500) * 0.05);
			tsalario = (salario + salarioc + vfvendas);
			JOptionPane.showMessageDialog(null, "Seu salário total será: R$" + tsalario + ".");
		} else {
			salarioc = (vendas * 0.03);
			tsalario = (salario + salarioc);
			JOptionPane.showMessageDialog(null, "Seu salário total será: R$" + tsalario + ".");
		}

	}

}
