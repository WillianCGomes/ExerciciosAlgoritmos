package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar vetores em ordem crescente e acrescentar 1
 * @author Willian Carlos Gomes
 * @since 12 de fev. de 2021
 */
public class Exercicio96 {

	/*
	 * M�todo principal para a execu��o da classe
	 */
	public static void main(String[] args) {
		//Declarando vetor e vari�vel
		int vetor[], aux, novo;
		
		//Inicializando vetor e declarando o seu tamanho
		vetor = new int[10];	
		
		//La�o de repeti��o para solicita��o dos n�meros
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i+1) + "� n�mero:"));
		}
		
		//La�os de repeti��o
		for (int j = 10; j > 0; j-=1) { //Enquanto j for maior que 0, o la�o decrementar� 1 de 10 sucessivamente
			for (int i = 0; i<j-1; i++) { //Em seguida incrementar� 1 ao �ndice do vetor
				
				//se o vetor anterior a vari�vel auxiliar auxiliar� na troca de posi��es
				if((vetor[i]) > (vetor[i+1])) {
					aux = vetor[i];
					vetor[i] = vetor[i+1];
					vetor[i+1] = aux;
				}
			}
		}
		//Impress�o em tela dos valores dos vetores organizados
		System.out.println("Vetor organizado!");
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		
		//Solicita��o para o usu�rio digitar o novo valor
		novo = Integer.parseInt(JOptionPane.showInputDialog("Digite um novo valor para ser inserido no vetor: "));
		for (int i = 0; i < vetor.length; i++) {
			if(vetor[i] >= novo){//Se o valor do vetor for maior que o novo valor digitado, sua posi��o ser� substitu�da 
				aux = vetor[i];
				vetor[i] = novo;
				novo = aux; //O �ltimo valor digitado ser� exclu�do, visto que � um vetor de 10 posi��es
			}
		}
		//Impress�o do resultado em tela
		System.out.println("\nVetor reorganizado:");
		for (int i = 0; i < 10; i++) {
			System.out.println(vetor[i]);
		}
	}

}
