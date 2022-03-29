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
	 * M�todo principal para a execu��o da Classe
	 */
	public static void main(String[] args) {
		// Declarando vari�veis
		String resultado;
		int inicio, restabuada, x;

		// Atribuindo valores as vari�veis
		resultado = "";

		// La�o de repeti��o para fazer o c�lculo da tabuada (do 1 ao 10)
		for (inicio = 1; inicio < 2;) {// In�cio do la�o
			for (x = 1; x < 11;) {
				for (int i = 1; i < 11; i++) {
					restabuada = x * i;
					resultado += x + " X " + i + " = " + restabuada + "\n";
					inicio++;
				}
				x++;
				JOptionPane.showMessageDialog(null, resultado); // Resultado em tela
				resultado = "";
			} // Final do la�o
			inicio++;
		}

	}

}
