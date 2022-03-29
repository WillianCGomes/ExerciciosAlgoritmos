package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para c�lculos com combust�vel
 * 
 * @author Willian Gomes
 * @since 09/02/2021
 */
public class Exercicio57 {
	/*
	 * M�todo principal para a execu��o da classe
	 */
	public static void main(String[] args) {

// Declara��es de vari�veis
		double A, G, qlitros;
		String tcombustivel;

		// Obtendo prefer�ncias do usu�rio
		qlitros = Double
				.parseDouble(JOptionPane.showInputDialog("Digite quantos litros de combustivel deseja comprar:"));
		tcombustivel = JOptionPane
				.showInputDialog("Digite A se deseja comprar �lcool, e G se deseja comprar gasolina:");

		// Switch para limitar o valor informado pelo usu�rio
		switch (tcombustivel) {
		case "G": {
			if (qlitros <= 20) {
				G = (qlitros * 3.30) * 0.96;
				JOptionPane.showMessageDialog(null, "O valor a ser pago � de RS" + G);
			}

			else if (qlitros > 20) {
				G = (qlitros * 3.30) * 0.94;
				JOptionPane.showMessageDialog(null, "O valor a ser pago � de RS" + G);
			}
			break;
		}
		case "g": {
			if (qlitros <= 20) {
				G = (qlitros * 3.30) * 0.96;
				JOptionPane.showMessageDialog(null, "O valor a ser pago � de RS" + G);
			}

			else if (qlitros > 20) {
				G = (qlitros * 3.30) * 0.94;
				JOptionPane.showMessageDialog(null, "O valor a ser pago � de RS" + G);
			}
			break;
		}
		case "A": {
			if (qlitros <= 20) {
				A = (qlitros * 2.90) * 0.97;
				JOptionPane.showMessageDialog(null, "O valor a ser pago � de RS" + A);
			}

			else if (qlitros > 20) {
				A = (qlitros * 2.90) * 0.95;
				JOptionPane.showMessageDialog(null, "O valor a ser pago � de RS" + A);
			}
			break;
		}
		case "a": {
			if (qlitros <= 20) {
				A = (qlitros * 2.90) * 0.97;
				JOptionPane.showMessageDialog(null, "O valor a ser pago � de RS" + A);
			}

			else if (qlitros > 20) {
				A = (qlitros * 2.90) * 0.95;
				JOptionPane.showMessageDialog(null, "O valor a ser pago � de RS" + A);
			}
			break;
		}

		// Valor padr�o caso o usu�rio informe um valor diferente do esperado
		default:
			JOptionPane.showMessageDialog(null, "N�o consta o tipo do combust�vel!");
		}
	}
}