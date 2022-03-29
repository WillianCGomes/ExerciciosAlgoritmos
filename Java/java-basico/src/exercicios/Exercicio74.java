package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 valores e escrever a m�dia
 * 
 * @author Willian Carlos Gomes
 * @since 10 de fev. de 2021
 */
public class Exercicio74 {

	/*
	 * 
	 */
	public static void main(String[] args) {
		// Declarando vari�veis
		double contador, valor, soma, media;

		// Iniciando as vari�veis
		soma = 0;
		contador = 0;

		// La�o para atribuir os 10 valores
		do {
			valor = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor para o c�lculo da m�dia"));
			soma = soma + valor;
			contador++;
		} while (contador < 10);

		// C�lculo da m�dia
		media = soma / contador;

		JOptionPane.showMessageDialog(null, "O valor da m�dia �: " + media);
	}
}
