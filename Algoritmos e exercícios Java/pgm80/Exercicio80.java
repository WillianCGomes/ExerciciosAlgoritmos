package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular o valor medio das mercadorias
 * 
 * @author Willian Carlos Gomes
 * @since 10 de fev. de 2021
 */
public class Exercicio80 {
	/*
	 * Método principal para a execução do programa
	 */
	public static void main(String[] args) {

		// Declarando variáveis
		double media, aux = 0;
		int quantidade;

		// Obtendo informações do usuário
		quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de produtos em estoque"));

		//
		for (int i = 1; i <= quantidade; i++) {
			aux += Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto"));
		}

		// Cálculo para obter a média do valor das mercadorias
		media = aux / quantidade;

		// Resultado em tela
		JOptionPane.showMessageDialog(null, "O valor médio dos produtos é de: " + media);

	}

}
