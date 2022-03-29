package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para verificar o acesso do usuário
 * 
 * @author Willian Gomes
 * @since 09/02/2021
 */
public class Exercicio60 {
	/*
	 * Método principal para a execução da classe
	 */
	public static void main(String[] args) {

// Declarações de variáveis
		int codigointerno, codigo, senhainterna, senha;

		// Leitura do cógigo e senha
		codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu código de usuário:"));

		// Atribuindo valores ao código e a senha corretos
		codigointerno = 1234;
		senhainterna = 9999;

		// Atribuindo a condição de usuário invalido
		if (codigo != codigointerno) {
			JOptionPane.showMessageDialog(null, "Usuário inválido!");
		}

		// Atribuindo a condição para prosseguir com a senha
		if (codigo == codigointerno) {
			senha = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua senha:"));

			// Atribuindo as condições de acesso permitido, e senha incorreta
			if ((senha == senhainterna) && (codigo == codigointerno)) {
				JOptionPane.showMessageDialog(null, "Acesso permitido!");
			} else if ((senha != senhainterna) && (codigo == codigointerno)) {
				JOptionPane.showMessageDialog(null, "senha incorreta!");
			}
		}
	}

}
