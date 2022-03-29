/**
 * 
 */
package br.com.foursys.locadora.controller;

import java.util.ArrayList;

import br.com.foursys.locadora.bean.Estado;
import br.com.foursys.locadora.dao.EstadoDAO;

/**
 * Classe responsavel por acessar o objeto DAO e efetuar alteracoes e consulta
 * na base de dados
 * 
 * @author Willian Carlos Gomes
 * @since 27/04/2021
 * @version 1.0
 */
public class EstadoController {

	public void salvar(Estado estado) {
		try {
			new EstadoDAO().salvar(estado);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Estado> buscarTodos() {
		ArrayList<Estado> retorno = new ArrayList<Estado>();
		try {
			retorno = new EstadoDAO().buscarTodos();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return retorno;
	}
	
	public ArrayList<Estado> buscarPorNome(String nome) {
		// lista auxiliar para retornar no metodo
		ArrayList<Estado> retorno = new ArrayList<Estado>();

		try {
			retorno = new EstadoDAO().buscarPorNome(nome);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return retorno;
	}
	
	public void excluir(Estado estado) {
		try {
			new EstadoDAO().excluir(estado);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
