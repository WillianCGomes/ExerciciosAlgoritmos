/**
 * 
 */
package exercicios;

import javax.swing.JOptionPane;

/**
 * Notas
 * 
 * @author Willian Gomes
 * @since 08/02/2021
 */
public class Exercicio24 {

	/*
	 * M�todo principal para a execu��o do programa
	 */
	public static void main(String[] args) {
		// Declara��es das Vari�veis
		double n1, n2, n3, media;

		// Leitura dos valores e atribui��es das vari�veis
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));
		n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota: "));

		// C�lculo da m�dia
		media = (n1 * 2) + (n2 * 3) + (n3 * 5);
		media = media / 10;

		// Exibi��o em tela
		JOptionPane.showMessageDialog(null, "A m�dia final �: " + media + ".");
	}
}
