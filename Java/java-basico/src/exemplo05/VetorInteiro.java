package exemplo05;

/**
 * Programa para demonstrar a utiliza��o de vetor do tipo inteiro
 * 
 * @author Willian Carlos Gomes
 * @since 11 de fev. de 2021
 */
public class VetorInteiro {

	/*
	 * M�todo principal para a execu��o do programa
	 */
	public static void main(String[] args) {
		// Declarando o vetor
		int vetor[];

		// Iniciando o vetor e informando a quantidade de posi��es (tamanho)
		vetor = new int[10];

		// adicionando o valor 10 na 1� posi��o do vetor
		vetor[0] = 10;

		// adicionando o valor 5 na 2� posi��o do vetor no seu �ndice 1
		vetor[1] = 5;

		// adicionando o valor 25 na 3� posi��o do vetor no seu �ndice 2
		vetor[2] = 25;

		// exibindo o valor da primeira posi��o do vetor
		System.out.println(vetor[0]);

		// exibindo o valor da segunda posi��o do vetor
		System.out.println(vetor[1]);
		
		// exibindo o valor da terceira posi��o do vetor
		System.out.println(vetor[2]);

	}

}
