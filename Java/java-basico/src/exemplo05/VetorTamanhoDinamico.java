package exemplo05;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar vetor com o usu�rio informando o seu tamanho
 * @author Willian Carlos Gomes
 * @since 11 de fev. de 2021
 */
public class VetorTamanhoDinamico {

	/*
	 * M�todo principal para executar a classe
	 */
	
	public static void main(String[] args) {
		//Declarando o vetor
		int vetor[];
		
		//vari�vel auxiliar informada pelo usu�rio para definir o tamanho do vetor
		int tamanho;
		
		//usu�rio informando o tamanho do vetor
		tamanho = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do vetor:"));
		
		//inicializando o vetor e definindo o seu tamanho
		vetor = new int[tamanho];
		
		//recebendo os valores a serem gravados no vetor
		for (int j = 0; j < vetor.length; j++) {
			vetor[j] = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor"));
		}
		
		//exibir os dados gravados no vetor
  	    for (int j = 0; j < vetor.length; j++) {
			System.out.println(vetor[j]);
		}

	}

}
