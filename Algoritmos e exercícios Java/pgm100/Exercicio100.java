package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler, armazenar a temperatura m�dia de todos os dias da semana e
 * exibir algumas informa��es
 * 
 * @author Willian Carlos Gomes
 * @since 14 de fev. de 2021
 */
public class Exercicio100 {

	/*
	 * M�todo principal para a execu��o do programa
	 */
	public static void main(String[] args) {

		// Declarando vetor e vari�veis
		double temp[], maior, menor, media;
		int quantidade;

		// Definindo o vetor e seu tamanho
		temp = new double[7];

		// Inicializa��o de vari�veis
		maior = -999999999;
		menor = 999999999;
		media = 0;
		quantidade = 0;

		// Solicita��o de temperaturas para o usu�rio e armazenamento no vetor
		for (int i = 0; i < temp.length; i++) {
			temp[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura do dia " + (i + 1) + ":"
					+ "\n" + "1. Domingo" + "\n2. Segunda-feira" + "\n3. Ter�a-feira" + "\n4. Quarta-feira"
					+ "\n5. Quinta-feira" + "\n6. Sexta-feira" + "\n7. S�bado"));

			// Caso um pr�ximo valor informado seja superior � vari�vel "maior", seu valor a
			// substituir�
			if (temp[i] > maior) {
				maior = temp[i];
				// Caso um pr�ximo valor informado seja inferior � vari�vel "menor", seu valor a
				// substituir�
			}
			if (temp[i] < menor) {
				menor = temp[i];
			}
			// C�lculo da m�dia de temperatura
			media = media + temp[i];
		}
		media = media / 7;

		// Incremento da vari�vel que conta os dias com temperaturas inferiores � m�dia
		for (int i = 0; i < temp.length; i++) {
			if (temp[i] < media) {
				quantidade++;
			}
		}

		// Exibi��es em tela
		System.out.println("A menor temperatura da semana foi: " + menor);
		System.out.println("A maior temperatura da semana foi: " + maior);
		System.out.println("A temperatura m�dia da semana foi: " + media);
		System.out.println("O n�mero de dias com temperatura inferior a m�dia da semana foi de: " + quantidade);
	}

}