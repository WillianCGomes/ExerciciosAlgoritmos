package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular a m�dia dos exerc�cios avaliativos
 * 
 * @author Willian Gomes
 * @since 09/02/2021
 */
public class Exercicio63 {
	/*
	 * M�todo principal para a execu��o da classe
	 */
	public static void main(String[] args) {

// Declara��es de vari�veis
		int cod, anonasc, anoing, anoatual, ttrabalho, idade;
		String aps;

		// Leitura dos dados do funcion�rio
		cod = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua matr�cula"));
		anonasc = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu ano de nascimento, por favor:"));
		anoing = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu ano de ingresso na Organiza��o:"));

		// C�lculo do tempo de trabalho
		anoatual = (2021);
		ttrabalho = (anoatual - anoing);

		// C�lculo da idade do funcion�rio
		idade = (anoatual - anonasc);

		// Condicionais compostas para a possibilidade de aposentadoria
		if (idade >= 65) {
			aps = ("Requerer aposentadoria");
		} else if (ttrabalho >= 30) {
			aps = ("Requerer aposentadoria");
		} else if ((idade >= 60) && (ttrabalho >= 25)) {
			aps = ("Requerer aposentadoria");
		} else {
			aps = ("N�o requerer aposentadoria");
		}

		// Impress�o em tela do resultado
		JOptionPane.showMessageDialog(null,
				"Matr�cula: " + cod + "\n" + "Prezado, voc� possu� " + idade + " anos de idade e " + ttrabalho
						+ " anos de empresa." + "\n" + "Contudo, a orienta��o �: " + aps + ".");
	}
}
