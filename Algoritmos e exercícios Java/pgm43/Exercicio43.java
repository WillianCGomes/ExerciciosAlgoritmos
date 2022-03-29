package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para verificar a duração de uma partida de xadrez
 * 
 * @author Willian Gomes
 * @since 09/02/2021
 */
public class Exercicio43 {
	/*
	 * Método principal para a execução da classe
	 */

	public static void main(String[] args) {
		// Declarações de variáveis
		double hinicio, hfim, htotal;

		// Leitura do horário
		hinicio = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o horário de início (no formato 24 horas):"));
		hfim = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o horário de término (no formato 24 horas):"));

		// Condicionais para verificação
		if (hinicio == hfim) {
			JOptionPane.showMessageDialog(null, "Tempo máximo de duração atingido: 24 horas.");
		}
		
		//Condicionais para partida inferior a 1 dia e impressões em tela
		else if (hfim >= hinicio) {
			htotal = (hfim - hinicio);
			JOptionPane.showMessageDialog(null, "A duração da partida foi de: " + htotal + " horas.");
		} else {
			htotal = ((24 - hinicio) + hfim);
			JOptionPane.showMessageDialog(null, "A duração da partida foi de: " + htotal + " horas.");
		}

	}

}
