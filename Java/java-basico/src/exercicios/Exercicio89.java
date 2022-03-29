package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular m�dia de uma turma de 20 alunos
 * 
 * @author Willian Carlos Gomes
 * @since 11 de fev. de 2021
 */

public class Exercicio89 {

	/*
	 * M�todo principal para a execu��o da classe
	 */
	public static void main(String[] args) {

		// Declarando vari�veis
				int contador, notas[], naluno;
				double aux = 0, media;

				// Atribuindo valores as vari�veis
				notas = new int[20];
				contador = 0;

				// Obtendo informa��es do usu�rio
				for (int i = 0; i < notas.length; i++) {
					naluno = (i+1);
					notas[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota do aluno, n� " + (int)naluno));
					aux += notas[i];
				}

				// C�lculo para obter a m�dia das notas
				media = aux / 20;
				for (int i = 0; i < notas.length; i++) {
					if (notas[i] > media) {
						contador++;
					}
				}

				// Resultado em tela
				System.out.println(
						"A m�dia das notas � de: " + media + "\n" + "Quantidade de alunos acima da m�dia: " + contador);

	
	}

}
