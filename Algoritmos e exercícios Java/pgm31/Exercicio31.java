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
	 * Método principal para a execução do programa
	 */
	public static void main(String[] args) {
		// Declarações de variáveis
		int aidentf, aaliment, nfrangos, vfrangos;

		// Leitura do número de frangos
		nfrangos = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de frangos:"));

		// Cálculo do custo com anéis
		aidentf = (nfrangos * 4);
		aaliment = (nfrangos * 7);
		vfrangos = (aidentf + aaliment);

		// Impressão do resultado em tela
		JOptionPane.showMessageDialog(null, "O custo total de anéis com os frangos será de: R$" + vfrangos);
		JOptionPane.showMessageDialog(null,
				"Sendo R$" + aidentf + " com anéis de identidade e R$" + aaliment + " com anéis de alimentos.");

	}

}
