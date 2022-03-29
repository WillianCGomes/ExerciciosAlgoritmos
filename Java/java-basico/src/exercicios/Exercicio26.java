package exercicios;

import javax.swing.JOptionPane;

/**
 * C�lculo de dia e m�s
 * 
 * @author Willian Gomes
 * @since 08/02/2021
 */
public class Exercicio26 {

	/*
	 * Metodo principal para a execu��o do programa
	 */
	public static void main(String[] args) {
		// Declara��es das vari�veis
		int dia, mes, diasano;

		// Leitura e atribui��es das vari�veis
		dia = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia: "));
		mes = Integer.parseInt(JOptionPane.showInputDialog("Informe o m�s: "));

		// C�lculo: Diminu� 1 m�s pois o c�lculo se refere ao m�s correspondente
		diasano = (mes * 29) + dia;

		// Impress�o em tela
		JOptionPane.showInternalMessageDialog(null, "Se passaram " + diasano + " desde o in�cio do ano.");
	}

}
