package br.com.foursys.locadora.controller;

import java.util.ArrayList;

import br.com.foursys.locadora.bean.Endereco;
import br.com.foursys.locadora.dao.EnderecoDAO;

/**
 * Classe responsavel por acessar o objeto DAO e efetuar alteracoes e consulta
 * da base de dados
 * 
 * @author Willian Carlos Gomes
 * @since 27 de abr. de 2021
 * @version 1.0
 */
public class EnderecoController {

	public void salvar(Endereco endereco) {
		try {
			new EnderecoDAO().salvar(endereco);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void excluir(Endereco endereco) {
		try {
			new EnderecoDAO().excluir(endereco);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<Endereco> buscarPorNome(String nome) {

		ArrayList<Endereco> retorno = new ArrayList<Endereco>();

		try {
			retorno = new EnderecoDAO().buscarPorNome(nome);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return retorno;
	}
	
} // Fim da classe
