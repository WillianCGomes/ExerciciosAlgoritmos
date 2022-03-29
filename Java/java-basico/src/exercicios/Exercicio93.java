package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para armazenar 20 números em um vetor e exibir estes números em ordem inversa
 * @author Willian Carlos Gomes
 * @since 12 de fev. de 2021
 */
public class Exercicio93 {

	/*
	 * Método principal para a execução da classe
	 */
	public static void main(String[] args) {
		//Declarando vetor e variável
		double numeros[];

		// Atribuindo valores as variáveis
		numeros = new double[20];

		// Obtendo informações
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o " + (i+1) + "º número"));
		}

		// Resultado em tela
		System.out.println("Ordem inversa dos valores: ");
		for(int i = 19; i >= 0; i--) {
			System.out.println((int)numeros[i]);
		}
	}

}
