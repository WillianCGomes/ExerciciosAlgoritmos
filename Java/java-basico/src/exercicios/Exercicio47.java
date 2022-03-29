package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para verificar quantidade em estoque
 * 
 * @author Willian Gomes
 * @since 09/02/2021
 */
public class Exercicio47 {
	/*
	 * Método principal para a execução da classe
	 */

	public static void main(String[] args) {

		// Declarações de variáveis
		double qatual, qmax, qmed, qmin;

		// Leitura dos valores
		qatual = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade atual em estoque: "));
		qmax = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade máxima em estoque: "));
		qmin = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade mínima em estoque: "));

		// Cálculo da média
		qmed = ((qmax + qmin) / 2);

		// Condicional composta
		if (qatual >= qmed) {
			JOptionPane.showMessageDialog(null, "Quantidade média = " + qmed + ". Não efetuar compra!");
		} else {
			JOptionPane.showMessageDialog(null, "Quantidade média = " + qmed + ". Efetuar compra!");
		}
	}

}
