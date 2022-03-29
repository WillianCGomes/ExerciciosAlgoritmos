package exemplo05;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar a soma de um vetor do tipo inteiro
 * 
 * @author Willian Carlos Gomes
 * @since 11 de fev. de 2021
 */
public class SomaVetor {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// Declarando o vetor
		int vetor[];

		// declarando vari�vel para somar
		int soma;

		// inicializar o vetor e definir o seu tamanho
		vetor = new int[5];

		// inicializando a vari�vel de soma
		soma = 0;

		// valorizando as posi��es do vetor com dados informados pelo usu�rio
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor: "));
		}
		// somando o vetor com o auxilio do comando FOR
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		// exibindo o resultado da soma do vetor
		System.out.println(soma);
}
}
