package exercicios;

import javax.swing.JOptionPane;

/**
 * Cálculo para exibir idade expressa em dias
 * 
 * @author Willian Gomes
 * @since 05/02/2021
 */

public class Exercicio17 {

	/*
	 * Método principal de execução
	 */

	public static void main(String[] args) {
		// Declação das variáveis
		int anos, meses, dias, total;

		// Atribuição de valores às variáveis

		anos = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos anos você tem: "));
		meses = Integer.parseInt(
				JOptionPane.showInputDialog("Digite o número de meses que se passaram desde o seu aniversário: "));
		dias = Integer.parseInt(
				JOptionPane.showInputDialog("Digite quantos dias se passaram desde o dia do seu aniversário no mês: "));

		// Conversão dos anos em dias
		total = anos * 365;

		// Conversão dos meses em dias
		total = total + (meses * 30);
		total = total + dias;

		// Exibição em tela
		JOptionPane.showInternalMessageDialog(null, "Você possuí " + total + " dias de vida.");

	}

}
