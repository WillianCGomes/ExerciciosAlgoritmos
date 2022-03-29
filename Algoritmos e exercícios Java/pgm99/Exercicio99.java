package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para verificar o n�mero de vezes em que um valor se repete no vetor
 * 
 * @author Willian Carlos Gomes
 * @since 14 de fev. de 2021
 */
public class Exercicio99 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// Declara��es de vetores e vari�veis
		int vetor[], num, cont;

		// Informando o tamanho do vetor
		vetor = new int[10];

		// Pedindo os 10 valores ao usu�rio atrav�s do la�o de repeti��o
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero; "));
		}

		// Solicitando o n�mero ao usu�rio que ser� verificado
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite outro n�mero para a pesquisa: "));

		// Inicializando vari�vel
		cont = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == num) {
				cont++;
			}
		}
		// Impress�o em tela
		System.out.println("O n�mero " + num + " aparece " + cont + " vezes no vetor.");

	}

}
