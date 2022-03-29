package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler um valor e imprimir todos os valores inteiros entre 1 e ele
 * @author Willian Carlos Gomes
 * @since 10 de fev. de 2021
 */
public class Exercicio69 {

	/*
	 * M�todo principal para a execu��o da classe
	 */
	
	public static void main(String[] args) {
		//Declarando vari�veis
		int n;
		
		//Solicita��o do valor
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
		
		//Contagem dos valores
		System.out.println("Os valores entre 1 e " + n + "(incluindo-os), s�o:");
		for (int i = 1; i <= n ; i++) {
			System.out.println(i);
		}
		
		
	}

}
