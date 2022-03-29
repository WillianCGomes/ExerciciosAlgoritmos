package exercicios;

import javax.swing.JOptionPane;

/**
 * Cálculo de reajuste
 * 
 * @author Willian Gomes
 * @since 05/02/2021
 */

public class Exercicio19 {
	/*
	 * Método principal de execução
	 */

	public static void main(String[] args) {
		// Declarações das variáveis
		Double salario, percentualreaj, salarionovo, totalreajuste;

		// Leitura e atribuições das variáveis
		salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salário: "));
		percentualreaj = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de reajuste: "));

		// Cálculo do reajuste
		salarionovo = salario * percentualreaj / 100;
		totalreajuste = salario + salarionovo;

		// Exibição em tela
		JOptionPane.showMessageDialog(null, "O salário com o reajuste é de: " + totalreajuste + ".");
	}
}
