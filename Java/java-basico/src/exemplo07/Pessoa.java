package exemplo07;

/**
 * Classe para armazenar os atributos e métodos do objeto Pessoa
 * 
 * @author Willian Carlos Gomes
 * @since 17 de fev. de 2021
 */
public class Pessoa {

	// Declarando os atributos da pessoa
	private String nome;
	private Data dataNascimento;
	private double salario;

	// Métodos para acessar os atributos
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Data getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Data dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	// Método para exibir os dados do objeto
	public void exibirDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Data Nascimento: " + dataNascimento);
	}

	@Override
	public String toString() {
		return ("Nome: " + nome);
	}
	
	// Método para verificar se o usuário ganha acima ou abaixo do salário minimo
	public String faixaSalarial() {
		if (salario >= 1163.55) {
			return "Acima do salário mínimo!";
		}else {
			return "Abaixo do salário mínimo!";
		}
	}

}
