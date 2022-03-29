/**
 * 
 */
package exemplo03;

/**
 * Programa para demonstrar cálculos aritméticos simplificados
 * 
 * @author Willian Gomes
 * @since 10/02/2021
 *
 */
public class OperacoesSimplificadas {

	/*
	 * Método principal para a execução da classe
	 */
	public static void main(String[] args) {

		// Declarando as variáveis
		int i;

		// inicialização da variável com o valor 10
		i = 10;

		// Operação de adição
		i = i + 1;

		System.out.println(i); // Exibindo o valor 11

		// Operação simplificada - incremento
		i++;

		System.out.println(i); // Exibindo o valor 12

		// Operação de subtração
		i = i - 1;

		System.out.println(i); // Exibindo o valor 11

		// Operação simplificada - decremento
		i--;

		System.out.println(i); // Exibindo o valor 10

		// operação de adição
		i = i + 2;

		System.out.println(i); // exibindo o valor 12

		// operação de adição simplificada
		i += 2;

		System.out.println(i); // exibindo o valor 14

		// operação de subtração
		i = i - 2;

		System.out.println(i); // exibindo o valor 12

		// operação de subtração simplificada
		i -= 2;

		System.out.println(i); // exibindo o valor 10

		// operação de multiplicação
		i = i * 3;
		System.out.println(i);

		// operação de multiplicação simplificada
		i *= 3;
		System.out.println(i);

		// operação de divisão
		i = i / 3;
		System.out.println(i);

		// operação de divisão simplificada
		i /= 3;
		System.out.println(i);

		// operação de módulo
		i = i % 5;
		System.out.println(i);

		// operação de módulo simplificada
		i %= 5;
		System.out.println(i);

	}

}
