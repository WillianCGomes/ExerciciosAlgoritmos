package exemplo06;

/**
 * Classe para demonstrar a utilização do objeto Pessoa
 * 
 * @author Willian Carlos Gomes
 * @since 17 de fev. de 2021
 */
public class TestaPessoa {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// Declarando o objeto pessoa
		Pessoa joao;

		// Inicializando o objeto joao
		joao = new Pessoa();

		// Atribuindo os valores ao objeto joao
		joao.nome = "João Almeida de Souza";
		joao.dataNascimento = "23/05/1986";
		joao.altura = 1.89;
		joao.peso = 85;
		joao.sexo = "Masculino";

		// Declarando o objeto pessoa maria
		Pessoa maria;

		// Inicializando o objeto maria
		maria = new Pessoa();

		// Atribuindo os valore ao objeto maria
		maria.nome = "Maria da Silva de Souza";
		maria.dataNascimento = "12/08/1985";
		maria.altura = 1.52;
		maria.peso = 65;
		maria.sexo = "Feminino";

		// Exibindo os dados do objeto joao
		System.out.println("Nome: " + joao.nome);
		System.out.println("Data de nasimento: " + joao.dataNascimento);
		System.out.println("Altura: " + joao.altura);
		System.out.println("Peso: " + joao.peso);
		System.out.println("Sexo: " + joao.sexo);

		// pulando uma linha
		System.out.println("");

		// Exibindo os dados do objeto mari
		System.out.println("Nome: " + maria.nome);
		System.out.println("Data de nasimento: " + maria.dataNascimento);
		System.out.println("Altura: " + maria.altura);
		System.out.println("Peso: " + maria.peso);
		System.out.println("Sexo: " + maria.sexo);

		// pulando uma linha
		System.out.println("");

		// Exibindo os dados do objeto joao
		joao.exibirDados();

		// pulando uma linha
		System.out.println("");

		// Exibir os dados do objeto maria
		maria.exibirDados();

	}

}
