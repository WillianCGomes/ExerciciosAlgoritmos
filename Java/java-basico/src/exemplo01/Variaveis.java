package exemplo01;

/**
 * Programa para demonstrar a utiliza��o de vari�veis
 * @author wcarlosg
 * @since 04/02/2021
 */
public class Variaveis {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// declarando uma vari�vel do tipo inteiro
		int idade;
		
		//declarando uma vari�vel do tipo String
		String nome;

		//declarando uma vari�vel do tipo double
		double valor;
		
		//atribuindo valores para as vari�veis
		idade = 18;
		nome = "Willian Carlos Gomes";
		valor = 155.98;
		
		//exibindo o conte�do das vari�veis no console
		System.out.println("Vari�vel IDADE: " + idade + ".");
		System.out.println("Vari�vel NOME: " + nome + ".");
		System.out.println("Vari�vel VALOR: " + valor + ".");
	}

}
