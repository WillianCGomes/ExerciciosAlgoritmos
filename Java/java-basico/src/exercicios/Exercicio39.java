/**
 * 
 */
package exercicios;

import javax.swing.JOptionPane;

/**
 * C�lculo de m�dia
 * 
 * @author Willian Gomes
 * @since 09/02/2021
 */
public class Exercicio39 {
	/*
	 * M�todo principal para a execu��o da classe
	 */

	public static void main(String[] args) {
		// Declara��es de vari�veis
		double nota1, nota2, media;

		//Leitura das notas
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota:"));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota:"));

		//C�lculo da m�dia
		media = ((nota1 + nota2) / 2);

		//Condicionais
		if (media >= 6) {
			JOptionPane.showMessageDialog(null, "Sua m�dia foi: " + media + " e voc� est� aprovado");
		} else {
			JOptionPane.showMessageDialog(null, "Sua m�dia foi: " + media + " e voc� est� reprovado");
		}

	}

}
