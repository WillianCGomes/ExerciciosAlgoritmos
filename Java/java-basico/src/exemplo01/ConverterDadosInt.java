package exemplo01;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar conversão de tipos de dados
 * 
 * @author Willian Gomes
 * @since 05/02/2021
 */
public class ConverterDadosInt {

	/*
	 * Método principal para a execução do programa
	 */
	public static void main(String[] args) {
		// Declarando variáveis
		int valor1;
		int valor2;
		int resultado;

		// Recebendo valores do usuário
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor: "));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor: "));

		// Calculando
		resultado = valor1 + valor2;

		// Imprimindo resultado em tela
		System.out.println("O resultado é: " + resultado + ".");

	}

}
