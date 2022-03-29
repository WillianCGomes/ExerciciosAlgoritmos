package exemplo01;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar conversão de dados String para Doule
 * 
 * @author Willian Gomes
 * @since 05/02/2021
 */
public class ConverterDadosDouble {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variáveis
		double valor1;
		double valor2;
		double resultado;

		// Atribuindo valores às variáveis
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
		valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));

		// cálculo
		resultado = valor1 / valor2;

		// Impressão em tela
		System.out.println("O resultado é: " + resultado + ".");

	}

}
