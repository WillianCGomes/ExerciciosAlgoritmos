package model;

/**
 * Classe para armazenar os dados referentes aos estados do projeto locadora
 * 
 * @author Willian Carlos Gomes
 * @since 4 de mar. de 2021
 */
public class Estado {
	// atributos da classe
	private String uf;
	private String nome;
	public Estado(String uf, String nome) {
		this.uf = uf;
		this.nome = nome;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	

	
	



	
}
