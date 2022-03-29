package exemplo01;

/**
 * Programa para demonstrar a utilização de variáveis
 * @author wcarlosg
 * @since 04/02/2021
 */
public class Variaveis {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// declarando uma variável do tipo inteiro
		int idade;
		
		//declarando uma variável do tipo String
		String nome;

		//declarando uma variável do tipo double
		double valor;
		
		//atribuindo valores para as variáveis
		idade = 18;
		nome = "Willian Carlos Gomes";
		valor = 155.98;
		
		//exibindo o conteúdo das variáveis no console
		System.out.println("Variável IDADE: " + idade + ".");
		System.out.println("Variável NOME: " + nome + ".");
		System.out.println("Variável VALOR: " + valor + ".");
	}

}
