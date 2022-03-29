package exemplo07;

/**
 * Programa para testar o objeto pessoa
 * 
 * @author Willian Carlos Gomes
 * @since 17 de fev. de 2021
 */
public class TestaPessoa {

	
	public static void main(String[] args) {

		// Declarar e instanciar o objeto pessoa
		Pessoa joao = new Pessoa();

		// Atribuindo os valores ao objeto joao
		joao.setNome("João Almeida de Souza");
		joao.setSalario(1500);
		
		// Atribuindo o salário do objeto joao

		// Criando e instanciando o objeto de data
		Data dataNascimento = new Data();

		// Inicializando a data do objeto joao
		dataNascimento.setDia(10);
		dataNascimento.setMes(02);
		dataNascimento.setAno(1985);

		// Atribundi os valores da data para o objeto joao
		joao.setDataNascimento(dataNascimento);

		// Exibindo os dados do objeto joao
		System.out.println("Nome:" + joao.getNome());
		System.out.println("Data Nascimento: " + joao.getDataNascimento());
		System.out.println(joao.getDataNascimento().faixaEtaria());
		System.out.println(joao.faixaSalarial());

	}

}
