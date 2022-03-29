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
	 * Método principal para a execução da classe
	 */

	public static void main(String[] args) {
		// Declarações de variáveis
		double v1, v2;
		
		//Leitura dos valores
		v1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro valor:"));
		v2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo valor:"));
		
		//Condicional para identificação do maior
		if(v1>v2) {
			JOptionPane.showMessageDialog(null, "O primeiro valor informado ("+v1+") é o maior!");
		}
			else {
			JOptionPane.showMessageDialog(null, "O segundo valor informado ("+v2+") é o maior!");
		}
	}

}
