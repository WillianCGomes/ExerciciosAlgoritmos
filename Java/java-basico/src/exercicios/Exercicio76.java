package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler e somar 10 números
 * 
 * @author Willian Carlos Gomes
 * @since 10 de fev. de 2021
 */
public class Exercicio76 {

	/*
	 * Método principal para a execução do programa
	 */
	public static void main(String[] args) {
		// Declarando variáveis
		double contador, valor, soma;

		// Iniciando as variáveis
		soma = 0;
		contador = 0;

		// Laço para atribuir e somar os 10 valores

		do {
			valor = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor para o cálculo da soma: "));
			soma = soma + valor;
			contador++;
		} while (contador < 10);

		JOptionPane.showMessageDialog(null, "O valor da soma destes valores é: " + soma);

	}

}
