package exemplo06;

/**
 * Classe para demonstrar a utilização de objetos Responsável por armazenar seus
 * tributos e métodos
 * 
 * @author Willian Carlos Gomes
 * @since 17 de fev. de 2021
 */
public class Pessoa {

	// Atributos ou características do objeto
	String nome;
	String dataNascimento;
	double altura;
	double peso;
	String sexo;

	// Método para exibir os dados do objeto
	public void exibirDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Data de Nasimento: " + dataNascimento);
		System.out.println("Altura: " + altura);
		System.out.println("Peso: " + peso);
		System.out.println("Sexo: " + sexo);
		System.out.println("Idade: " + calcularIdade());
		System.out.println(faixaEtaria());
	}
	

	// Médoto para retornar a idade da pessoa
	public int calcularIdade() {
		// Declarando a variável de retorno do método
		int idade = 0;

		// Variável para armazenar o ano de nascimento
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
	
	// Método para verificar se a pessoa é ou não maior de idade
	public String faixaEtaria() {
		if (calcularIdade() >= 18 ) {
			return "Maior de idade";
		} else {
			return "Menor de idade";
		}
	}
}
