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
	 * Método principal para a execução do programa
	 */
	public static void main(String[] args) {
		// Declarações das Variáveis
		double n1, n2, n3, media;

		// Leitura dos valores e atribuições das variáveis
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));
		n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota: "));

		// Cálculo da média
		media = (n1 * 2) + (n2 * 3) + (n3 * 5);
		media = media / 10;

		// Exibição em tela
		JOptionPane.showMessageDialog(null, "A média final é: " + media + ".");
	}
}
