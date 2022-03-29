/**
 * 
 */
package br.com.foursys.locadora.controller;

import java.util.ArrayList;

import br.com.foursys.locadora.bean.Cidade;
import br.com.foursys.locadora.bean.Estado;
import br.com.foursys.locadora.dao.CidadeDAO;

/**
 * Classe responsavel por acessar o objeto DAO e efetuar alteracoes e consulta
 * na base de dados
 * 
 * @author Willian Carlos Gomes
 * @since 30/04/2021
 * @version 1.0
 */
public class CidadeController {

	public void salvar(Cidade cidade) {
		try {
			new CidadeDAO().salvar(cidade);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Cidade> buscarPorEstado(Estado estado) {
		// lista auxiliar para retornar no metodo
		ArrayList<Cidade> retorno = new ArrayList<Cidade>();

		try {
			retorno = new CidadeDAO().buscarPorEstado(estado);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return retorno;
	}

	public ArrayList<Cidade> buscarPorNome(String nome) {
		// lista auxiliar para retornar no metodo
		ArrayList<Cidade> retorno = new ArrayList<Cidade>();

		try {
			retorno = new CidadeDAO().buscarPorNome(nome);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return retorno;
	}

	public void excluir(Cidade cidade) {
		try {
			new CidadeDAO().excluir(cidade);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
