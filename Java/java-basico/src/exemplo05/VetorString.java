package exemplo05;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar a utilização de vetor do tipo string
 * 
 * @author Willian Carlos Gomes
 * @since 11 de fev. de 2021
 */
public class VetorString {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// Declarando o vetor
		String vetor[];

		// inicializando e definindo o tamanho do vetor
		vetor = new String[5];

		// valorizando o vetor recebendo os dados do usuário
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = JOptionPane.showInputDialog("Informe um nome: ");

		}
		// exibindo os dados gravados no vetor
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}

}
