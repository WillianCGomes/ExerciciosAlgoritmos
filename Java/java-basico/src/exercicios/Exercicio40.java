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
	 * Método principal para a execução da classe
	 */

	public static void main(String[] args) {
		// Declarações de variáveis
		double anonasc, anoatual, idade;

		// Leitura das informações
		anonasc = Double.parseDouble(JOptionPane.showInputDialog("Digite o ano de nascimento:"));
		anoatual = Double.parseDouble(JOptionPane.showInputDialog("Digite o ano atual:"));

		// Cálculo da idade
		idade = (anoatual - anonasc);

		// Condicionais
		if (idade >= 16) {
			JOptionPane.showMessageDialog(null, "Você pode votar!");
		} else {
			JOptionPane.showMessageDialog(null, "Você pode votar!");
		}

	}

}
