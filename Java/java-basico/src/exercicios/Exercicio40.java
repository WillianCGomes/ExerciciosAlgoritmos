package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para verificar a possibilidade da pessoa votar
 * 
 * @author Willian Gomes
 * @since 09/02/2021
 */
public class Exercicio40 {
	/*
	 * M�todo principal para a execu��o da classe
	 */

	public static void main(String[] args) {
		// Declara��es de vari�veis
		double anonasc, anoatual, idade;

		// Leitura das informa��es
		anonasc = Double.parseDouble(JOptionPane.showInputDialog("Digite o ano de nascimento:"));
		anoatual = Double.parseDouble(JOptionPane.showInputDialog("Digite o ano atual:"));

		// C�lculo da idade
		idade = (anoatual - anonasc);

		// Condicionais
		if (idade >= 16) {
			JOptionPane.showMessageDialog(null, "Voc� pode votar!");
		} else {
			JOptionPane.showMessageDialog(null, "Voc� pode votar!");
		}

	}

}
