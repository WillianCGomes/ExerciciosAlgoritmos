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
	 * M�todo principal para a execu��o do programa
	 */
	public static void main(String[] args) {
		// Declara��es de vari�veis
		double anonasc, anoatual, idade, meses, dias, semana;

		// Leitura do ano de nascimento e ano atual
		anonasc = Double.parseDouble(JOptionPane.showInputDialog("Em que ano voc� nasceu?"));
		anoatual = Double.parseDouble(JOptionPane.showInputDialog("Qual o ano atual?"));

		// calculo da idade
		idade = (anoatual - anonasc);
		meses = (idade * 12);
		dias = (idade * 365);
		semana = (dias / 7);

		// Impress�o em tela
		JOptionPane.showMessageDialog(null, "A sua idade � " + idade + " anos. \n Voc� tem " + meses
				+ " meses de vida.\n Voc� tem " + dias + " dias de vida.\n Voc� tem " + semana + " semanas de vida.");

	}

}
