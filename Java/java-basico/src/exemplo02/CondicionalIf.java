package exemplo02;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar o comando if
 * 
 * @author Willian Gomes
 * @since 08/02/2021
 */
public class CondicionalIf {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// Declarando variáveis
		double imc, altura, peso;

		// Capturando os dados do usuário
		peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso: "));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura: "));

		// Calculando o IMC do Usuário
		imc = peso / (Math.pow(altura, 2));

		// Exibir o resultado do IMC
		if (imc < 18.5) {
			JOptionPane.showMessageDialog(null, "Abaixo do peso.");
		}
		if ((imc >= 18.5) && (imc <= 24.9)) {
			JOptionPane.showMessageDialog(null, "Peso ideal.");
		}
	}

}
