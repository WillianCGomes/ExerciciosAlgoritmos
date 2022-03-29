package exercicios;

import javax.swing.JOptionPane;

/**
 * Conversão de unidade de medida de temperatura
 * 
 * @author Willian Gomes
 * @since 08/02/2021
 */
public class Exercício30 {

	/*
	 * Método principal para a execução do programa
	 */
	public static void main(String[] args) {
		// Declaração das variáveis
		double ftemperatura, ctemperatura;

		// Leitura da variavel
		ctemperatura = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em graus Celsius:"));

		// cálculo de conversão
		ftemperatura = (ctemperatura * 1.8 + 32);

		// impressão em tela
		JOptionPane.showInternalMessageDialog(null,
				ctemperatura + " graus Celsius é igual a: " + ftemperatura + " graus Fahrenheit.");

	}

}
