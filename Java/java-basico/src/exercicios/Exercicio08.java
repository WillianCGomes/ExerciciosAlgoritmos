package exercicios;

import javax.swing.JOptionPane;

/**
 * Receber e exibir o salario e vr
 * 
 * @author Willian Gomes
 * @since 05/02/2021
 */
public class Exercicio08 {

	/*
	 * M�todo principal para executar o programa
	 */

	public static void main(String[] args) {

		// Declarando vari�veis
		Double salario, vr;


		// Atribui��es dos valores �s vari�veis
		salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu sal�rio: "));
		vr = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do seu vale refei��o: "));
		
		// Impress�o em tela
		System.out.println("Seu sal�rio �: " + salario + ".");
		System.out.println("Seu vale refei��o �: " + vr + ".");

	}

}
