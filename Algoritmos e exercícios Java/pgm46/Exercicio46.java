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
	 * M�todo principal para a execu��o da classe
	 */

	public static void main(String[] args) {
		// Declara��es de vari�veis
		int nconta;
		double saldo, debito, credito, satual;

		// Leitura dos dados da conta
		nconta = (int) Double.parseDouble(JOptionPane.showInputDialog("Informe o n�mero da conta:"));
		saldo = Double.parseDouble(JOptionPane.showInputDialog("Informe o saldo:"));
		debito = Double.parseDouble(JOptionPane.showInputDialog("Informe o d�bito"));
		credito = Double.parseDouble(JOptionPane.showInputDialog("Informe o cr�dito"));

		// C�lculo do saldo
		satual = ((saldo - debito) + credito);
		JOptionPane.showMessageDialog(null, "Conta N�" + nconta + "\nSeu saldo �: " + satual);

		// Condicionais
		if (satual >= 0) {
			JOptionPane.showMessageDialog(null, "Saldo positivo");
		} else {
			JOptionPane.showMessageDialog(null, "Saldo negativo");
		}

	}

}
