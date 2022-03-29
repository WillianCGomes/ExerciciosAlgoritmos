package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para imprimir sequências de números
 * 
 * @author Willian Carlos Gomes
 * @since 11 de fev. de 2021
 */
public class Exercicio86 {

	/*
	 * Método principal para a execução da Classe
	 */
	public static void main(String[] args) {

		// Declarando variáveis
		int resultado, restante = 123456789;
		int fim = 10;

		// Laço de repetição para ir mudando o primeiro número
		for (int i = 1; i < 11; i++) {
			resultado = restante;
			JOptionPane.showMessageDialog(null, i + "," + resultado + fim);// Resultado tem tela
		}

	}

}