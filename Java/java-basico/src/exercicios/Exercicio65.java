package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para informar a m�dia das avalia��es
 * 
 * @author Willian Carlos Gomes
 * @since 10 de fev. de 2021
 */
public class Exercicio65 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declarando vari�veis
		double n1, n2, media;

		do {// inicio do la�o de repeti��o do while
			n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite nota da primeira avalia��o:"));

		} while ((n1 < 0) || (n1 > 10)); // Enquanto o valor informado for menor que 0 ou maior que 10, repetir a
											// solicita��o
		// fim do la�o de repeti��o do while

		do {// inicio do la�o de repeti��o do while
			n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite nota da segunda avalia��o:"));

		} while ((n2 < 0) || (n2 > 10)); // Enquanto o valor informado for menor que 0 ou maior que 10, repetir a
											// solicita��o
		// fim do la�o de repeti��o do while

		media = (n1 + n2) / 2;

		JOptionPane.showMessageDialog(null, "A sua m�dia foi de: " + media);

	}

}
