package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para informar o resultado do jogo
 * 
 * @author Willian Gomes
 * @since 09/02/2021
 */
public class Exercicio55 {
	/*
	 * Método principal para a execução da classe
	 */

	public static void main(String[] args) {

		// Declarações de variáveis {
		String t1, t2;
		int gt1, gt2;

		// Leitura dos nomes dos times e placar
		t1 = JOptionPane.showInputDialog("Informe o nome do time da casa:");
		t2 = JOptionPane.showInputDialog("Informe o nome do time visitante:");

		gt1 = Integer.parseInt(JOptionPane.showInputDialog("A partida acabou com quantos gols do time da casa?"));
		gt2 = Integer.parseInt(JOptionPane.showInputDialog("A partida acabou com quantos gols do time visitante?"));

		// Condicionais compostas
		if (gt1 > gt2) {
			JOptionPane.showMessageDialog(null, t1 + " venceram, com o placar de: " + gt1 + " X " + gt2);
		} else if (gt2 > gt1) {
			JOptionPane.showMessageDialog(null, t2 + " venceram, com o placar de: " + gt1 + " X " + gt2);
		} else
			JOptionPane.showMessageDialog(null, "Empate! Placar: " + gt1 + " X " + gt2);
	}

}
