package exemplo01;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar convers�o de dados String para Doule
 * 
 * @author Willian Gomes
 * @since 05/02/2021
 */
public class ConverterDadosDouble {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando vari�veis
		double valor1;
		double valor2;
		double resultado;

		// Atribuindo valores �s vari�veis
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
		valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));

		// c�lculo
		resultado = valor1 / valor2;

		// Impress�o em tela
		System.out.println("O resultado �: " + resultado + ".");

	}

}
