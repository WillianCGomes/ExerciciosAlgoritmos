package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para informar a média das avaliações
 * 
 * @author Willian Carlos Gomes
 * @since 10 de fev. de 2021
 */
public class Exercicio65 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declarando variáveis
		double n1, n2, media;

		do {// inicio do laço de repetição do while
			n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite nota da primeira avaliação:"));

		} while ((n1 < 0) || (n1 > 10)); // Enquanto o valor informado for menor que 0 ou maior que 10, repetir a
											// solicitação
		// fim do laço de repetição do while

		do {// inicio do laço de repetição do while
			n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite nota da segunda avaliação:"));

		} while ((n2 < 0) || (n2 > 10)); // Enquanto o valor informado for menor que 0 ou maior que 10, repetir a
											// solicitação
		// fim do laço de repetição do while

		media = (n1 + n2) / 2;

		JOptionPane.showMessageDialog(null, "A sua média foi de: " + media);

	}

}
