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
	 * M�todo principal para a execu��o da classe
	 */

	public static void main(String[] args) {

		// Declara��es de vari�veis
		double qatual, qmax, qmed, qmin;

		// Leitura dos valores
		qatual = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade atual em estoque: "));
		qmax = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade m�xima em estoque: "));
		qmin = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade m�nima em estoque: "));

		// C�lculo da m�dia
		qmed = ((qmax + qmin) / 2);

		// Condicional composta
		if (qatual >= qmed) {
			JOptionPane.showMessageDialog(null, "Quantidade m�dia = " + qmed + ". N�o efetuar compra!");
		} else {
			JOptionPane.showMessageDialog(null, "Quantidade m�dia = " + qmed + ". Efetuar compra!");
		}
	}

}
