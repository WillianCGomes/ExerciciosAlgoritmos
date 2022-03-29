package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para verificar o acesso do usu�rio
 * 
 * @author Willian Gomes
 * @since 09/02/2021
 */
public class Exercicio60 {
	/*
	 * M�todo principal para a execu��o da classe
	 */
	public static void main(String[] args) {

// Declara��es de vari�veis
		int codigointerno, codigo, senhainterna, senha;

		// Leitura do c�gigo e senha
		codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu c�digo de usu�rio:"));

		// Atribuindo valores ao c�digo e a senha corretos
		codigointerno = 1234;
		senhainterna = 9999;

		// Atribuindo a condi��o de usu�rio invalido
		if (codigo != codigointerno) {
			JOptionPane.showMessageDialog(null, "Usu�rio inv�lido!");
		}

		// Atribuindo a condi��o para prosseguir com a senha
		if (codigo == codigointerno) {
			senha = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua senha:"));

			// Atribuindo as condi��es de acesso permitido, e senha incorreta
			if ((senha == senhainterna) && (codigo == codigointerno)) {
				JOptionPane.showMessageDialog(null, "Acesso permitido!");
			} else if ((senha != senhainterna) && (codigo == codigointerno)) {
				JOptionPane.showMessageDialog(null, "senha incorreta!");
			}
		}
	}

}
