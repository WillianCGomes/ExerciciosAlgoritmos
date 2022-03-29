package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para somar e multiplicar idades
 * 
 * @author Willian Gomes
 * @since 09/02/2021
 */
public class Exercicio58 {
	/*
	 * Método principal para a execução da classe
	 */
	public static void main(String[] args) {

// Declarações de variáveis
		int h1, h2, m1, m2, soma, mult;
		double media1, media2;

		// Obtendo informações do usuário
		h1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do primeiro homem"));
		h2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do segundo homem"));
		m1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da primeira mulher"));
		m2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da segunda mulher"));

		// Cálculo para obter a media dos homens e das mulheres
		media1 = (h1 + h2) / 2;
		media2 = (m1 + m2) / 2;

		// Reultado em tela da soma da idade do homem mais velho com a mulher mais nova
		if ((h1 > media1) && (m1 < media2)) {
			soma = h1 + m1;
			JOptionPane.showMessageDialog(null,
					"A soma da idade do homem mais velho com a mulher mais nova é de " + soma);
		} else if ((h1 > media1) && (m2 < media2)) {
			soma = h1 + m2;
			JOptionPane.showMessageDialog(null,
					"A soma da idade do homem mais velho com a mulher mais nova é de " + soma);
		} else if ((h2 > media1) && (m1 < media2)) {
			soma = h2 + m1;
			JOptionPane.showMessageDialog(null,
					"A soma da idade do homem mais velho com a mulher mais nova é de " + soma);
		} else if ((h2 > media1) && (m2 < media2)) {
			soma = h2 + m2;
			JOptionPane.showMessageDialog(null,
					"A soma da idade do homem mais velho com a mulher mais nova é de " + soma);
		}

		// Resultado em tela da multiplicação da idade do homem mais novo com a mulher
		// mais velha
		if ((h1 < media1) && (m1 > media2)) {
			mult = h1 * m1;
			JOptionPane.showMessageDialog(null,
					"A multiplicação da idade do homem mais novo com a mulher mais velha é de " + mult);
		} else if ((h1 < media1) && (m2 > media2)) {
			mult = h1 * m2;
			JOptionPane.showMessageDialog(null,
					"A multiplicação da idade do homem mais novo com a mulher mais velha é de " + mult);
		} else if ((h2 < media1) && (m1 > media2)) {
			mult = h2 * m1;
			JOptionPane.showMessageDialog(null,
					"A multiplicação da idade do homem mais novo com a mulher mais velha é de " + mult);
		} else if ((h2 < media1) && (m2 > media2)) {
			mult = h2 * m2;
			JOptionPane.showMessageDialog(null,
					"A multiplicação da idade do homem mais novo com a mulher mais velha é de " + mult);
		}
	}
}
