package exercicios;

import javax.swing.JOptionPane;

/**
 * Cálculo de litros de gasolina
 * 
 * @author Willian Gomes
 * @since 08/02/2021
 *
 */
public class Exercicio25 {

	/*
	 * Método principal para a execução do programa
	 */
	public static void main(String[] args) {
		// Declaração das variáveis
		double vlitro, vgasolina, qtd;

		// Leitura dos valores e atribuições
		vlitro = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor por litro de gasolina: "));
		vgasolina = Double.parseDouble(JOptionPane.showInputDialog("Quanto você deseja pagar?"));

		// Cálculo
		qtd = vgasolina / vlitro;

		// Impressão em tela
		JOptionPane.showMessageDialog(null, "Você conseguirá colocar" + qtd + " litros de gasolina.");

	}

}
