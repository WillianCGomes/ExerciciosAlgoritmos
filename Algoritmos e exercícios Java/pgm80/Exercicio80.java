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
	 * M�todo principal para a execu��o do programa
	 */
	public static void main(String[] args) {

		// Declarando vari�veis
		double media, aux = 0;
		int quantidade;

		// Obtendo informa��es do usu�rio
		quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de produtos em estoque"));

		//
		for (int i = 1; i <= quantidade; i++) {
			aux += Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto"));
		}

		// C�lculo para obter a m�dia do valor das mercadorias
		media = aux / quantidade;

		// Resultado em tela
		JOptionPane.showMessageDialog(null, "O valor m�dio dos produtos � de: " + media);

	}

}
