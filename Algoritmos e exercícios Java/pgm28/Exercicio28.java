package exercicios;

import javax.swing.JOptionPane;

/**
 * Divisão da conta
 * 
 * @author Willian Gomes
 * @since 08/02/2021
 */
public class Exercicio28 {

	/*
	 * Método principal para a execução do programa
	 */
	public static void main(String[] args) {
		int vcarlos, vandre;
		double vfelipe, vtotal;

		// Obtendo informações do usuário
		vtotal = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor total da compra"));

		// Cálculo para dizer quanto que cada um deve pagar

		vcarlos = (int) vtotal / 3;
		vandre = (int) vtotal / 3;
		vfelipe = (vtotal - (vcarlos + vandre));

		// Resultado em tela
		JOptionPane.showMessageDialog(null, "Carlos deve pagar R$" + vcarlos + "\n" + "Andre deve pagar R$" + vandre
				+ "\n " + "Felipe deve pagar R$" + vfelipe);

	}

}
