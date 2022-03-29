package model;

/**
 * Classe responsavel por armazenar atributos e métodos do Contato
 *
 * @author Willian Carlos Gomes
 * @since 23 de fev. de 2021
 */
public class Contato {
	
	//declarando os atributos do objeto Endereco
	
	private String celular;
	private String email;
	
	// métodos acessores
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
