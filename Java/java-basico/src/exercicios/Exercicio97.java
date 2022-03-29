package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar a exclus�o de um valor do vetor
 * 
 * @author Willian Carlos Gomes
 * @since 12 de fev. de 2021
 */
public class Exercicio97 {

	/*
	 * M�todo principal para a execu��o do programa
	 */

	public static void main(String[] args) {
		// Declarando vari�veis e vetores
		int v1[], v2[], n, j;

		// Definindo o tamanho dos vetores
		v1 = new int[20];
		v2 = new int[20];

		// La�o para pegar os valores do vetor
		for (int i = 0; i < v1.length; i++) {
			v1[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "� n�mero."));
		}

		// Solicitando o valor que ser� exclu�do
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para ser exclu�do:"));

		// Inicializando a vari�vel
		j = 0;

		// la�o de repeti��o que verifica a igualdade entre o valor digitado e os
		// valores do vetor... Se sim, a vari�vel J recebe incremento
		for (int i = 0; i < v1.length; i++) {
			if (n != v1[i]) {
				j = j + 1;
				v2[j] = v1[i];
			}
		}

		// Caso o valor de j continue igual a 20, significa que n�o houve incremento,
		// Logo o valor digitado n�o faz parte do vetor
		if (j == 20) {
			System.out.println(j + " N�o ocorre no vetor!");
		} else {
			System.out.println("Vetor sem " + n + ":");
			for (int i = 0; i < j; i++) {
				// Um vetor secund�rio � utilizado para a impress�o em tela
				System.out.println(v2[i]);
			}
		}
	}
}
