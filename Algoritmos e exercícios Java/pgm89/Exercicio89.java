package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular média de uma turma de 20 alunos
 * 
 * @author Willian Carlos Gomes
 * @since 11 de fev. de 2021
 */

public class Exercicio89 {

	/*
	 * Método principal para a execução da classe
	 */
	public static void main(String[] args) {

		// Declarando variáveis
				int contador, notas[], naluno;
				double aux = 0, media;

				// Atribuindo valores as variáveis
				notas = new int[20];
				contador = 0;

				// Obtendo informações do usuário
				for (int i = 0; i < notas.length; i++) {
					naluno = (i+1);
					notas[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota do aluno, nº " + (int)naluno));
					aux += notas[i];
				}

				// Cálculo para obter a média das notas
				media = aux / 20;
				for (int i = 0; i < notas.length; i++) {
					if (notas[i] > media) {
						contador++;
					}
				}

				// Resultado em tela
				System.out.println(
						"A média das notas é de: " + media + "\n" + "Quantidade de alunos acima da média: " + contador);

	
	}

}
