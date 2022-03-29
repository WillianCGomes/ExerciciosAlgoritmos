package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para verificar o maior entre 2 valores
 * 
 * @author Willian Gomes
 * @since 09/02/2021
 */
public class Exercicio41 {
	/*
	 * M�todo principal para a execu��o da classe
	 */

	public static void main(String[] args) {
		// Declara��es de vari�veis
		double v1, v2;
		
		//Leitura dos valores
		v1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro valor:"));
		v2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo valor:"));
		
		//Condicional para identifica��o do maior
		if(v1>v2) {
			JOptionPane.showMessageDialog(null, "O primeiro valor informado ("+v1+") � o maior!");
		}
			else {
			JOptionPane.showMessageDialog(null, "O segundo valor informado ("+v2+") � o maior!");
		}
	}

}
