package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler o código e o preço de 5 produtos e calcular média e maior
 * preço
 * 
 * @author Willian Carlos Gomes
 * @since 11 de fev. de 2021
 */
public class Exercicio83 {

	/*
	 * Método principal para a execução da Classe
	 */
	public static void main(String[] args) {

		// Declarando variáveis
		String codigo, resultado = "";
		int aux, maior, aux2;
		double calculo, media = 0;

		// Atribuindo valores as variáveis
		maior = -999999999;
		aux2 = 0;
		calculo = 0;

		// Obtendo informações do usuário//Laço de repetição para cálcular o maior
		// número informado
		for (int i = 1; i <= 5; i++) { // Início do laço
			codigo = JOptionPane.showInputDialog("Digite o código do " + i + "º" + " produto");
			aux = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor"));
			if (aux > maior) { // Obtendo o maior número informado
				maior = aux;
			}
			if (aux > aux2) { // Cálculo para saber a soma dos números digitados pelo usuário
				calculo += aux;
				aux2 = 0;
			}
			resultado += "Código do " + i + "º" + " produto " + "é: " + codigo + "\n";
		} // Fim do laço

		// Cálculo para obter a média dos números
		media = calculo / 5;

		// Resultado em tela
		JOptionPane.showMessageDialog(null,
				resultado + "Maior número é: " + maior + "\n" + "A média dos números é de: " + media);
	}
}
