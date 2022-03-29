package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler, armazenar a temperatura média de todos os dias da semana e
 * exibir algumas informações
 * 
 * @author Willian Carlos Gomes
 * @since 14 de fev. de 2021
 */
public class Exercicio100 {

	/*
	 * Método principal para a execução do programa
	 */
	public static void main(String[] args) {

		// Declarando vetor e variáveis
		double temp[], maior, menor, media;
		int quantidade;

		// Definindo o vetor e seu tamanho
		temp = new double[7];

		// Inicialização de variáveis
		maior = -999999999;
		menor = 999999999;
		media = 0;
		quantidade = 0;

		// Solicitação de temperaturas para o usuário e armazenamento no vetor
		for (int i = 0; i < temp.length; i++) {
			temp[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura do dia " + (i + 1) + ":"
					+ "\n" + "1. Domingo" + "\n2. Segunda-feira" + "\n3. Terça-feira" + "\n4. Quarta-feira"
					+ "\n5. Quinta-feira" + "\n6. Sexta-feira" + "\n7. Sábado"));

			// Caso um próximo valor informado seja superior à variável "maior", seu valor a
			// substituirá
			if (temp[i] > maior) {
				maior = temp[i];
				// Caso um próximo valor informado seja inferior à variável "menor", seu valor a
				// substituirá
			}
			if (temp[i] < menor) {
				menor = temp[i];
			}
			// Cálculo da média de temperatura
			media = media + temp[i];
		}
		media = media / 7;

		// Incremento da variável que conta os dias com temperaturas inferiores à média
		for (int i = 0; i < temp.length; i++) {
			if (temp[i] < media) {
				quantidade++;
			}
		}

		// Exibições em tela
		System.out.println("A menor temperatura da semana foi: " + menor);
		System.out.println("A maior temperatura da semana foi: " + maior);
		System.out.println("A temperatura média da semana foi: " + media);
		System.out.println("O número de dias com temperatura inferior a média da semana foi de: " + quantidade);
	}

}