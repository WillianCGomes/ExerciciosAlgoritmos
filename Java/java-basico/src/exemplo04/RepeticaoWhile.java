package exemplo04;

/**
 * Programa para demonstrar o laço de repetição while
 * 
 * @author Willian Gomes
 * @since 10/02/2021
 */
public class RepeticaoWhile {

	/*
	 * Método principal para a execução da classe
	 */
	public static void main(String[] args) {

		// Declarações de variáveis
		int indice;

		// Inicializando a variável
		indice = 0;

		// Efetuando o laço de repetição para exibir o cubo de um número
		while (indice < 10) {// Início do laço de repetição
			System.out.println(indice + " ao cubo é: " + ((indice * indice) * indice));
			indice++;

			// fim do laço de repetição
		}
	}

}
