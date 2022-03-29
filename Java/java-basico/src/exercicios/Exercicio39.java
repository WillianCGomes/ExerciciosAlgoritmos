/**
 * 
 */
package exercicios;

import javax.swing.JOptionPane;

/**
 * Cálculo de média
 * 
 * @author Willian Gomes
 * @since 09/02/2021
 */
public class Exercicio39 {
	/*
	 * Método principal para a execução da classe
	 */

	public static void main(String[] args) {
		// Declarações de variáveis
		double nota1, nota2, media;

		//Leitura das notas
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota:"));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota:"));

		//Cálculo da média
		media = ((nota1 + nota2) / 2);

		//Condicionais
		if (media >= 6) {
			JOptionPane.showMessageDialog(null, "Sua média foi: " + media + " e você está aprovado");
		} else {
			JOptionPane.showMessageDialog(null, "Sua média foi: " + media + " e você está reprovado");
		}

	}

}
