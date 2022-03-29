package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para imprimir sequ�ncias de n�meros
 * 
 * @author Willian Carlos Gomes
 * @since 11 de fev. de 2021
 */
public class Exercicio86 {

	/*
	 * M�todo principal para a execu��o da Classe
	 */
	public static void main(String[] args) {

		// Declarando vari�veis
		int resultado, restante = 123456789;
		int fim = 10;

		// La�o de repeti��o para ir mudando o primeiro n�mero
		for (int i = 1; i < 11; i++) {
			resultado = restante;
			JOptionPane.showMessageDialog(null, i + "," + resultado + fim);// Resultado tem tela
		}

	}

}