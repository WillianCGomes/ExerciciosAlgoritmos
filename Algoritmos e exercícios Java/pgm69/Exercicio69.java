package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler um valor e imprimir todos os valores inteiros entre 1 e ele
 * @author Willian Carlos Gomes
 * @since 10 de fev. de 2021
 */
public class Exercicio69 {

	/*
	 * Método principal para a execução da classe
	 */
	
	public static void main(String[] args) {
		//Declarando variáveis
		int n;
		
		//Solicitação do valor
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
		
		//Contagem dos valores
		System.out.println("Os valores entre 1 e " + n + "(incluindo-os), são:");
		for (int i = 1; i <= n ; i++) {
			System.out.println(i);
		}
		
		
	}

}
