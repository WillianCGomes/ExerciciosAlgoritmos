package exercicios;

import javax.swing.JOptionPane;

/**
 * Área do retângulo
 * 
 * @author Willian Gomes
 * @since 05/02/2021
 *
 */
public class Exercicio16 {

	/*
	 * Método padrão de execução
	 */

	public static void main(String[] args) {

		// Declaração das variáveis
		Double base, altura, area;

		// Leitura e atribuições
		base = Double.parseDouble(
				JOptionPane.showInputDialog("Digite o valor da base do retângulo sem a unidade de medida: "));
		altura = Double.parseDouble(
				JOptionPane.showInputDialog("Digite o valor da altura do retângulo sem a unidade de medida: "));

		// Cálculo da área
		area = base * altura;

		// Impressão em tela
		JOptionPane.showMessageDialog(null, "A área do retângulo (na respectiva unidade de medida) é: " + area + ".");
	}
}
