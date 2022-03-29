package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 valores e escrever a média
 * 
 * @author Willian Carlos Gomes
 * @since 10 de fev. de 2021
 */
public class Exercicio74 {

	/*
	 * 
	 */
	public static void main(String[] args) {
		// Declarando variáveis
		double contador, valor, soma, media;

		// Iniciando as variáveis
		soma = 0;
		contador = 0;

		// Laço para atribuir os 10 valores
		do {
			valor = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor para o cálculo da média"));
			soma = soma + valor;
			contador++;
		} while (contador < 10);

		// Cálculo da média
		media = soma / contador;

		JOptionPane.showMessageDialog(null, "O valor da média é: " + media);
	}
}
