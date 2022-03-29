package exercicios;

import javax.swing.JOptionPane;

/**
 * Convers�o de unidade de medida de temperatura
 * 
 * @author Willian Gomes
 * @since 08/02/2021
 */
public class Exerc�cio30 {

	/*
	 * M�todo principal para a execu��o do programa
	 */
	public static void main(String[] args) {
		// Declara��o das vari�veis
		double ftemperatura, ctemperatura;

		// Leitura da variavel
		ctemperatura = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em graus Celsius:"));

		// c�lculo de convers�o
		ftemperatura = (ctemperatura * 1.8 + 32);

		// impress�o em tela
		JOptionPane.showInternalMessageDialog(null,
				ctemperatura + " graus Celsius � igual a: " + ftemperatura + " graus Fahrenheit.");

	}

}
