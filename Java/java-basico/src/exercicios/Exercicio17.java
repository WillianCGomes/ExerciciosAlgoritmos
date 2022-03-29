package exercicios;

import javax.swing.JOptionPane;

/**
 * C�lculo para exibir idade expressa em dias
 * 
 * @author Willian Gomes
 * @since 05/02/2021
 */

public class Exercicio17 {

	/*
	 * M�todo principal de execu��o
	 */

	public static void main(String[] args) {
		// Decla��o das vari�veis
		int anos, meses, dias, total;

		// Atribui��o de valores �s vari�veis

		anos = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos anos voc� tem: "));
		meses = Integer.parseInt(
				JOptionPane.showInputDialog("Digite o n�mero de meses que se passaram desde o seu anivers�rio: "));
		dias = Integer.parseInt(
				JOptionPane.showInputDialog("Digite quantos dias se passaram desde o dia do seu anivers�rio no m�s: "));

		// Convers�o dos anos em dias
		total = anos * 365;

		// Convers�o dos meses em dias
		total = total + (meses * 30);
		total = total + dias;

		// Exibi��o em tela
		JOptionPane.showInternalMessageDialog(null, "Voc� possu� " + total + " dias de vida.");

	}

}
