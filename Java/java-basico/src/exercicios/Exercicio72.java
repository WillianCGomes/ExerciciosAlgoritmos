package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para informar quantos numeros negativos foram digitados
 * 
 * @author Willian Carlos Gomes
 * @since 10 de fev. de 2021
 */
public class Exercicio72 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// Declarando variáveis
		int contador;
		int valor;

		// Inicializando a variável de contagem
		contador = 0;

		// Usuário declara 10 valores
		for (int i = 1; i < 11; i++) {
			valor = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor: "));
			if (valor < 0) {
				contador++;
			}
		}
		// exibindo o resultado para o usuário
		JOptionPane.showMessageDialog(null, "Números negativos digitados: " + contador);
	}

}
