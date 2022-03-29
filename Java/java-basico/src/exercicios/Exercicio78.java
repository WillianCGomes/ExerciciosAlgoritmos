package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular e escrever a soma dos inteiros existentes entre os 2
 * valores lidos
 * 
 * @author Willian Carlos Gomes
 * @since 10 de fev. de 2021
 */
public class Exercicio78 {

	/*
	 * M�todo principal para a execu��o do programa
	 */
	public static void main(String[] args) {
		// Declarando vari�veis
		double v1, v2, soma;

		// Solicitando valores do usu�rio
		v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
		v2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));

		// Inicializando a vari�vel soma
		soma = 0;

		// La�o para verifica��o
		for (int i = (int) v1; i <= v2; i++) {
			soma += i;
		}

		// Impress�o em tela
		JOptionPane.showMessageDialog(null, soma);
	}

}
