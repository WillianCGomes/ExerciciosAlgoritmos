package exemplo03;

/**
 * Programa para demonstrar a utiliza��o de incremento e decremento de valores
 * @author Willian Gomes
 * @since 10/02/2021
 *
 */
public class ExemploIncremento {

	/*
	 * M�todo principal para a execu��o da classe
	 */
	public static void main(String[] args) {
		// Declara��o de vari�veis
		int numero;
		
		numero = 1;
		
		System.out.println(numero); //exibindo o valor 1
		
		numero = numero + 1; //Incremento
		
		System.out.println(numero); //exibindo o valor 2
		
		numero ++; // Incremento
		
		System.out.println(numero); // exibindo o valor 3
		
		System.out.println(numero++); // exibindo o valor 3
		
		System.out.println(numero); //exibindo o n�mero 4
		
		System.out.println(++numero); // exibindo o n�mero 5
	}

}
