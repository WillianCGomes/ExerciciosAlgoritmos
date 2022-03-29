package exemplo09;

/**
 * Classe para demonstrar o conceito de herança de métodos e atributos
 * @author Willian Carlos Gomes
 * @since 23 de fev. de 2021
 */
public abstract class Funcionario {
	
	// Atributos do objeto Funcionário
	private String nome;
	private String cpf;
	private double salario;
	
	//Métodos para acessar os atributos
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	//método simples para exibir os atributos
	public void mostrarDados() {
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("Salário: " + salario);
	}
	
}// fim da classe
