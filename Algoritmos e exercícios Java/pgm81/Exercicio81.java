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
	 * M�todo principal para a execu��o da classe
	 */
	public static void main(String[] args) {
		// Declarando vari�veis
		int aux, menor, maior;

		aux = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor: "));

		// Inicializando as vari�veis
		menor = aux;
		maior = aux;

		for (int i = 1; i < 10; i++) {// La�o de repeti��o
			aux = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor: "));
			if (aux > maior) {
				maior = aux;
			}
			if (aux < menor) {
				menor = aux;
			}
		}
		JOptionPane.showMessageDialog(null,
				"O menor n�mero informado foi: " + menor + "\n" + "O maior n�mero informado foi: " + maior);
	}

}
