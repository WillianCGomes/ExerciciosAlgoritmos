package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para verificar 10 valores e identificar o maior e o menor
 * 
 * @author Willian Carlos Gomes
 * @since 10 de fev. de 2021
 */
public class Exercicio81 {

	/*
	 * Método principal para a execução da classe
	 */
	public static void main(String[] args) {
		// Declarando variáveis
		int aux, menor, maior;

		aux = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor: "));

		// Inicializando as variáveis
		menor = aux;
		maior = aux;

		for (int i = 1; i < 10; i++) {// Laço de repetição
			aux = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor: "));
			if (aux > maior) {
				maior = aux;
			}
			if (aux < menor) {
				menor = aux;
			}
		}
		JOptionPane.showMessageDialog(null,
				"O menor número informado foi: " + menor + "\n" + "O maior número informado foi: " + maior);
	}

}
