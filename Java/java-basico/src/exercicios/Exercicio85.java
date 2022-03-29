package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para exibir a tabuada do 1 ao 10
 * 
 * @author Willian Carlos Gomes
 * @since 11 de fev. de 2021
 */
public class Exercicio85 {

	/*
	 * Método principal para a execução da Classe
	 */
	public static void main(String[] args) {
		// Declarando variáveis
		String resultado;
		int inicio, restabuada, x;

		// Atribuindo valores as variáveis
		resultado = "";

		// Laço de repetição para fazer o cálculo da tabuada (do 1 ao 10)
		for (inicio = 1; inicio < 2;) {// Início do laço
			for (x = 1; x < 11;) {
				for (int i = 1; i < 11; i++) {
					restabuada = x * i;
					resultado += x + " X " + i + " = " + restabuada + "\n";
					inicio++;
				}
				x++;
				JOptionPane.showMessageDialog(null, resultado); // Resultado em tela
				resultado = "";
			} // Final do laço
			inicio++;
		}

	}

}
