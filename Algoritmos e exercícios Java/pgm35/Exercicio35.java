package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular idade
 * 
 * @author Willian Gomes
 * @since 08/02/2021
 */
public class Exercicio35 {

	/*
	 * Método principal para a execução do programa
	 */
	public static void main(String[] args) {
		// Declarações de variáveis
		double anonasc, anoatual, idade, meses, dias, semana;

		// Leitura do ano de nascimento e ano atual
		anonasc = Double.parseDouble(JOptionPane.showInputDialog("Em que ano você nasceu?"));
		anoatual = Double.parseDouble(JOptionPane.showInputDialog("Qual o ano atual?"));

		// calculo da idade
		idade = (anoatual - anonasc);
		meses = (idade * 12);
		dias = (idade * 365);
		semana = (dias / 7);

		// Impressão em tela
		JOptionPane.showMessageDialog(null, "A sua idade é " + idade + " anos. \n Você tem " + meses
				+ " meses de vida.\n Você tem " + dias + " dias de vida.\n Você tem " + semana + " semanas de vida.");

	}

}
