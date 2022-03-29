package exemplo05;

import javax.swing.JOptionPane;

/*
 * Programa para demonstrar a utiliza��o do vetor double
 * @author Willian Carlos Gomes
 * @since 11 de fev. de 2021
 */
public class VetorDouble {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {

		// Declarando o vetor
		double vetor[];

		// inicializando e informando o tamanho do vetor
		vetor = new double[5];

		// recebendo os dados do usu�rio para valorizar o vetor
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor: "));

			// exibindo os dados gravados no vetor
			for (int j = 0; j < vetor.length; j++) {
				System.out.println(vetor[i]);
			}
		}
	}
}
