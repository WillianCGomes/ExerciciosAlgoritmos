package exercicios;

import javax.swing.JOptionPane;

/**
 * C�lculo de litros de gasolina
 * 
 * @author Willian Gomes
 * @since 08/02/2021
 *
 */
public class Exercicio25 {

	/*
	 * M�todo principal para a execu��o do programa
	 */
	public static void main(String[] args) {
		// Declara��o das vari�veis
		double vlitro, vgasolina, qtd;

		// Leitura dos valores e atribui��es
		vlitro = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor por litro de gasolina: "));
		vgasolina = Double.parseDouble(JOptionPane.showInputDialog("Quanto voc� deseja pagar?"));

		// C�lculo
		qtd = vgasolina / vlitro;

		// Impress�o em tela
		JOptionPane.showMessageDialog(null, "Voc� conseguir� colocar" + qtd + " litros de gasolina.");

	}

}
