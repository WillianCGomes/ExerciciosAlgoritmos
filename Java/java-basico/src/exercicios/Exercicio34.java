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
	 * M�todo principal para a execu��o do programa
	 */
	public static void main(String[] args) {
		// Declara��es de vari�veis
		double qtdref, lagua, lmaracuja;

		// Leitura da quantidade de refreco desejada
		qtdref = Double.parseDouble(JOptionPane.showInputDialog("Quantos litros de refresco voc� deseja?"));

		// C�lculo
		lagua = (qtdref * 0.8);
		lmaracuja = (qtdref * 0.2);

		// Impress�o em tela
		JOptionPane.showMessageDialog(null, "Para" + qtdref + " litros de refresco, voc� vai precisar de: " + lagua
				+ " litros de �gua e " + lmaracuja + " litros de suco.");
	}

}
