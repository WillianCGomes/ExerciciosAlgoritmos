package exercicios;

import javax.swing.JOptionPane;

/**
 * Cálculo de dia e mês
 * 
 * @author Willian Gomes
 * @since 08/02/2021
 */
public class Exercicio26 {

	/*
	 * Metodo principal para a execução do programa
	 */
	public static void main(String[] args) {
		// Declarações das variáveis
		int dia, mes, diasano;

		// Leitura e atribuições das variáveis
		dia = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia: "));
		mes = Integer.parseInt(JOptionPane.showInputDialog("Informe o mês: "));

		// Cálculo: Diminuí 1 mês pois o cálculo se refere ao mês correspondente
		diasano = (mes * 29) + dia;

		// Impressão em tela
		JOptionPane.showInternalMessageDialog(null, "Se passaram " + diasano + " desde o início do ano.");
	}

}
