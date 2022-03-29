package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular e escrever a média aritmética dos números inteiros
 * entre 15 (inclusive) e 100 (inclusive).
 * 
 * @author Willian Carlos Gomes
 * @since 10 de fev. de 2021
 */
public class Exercicio79 {

	/*
	 * Método principal para a execução do programa
	 */
	public static void main(String[] args) {
		// Declarando variáveis
		int aux;

		// Iniciando a variável
		aux = 0;

		// Laço contando de 15 a 100 e auxiliar recebendo o incremento
		for (int i = 15; i <= 100; i++) {
			aux += i;

		}
		// Impressão em tela
		JOptionPane.showMessageDialog(null, "Média dos números entre 15 e 100: " + aux / 85);
		;
	}

}
