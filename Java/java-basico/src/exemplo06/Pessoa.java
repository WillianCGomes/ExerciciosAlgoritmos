package exemplo06;

/**
 * Classe para demonstrar a utiliza��o de objetos Respons�vel por armazenar seus
 * tributos e m�todos
 * 
 * @author Willian Carlos Gomes
 * @since 17 de fev. de 2021
 */
public class Pessoa {

	// Atributos ou caracter�sticas do objeto
	String nome;
	String dataNascimento;
	double altura;
	double peso;
	String sexo;

	// M�todo para exibir os dados do objeto
	public void exibirDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Data de Nasimento: " + dataNascimento);
		System.out.println("Altura: " + altura);
		System.out.println("Peso: " + peso);
		System.out.println("Sexo: " + sexo);
		System.out.println("Idade: " + calcularIdade());
		System.out.println(faixaEtaria());
	}
	

	// M�doto para retornar a idade da pessoa
	public int calcularIdade() {
		// Declarando a vari�vel de retorno do m�todo
		int idade = 0;

		// Vari�vel para armazenar o ano de nascimento
		int anoNascimento = 0;
		int anoAtual = 2021;

		// Quebrando a data do tipo string
		String dataQuebrada[] = dataNascimento.split("/");
		anoNascimento = Integer.parseInt(dataQuebrada[2]);

		// Calculando a idade do objeto
		idade = anoAtual - anoNascimento;

		// Retornando a idade da pessoa
		return idade;
	}
	
	// M�todo para verificar se a pessoa � ou n�o maior de idade
	public String faixaEtaria() {
		if (calcularIdade() >= 18 ) {
			return "Maior de idade";
		} else {
			return "Menor de idade";
		}
	}
}
