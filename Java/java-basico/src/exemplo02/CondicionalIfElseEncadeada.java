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
	 * M�todo principal de execu��o
	 */
	public static void main(String[] args) {
		// Declara��o das vari�veis
		double imc, altura, peso;

		// Capturando os dados do usu�rio
		peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso: "));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura: "));

		// Calculando o IMC do Usu�rio
		imc = peso / (Math.pow(altura, 2));

		// Demonstrando o resultado para o usu�rio
		if (imc < 18.5) {
			JOptionPane.showMessageDialog(null, "Abaixo do peso!");
		} else if ((imc >= 18.5) && (imc < 24.9)) {
			JOptionPane.showMessageDialog(null, "Peso ideal!");
		} else if ((imc >= 25) && (imc <= 29.9)) {
			JOptionPane.showMessageDialog(null, "Acima do peso!");
		} else if ((imc >= 30) && (imc <= 34.9)) {
			JOptionPane.showMessageDialog(null, "Obesidade n�vel I!");
		} else {
			JOptionPane.showMessageDialog(null, "Obesidade m�rbida");
		}

	}

}