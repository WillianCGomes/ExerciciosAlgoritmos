package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular o sal�rio do vendedor
 * 
 * @author Willian Gomes
 * @since 09/02/2021
 */
public class Exercicio45 {
	/*
	 * M�todo principal para a execu��o da classe
	 */

	public static void main(String[] args) {
		// Declara��es de vari�veis
		double salario, vendas, salarioc, tsalario, vfvendas;

		// Leitura do sal�rio e comiss�o
		salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salario, por favor: "));
		vendas = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor total de vendas: "));

		// C�lculo e condicional composta
		if (vendas > 1500) {
			salarioc = (vendas * 0.03);
			vfvendas = ((vendas - 1500) * 0.05);
			tsalario = (salario + salarioc + vfvendas);
			JOptionPane.showMessageDialog(null, "Seu sal�rio total ser�: R$" + tsalario + ".");
		} else {
			salarioc = (vendas * 0.03);
			tsalario = (salario + salarioc);
			JOptionPane.showMessageDialog(null, "Seu sal�rio total ser�: R$" + tsalario + ".");
		}

	}

}
