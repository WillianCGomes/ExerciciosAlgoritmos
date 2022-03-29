/**
 * 
 */
package br.com.foursys.locadora.controller;

import java.util.ArrayList;

import br.com.foursys.locadora.bean.Cliente;
import br.com.foursys.locadora.bean.Filme;
import br.com.foursys.locadora.dao.ClienteDAO;
import br.com.foursys.locadora.dao.FilmeDAO;

/**
 * Classe responsavel por acessar o objeto DAO e efetuar alteracoes e consulta
 * na base de dados
 * 
 * @author Willian Carlos Gomes
 * @since 27/04/2021
 * @version 1.0
 */
public class FilmeController {

	public void salvar(Filme filme) {
		try {
			new FilmeDAO().salvar(filme);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Filme> buscarPorNome(String nome) {
		// lista auxiliar para retornar no metodo
		ArrayList<Filme> retorno = new ArrayList<Filme>();

		try {
			retorno = new FilmeDAO().buscarPorNome(nome);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return retorno;
	}
	
	public void excluir(Filme filme) {
		try {
			new FilmeDAO().excluir(filme);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<Filme> buscarTodos() {
		ArrayList<Filme> retorno = new ArrayList<Filme>();
		try {
			retorno = new FilmeDAO().buscarTodos();
		} catch (Exception e) {
			e.printStackTrace();

		}
		return retorno;
	}

	public ArrayList<Filme> buscarDisponivel(String disponivel) {
		ArrayList<Filme> retorno = new ArrayList<Filme>();
		try {
			retorno = new FilmeDAO().buscarDisponivel(disponivel);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return retorno;
	}
	
}
