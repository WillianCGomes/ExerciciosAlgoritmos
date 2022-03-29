package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para armazenar valores do usu�rio e informar o menot
 * @author Willian Carlos Gomes
 * @since 12 de fev. de 2021
 */
public class Exercicio91 {

	/*
	 * M�todo principal para a execu��o do programa
	 */
	
	public static void main(String[] args) {

			// Declarando vari�veis
			double aux, aux2, menor, valor[];

			// Atribuindo valor as vari�veis
			valor = new double[20];
			menor = 999999999;
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
					if (aux < menor) {// C�lculo para obter o menor n�mero informado
						menor = aux;
					}
				}
				
			}

			// C�lculo para obter a posi��o do maior n�mero//Resultado em tela
			for (int i = 0; i < valor.length; i++) {
				if (valor[i] == menor) {
					System.out.println("O menor n�mero �: " + menor + "\n" + "O menor n�mero est� na " + i + "� posi��o");
				}
			}
	}

}
