package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para
 * @author Willian Carlos Gomes
 * @since 12 de fev. de 2021
 */
public class Exercicio94 {

		/*
		 * M�todo principal para a execu��o da classe
		 */
		public static void main(String[] args) {

			// Declarando vari�veis
			double A[], B[], SOMA[];
			int x;

			// Comando para obter o valor de X (que ser� o tamnho dos vetores)
			x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor (tamanho dos vetores)"));

			// Atribuindo valores as vari�veis
			A = new double[x];
			B = new double[x];
			SOMA = new double[x];

			// Obtendo informa��es do usu�rio
			for (int i = 0; i < A.length; i++) {
				A[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o " + (i+1) + "� n�mero de A"));
			}
			for (int i = 0; i < B.length; i++) {
				B[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o " + (i+1) + "� n�mero de B"));
				SOMA[i] = A[i] + B[i];
			}

			// Resultado em tela
			for (int i = 0; i < SOMA.length; i++) {
				System.out.println("A soma dos vetores A e B, na " + (i+1) + "� posi��o � de: " + (int)SOMA[i]);
			}

		}
	}