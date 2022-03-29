package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular a média dos exercícios avaliativos
 * 
 * @author Willian Gomes
 * @since 09/02/2021
 */
public class Exercicio63 {
	/*
	 * Método principal para a execução da classe
	 */
	public static void main(String[] args) {

// Declarações de variáveis
		int cod, anonasc, anoing, anoatual, ttrabalho, idade;
		String aps;

		// Leitura dos dados do funcionário
		cod = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua matrícula"));
		anonasc = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu ano de nascimento, por favor:"));
		anoing = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu ano de ingresso na Organização:"));

		// Cálculo do tempo de trabalho
		anoatual = (2021);
		ttrabalho = (anoatual - anoing);

		// Cálculo da idade do funcionário
		idade = (anoatual - anonasc);

		// Condicionais compostas para a possibilidade de aposentadoria
		if (idade >= 65) {
			aps = ("Requerer aposentadoria");
		} else if (ttrabalho >= 30) {
			aps = ("Requerer aposentadoria");
		} else if ((idade >= 60) && (ttrabalho >= 25)) {
			aps = ("Requerer aposentadoria");
		} else {
			aps = ("Não requerer aposentadoria");
		}

		// Impressão em tela do resultado
		JOptionPane.showMessageDialog(null,
				"Matrícula: " + cod + "\n" + "Prezado, você possuí " + idade + " anos de idade e " + ttrabalho
						+ " anos de empresa." + "\n" + "Contudo, a orientação é: " + aps + ".");
	}
}
