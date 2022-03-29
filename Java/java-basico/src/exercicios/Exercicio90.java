package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para armazenar valores de usuário e informar o maior
 * 
 * @author Willian Carlos Gomes
 * @since 12 de fev. de 2021
 */
public class Exercicio90 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		// Declarando variáveis
		double aux, aux2, maior, valor[];

		// Atribuindo valor as variáveis
		valor = new double[20];
		maior = 0;
		aux = 0;

		// Obtendo informações do usuário

		for (int i = 0; i < valor.length; i++) {
			aux2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor"));
			if (aux2 < 0) {
				JOptionPane.showMessageDialog(null, "Número invalido! Por favor, digite um número positivo");
				i--;
			} else {
				valor[i] = aux2;
				aux = valor[i];
				if (aux > maior) {// Cálculo para obter o maior número informado
					maior = aux;
				}

			}
		}

		// Cálculo para obter a posição do maior número//Resultado em tela
		for (int i = 0; i < valor.length; i++) {
			if (valor[i] == maior) {
				System.out.println("O maior número é: " + maior + "\n" + "O maior número está na " + i + "º posição");
			}

		}

	}
}
