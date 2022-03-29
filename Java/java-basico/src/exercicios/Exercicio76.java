package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler e somar 10 n�meros
 * 
 * @author Willian Carlos Gomes
 * @since 10 de fev. de 2021
 */
public class Exercicio76 {

	/*
	 * M�todo principal para a execu��o do programa
	 */
	public static void main(String[] args) {
		// Declarando vari�veis
		double contador, valor, soma;

		// Iniciando as vari�veis
		soma = 0;
		contador = 0;

		// La�o para atribuir e somar os 10 valores

		do {
			valor = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor para o c�lculo da soma: "));
			soma = soma + valor;
			contador++;
		} while (contador < 10);

		JOptionPane.showMessageDialog(null, "O valor da soma destes valores �: " + soma);

	}

}
