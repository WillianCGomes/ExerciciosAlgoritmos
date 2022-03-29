package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular o saldo do cliente
 * 
 * @author Willian Gomes
 * @since 09/02/2021
 */
public class Exercicio46 {
	/*
	 * Método principal para a execução da classe
	 */

	public static void main(String[] args) {
		// Declarações de variáveis
		int nconta;
		double saldo, debito, credito, satual;

		// Leitura dos dados da conta
		nconta = (int) Double.parseDouble(JOptionPane.showInputDialog("Informe o número da conta:"));
		saldo = Double.parseDouble(JOptionPane.showInputDialog("Informe o saldo:"));
		debito = Double.parseDouble(JOptionPane.showInputDialog("Informe o débito"));
		credito = Double.parseDouble(JOptionPane.showInputDialog("Informe o crédito"));

		// Cálculo do saldo
		satual = ((saldo - debito) + credito);
		JOptionPane.showMessageDialog(null, "Conta Nº" + nconta + "\nSeu saldo é: " + satual);

		// Condicionais
		if (satual >= 0) {
			JOptionPane.showMessageDialog(null, "Saldo positivo");
		} else {
			JOptionPane.showMessageDialog(null, "Saldo negativo");
		}

	}

}
