package exercicios;

import javax.swing.JOptionPane;

/**
 * Percentual de eleitores
 * 
 * @author Willian Gomes
 * @since 05/02/2021
 */

public class Exercicio18 {

	/*
	 * Método principal de execução do programa
	 */

	public static void main(String[] args) {
		// Declaração das variáveis
		Double totaleleitores, vb, vv, vn, pbrancos, pnulos, pvalidos;

		// Leitura e atribuições das variáveis
		totaleleitores = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de eleitores do município: "));
		vb = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de votos brancos: "));
		vn = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de votos nulos: "));
		vv = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de votos válidos: "));

		// Cálculo do percentual
		pbrancos = (100 * vb / totaleleitores);
		pnulos = (100 * vn / totaleleitores);
		pvalidos = (100 * vv / totaleleitores);

		// Exibição dos resultados em tela
		JOptionPane.showMessageDialog(null, "Votos brancos: " + pbrancos + "%" + "\n" + "Votos nulos: " + pnulos + "%"
				+ "\n" + "Votos válidos: " + pvalidos + "%" + "\n");
	}

}
