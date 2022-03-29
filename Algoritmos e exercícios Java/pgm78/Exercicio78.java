package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular e escrever a soma dos inteiros existentes entre os 2
 * valores lidos
 * 
 * @author Willian Carlos Gomes
 * @since 10 de fev. de 2021
 */
public class Exercicio78 {

	/*
	 * Método principal para a execução do programa
	 */
	public static void main(String[] args) {
		// Declarando variáveis
		double v1, v2, soma;

		// Solicitando valores do usuário
		v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
		v2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));

		// Inicializando a variável soma
		soma = 0;

		// Laço para verificação
		for (int i = (int) v1; i <= v2; i++) {
			soma += i;
		}

		// Impressão em tela
		JOptionPane.showMessageDialog(null, soma);
	}

}
