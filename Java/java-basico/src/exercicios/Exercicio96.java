package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar vetores em ordem crescente e acrescentar 1
 * @author Willian Carlos Gomes
 * @since 12 de fev. de 2021
 */
public class Exercicio96 {

	/*
	 * Método principal para a execução da classe
	 */
	public static void main(String[] args) {
		//Declarando vetor e variável
		int vetor[], aux, novo;
		
		//Inicializando vetor e declarando o seu tamanho
		vetor = new int[10];	
		
		//Laço de repetição para solicitação dos números
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i+1) + "º número:"));
		}
		
		//Laços de repetição
		for (int j = 10; j > 0; j-=1) { //Enquanto j for maior que 0, o laço decrementará 1 de 10 sucessivamente
			for (int i = 0; i<j-1; i++) { //Em seguida incrementará 1 ao índice do vetor
				
				//se o vetor anterior a variável auxiliar auxiliará na troca de posições
				if((vetor[i]) > (vetor[i+1])) {
					aux = vetor[i];
					vetor[i] = vetor[i+1];
					vetor[i+1] = aux;
				}
			}
		}
		//Impressão em tela dos valores dos vetores organizados
		System.out.println("Vetor organizado!");
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		
		//Solicitação para o usuário digitar o novo valor
		novo = Integer.parseInt(JOptionPane.showInputDialog("Digite um novo valor para ser inserido no vetor: "));
		for (int i = 0; i < vetor.length; i++) {
			if(vetor[i] >= novo){//Se o valor do vetor for maior que o novo valor digitado, sua posição será substituída 
				aux = vetor[i];
				vetor[i] = novo;
				novo = aux; //O último valor digitado será excluído, visto que é um vetor de 10 posições
			}
		}
		//Impressão do resultado em tela
		System.out.println("\nVetor reorganizado:");
		for (int i = 0; i < 10; i++) {
			System.out.println(vetor[i]);
		}
	}

}
