package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular e escrever a m�dia aritm�tica dos n�meros inteiros
 * entre 15 (inclusive) e 100 (inclusive).
 * 
 * @author Willian Carlos Gomes
 * @since 10 de fev. de 2021
 */
public class Exercicio79 {

	/*
	 * M�todo principal para a execu��o do programa
	 */
	public static void main(String[] args) {
		// Declarando vari�veis
		int aux;

		// Iniciando a vari�vel
		aux = 0;

		// La�o contando de 15 a 100 e auxiliar recebendo o incremento
		for (int i = 15; i <= 100; i++) {
			aux += i;

		}
		// Impress�o em tela
		JOptionPane.showMessageDialog(null, "M�dia dos n�meros entre 15 e 100: " + aux / 85);
		;
	}

}
