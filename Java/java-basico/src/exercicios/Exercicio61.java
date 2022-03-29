package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular desconto e total do pre�o de um produto
 * 
 * @author Willian Gomes
 * @since 09/02/2021
 */
public class Exercicio61 {
	/*
	 * M�todo principal para a execu��o da classe
	 */
	public static void main(String[] args) {

// Declara��es de vari�veis
		String prod;
		double qtd, preco, total, result, desc;

		prod = JOptionPane.showInputDialog("Informe o nome do produto:");
		qtd = Double.parseDouble(JOptionPane.showInputDialog("Quantas unidades foram adquiridas?"));
		preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor: R$"));

		if (qtd <= 5) {// haver� desconto de 2%
			total = (qtd * preco);
			desc = (total / 98);
			result = (qtd * preco) - desc;

			JOptionPane.showMessageDialog(null, "O desconto no " + prod + " � de: R$" + desc);
			JOptionPane.showMessageDialog(null, "O valor a pagar �: R$" + result);
		}

		if ((qtd > 5) && (qtd <= 10)) {// desconto de 3%
			total = (qtd * preco);
			desc = (total / 97);
			result = (qtd * preco) - desc;

			JOptionPane.showMessageDialog(null, "O desconto no " + prod + " � de: R$" + desc);
			JOptionPane.showMessageDialog(null, "O valor a pagar �: R$" + result);
		}

		if (qtd > 10) {// desconto de 5%
			total = (qtd * preco);
			desc = (total / 95);
			result = (qtd * preco) - desc;

			JOptionPane.showMessageDialog(null, "O desconto no " + prod + " � de: R$" + desc);
			JOptionPane.showMessageDialog(null, "O valor a pagar �: R$" + result);
		}
	}
}
