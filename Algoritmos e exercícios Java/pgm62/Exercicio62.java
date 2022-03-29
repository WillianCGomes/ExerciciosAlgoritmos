package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular a m�dia dos exerc�cios avaliativos
 * 
 * @author Willian Gomes
 * @since 09/02/2021
 */
public class Exercicio62 {
	/*
	 * M�todo principal para a execu��o da classe
	 */
	public static void main(String[] args) {

// Declara��es de vari�veis
		double n1, n2, n3, n4, media_aproveitamento;
		String conceito;

//leitura das notas
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 1"));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 2"));
		n3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 3"));
		n4 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 4"));

//c�lculo da m�dia
		media_aproveitamento = (((n1) + (n2 * 2) + (n3 * 3) + (n4)) / 7);

//Condicionais compostas
		if (media_aproveitamento >= 9) {// aplicar conceito A
			conceito = ("A");
		} else if ((media_aproveitamento >= 7.5) && (media_aproveitamento < 9)) {// aplicar conceito B
			conceito = ("B");
		} else if ((media_aproveitamento >= 6) && (media_aproveitamento < 7.5)) {// aplicar conceito C
			conceito = ("C");
		} else {// aplicar conceito D
			conceito = ("D");
		}

//impress�o em tela
		JOptionPane.showMessageDialog(null, "Segue o seu resultado: " + "\n" + "Conceito " + conceito + ".");

	}

}
