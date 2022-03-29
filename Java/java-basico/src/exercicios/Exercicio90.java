package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para armazenar valores de usu�rio e informar o maior
 * 
 * @author Willian Carlos Gomes
 * @since 12 de fev. de 2021
 */
public class Exercicio90 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {

		// Declarando vari�veis
		double aux, aux2, maior, valor[];

		// Atribuindo valor as vari�veis
		valor = new double[20];
		maior = 0;
		aux = 0;

		// Obtendo informa��es do usu�rio

		for (int i = 0; i < valor.length; i++) {
			aux2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor"));
			if (aux2 < 0) {
				JOptionPane.showMessageDialog(null, "N�mero invalido! Por favor, digite um n�mero positivo");
				i--;
			} else {
				valor[i] = aux2;
				aux = valor[i];
				if (aux > maior) {// C�lculo para obter o maior n�mero informado
					maior = aux;
				}

			}
		}

		// C�lculo para obter a posi��o do maior n�mero//Resultado em tela
		for (int i = 0; i < valor.length; i++) {
			if (valor[i] == maior) {
				System.out.println("O maior n�mero �: " + maior + "\n" + "O maior n�mero est� na " + i + "� posi��o");
			}

		}

	}
}
