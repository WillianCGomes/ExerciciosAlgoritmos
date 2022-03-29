package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler n�mero de alunos e calcular a m�dia de notas
 * 
 * @author Willian Carlos Gomes
 * @since 10 de fev. de 2021
 */
public class Exercicio75 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// Declarando vari�veis
		int nalunos, calculo, notas, div;
		double media;

		// Obtendo informa��es do usu�rio
		nalunos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos"));

		// Atribuindo o valor as vari�veis
		calculo = 0;
		div = nalunos;

		// Obtendo informa��es do usu�rio//Soma das notas
		do {
			notas = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota do aluno:"));
			calculo += notas;
			nalunos--;
		} while (nalunos > 0);

		// C�lculando a m�dia das notas
		media = calculo / div;

		// Resultado em tela
		JOptionPane.showMessageDialog(null, "A m�dia das notas �: " + media);

	}

}