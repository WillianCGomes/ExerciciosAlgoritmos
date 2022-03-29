package exercicios;

import javax.swing.JOptionPane;

/**
 * Divis�o da conta
 * 
 * @author Willian Gomes
 * @since 08/02/2021
 */
public class Exercicio28 {

	/*
	 * M�todo principal para a execu��o do programa
	 */
	public static void main(String[] args) {
		int vcarlos, vandre;
		double vfelipe, vtotal;

		// Obtendo informa��es do usu�rio
		vtotal = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor total da compra"));

		// C�lculo para dizer quanto que cada um deve pagar

		vcarlos = (int) vtotal / 3;
		vandre = (int) vtotal / 3;
		vfelipe = (vtotal - (vcarlos + vandre));

		// Resultado em tela
		JOptionPane.showMessageDialog(null, "Carlos deve pagar R$" + vcarlos + "\n" + "Andre deve pagar R$" + vandre
				+ "\n " + "Felipe deve pagar R$" + vfelipe);

	}

}
