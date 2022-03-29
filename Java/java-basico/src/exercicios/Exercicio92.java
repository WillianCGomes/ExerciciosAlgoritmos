package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para realizar c�lculo de multiplica��o com vetores
 * 
 * @author Willian Carlos Gomes
 * @since 12 de fev. de 2021
 */
public class Exercicio92 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// Declarando vetores e cari�veis
		double x, A[], M[];
		int aux;

		// Atribuindo valores as vari�veis
		A = new double[10];
		M = new double[10];
		aux = 0;

		// Obtendo informa��es do usu�rio
		for (int i = 0; i < A.length; i++, aux++) {
			A[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o n�mero"));
			M[aux] = A[i];
		}

		// Obtendo o valor(X) Do usu�rio
		x = Double.parseDouble(JOptionPane.showInputDialog("Digite O n�mero multiplicador"));

		// C�lculo para multiplicar os valores armazenados no vetor "A" pelo valor de
		// "X" e armazenalos no vetor "M"
		for (int j = 0; j < M.length; j++) {
			M[j] = M[j] * x;
			System.out.println(M[j]);// Resultado em tela
		}
	}
}
