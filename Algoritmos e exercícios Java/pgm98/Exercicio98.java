package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para verificar número de vezes em que 2 vetores possuem mesmo valor
 * e mesma posição
 * 
 * @author Willian Carlos Gomes
 * @since 12 de fev. de 2021
 */
public class Exercicio98 {

	/*
	 * Método principal para a execução da classe
	 */
	public static void main(String[] args) {
		// Declarando variáveis e vetores
		int v1[], v2[], qtd;

		// definição dos tamanhos dos vetores
		v1 = new int[15];
		v2 = new int[15];

		// Recebendo valores dos vetores
		for (int i = 0; i < v2.length; i++) {
			v1[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º número do vetor 1:"));
		}
		for (int i = 0; i < v2.length; i++) {
			v2[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º número do vetor 2:"));
		}

		// Verificação dos valores iguais
		qtd = 0;
		for (int i = 0; i < v2.length; i++) {
			if (v1[i] == v2[i]) {
				qtd = qtd + 1;
			}
		}
		// Impressão em tela
		System.out.println("Existe(m) " + qtd + " número(s) igual(is) nas mesmas posições dos vetores.");

	}

}
