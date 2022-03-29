/**
 * 
 */
package exemplo04;

/**
 * Programa para demonstrar o laço de repetição do while
 * 
 * @author Willian Gomes
 * @since 10/02/2021
 */
public class RepeticaoDoWhile {

	/*
	 * Método principal para a execução da classe
	 */
	public static void main(String[] args) {

		// Declarações de variáveis
		int i;

		// iniciando a variável i
		i = 10;

		do {
			System.out.println(i + " ao cubo é: " + ((i * i) * i));
			i++;
		} while (i < 10);
	}

}
