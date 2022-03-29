package exemplo01;

/**
 * Programa para demonstrar operadores
 * 
 * @author wcarlosg
 * @since 05/02/2021
 */
public class OperadoresAritmeticos {

	/*
	 * M�todo principal para a execu��o do programa
	 */
	public static void main(String[] args) {
		// declarando vari�veis
		int adicao;
		int subtracao;
		int multiplicacao;
		double divisao;
		int modulo;

		// exemplo de adi��o
		adicao = 10 + 5;

		// exemplo de subtra��o
		subtracao = 10 - 5;

		// exemplo de multiplica��o
		multiplicacao = 24 * 3;

		// exemplo de divis�o
		divisao = 25 / 6.0;

		// exemplo de m�dulo
		modulo = 10 % 3;

		// exibindo o resultado na tela
		System.out.println("10 + 5 = " + adicao);
		System.out.println("10 - 5 = " + subtracao);
		System.out.println("24 * 3 = " + multiplicacao);
		System.out.println("25 / 6 = " + divisao);
		System.out.println("10 % 3 = " + modulo);

	}

}
