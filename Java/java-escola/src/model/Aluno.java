package model;

/**
 * Classe responsavel por armazenar atributos e m�todos do Aluno
 *
 * @author Willian Carlos Gomes
 * @since 23 de fev. de 2021
 */
public class Aluno {

	// declarando os atributos do objeto aluno
	private int codigo;
	private String nome;
	private String cpf;
	private String rg;
	private Contato contato;
	private Endereco endereco;
	
	//metodos acessores

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

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

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

}
