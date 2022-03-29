/**
 * 
 */
package br.com.foursys.locadora.controller;

import java.util.ArrayList;

import br.com.foursys.locadora.bean.Funcionario;
import br.com.foursys.locadora.dao.FuncionarioDAO;

/**
 * Classe responsavel por acessar o objeto DAO e efetuar alteracoes e consulta
 * na base de dados
 * 
 * @author Willian Carlos Gomes
 * @since 27/04/2021
 * @version 1.0
 */
public class FuncionarioController {

	public void salvar(Funcionario funcionario) {
		try {
			new FuncionarioDAO().salvar(funcionario);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Funcionario> buscarPorNome(String nome) {
		// lista auxiliar para retornar no metodo
		ArrayList<Funcionario> retorno = new ArrayList<Funcionario>();

		try {
			retorno = new FuncionarioDAO().buscarPorNome(nome);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return retorno;
	}
	
	public ArrayList<Funcionario> buscarPorLogin(String login) {
		// lista auxiliar para retornar no metodo
		ArrayList<Funcionario> retorno = new ArrayList<Funcionario>();
		
		try {
			retorno = new FuncionarioDAO().buscarPorLogin(login);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return retorno;
	}
	
	public void excluir(Funcionario funcionario) {
		try {
			new FuncionarioDAO().excluir(funcionario);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	public ArrayList<Funcionario> buscarTodos() {
		try {
			return new FuncionarioDAO().buscarTodos();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	

}
