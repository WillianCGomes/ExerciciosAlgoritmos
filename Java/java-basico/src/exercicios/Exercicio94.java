package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para
 * @author Willian Carlos Gomes
 * @since 12 de fev. de 2021
 */
public class Exercicio94 {

		/*
		 * Método principal para a execução da classe
		 */
		public static void main(String[] args) {

			// Declarando variáveis
			double A[], B[], SOMA[];
			int x;

			// Comando para obter o valor de X (que será o tamnho dos vetores)
			x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor (tamanho dos vetores)"));

			// Atribuindo valores as variáveis
			A = new double[x];
			B = new double[x];
			SOMA = new double[x];

			// Obtendo informações do usuário
			for (int i = 0; i < A.length; i++) {
				A[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o " + (i+1) + "º número de A"));
			}
			for (int i = 0; i < B.length; i++) {
				B[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o " + (i+1) + "º número de B"));
				SOMA[i] = A[i] + B[i];
			}

			// Resultado em tela
			for (int i = 0; i < SOMA.length; i++) {
				System.out.println("A soma dos vetores A e B, na " + (i+1) + "ª posição é de: " + (int)SOMA[i]);
			}

		}
	}