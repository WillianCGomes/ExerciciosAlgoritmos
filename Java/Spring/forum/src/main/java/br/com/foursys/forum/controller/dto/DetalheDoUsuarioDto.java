package br.com.foursys.forum.controller.dto;

import br.com.foursys.forum.model.Usuario;

public class DetalheDoUsuarioDto {
	private Long id;
	private String nome;
	private String email;
	
	public DetalheDoUsuarioDto(Usuario usuario) {
		this.id = usuario.getId();
		this.nome = usuario.getNome();
		this.email = usuario.getEmail();
		
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

}
