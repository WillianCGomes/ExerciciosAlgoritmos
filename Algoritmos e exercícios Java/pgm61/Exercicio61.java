package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular desconto e total do preço de um produto
 * 
 * @author Willian Gomes
 * @since 09/02/2021
 */
public class Exercicio61 {
	/*
	 * Método principal para a execução da classe
	 */
	public static void main(String[] args) {

// Declarações de variáveis
		String prod;
		double qtd, preco, total, result, desc;

		prod = JOptionPane.showInputDialog("Informe o nome do produto:");
		qtd = Double.parseDouble(JOptionPane.showInputDialog("Quantas unidades foram adquiridas?"));
		preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor: R$"));

		if (qtd <= 5) {// haverá desconto de 2%
			total = (qtd * preco);
			desc = (total / 98);
			result = (qtd * preco) - desc;

			JOptionPane.showMessageDialog(null, "O desconto no " + prod + " É de: R$" + desc);
			JOptionPane.showMessageDialog(null, "O valor a pagar é: R$" + result);
		}

		if ((qtd > 5) && (qtd <= 10)) {// desconto de 3%
			total = (qtd * preco);
			desc = (total / 97);
			result = (qtd * preco) - desc;

			JOptionPane.showMessageDialog(null, "O desconto no " + prod + " É de: R$" + desc);
			JOptionPane.showMessageDialog(null, "O valor a pagar é: R$" + result);
		}

		if (qtd > 10) {// desconto de 5%
			total = (qtd * preco);
			desc = (total / 95);
			result = (qtd * preco) - desc;

			JOptionPane.showMessageDialog(null, "O desconto no " + prod + " É de: R$" + desc);
			JOptionPane.showMessageDialog(null, "O valor a pagar é: R$" + result);
		}
	}
}
