package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler n�meros e somar os menores que 40
 * 
 * @author Willian Carlos Gomes
 * @since 10 de fev. de 2021
 */
public class Exercicio77 {

	/*
	 * M�todo principal para a execu��o do programa
	 */
	public static void main(String[] args) {
		// Declarando vari�veis

		double contador, valor, soma;

		// Iniciando as vari�veis
		soma = 0;
		contador = 0;

		// Primeira mensagem para diferenciar o programa
		valor = Double.parseDouble(JOptionPane.showInputDialog(null,
				"Para come�ar, digite um valor. Valores inferiores a 40 ser�o somados: "));
		if (valor < 40) {// Incluir o valor � soma
			soma = soma + valor;
		}
		contador++;

		// La�o para atribuir os 9 valores restantes
		while (contador < 10) {
			valor = Double.parseDouble(JOptionPane.showInputDialog("Por favor, digite mais um valor: "));
			if (valor < 40) {// Incluir o valor � soma
				soma = soma + valor;
			}
			contador++;
		}
		JOptionPane.showMessageDialog(null, "O resultado da soma dos n�meros menores que 40 �: " + soma);

	}

}
