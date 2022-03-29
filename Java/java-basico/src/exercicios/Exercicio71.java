package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para exibir a tabuada do valor escolhido pelo usuário
 * 
 * @author Willian Carlos Gomes
 * @since 10 de fev. de 2021
 */
public class Exercicio71 {

	/*
	 * Método principal para a execução do programa
	 */
	public static void main(String[] args) {
		int tabuada;
		String resultado;
		double calculoDaTabuada;

		// incializando a variável de tabuada para entrar no looping
		tabuada = -1;

		// recebendo o valor do usuario entre 1 e 10
		while ((tabuada <= 0) || (tabuada > 10)) {
			tabuada = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero para a tabuada:"));
		}

		// valorizando o cabeçalho do resultado
		resultado = "Tabuada do " + tabuada + "\n";

		// laço de repetição para calcular a tabuada
		for (int i = 0; i < 11; i++) {
			calculoDaTabuada = tabuada * i;
			resultado += tabuada + " x " + i + " = " + calculoDaTabuada + "\n";
		}

		// exibindo o resultado para o usuario
		JOptionPane.showMessageDialog(null, resultado);

	}

}