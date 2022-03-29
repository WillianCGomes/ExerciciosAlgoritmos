package exemplo05;

import javax.swing.JOptionPane;

/**
 * Programa para valorizar o vetor do tipo inteiro informado pelo usuário usando o for
 * @author Willian Carlos Gomes
 * @since 11 de fev. de 2021
 */
public class ValorizandoVetorInteiroLooping {

	/*
	 * Método principal para a execução da classe
	 */
	public static void main(String[] args) {
		//Declarando vetor
		int vetor[];
		
		//inicializando o vetor e definindo o seu tamanho
		vetor = new int[5];
		
		//recebendo os valores do usuário com o auxilio do comando FOR
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
		}
		//exibindo os valores contigos no vetor
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}

}
