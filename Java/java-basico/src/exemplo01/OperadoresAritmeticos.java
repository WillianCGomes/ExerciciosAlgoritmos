package exemplo01;

/**
 * Programa para demonstrar operadores
 * 
 * @author wcarlosg
 * @since 05/02/2021
 */
public class OperadoresAritmeticos {

	/*
	 * Método principal para a execução do programa
	 */
	public static void main(String[] args) {
		// declarando variáveis
		int adicao;
		int subtracao;
		int multiplicacao;
		double divisao;
		int modulo;

		// exemplo de adição
		adicao = 10 + 5;

		// exemplo de subtração
		subtracao = 10 - 5;

		// exemplo de multiplicação
		multiplicacao = 24 * 3;

		// exemplo de divisão
		divisao = 25 / 6.0;

		// exemplo de módulo
		modulo = 10 % 3;

		// exibindo o resultado na tela
		System.out.println("10 + 5 = " + adicao);
		System.out.println("10 - 5 = " + subtracao);
		System.out.println("24 * 3 = " + multiplicacao);
		System.out.println("25 / 6 = " + divisao);
		System.out.println("10 % 3 = " + modulo);

	}

}
