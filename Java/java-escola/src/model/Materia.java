package model;

/**
 * Classe responsavel por armazenar atributos e métodos do Materia
 *
 * @author Willian Carlos Gomes
 * @since 23 de fev. de 2021
 */
public class Materia {
	
	//declarando os atributos do objeto professor
	private int codigo;
	private String nome;
	
	// métodos acessores
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
	
	
}
