package br.com.foursys.locadora.backingbean;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponent;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;

import org.primefaces.component.tabview.TabView;

import br.com.foursys.locadora.bean.Cidade;
import br.com.foursys.locadora.bean.Contato;
import br.com.foursys.locadora.bean.Endereco;
import br.com.foursys.locadora.bean.Estado;
import br.com.foursys.locadora.bean.Funcionario;
import br.com.foursys.locadora.controller.CidadeController;
import br.com.foursys.locadora.controller.ContatoController;
import br.com.foursys.locadora.controller.EnderecoController;
import br.com.foursys.locadora.controller.EstadoController;
import br.com.foursys.locadora.controller.FuncionarioController;
import br.com.foursys.locadora.util.JSFUtil;
import br.com.foursys.locadora.util.Logradouro;
import br.com.foursys.locadora.util.Mensagem;
import br.com.foursys.locadora.util.Perfil;
import br.com.foursys.locadora.util.Titulo;
import br.com.foursys.locadora.util.Valida;

/**
 * Classe responsavel por controlar o componentes do front-end Funcionario
 * 
 * @author Willian Carlos Gomes
 * @since 27/04/2021
 * @version 1.0
 */
@ManagedBean(name = "funcionarioBacking")
@SessionScoped
public class FuncionarioBacking implements Serializable {

	private static final long serialVersionUID = 1L;
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
	private String telefone;
	private String celular;
	private String email;
	private String tipoLogradouro;
	private String nomeEndereco;
	private String numero;
	private String complemento;
	private String bairro;
	private String cep;

	// atributos da tela de consulta
	private String nomePesquisar;
	private Funcionario funcionarioSelecionado;

	// atributos auxiliares
	private Endereco endereco;
	private Contato contato;
	private Funcionario funcionario;
	private int cidade;
	private int estado;

	private ArrayList<Funcionario> listaFuncionarios;
	private ArrayList<String> listaPerfil;
	private ArrayList<Estado> listaEstados;
	private ArrayList<String> listaLogradouros;
	private ArrayList<Cidade> listaCidades;
	private boolean statusComboCidade = true;

	public FuncionarioBacking() {
		pesquisar();
		carregarPerfil();
		carregarListaLogradouros();
		
	}
	
	

	public ArrayList<String> getListaLogradouros() {
		return listaLogradouros;
	}



	public void setListaLogradouros(ArrayList<String> listaLogradouros) {
		this.listaLogradouros = listaLogradouros;
	}



	public boolean isStatusComboCidade() {
		return statusComboCidade;
	}



	public void setStatusComboCidade(boolean statusComboCidade) {
		this.statusComboCidade = statusComboCidade;
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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTipoLogradouro() {
		return tipoLogradouro;
	}

	public void setTipoLogradouro(String tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}

	public String getNomeEndereco() {
		return nomeEndereco;
	}

	public void setNomeEndereco(String nomeEndereco) {
		this.nomeEndereco = nomeEndereco;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public int getCidade() {
		return cidade;
	}

	public void setCidade(int cidade) {
		this.cidade = cidade;
	}

	public ArrayList<Funcionario> getListaFuncionarios() {
		return listaFuncionarios;
	}

	public void setListaFuncionarios(ArrayList<Funcionario> listaFuncionarios) {
		this.listaFuncionarios = listaFuncionarios;
	}

	public ArrayList<String> getListaPerfil() {
		return listaPerfil;
	}

	public void setListaPerfil(ArrayList<String> listaPerfil) {
		this.listaPerfil = listaPerfil;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/*
	 * metodo que captura a acao do botao CADASTRAR na tela cad-funcionario.jsp
	 */
	public void cadastrar() {

		if (validar()) {

			funcionario = new Funcionario();
			contato = new Contato();
			endereco = new Endereco();

			contato = getObjContato();
			endereco = getObjEndereco();
			funcionario = getFuncionario();

			new ContatoController().salvar(contato);
			new EnderecoController().salvar(endereco);

			try {
				new FuncionarioController().salvar(funcionario);
				limparCampos();
				JSFUtil.addInfoMessage(Titulo.CADASTRO_FUNCIONARIO, Mensagem.FUNCIONARIO_SALVO);
			} catch (Exception e) {
				JSFUtil.addErrorMessage(Titulo.CADASTRO_FUNCIONARIO, Mensagem.FUNCIONARIO_ERRO_SALVO);
			}
		}

	}

	public void alterarFuncionario() {

		if (validaAlterar()) {

			try {
				getFuncionarioAlterar();

				new ContatoController().salvar(contato);
				new EnderecoController().salvar(endereco);
				limparCampos();
				JSFUtil.addInfoMessage(Titulo.CADASTRO_FUNCIONARIO, Mensagem.FUNCIONARIO_SALVO);
			} catch (Exception e) {
				JSFUtil.addErrorMessage(Titulo.CADASTRO_FUNCIONARIO, Mensagem.FUNCIONARIO_ERRO_SALVO);
			}

		}

	}

	private boolean validar() {

		if (Valida.isEmptyOrNull(nome)) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_FUNCIONARIO, Mensagem.NOME_VAZIO);
			return false;
		}

		if (cpf.length() != 14) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_FUNCIONARIO, Mensagem.CPF_VAZIO);
			return false;
		}

		if (rg.length() != 12) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_FUNCIONARIO, Mensagem.RG_VAZIO);
			return false;
		}

		if (dataNascimento.length() != 10) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_FUNCIONARIO, Mensagem.DATA_NASCIMENTO_VAZIO);
			return false;
		}

		if (!Valida.isInteger(idade)) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_FUNCIONARIO, Mensagem.IDADE_VAZIO);
			return false;
		} else if (Valida.isIntZero(Integer.parseInt(idade))) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_FUNCIONARIO, Mensagem.IDADE_INVALIDA);
			return false;
		}
		if (Valida.isEmptyOrNull(sexo)) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_FUNCIONARIO, Mensagem.SEXO_VAZIO);
			return false;
		}

		if (Valida.isEmptyOrNull(login)) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_FUNCIONARIO, Mensagem.LOGIN_VAZIO);
			return false;
		}

		if (Valida.isEmptyOrNull(senha)) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_FUNCIONARIO, Mensagem.SENHA_VAZIO);
			return false;
		}

		if (Valida.isEmptyOrNull(perfilAcesso)) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_FUNCIONARIO, Mensagem.PERFIL_ACESSO_VAZIO);
			return false;
		}

		if (celular.length() != 15) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_FUNCIONARIO, Mensagem.CELULAR_VAZIO);
			return false;
		}

		if (Valida.isEmptyOrNull(email)) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_FUNCIONARIO, Mensagem.EMAIL_VAZIO);
			return false;
		}

		if (Valida.isComboInvalida(estado)) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_FUNCIONARIO, Mensagem.ESTADO_VAZIO);
			return false;
		}

		if (Valida.isComboInvalida(cidade)) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_FUNCIONARIO, Mensagem.CIDADE_VAZIO);
			return false;
		}

		if (Valida.isEmptyOrNull(tipoLogradouro)) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_FUNCIONARIO, Mensagem.TIPO_LOGRADOURO_VAZIO);
			return false;
		}

		if (Valida.isEmptyOrNull(nomeEndereco)) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_FUNCIONARIO, Mensagem.NOME_ENDERECO_VAZIO);
			return false;
		}

		if (Valida.isEmptyOrNull(numero)) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_FUNCIONARIO, Mensagem.NUMERO_ENDERECO_VAZIO);
			return false;
		}

		if (Valida.isEmptyOrNull(bairro)) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_FUNCIONARIO, Mensagem.BAIRRO_VAZIO);
			return false;
		}

		if (cep.length() != 9) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_FUNCIONARIO, Mensagem.CEP_VAZIO);
			return false;
		}
		return true;
	}

	private boolean validaAlterar() {

		if (!Valida.isInteger(idade)) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_FUNCIONARIO, Mensagem.IDADE_VAZIO);
			return false;
		} else if (Valida.isIntZero(Integer.parseInt(idade))) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_FUNCIONARIO, Mensagem.IDADE_INVALIDA);
			return false;
		}
		if (Valida.isEmptyOrNull(sexo)) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_FUNCIONARIO, Mensagem.SEXO_VAZIO);
			return false;
		}

		if (celular.length() != 15) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_FUNCIONARIO, Mensagem.CELULAR_VAZIO);
			return false;
		}

		if (Valida.isEmptyOrNull(email)) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_FUNCIONARIO, Mensagem.EMAIL_VAZIO);
			return false;
		}

		if (Valida.isComboInvalida(estado)) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_FUNCIONARIO, Mensagem.ESTADO_VAZIO);
			return false;
		}

		if (Valida.isComboInvalida(cidade)) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_FUNCIONARIO, Mensagem.CIDADE_VAZIO);
			return false;
		}

		if (Valida.isEmptyOrNull(tipoLogradouro)) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_FUNCIONARIO, Mensagem.TIPO_LOGRADOURO_VAZIO);
			return false;
		}

		if (Valida.isEmptyOrNull(nomeEndereco)) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_FUNCIONARIO, Mensagem.NOME_ENDERECO_VAZIO);
			return false;
		}

		if (Valida.isEmptyOrNull(numero)) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_FUNCIONARIO, Mensagem.NUMERO_ENDERECO_VAZIO);
			return false;
		}

		if (Valida.isEmptyOrNull(bairro)) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_FUNCIONARIO, Mensagem.BAIRRO_VAZIO);
			return false;
		}

		if (cep.length() != 9) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_FUNCIONARIO, Mensagem.CEP_VAZIO);
			return false;
		}

		return true;
	}

	/*
	 * metodo que captura a acao do botao CANCELAR na tela cad-funcionario.jsp
	 */
	public void cancelar() {
		limparCampos();
		voltarIndex();
		listaCidades = null;
	}

	/*
	 * metodo que captura a acao do botao SAIR na tela cad-funcionario.jsp
	 */
	public void sair() {
		try {
			FacesContext.getCurrentInstance().getExternalContext().redirect("index.xhtml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void sairDetalhes() {
		try {
			FacesContext.getCurrentInstance().getExternalContext().redirect("list-funcionario.xhtml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*
	 * metodo para abrir a tela de cadastro
	 */
	public String cadastroFuncionario() {
		limparCampos();
		return "";
	}

	/*
	 * m�todo para abrir a tela de consulta
	 */
	public String consultarFuncionario() {
		nomePesquisar = null;
		listaFuncionarios = null;
		return "";
	}

	/*
	 * metodo para retornar um objeto Funcionario
	 */
	private Funcionario getFuncionario() {

		funcionario.setNome(nome);
		funcionario.setCpf(cpf);
		funcionario.setRg(rg);
		funcionario.setDataNascimento(dataNascimento);
		funcionario.setIdade(Integer.parseInt(idade));
		funcionario.setSexo(sexo);
		funcionario.setLogin(login);
		funcionario.setSenha(senha);
		funcionario.setPerfilAcesso(perfilAcesso);

		return funcionario;
	}

	/*
	 * metodo para retornar um objeto Contato
	 */
	private Contato getObjContato() {

		contato.setTelefone(telefone);
		contato.setCelular(celular);
		contato.setEmail(email);

		funcionario.setContatoIdContato(contato);

		return contato;
	}

	/*
	 * metodo para retornar um objeto Endereco
	 */
	private Endereco getObjEndereco() {

		endereco.setTipoLogradouro(tipoLogradouro);
		endereco.setEndereco(nomeEndereco);
		endereco.setNumero(Integer.parseInt(numero));
		endereco.setComplemento(complemento);
		endereco.setBairro(bairro);
		endereco.setCep(cep);
		endereco.setCidadeIdCidade(new Cidade(cidade));

		funcionario.setEnderecoIdEndereco(endereco);

		return endereco;
	}

	private void getFuncionarioAlterar() {
		funcionario = funcionarioSelecionado;

		funcionario.setNome(nome);
		funcionario.setCpf(cpf);
		funcionario.setRg(rg);
		funcionario.setDataNascimento(dataNascimento);
		funcionario.setIdade(Integer.parseInt(idade));
		funcionario.setSexo(sexo);
		funcionario.setLogin(login);
		funcionario.setSenha(senha);
		funcionario.setPerfilAcesso(perfilAcesso);

		funcionario.setEnderecoIdEndereco(endereco);

		contato.setTelefone(telefone);
		contato.setCelular(celular);
		contato.setEmail(email);

		funcionario.setContatoIdContato(contato);

		endereco.setTipoLogradouro(tipoLogradouro);
		endereco.setEndereco(nomeEndereco);
		endereco.setNumero(Integer.parseInt(numero));
		endereco.setComplemento(complemento);
		endereco.setBairro(bairro);
		endereco.setCep(cep);
		endereco.setCidadeIdCidade(new Cidade(cidade));

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
		setTelefone(null);
		setCelular(null);
		setEmail(null);
		setTipoLogradouro(null);
		setNomeEndereco(null);
		setNumero(null);
		setComplemento(null);
		setBairro(null);
		setCep(null);
		setCidade(0);
		setEstado(0);
		
		
		
	}

	
	
	
	
	public void comumAlterarDetalhar() {
		nome = funcionarioSelecionado.getNome();
		cpf = funcionarioSelecionado.getCpf();
		rg = funcionarioSelecionado.getRg();
		dataNascimento = funcionarioSelecionado.getDataNascimento();
		idade = funcionarioSelecionado.getIdade() + "";
		sexo = funcionarioSelecionado.getSexo();
		login = funcionarioSelecionado.getLogin();
		senha = funcionarioSelecionado.getSenha();
		perfilAcesso = funcionarioSelecionado.getPerfilAcesso();

		telefone = funcionarioSelecionado.getContatoIdContato().getTelefone();
		celular = funcionarioSelecionado.getContatoIdContato().getCelular();
		email = funcionarioSelecionado.getContatoIdContato().getEmail();

		contato = funcionarioSelecionado.getContatoIdContato();

		tipoLogradouro = funcionarioSelecionado.getEnderecoIdEndereco().getTipoLogradouro();
		nomeEndereco = funcionarioSelecionado.getEnderecoIdEndereco().getEndereco();
		numero = funcionarioSelecionado.getEnderecoIdEndereco().getNumero() + "";
		complemento = funcionarioSelecionado.getEnderecoIdEndereco().getComplemento();
		bairro = funcionarioSelecionado.getEnderecoIdEndereco().getBairro();
		cep = funcionarioSelecionado.getEnderecoIdEndereco().getCep();
		
		carregarEstado();
		estado = funcionarioSelecionado.getEnderecoIdEndereco().getCidadeIdCidade().getEstadoIdEstado().getIdEstado();
		
		carregarCidade();
		cidade = funcionarioSelecionado.getEnderecoIdEndereco().getCidadeIdCidade().getIdCidade();

		endereco = funcionarioSelecionado.getEnderecoIdEndereco();
	}

	public void alterar() {
		comumAlterarDetalhar();
		try {
			FacesContext.getCurrentInstance().getExternalContext().redirect("alt-funcionario.xhtml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void detalhar() {
		comumAlterarDetalhar();
		try {
			FacesContext.getCurrentInstance().getExternalContext().redirect("det-funcionario.xhtml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void excluir() {

		try {
			new FuncionarioController().excluir(funcionarioSelecionado);
			new EnderecoController().excluir(funcionarioSelecionado.getEnderecoIdEndereco());
			new ContatoController().excluir(funcionarioSelecionado.getContatoIdContato());
			pesquisar();
			JSFUtil.addInfoMessage(Titulo.CADASTRO_FUNCIONARIO, Mensagem.FUNCIONARIO_EXCLUIDO);
		} catch (Exception e) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_FUNCIONARIO, Mensagem.FUNCIONARIO_ERRO_EXCLUIDO);
		}

	}

	/*
	 * Método para carregar a lista de perfil de acesso
	 */
	public void carregarPerfil() {
		listaPerfil = new ArrayList<String>();
		for (Perfil p : Perfil.values()) {
			listaPerfil.add(p.getDescricao());
		}
	}

	private void carregarEstado() {
		try {
			listaEstados = new EstadoController().buscarTodos();
			statusComboCidade = false;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/*
	 * Método para valorizar combo estado
	 */
	public List<Estado> getComboEstado() {
		listaEstados = new EstadoController().buscarTodos();
		return listaEstados;
	}

	public void carregarCidade() {
		try {
			listaCidades = new CidadeController().buscarPorEstado(new Estado(estado));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	/*
	 * Metodo para valorizar combo Logradouro
	 */
	public void carregarListaLogradouros() {
		listaLogradouros = new ArrayList<String>();
		for (Logradouro l : Logradouro.values()) {
			listaLogradouros.add(l.getDescricao());
		}
	}
	
	/*
	 * Metodo para valorizar a combo cidades com base no Estado Selecionado
	 */
	public void atualizaCidades() {
		listaCidades = new CidadeController().buscarPorEstado(new Estado(estado));
		if (Valida.isIntZero(estado)) {
			statusComboCidade = true;
		} else {
			statusComboCidade = false;
		}
	}

	public void voltarIndex() {
		statusComboCidade = true;
		UIViewRoot viewRoot = FacesContext.getCurrentInstance().getViewRoot();
		UIComponent componente = viewRoot.findComponent("formCadFuncionario:tbFuncionario");
		TabView tabView = (TabView) componente;
		tabView.setActiveIndex(0);
	}
	
	public void pesquisar() {
		try {
			listaFuncionarios = new ArrayList<Funcionario>();
			for (Funcionario funcionario : new FuncionarioController().buscarPorNome(nomePesquisar)) {
				if (funcionario.getPerfilAcesso().equals(Perfil.DEV.getDescricao())) {
					if (LoginBacking.funcionarioLogado.getPerfilAcesso().equals(Perfil.DEV.getDescricao())) {
						listaFuncionarios.add(funcionario);
					}
				} else {
					listaFuncionarios.add(funcionario);
				}
			}
		} catch (Exception e) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_FUNCIONARIO, Mensagem.FUNCIONARIO_ERRO_PESQUISA);
		}
	}

	private void listarFuncionarios() {
		try {
			listaFuncionarios = new ArrayList<Funcionario>();
			for (Funcionario funcionario : new FuncionarioController().buscarTodos()) {
				if (funcionario.getPerfilAcesso().equals(Perfil.DEV.getDescricao())) {
					if (LoginBacking.funcionarioLogado.getPerfilAcesso().equals(Perfil.DEV.getDescricao())) {
						listaFuncionarios.add(funcionario);
					}
				} else {
					listaFuncionarios.add(funcionario);
				}
			}
		} catch (Exception e) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_FUNCIONARIO, Mensagem.FUNCIONARIO_ERRO_PESQUISA);
		}
	}

}
