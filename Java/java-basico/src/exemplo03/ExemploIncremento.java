package exemplo03;

/**
 * Programa para demonstrar a utilização de incremento e decremento de valores
 * @author Willian Gomes
 * @since 10/02/2021
 *
 */
public class ExemploIncremento {

	/*
	 * Método principal para a execução da classe
	 */
	public static void main(String[] args) {
		// Declaração de variáveis
		int numero;
		
		numero = 1;
		
		System.out.println(numero); //exibindo o valor 1
		
		numero = numero + 1; //Incremento
		
		System.out.println(numero); //exibindo o valor 2
		
		numero ++; // Incremento
		
		System.out.println(numero); // exibindo o valor 3
		
		System.out.println(numero++); // exibindo o valor 3
		
		System.out.println(numero); //exibindo o número 4
		
		System.out.println(++numero); // exibindo o número 5
	}

}
