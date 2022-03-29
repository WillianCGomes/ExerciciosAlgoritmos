package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 valores e escrever quantos desses valores lidos est�o no
 * intervalo [10,20]
 * 
 * @author Willian Carlos Gomes
 * @since 10 de fev. de 2021
 */
public class Exercicio73 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// Declarando vari�veis
		int valor, contador;

		// In�cio da vari�vel de contagem
		contador = 0;

		// Usu�rio declara 10 valores
		for (int i = 1; i < 11; i++) {
			valor = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor: "));
			if ((valor <= 20) && (valor >= 10)) {
				contador++;
			}
		}
		// exibindo o resultado para o usu�rio
		JOptionPane.showMessageDialog(null, "N�meros negativos digitados: " + contador);
	}

}