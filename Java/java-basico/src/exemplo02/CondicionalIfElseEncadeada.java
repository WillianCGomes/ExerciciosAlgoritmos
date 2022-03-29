package exemplo02;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar o uso do comando if else encadeado
 * 
 * @author Willian Gomes
 * @since 08/02/2002
 */
public class CondicionalIfElseEncadeada {

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
		} else if ((imc >= 18.5) && (imc < 24.9)) {
			JOptionPane.showMessageDialog(null, "Peso ideal!");
		} else if ((imc >= 25) && (imc <= 29.9)) {
			JOptionPane.showMessageDialog(null, "Acima do peso!");
		} else if ((imc >= 30) && (imc <= 34.9)) {
			JOptionPane.showMessageDialog(null, "Obesidade nível I!");
		} else {
			JOptionPane.showMessageDialog(null, "Obesidade mórbida");
		}

	}

}