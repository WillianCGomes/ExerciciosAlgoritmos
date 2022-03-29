package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler o c�digo e o pre�o de 5 produtos e calcular m�dia e maior
 * pre�o
 * 
 * @author Willian Carlos Gomes
 * @since 11 de fev. de 2021
 */
public class Exercicio83 {

	/*
	 * M�todo principal para a execu��o da Classe
	 */
	public static void main(String[] args) {

		// Declarando vari�veis
		String codigo, resultado = "";
		int aux, maior, aux2;
		double calculo, media = 0;

		// Atribuindo valores as vari�veis
		maior = -999999999;
		aux2 = 0;
		calculo = 0;

		// Obtendo informa��es do usu�rio//La�o de repeti��o para c�lcular o maior
		// n�mero informado
		for (int i = 1; i <= 5; i++) { // In�cio do la�o
			codigo = JOptionPane.showInputDialog("Digite o c�digo do " + i + "�" + " produto");
			aux = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor"));
			if (aux > maior) { // Obtendo o maior n�mero informado
				maior = aux;
			}
			if (aux > aux2) { // C�lculo para saber a soma dos n�meros digitados pelo usu�rio
				calculo += aux;
				aux2 = 0;
			}
			resultado += "C�digo do " + i + "�" + " produto " + "�: " + codigo + "\n";
		} // Fim do la�o

		// C�lculo para obter a m�dia dos n�meros
		media = calculo / 5;

		// Resultado em tela
		JOptionPane.showMessageDialog(null,
				resultado + "Maior n�mero �: " + maior + "\n" + "A m�dia dos n�meros � de: " + media);
	}
}
