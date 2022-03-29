package exemplo05;

import javax.swing.JOptionPane;

/**
 * Programa para buscar um valor especifico no vetor String
 * @author Willian Carlos Gomes
 * @since 11 de fev. de 2021
 */
public class BuscarValorVetorString {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		//Declarando o vetor
		String vetor[];
		
		//inicializando o vetor e definindo o seu tamanho
		vetor = new String[3];
		
		//valorizando o vetor com dados informados pelo usu�rio
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = JOptionPane.showInputDialog("Informe um nome: ");
			}
			
		// varrendo o vetor para verificar os registros armazenados
			for (int i = 0; i < vetor.length; i++) {
				if (vetor[i].equals("Willian")) {
					System.out.println("Achei o que voc� procurava na posi��o: " + i);
			}
		}
	}

}
