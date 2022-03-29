package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa de caixa eletrônico
 * 
 * @author Willian Gomes
 * @since 08/02/2021
 */
public class CaixaEletronico {

	/*
	 * Método principal para a execução do programa
	 */
	public static void main(String[] args) {
		// Declaração de variáveis
		String mensagem;
		double resto, valorSaque;
		int notaDois, notaCinco, notaDez, notaVinte, notaCinquenta;

		// Capturando o valor de saque do usuário
		valorSaque = Double.parseDouble(JOptionPane.showInputDialog("===== Caixa Eletrônico =====" + "\n"
				+ "Notas disponíveis: 2, 5, 10, 20, 50" + "\n\n" + "Informe o valor a ser sacado"));

		// Cálculo do resto do saque por 1
		resto = valorSaque % 1;

		// Verificação se o saque é menor ou igual a 0
		if ((valorSaque <= 0) || (valorSaque == 1) || (valorSaque == 3)) {
			JOptionPane.showMessageDialog(null, "Informe um valor válido!");
		}
		// Verificação de resto para validar se possuí centavos ou não
		else if (resto != 0) {
			JOptionPane.showMessageDialog(null,
					"A OPERAÇÃO NÃO PODE SER REALIZADA" + "\n" + "Não é possível sacar centavos!");
		} else if (valorSaque > 0) {
			// Procedimento de notas

			// Verificando quantidades necessárias de notas e subtraindo do valor total
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

			// Verificação da falta de 1 real
			if (valorSaque == 1) {
				if (notaCinco >= 1) // Para valores de 6 e 8, utilização de notas de 2 reais
				{
					notaCinco -= 1;
					notaDois += 3;
				} else if (notaDez >= 1) // Para valores 11 e 13, utilização de notas de 2 e 5 reais
				{
					notaDez -= 1;
					notaCinco += 1;
					notaDois += 3;
				} else if (notaVinte >= 1) // Para valores 21 e 23, utilização de notas de 10, 5 e 2 reais
				{
					notaVinte -= 1;
					notaDez += 1;
					notaCinco += 1;
					notaDois += 3;
				} else if (notaCinquenta >= 1) // Para valores 51 e 53, utilização de notas de
				{
					notaCinquenta -= 1;
					notaVinte += 2;
					notaDez += 1;
					notaCinco += 1;
					notaDois += 3;
				}
			}
			// Variável concatena e mostra o resultado para o usuário com a impressão em
			// tela
			mensagem = "";
			if (notaCinquenta > 0) // Caso existam as notas, serão concatenadas com a mensagem e impressas em tela
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

			// Impressão em tela com somente as notas que serão sacadas
			JOptionPane.showMessageDialog(null, mensagem);

		} else {
			JOptionPane.showMessageDialog(null, "Informe um valor válido!");
		}

	}

}
