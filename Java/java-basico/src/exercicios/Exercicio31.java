package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular gastos com frangos
 * 
 * @author Willian Gomes
 * @since 08/02/2021
 */
public class Exercicio31 {

	/*
	 * M�todo principal para a execu��o do programa
	 */
	public static void main(String[] args) {
		// Declara��es de vari�veis
		int aidentf, aaliment, nfrangos, vfrangos;

		// Leitura do n�mero de frangos
		nfrangos = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de frangos:"));

		// C�lculo do custo com an�is
		aidentf = (nfrangos * 4);
		aaliment = (nfrangos * 7);
		vfrangos = (aidentf + aaliment);

		// Impress�o do resultado em tela
		JOptionPane.showMessageDialog(null, "O custo total de an�is com os frangos ser� de: R$" + vfrangos);
		JOptionPane.showMessageDialog(null,
				"Sendo R$" + aidentf + " com an�is de identidade e R$" + aaliment + " com an�is de alimentos.");

	}

}
