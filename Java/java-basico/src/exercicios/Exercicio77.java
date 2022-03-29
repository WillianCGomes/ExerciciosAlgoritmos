package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler números e somar os menores que 40
 * 
 * @author Willian Carlos Gomes
 * @since 10 de fev. de 2021
 */
public class Exercicio77 {

	/*
	 * Método principal para a execução do programa
	 */
	public static void main(String[] args) {
		// Declarando variáveis

		double contador, valor, soma;

		// Iniciando as variáveis
		soma = 0;
		contador = 0;

		// Primeira mensagem para diferenciar o programa
		valor = Double.parseDouble(JOptionPane.showInputDialog(null,
				"Para começar, digite um valor. Valores inferiores a 40 serão somados: "));
		if (valor < 40) {// Incluir o valor à soma
			soma = soma + valor;
		}
		contador++;

		// Laço para atribuir os 9 valores restantes
		while (contador < 10) {
			valor = Double.parseDouble(JOptionPane.showInputDialog("Por favor, digite mais um valor: "));
			if (valor < 40) {// Incluir o valor à soma
				soma = soma + valor;
			}
			contador++;
		}
		JOptionPane.showMessageDialog(null, "O resultado da soma dos números menores que 40 é: " + soma);

	}

}
