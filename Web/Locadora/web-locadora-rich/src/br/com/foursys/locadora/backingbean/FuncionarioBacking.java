package br.com.foursys.locadora.backingbean;

import java.util.ArrayList;
import java.util.Iterator;

import br.com.foursys.locadora.bean.Cidade;
import br.com.foursys.locadora.bean.Contato;
import br.com.foursys.locadora.bean.Endereco;
import br.com.foursys.locadora.bean.Estado;
import br.com.foursys.locadora.bean.Funcionario;
import br.com.foursys.locadora.controller.FuncionarioController;
import br.com.foursys.locadora.dao.CidadeDAO;
import br.com.foursys.locadora.dao.EstadoDAO;
import br.com.foursys.locadora.util.JSFUtil;
import br.com.foursys.locadora.util.Valida;

/**
 * Classe responsável por controlar o componentes do front-end Funcionario
 * @author Willian Carlos Gomes
 * @since 28/04/2021
 * @version 1.0
 */

public class FuncionarioBacking {

	// atributos da tela de cadastro
	private String nome;
	private String cpf;
	private String rg;
	private String dataNascimento;
	private String idade;
	private String sexo;
	private String login;
	private String senha;
	private String perfilAcesso;

	// atributos da tela de consulta
	private String nomePesquisar;
	private Funcionario funcionarioSelecionado;

	// atributos auxiliares
	private Funcionario funcionario;
	private Endereco endereco;
	private Contato contato	;
	private ArrayList<Funcionario> listaFuncionarios;
	private ArrayList<Estado> listaEstados;
    private ArrayList<Cidade> listaCidades;
    private Cidade cidade;
    private Estado estado;
    
    public FuncionarioBacking() {
    	listaEstados = listaEstados();
    }
  	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public ArrayList<Estado> getListaEstados() {
		return listaEstados;
	}

	public void setListaEstados(ArrayList<Estado> listaEstados) {
		this.listaEstados = listaEstados;
	}

	public ArrayList<Cidade> getListaCidades() {
		return listaCidades;
	}

	public void setListaCidades(ArrayList<Cidade> listaCidades) {
		this.listaCidades = listaCidades;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getPerfilAcesso() {
		return perfilAcesso;
	}

	public void setPerfilAcesso(String perfilAcesso) {
		this.perfilAcesso = perfilAcesso;
	}

	public String getNomePesquisar() {
		return nomePesquisar;
	}

	public void setNomePesquisar(String nomePesquisar) {
		this.nomePesquisar = nomePesquisar;
	}


	public Funcionario getFuncionarioSelecionado() {
		return funcionarioSelecionado;
	}

	public void setFuncionarioSelecionado(Funcionario funcionarioSelecionado) {
		this.funcionarioSelecionado = funcionarioSelecionado;
	}

	public ArrayList<Funcionario> getListaFuncionarios() {
		return listaFuncionarios;
	}

	public void setListaFuncionarios(ArrayList<Funcionario> listaFuncionarios) {
		this.listaFuncionarios = listaFuncionarios;
	}

	/*
	 * método que captura a ação do botão CADASTRAR na tela cad-funcionario.jsp
	 */
	public void cadastrar() {

		if (validar()) {

			try {
				getFuncionario();
				new FuncionarioController().salvar(funcionario);
				limparCampos();
				JSFUtil.addInfoMessage("Funcionario gravado com sucesso!");
			} catch (Exception e) {
				JSFUtil.addErrorMessage("Erro ao cadastrar o funcionario!");
			}

		}

	}

	public void alterarFuncionario() {

		if (validar()) {

			try {
				getFuncionarioAlterar();
				new FuncionarioController().salvar(funcionario);
				limparCampos();
				JSFUtil.addInfoMessage("Funcionario alterado com sucesso!");
			} catch (Exception e) {
				JSFUtil.addErrorMessage("Erro ao alterar o funcionario!");
			}

		}

	}

	private boolean validar() {

		if (Valida.isEmptyOrNull(nome)) {
			JSFUtil.addErrorMessage("Informe o nome, campo obrigatório!");
			return false;
		}
		
		if (Valida.isEmptyOrNull(cpf)) {
			JSFUtil.addErrorMessage("Informe o CPF, campo obrigatório!");
			return false;
		}
		
		if (Valida.isEmptyOrNull(rg)) {
			JSFUtil.addErrorMessage("Informe o RG, campo obrigatório!");
			return false;
		}
		
		if (Valida.isEmptyOrNull(dataNascimento)) {
			JSFUtil.addErrorMessage("Informe uma data de nascimento, campo obrigatório!");
			return false;
		}

		if (!Valida.isInteger(idade)) {
			JSFUtil.addErrorMessage("Informe uma idade, campo obrigatório!");
			return false;
		} else if (Valida.isIntZero(Integer.parseInt(idade))) {
			JSFUtil.addErrorMessage("Informe uma idade válida!");
			return false;
		}
		
		if (Valida.isEmptyOrNull(sexo)) {
			JSFUtil.addErrorMessage("Informe o sexo, campo obrigatório!");
			return false;
		}

		if (Valida.isEmptyOrNull(login)) {
			JSFUtil.addErrorMessage("Informe o login, campo obrigatório!");
			return false;
		}
		
		if (Valida.isEmptyOrNull(senha)) {
			JSFUtil.addErrorMessage("Informe a senha, campo obrigatório!");
			return false;
		}
		
		if (Valida.isEmptyOrNull(perfilAcesso)) {
			JSFUtil.addErrorMessage("Informe o perfil de acesso, campo obrigatório!");
			return false;
		}
		
		return true;
	}

	/*
	 * método que captura a ação do botão CANCELAR na tela cad-funcionario.jsp
	 */
	public void cancelar() {
		limparCampos();
	}

	/*
	 * método que captura a ação do botão SAIR na tela cad-funcionario.jsp
	 */
	public String sair() {
		return "sair";
	}

	/*
	 * método para abrir a tela de cadastro
	 */
	public String cadastroFuncionario() {
		limparCampos();
		return "";
	}

	/*
	 * método para abrir a tela de consulta
	 */
	public String consultarFuncionario() {
		nomePesquisar = null;
		listaFuncionarios = null;
		return "";
	}

	/*
	 * método para retornar um objeto Funcionario
	 */
	private void getFuncionario() {
		funcionario = new Funcionario();
		funcionario.setNome(nome);
		funcionario.setCpf(cpf);
		funcionario.setRg(rg);
		funcionario.setDataNascimento(dataNascimento);
		funcionario.setIdade(Integer.parseInt(idade));
		funcionario.setSexo(sexo);
		funcionario.setLogin(login);
		funcionario.setSenha(senha);
		funcionario.setPerfilAcesso(perfilAcesso);
		
		
	}

	private void getFuncionarioAlterar() {
		funcionario.setNome(nome);
		funcionario.setCpf(cpf);
		funcionario.setRg(rg);
		funcionario.setDataNascimento(dataNascimento);
		funcionario.setIdade(Integer.parseInt(idade));
		funcionario.setSexo(sexo);
		funcionario.setLogin(login);
		funcionario.setSenha(senha);
		funcionario.setPerfilAcesso(perfilAcesso);
	}

	private void limparCampos() {
	    setNome(null);
		setCpf(null);
		setRg(null);
		setDataNascimento(null);
		setIdade(null);
		setSexo(null);
		setLogin(null);
		setSenha(null);
		setPerfilAcesso(null);
	}

	/*
	 * método para pesquisar funcionarios
	 */
	public String pesquisar() {

		try {
			listaFuncionarios = new FuncionarioController().buscarPorNome(nomePesquisar);
		} catch (Exception e) {
			JSFUtil.addErrorMessage("Erro ao pesquisar Funcionarios!");
		}

		return "";

	}

	public String alterar() {
		nome = funcionarioSelecionado.getNome();
		cpf = funcionarioSelecionado.getCpf();
		rg = funcionarioSelecionado.getRg();
		dataNascimento = funcionarioSelecionado.getDataNascimento();
		idade = funcionarioSelecionado.getIdade() + "";
		sexo = funcionarioSelecionado.getSexo();
		login = funcionarioSelecionado.getLogin();
		senha = funcionarioSelecionado.getSenha();
		perfilAcesso = funcionarioSelecionado.getPerfilAcesso();

			
		return "";
	}

	public String excluir() {

		try {
			new FuncionarioController().excluir(funcionarioSelecionado);
			pesquisar();
			JSFUtil.addInfoMessage("Funcionario excluído com sucesso!");
		} catch (Exception e) {
			JSFUtil.addErrorMessage("Erro ao excluir o Funcionario!");
		}

		return "";
	}
	
	/*
	    * método para retornar os estados gravados na tabela
	    */
	   public ArrayList<Estado> listaEstados() {
	       // lista auxiliar para retornar no método
	       ArrayList<Estado> listaEstados = null;
	       
	       try {
	    	   listaEstados = new EstadoDAO().buscarTodos();
	       } catch (Exception ex) {
	    	   JSFUtil.addErrorMessage("Erro ao carregar estados");
	       }
	       
	       return listaEstados;
	   } 
	   
	
	/*
     * método para carregar a combo de estado
     */
    public void carregaListaEstado() {
        listaEstados = new FuncionarioBacking().listaEstados();
			
		}
    
    
    
    /*
	    * método para retornar os estados gravados na tabela
	    */
	   public ArrayList<Cidade> buscarTodas() {
	       // lista auxiliar para retornar no método
	       ArrayList<Cidade> retorno = null;
	       
	       try {
	       //    retorno = new CidadeDAO().buscarTodos();
	       } catch (Exception ex) {
	    	   JSFUtil.addErrorMessage("Erro ao carregar cidades");
	       }
	       
	       return retorno;
	   } 
        
    }


