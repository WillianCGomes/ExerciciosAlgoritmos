package br.com.foursys.locadora.util;

/**
 * ENUM responsável por armazenar os gêneros de filmes
 * 
 * @author Willian Carlos Gomes
 * @since 29/04/2021
 * @version 1.0
 */
public enum Perfil {

	ADMIN("Administrador"), DEV("Desenvolvedor"), USER("Usuario");

	private String descricao;

	Perfil(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}