package br.com.foursys.locadora.controller;

import java.util.ArrayList;

import br.com.foursys.locadora.bean.Contato;
import br.com.foursys.locadora.dao.ContatoDAO;

/**
 * Classe responsavel por acessar o objeto DAO e efetuar alteracoes e consulta
 * da base de dados
 * 
 * @author Willian Carlos Gomes
 * @since 29 de abr. de 2021
 * @version 1.0
 */
public class ContatoController {

	public void salvar(Contato contato) {
		try {
			new ContatoDAO().salvar(contato);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void excluir(Contato contato) {
		try {
			new ContatoDAO().excluir(contato);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<Contato> buscarPorNome(String nome) {

		ArrayList<Contato> retorno = new ArrayList<Contato>();

		try {
			retorno = new ContatoDAO().buscarPorNome(nome);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return retorno;
	}
	
} // Fim da classe
