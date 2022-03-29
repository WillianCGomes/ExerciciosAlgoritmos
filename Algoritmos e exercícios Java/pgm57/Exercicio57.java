package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para cálculos com combustível
 * 
 * @author Willian Gomes
 * @since 09/02/2021
 */
public class Exercicio57 {
	/*
	 * Método principal para a execução da classe
	 */
	public static void main(String[] args) {

// Declarações de variáveis
		double A, G, qlitros;
		String tcombustivel;

		// Obtendo preferências do usuário
		qlitros = Double
				.parseDouble(JOptionPane.showInputDialog("Digite quantos litros de combustivel deseja comprar:"));
		tcombustivel = JOptionPane
				.showInputDialog("Digite A se deseja comprar álcool, e G se deseja comprar gasolina:");

		// Switch para limitar o valor informado pelo usuário
		switch (tcombustivel) {
		case "G": {
			if (qlitros <= 20) {
				G = (qlitros * 3.30) * 0.96;
				JOptionPane.showMessageDialog(null, "O valor a ser pago é de RS" + G);
			}

			else if (qlitros > 20) {
				G = (qlitros * 3.30) * 0.94;
				JOptionPane.showMessageDialog(null, "O valor a ser pago é de RS" + G);
			}
			break;
		}
		case "g": {
			if (qlitros <= 20) {
				G = (qlitros * 3.30) * 0.96;
				JOptionPane.showMessageDialog(null, "O valor a ser pago é de RS" + G);
			}

			else if (qlitros > 20) {
				G = (qlitros * 3.30) * 0.94;
				JOptionPane.showMessageDialog(null, "O valor a ser pago é de RS" + G);
			}
			break;
		}
		case "A": {
			if (qlitros <= 20) {
				A = (qlitros * 2.90) * 0.97;
				JOptionPane.showMessageDialog(null, "O valor a ser pago é de RS" + A);
			}

			else if (qlitros > 20) {
				A = (qlitros * 2.90) * 0.95;
				JOptionPane.showMessageDialog(null, "O valor a ser pago é de RS" + A);
			}
			break;
		}
		case "a": {
			if (qlitros <= 20) {
				A = (qlitros * 2.90) * 0.97;
				JOptionPane.showMessageDialog(null, "O valor a ser pago é de RS" + A);
			}

			else if (qlitros > 20) {
				A = (qlitros * 2.90) * 0.95;
				JOptionPane.showMessageDialog(null, "O valor a ser pago é de RS" + A);
			}
			break;
		}

		// Valor padrão caso o usuário informe um valor diferente do esperado
		default:
			JOptionPane.showMessageDialog(null, "Não consta o tipo do combustível!");
		}
	}
}