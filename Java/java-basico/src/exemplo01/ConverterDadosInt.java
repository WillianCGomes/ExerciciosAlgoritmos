package exemplo01;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar convers�o de tipos de dados
 * 
 * @author Willian Gomes
 * @since 05/02/2021
 */
public class ConverterDadosInt {

	/*
	 * M�todo principal para a execu��o do programa
	 */
	public static void main(String[] args) {
		// Declarando vari�veis
		int valor1;
		int valor2;
		int resultado;

		// Recebendo valores do usu�rio
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor: "));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor: "));

		// Calculando
		resultado = valor1 + valor2;

		// Imprimindo resultado em tela
		System.out.println("O resultado �: " + resultado + ".");

	}

}
