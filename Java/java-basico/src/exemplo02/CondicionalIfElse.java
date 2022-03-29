package exemplo02;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar o uso do comando if else
 * 
 * @author Willian Gomes
 * @since 08/02/2002
 */
public class CondicionalIfElse {

	/*
	 * Método principal de execução
	 */
	public static void main(String[] args) {
		// Declaração das variáveis
		double imc, altura, peso;

		// Capturando os dados do usuário
		peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso: "));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura: "));

		// Calculando o IMC do Usuário
		imc = peso / (Math.pow(altura, 2));

		// Demonstrando o resultado para o usuário
		if (imc < 18.5) {
			JOptionPane.showMessageDialog(null, "Abaixo do peso!");
		} else {
			JOptionPane.showMessageDialog(null, "Peso ideal!");
		}

	}

}
