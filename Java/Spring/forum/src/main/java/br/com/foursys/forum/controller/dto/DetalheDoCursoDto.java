package br.com.foursys.forum.controller.dto;

import br.com.foursys.forum.model.Curso;

public class DetalheDoCursoDto {
	private Long id;
    private String nome;
    private String categoria;
    
    public DetalheDoCursoDto(Curso curso) {
    	this.id = curso.getId();
    	this.nome = curso.getNome();
    	this.categoria = curso.getCategoria();
    }

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getCategoria() {
		return categoria;
	}
	
	
}
