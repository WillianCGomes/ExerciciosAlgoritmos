package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para armazenar 20 n�meros em um vetor e exibir estes n�meros em ordem inversa
 * @author Willian Carlos Gomes
 * @since 12 de fev. de 2021
 */
public class Exercicio93 {

	/*
	 * M�todo principal para a execu��o da classe
	 */
	public static void main(String[] args) {
		//Declarando vetor e vari�vel
		double numeros[];

		// Atribuindo valores as vari�veis
		numeros = new double[20];

		// Obtendo informa��es
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o " + (i+1) + "� n�mero"));
		}

		// Resultado em tela
		System.out.println("Ordem inversa dos valores: ");
		for(int i = 19; i >= 0; i--) {
			System.out.println((int)numeros[i]);
		}
	}

}
