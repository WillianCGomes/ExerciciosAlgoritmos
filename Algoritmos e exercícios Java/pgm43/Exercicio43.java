package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para verificar a dura��o de uma partida de xadrez
 * 
 * @author Willian Gomes
 * @since 09/02/2021
 */
public class Exercicio43 {
	/*
	 * M�todo principal para a execu��o da classe
	 */

	public static void main(String[] args) {
		// Declara��es de vari�veis
		double hinicio, hfim, htotal;

		// Leitura do hor�rio
		hinicio = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o hor�rio de in�cio (no formato 24 horas):"));
		hfim = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o hor�rio de t�rmino (no formato 24 horas):"));

		// Condicionais para verifica��o
		if (hinicio == hfim) {
			JOptionPane.showMessageDialog(null, "Tempo m�ximo de dura��o atingido: 24 horas.");
		}
		
		//Condicionais para partida inferior a 1 dia e impress�es em tela
		else if (hfim >= hinicio) {
			htotal = (hfim - hinicio);
			JOptionPane.showMessageDialog(null, "A dura��o da partida foi de: " + htotal + " horas.");
		} else {
			htotal = ((24 - hinicio) + hfim);
			JOptionPane.showMessageDialog(null, "A dura��o da partida foi de: " + htotal + " horas.");
		}

	}

}
