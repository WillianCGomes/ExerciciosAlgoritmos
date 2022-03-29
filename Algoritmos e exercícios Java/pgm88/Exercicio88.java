package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para buscar um nome espec�fico no vetor
 * 
 * @author Willian Carlos Gomes
 * @since 11 de fev. de 2021
 */
public class Exercicio88 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// Declarando o vetor String
		String nomes[];

		// Inicializar e definir o tamanho do vetor
		nomes = new String[10];

		// Recebendo do usu�rio os nomes e armazenando em um vetor
		for (int i = 0; i < nomes.length; i++) {
			nomes[i] = JOptionPane.showInputDialog("Informe um nome");
		}

		// Recebendo do usu�rio um nome qualquer
		String busca = JOptionPane.showInputDialog("Informe um nome a ser procurado");

		// Vari�vel auxiliar para contar as vezes que achou o nome escolhido pelo
		// usu�rio
		boolean achou = false;

		// Varrendo o vetor para verificar se o nome informado pelo usu�rio existe
		for (int i = 0; i < nomes.length; i++) {
			if (nomes[i].equals(busca)) {
				achou = true;
			}
		}
		//exibindo o resultado da busca
		if (achou) {
			System.out.println("ACHEI");
		} else {
			System.out.println("N�O ACHEI");
		}
	}
}