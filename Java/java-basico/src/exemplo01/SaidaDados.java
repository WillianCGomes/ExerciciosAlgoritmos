package exemplo01;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar exibição de dados para o usuário
 * 
 * @author Willian Gomes
 * @Since 05/02/2021
 */
public class SaidaDados {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		// Declarando variáveis
		double num1, num2, res;

		// Atribuindo valores para as variáveis
		num1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro número"));
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo número"));

		// Efetuando a operação de multiplicação
		res = num1 * num2;

		// Exibindo o resultado no console
		JOptionPane.showMessageDialog(null, "O primeiro valor digitado é: " + num1 + "\n"
										  + "O segundo valor digitado é: " + num2 + "\n" 
										  + "O resultado da operação é: " + res);

	}
}
