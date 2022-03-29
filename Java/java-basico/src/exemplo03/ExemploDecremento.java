package exemplo03;

/**
 * Programa para demonstrar o decremento de valores
 * 
 * @author Willian Gomes
 * @since 10/02/2021
 *
 */
public class ExemploDecremento {

	/*
	 * Método principal para a execução da classe
	 */
	public static void main(String[] args) {
		
		// Declarações das variáveis
		int numero;

		numero = 1;

		System.out.println(numero); // exibindo o valor 1

		numero = numero - 1; // Incremento

		System.out.println(numero); // exibindo o valor 0
		
		//Iniciando a variável novamente
		numero = 10;

		numero--; // Decremento

		System.out.println(numero); // exibindo o valor 9
		
		numero--;
		numero--;

		System.out.println(numero); // exibindo o valor 7

	}

}
