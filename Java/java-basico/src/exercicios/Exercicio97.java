package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar a exclusão de um valor do vetor
 * 
 * @author Willian Carlos Gomes
 * @since 12 de fev. de 2021
 */
public class Exercicio97 {

	/*
	 * Método principal para a execução do programa
	 */

	public static void main(String[] args) {
		// Declarando variáveis e vetores
		int v1[], v2[], n, j;

		// Definindo o tamanho dos vetores
		v1 = new int[20];
		v2 = new int[20];

		// Laço para pegar os valores do vetor
		for (int i = 0; i < v1.length; i++) {
			v1[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º número."));
		}

		// Solicitando o valor que será excluído
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para ser excluído:"));

		// Inicializando a variável
		j = 0;

		// laço de repetição que verifica a igualdade entre o valor digitado e os
		// valores do vetor... Se sim, a variável J recebe incremento
		for (int i = 0; i < v1.length; i++) {
			if (n != v1[i]) {
				j = j + 1;
				v2[j] = v1[i];
			}
		}

		// Caso o valor de j continue igual a 20, significa que não houve incremento,
		// Logo o valor digitado não faz parte do vetor
		if (j == 20) {
			System.out.println(j + " Não ocorre no vetor!");
		} else {
			System.out.println("Vetor sem " + n + ":");
			for (int i = 0; i < j; i++) {
				// Um vetor secundário é utilizado para a impressão em tela
				System.out.println(v2[i]);
			}
		}
	}
}
