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
	 * M�todo principal de execu��o do programa
	 */

	public static void main(String[] args) {
		// Declara��o das vari�veis
		Double totaleleitores, vb, vv, vn, pbrancos, pnulos, pvalidos;

		// Leitura e atribui��es das vari�veis
		totaleleitores = Double.parseDouble(JOptionPane.showInputDialog("Digite o n�mero de eleitores do munic�pio: "));
		vb = Double.parseDouble(JOptionPane.showInputDialog("Digite o n�mero de votos brancos: "));
		vn = Double.parseDouble(JOptionPane.showInputDialog("Digite o n�mero de votos nulos: "));
		vv = Double.parseDouble(JOptionPane.showInputDialog("Digite o n�mero de votos v�lidos: "));

		// C�lculo do percentual
		pbrancos = (100 * vb / totaleleitores);
		pnulos = (100 * vn / totaleleitores);
		pvalidos = (100 * vv / totaleleitores);

		// Exibi��o dos resultados em tela
		JOptionPane.showMessageDialog(null, "Votos brancos: " + pbrancos + "%" + "\n" + "Votos nulos: " + pnulos + "%"
				+ "\n" + "Votos v�lidos: " + pvalidos + "%" + "\n");
	}

}
