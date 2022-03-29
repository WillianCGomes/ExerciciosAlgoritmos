package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler número de alunos e calcular a média de notas
 * 
 * @author Willian Carlos Gomes
 * @since 10 de fev. de 2021
 */
public class Exercicio75 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// Declarando variáveis
		int nalunos, calculo, notas, div;
		double media;

		// Obtendo informações do usuário
		nalunos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos"));

		// Atribuindo o valor as variáveis
		calculo = 0;
		div = nalunos;

		// Obtendo informações do usuário//Soma das notas
		do {
			notas = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota do aluno:"));
			calculo += notas;
			nalunos--;
		} while (nalunos > 0);

		// Cálculando a média das notas
		media = calculo / div;

		// Resultado em tela
		JOptionPane.showMessageDialog(null, "A média das notas é: " + media);

	}

}