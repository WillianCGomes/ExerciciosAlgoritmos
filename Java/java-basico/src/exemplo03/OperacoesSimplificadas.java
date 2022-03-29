/**
 * 
 */
package exemplo03;

/**
 * Programa para demonstrar c�lculos aritm�ticos simplificados
 * 
 * @author Willian Gomes
 * @since 10/02/2021
 *
 */
public class OperacoesSimplificadas {

	/*
	 * M�todo principal para a execu��o da classe
	 */
	public static void main(String[] args) {

		// Declarando as vari�veis
		int i;

		// inicializa��o da vari�vel com o valor 10
		i = 10;

		// Opera��o de adi��o
		i = i + 1;

		System.out.println(i); // Exibindo o valor 11

		// Opera��o simplificada - incremento
		i++;

		System.out.println(i); // Exibindo o valor 12

		// Opera��o de subtra��o
		i = i - 1;

		System.out.println(i); // Exibindo o valor 11

		// Opera��o simplificada - decremento
		i--;

		System.out.println(i); // Exibindo o valor 10

		// opera��o de adi��o
		i = i + 2;

		System.out.println(i); // exibindo o valor 12

		// opera��o de adi��o simplificada
		i += 2;

		System.out.println(i); // exibindo o valor 14

		// opera��o de subtra��o
		i = i - 2;

		System.out.println(i); // exibindo o valor 12

		// opera��o de subtra��o simplificada
		i -= 2;

		System.out.println(i); // exibindo o valor 10

		// opera��o de multiplica��o
		i = i * 3;
		System.out.println(i);

		// opera��o de multiplica��o simplificada
		i *= 3;
		System.out.println(i);

		// opera��o de divis�o
		i = i / 3;
		System.out.println(i);

		// opera��o de divis�o simplificada
		i /= 3;
		System.out.println(i);

		// opera��o de m�dulo
		i = i % 5;
		System.out.println(i);

		// opera��o de m�dulo simplificada
		i %= 5;
		System.out.println(i);

	}

}
