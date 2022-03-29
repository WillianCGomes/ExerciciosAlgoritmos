package exercicios;

import javax.swing.JOptionPane;

/**
 * Tonel de refresco
 * 
 * @author Willian Gomes
 * @since 08/02/2021
 */
public class Exercicio34 {

	/*
	 * Método principal para a execução do programa
	 */
	public static void main(String[] args) {
		// Declarações de variáveis
		double qtdref, lagua, lmaracuja;

		// Leitura da quantidade de refreco desejada
		qtdref = Double.parseDouble(JOptionPane.showInputDialog("Quantos litros de refresco você deseja?"));

		// Cálculo
		lagua = (qtdref * 0.8);
		lmaracuja = (qtdref * 0.2);

		// Impressão em tela
		JOptionPane.showMessageDialog(null, "Para" + qtdref + " litros de refresco, você vai precisar de: " + lagua
				+ " litros de água e " + lmaracuja + " litros de suco.");
	}

}
