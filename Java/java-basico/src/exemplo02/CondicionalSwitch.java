package exemplo02;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar o comando Switch
 * @author Willian Gomes 
 * @since 08/02/2021
 */
public class CondicionalSwitch {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// Declaração das variáveis
		int mes;

		// Capturando dados do usuário
		mes = Integer.parseInt(JOptionPane.showInputDialog("Informe o mês:"));

		// Exibindo o mês informado pelo usuário
		switch (mes) {
		case 1: {
			JOptionPane.showMessageDialog(null, "Més escolhido - Janeiro");
			break;
		}
		case 2: {
			JOptionPane.showMessageDialog(null, "Més escolhido - Fevereiro");
			break;
		}
		case 3: {
			JOptionPane.showMessageDialog(null, "Més escolhido - Março");
			break;
		}
		case 4: {
			JOptionPane.showMessageDialog(null, "Més escolhido - Abril");
			break;
		}
		case 5: {
			JOptionPane.showMessageDialog(null, "Més escolhido - Maio");
			break;
		}
		case 6: {
			JOptionPane.showMessageDialog(null, "Més escolhido - Junho");
			break;
		}
		case 7: {
			JOptionPane.showMessageDialog(null, "Més escolhido - Julho");
			break;
		}
		case 8: {
			JOptionPane.showMessageDialog(null, "Més escolhido - Agosto");
			break;
		}
		case 9: {
			JOptionPane.showMessageDialog(null, "Més escolhido - Setembro");
			break;
		}
		case 10: {
			JOptionPane.showMessageDialog(null, "Més escolhido - Outubro");
			break;
		}
		case 11: {
			JOptionPane.showMessageDialog(null, "Més escolhido - Novembro");
			break;
		}
		case 12: {
			JOptionPane.showMessageDialog(null, "Més escolhido - Dezembro");
			break;
		}

		default:
			JOptionPane.showMessageDialog(null, "Não consta no calendário!");
		}

	}

}
