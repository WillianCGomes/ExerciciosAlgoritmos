package exemplo04;

/**
 * Programa para demonstrar o la�o de repeti��o while
 * 
 * @author Willian Gomes
 * @since 10/02/2021
 */
public class RepeticaoWhile {

	/*
	 * M�todo principal para a execu��o da classe
	 */
	public static void main(String[] args) {

		// Declara��es de vari�veis
		int indice;

		// Inicializando a vari�vel
		indice = 0;

		// Efetuando o la�o de repeti��o para exibir o cubo de um n�mero
		while (indice < 10) {// In�cio do la�o de repeti��o
			System.out.println(indice + " ao cubo �: " + ((indice * indice) * indice));
			indice++;

			// fim do la�o de repeti��o
		}
	}

}
