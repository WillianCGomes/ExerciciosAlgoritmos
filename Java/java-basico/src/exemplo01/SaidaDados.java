package exemplo01;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar exibi��o de dados para o usu�rio
 * 
 * @author Willian Gomes
 * @Since 05/02/2021
 */
public class SaidaDados {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {

		// Declarando vari�veis
		double num1, num2, res;

		// Atribuindo valores para as vari�veis
		num1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro n�mero"));
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo n�mero"));

		// Efetuando a opera��o de multiplica��o
		res = num1 * num2;

		// Exibindo o resultado no console
		JOptionPane.showMessageDialog(null, "O primeiro valor digitado �: " + num1 + "\n"
										  + "O segundo valor digitado �: " + num2 + "\n" 
										  + "O resultado da opera��o �: " + res);

	}
}
