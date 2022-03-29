package exemplo05;

/**
 * Programa para demonstrar a utilização de vetor do tipo inteiro
 * 
 * @author Willian Carlos Gomes
 * @since 11 de fev. de 2021
 */
public class VetorInteiro {

	/*
	 * Método principal para a execução do programa
	 */
	public static void main(String[] args) {
		// Declarando o vetor
		int vetor[];

		// Iniciando o vetor e informando a quantidade de posições (tamanho)
		vetor = new int[10];

		// adicionando o valor 10 na 1ª posição do vetor
		vetor[0] = 10;

		// adicionando o valor 5 na 2ª posição do vetor no seu índice 1
		vetor[1] = 5;

		// adicionando o valor 25 na 3ª posição do vetor no seu índice 2
		vetor[2] = 25;

		// exibindo o valor da primeira posição do vetor
		System.out.println(vetor[0]);

		// exibindo o valor da segunda posição do vetor
		System.out.println(vetor[1]);
		
		// exibindo o valor da terceira posição do vetor
		System.out.println(vetor[2]);

	}

}
