/**
 * 
 */
package br.com.foursys.forum.controller.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.foursys.forum.model.Usuario;

/**
 * Classe responsável por armazenar atributos devolvidos nas requisicoes
 * 
 * @author Willian Carlos Gomes
 * @since 17/05/2021
 * @version 1.0
 *
 */
public class UsuarioDto {

	private Long id;
	private String nome;
	private String email;

	public UsuarioDto(Usuario Usuario) {
		this.id = Usuario.getId();
		this.nome = Usuario.getNome();
		this.email = Usuario.getEmail();
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public static List<UsuarioDto> converter(List<Usuario> Usuarios) {

		return Usuarios.stream().map(UsuarioDto::new).collect(Collectors.toList());
	}

}
