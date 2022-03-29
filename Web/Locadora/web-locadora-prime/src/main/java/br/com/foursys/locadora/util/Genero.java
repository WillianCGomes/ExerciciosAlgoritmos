package br.com.foursys.locadora.util;

/**
 * ENUM responsável por armazenar os gêneros de filmes
 * @author Willian Carlos Gomes
 * @since 29/04/2021
 * @version 1.0
 */
public enum Genero {

	ACAO("Ação"),
	AVENTURA("Aventura"),
	COMEDIA("Comédia"),
	CINEMADEARTE("Cinema de arte"),
	CHANCHADA("Chanchada"),
	COMEDIADEAÇÃO("Comédia de ação"),
	COMEDIADETERROR("Comédia de terror"),
	COMÉDIADRAMATICA("Comédia dramática"),
	COMEDIAROMANTICA("Comédia romântica"),
	DANCA("Dança"),
	DOCUMENTARIO("Documentário"),
	DOCUFICCAO("Docuficção"),
	DRAMA("Drama"),
	ESPIONAGEM("Espionagem"),
	FAROESTE("Faroeste"),
	FANTASIA("Fantasia"),
	FANTASIACIENTIFICA("Fantasia Científica"),
	FICCAOCIENTIFICA("Ficção científica"),
	FILMESCOMTRUQUES("Filmes com truques"),
	FILMESDEGUERRA("Filmes de guerra"),
	MUSICAL("Musical"),
	FILMEPOLICIAL("Filme Policial"),
	ROMANCE("Romance"),
	SERIADO("Seriado"),
	SUSPENSE("Suspense"),
	TERROR("Terror"),
	THRILLER("Thriller");

	private String descricao;
	
	Genero(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
