package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para verificar o número de vezes em que um valor se repete no vetor
 * 
 * @author Willian Carlos Gomes
 * @since 14 de fev. de 2021
 */
public class Exercicio99 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// Declarações de vetores e variáveis
		int vetor[], num, cont;

		// Informando o tamanho do vetor
		vetor = new int[10];

		// Pedindo os 10 valores ao usuário através do laço de repetição
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número; "));
		}

		// Solicitando o número ao usuário que será verificado
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número para a pesquisa: "));

		// Inicializando variável
		cont = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == num) {
				cont++;
			}
		}
		// Impressão em tela
		System.out.println("O número " + num + " aparece " + cont + " vezes no vetor.");

	}

}
