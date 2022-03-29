package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para armazenar valores do usuário e informar o menot
 * @author Willian Carlos Gomes
 * @since 12 de fev. de 2021
 */
public class Exercicio91 {

	/*
	 * Método principal para a execução do programa
	 */
	
	public static void main(String[] args) {

			// Declarando variáveis
			double aux, aux2, menor, valor[];

			// Atribuindo valor as variáveis
			valor = new double[20];
			menor = 999999999;
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
					if (aux < menor) {// Cálculo para obter o menor número informado
						menor = aux;
					}
				}
				
			}

			// Cálculo para obter a posição do maior número//Resultado em tela
			for (int i = 0; i < valor.length; i++) {
				if (valor[i] == menor) {
					System.out.println("O menor número é: " + menor + "\n" + "O menor número está na " + i + "º posição");
				}
			}
	}

}
