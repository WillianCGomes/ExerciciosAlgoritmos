/**
 * 
 */
package exemplo04;

/**
 * Programa para demonstrar o la�o de repeti��o do while
 * 
 * @author Willian Gomes
 * @since 10/02/2021
 */
public class RepeticaoDoWhile {

	/*
	 * M�todo principal para a execu��o da classe
	 */
	public static void main(String[] args) {

		// Declara��es de vari�veis
		int i;

		// iniciando a vari�vel i
		i = 10;

		do {
			System.out.println(i + " ao cubo �: " + ((i * i) * i));
			i++;
		} while (i < 10);
	}

}
