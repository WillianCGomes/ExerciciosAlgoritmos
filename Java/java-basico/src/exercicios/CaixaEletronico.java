package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa de caixa eletr�nico
 * 
 * @author Willian Gomes
 * @since 08/02/2021
 */
public class CaixaEletronico {

	/*
	 * M�todo principal para a execu��o do programa
	 */
	public static void main(String[] args) {
		// Declara��o de vari�veis
		String mensagem;
		double resto, valorSaque;
		int notaDois, notaCinco, notaDez, notaVinte, notaCinquenta;

		// Capturando o valor de saque do usu�rio
		valorSaque = Double.parseDouble(JOptionPane.showInputDialog("===== Caixa Eletr�nico =====" + "\n"
				+ "Notas dispon�veis: 2, 5, 10, 20, 50" + "\n\n" + "Informe o valor a ser sacado"));

		// C�lculo do resto do saque por 1
		resto = valorSaque % 1;

		// Verifica��o se o saque � menor ou igual a 0
		if ((valorSaque <= 0) || (valorSaque == 1) || (valorSaque == 3)) {
			JOptionPane.showMessageDialog(null, "Informe um valor v�lido!");
		}
		// Verifica��o de resto para validar se possu� centavos ou n�o
		else if (resto != 0) {
			JOptionPane.showMessageDialog(null,
					"A OPERA��O N�O PODE SER REALIZADA" + "\n" + "N�o � poss�vel sacar centavos!");
		} else if (valorSaque > 0) {
			// Procedimento de notas

			// Verificando quantidades necess�rias de notas e subtraindo do valor total
			notaCinquenta = (int) valorSaque / 50;
			valorSaque -= (notaCinquenta * 50);

			notaVinte = (int) valorSaque / 20;
			valorSaque -= (notaVinte * 20);

			notaDez = (int) valorSaque / 10;
			valorSaque -= (notaDez * 10);

			notaCinco = (int) valorSaque / 5;
			valorSaque -= (notaCinco * 5);

			notaDois = (int) valorSaque / 2;
			valorSaque -= (notaDois * 2);

			// Verifica��o da falta de 1 real
			if (valorSaque == 1) {
				if (notaCinco >= 1) // Para valores de 6 e 8, utiliza��o de notas de 2 reais
				{
					notaCinco -= 1;
					notaDois += 3;
				} else if (notaDez >= 1) // Para valores 11 e 13, utiliza��o de notas de 2 e 5 reais
				{
					notaDez -= 1;
					notaCinco += 1;
					notaDois += 3;
				} else if (notaVinte >= 1) // Para valores 21 e 23, utiliza��o de notas de 10, 5 e 2 reais
				{
					notaVinte -= 1;
					notaDez += 1;
					notaCinco += 1;
					notaDois += 3;
				} else if (notaCinquenta >= 1) // Para valores 51 e 53, utiliza��o de notas de
				{
					notaCinquenta -= 1;
					notaVinte += 2;
					notaDez += 1;
					notaCinco += 1;
					notaDois += 3;
				}
			}
			// Vari�vel concatena e mostra o resultado para o usu�rio com a impress�o em
			// tela
			mensagem = "";
			if (notaCinquenta > 0) // Caso existam as notas, ser�o concatenadas com a mensagem e impressas em tela
			{
				mensagem += "\n" + notaCinquenta + " Notas de R$50,00";
			}
			if (notaVinte > 0) {
				mensagem += "\n" + notaVinte + " Notas de R$20,00";
			}
			if (notaDez > 0) {
				mensagem += "\n" + notaDez + " Notas de R$10,00";
			}
			if (notaCinco > 0) {
				mensagem += "\n" + notaCinco + " Notas de R$5,00";
			}
			if (notaDois > 0) {
				mensagem += "\n" + notaDois + " Notas de R$2,00";
			}

			// Impress�o em tela com somente as notas que ser�o sacadas
			JOptionPane.showMessageDialog(null, mensagem);

		} else {
			JOptionPane.showMessageDialog(null, "Informe um valor v�lido!");
		}

	}

}
