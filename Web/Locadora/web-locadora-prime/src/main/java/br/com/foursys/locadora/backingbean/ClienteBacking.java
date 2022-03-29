package br.com.foursys.locadora.backingbean;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;

import org.primefaces.component.tabview.TabView;

import br.com.foursys.locadora.bean.Cidade;
import br.com.foursys.locadora.bean.Contato;
import br.com.foursys.locadora.bean.Endereco;
import br.com.foursys.locadora.bean.Estado;
import br.com.foursys.locadora.bean.Cliente;
import br.com.foursys.locadora.controller.CidadeController;
import br.com.foursys.locadora.controller.ContatoController;
import br.com.foursys.locadora.controller.EnderecoController;
import br.com.foursys.locadora.controller.EstadoController;
import br.com.foursys.locadora.controller.ClienteController;
import br.com.foursys.locadora.util.JSFUtil;
import br.com.foursys.locadora.util.Logradouro;
import br.com.foursys.locadora.util.Mensagem;
import br.com.foursys.locadora.util.Perfil;
import br.com.foursys.locadora.util.Titulo;
import br.com.foursys.locadora.util.Valida;

/**
 * Classe responsavel por controlar o componentes do front-end Cliente
 * 
 * @author Willian Carlos Gomes
 * @since 03/05/2021
 * @version 1.0
 */
@ManagedBean(name = "clienteBacking")
@SessionScoped
public class ClienteBacking implements Serializable {

	private static final long serialVersionUID = 1L;
	// atributos da tela de cadastro
	private String nome;
	private String cpf;
	private String rg;
	private String dataNascimento;
	private String idade;
	private String sexo;
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
	private Cliente clienteSelecionado;

	// atributos auxiliares
	private Endereco endereco;
	private Contato contato;
	private Cliente cliente;
	private int cidade;
	private int estado;

	private ArrayList<Cliente> listaClientes;
	private ArrayList<String> listaPerfil;
	private ArrayList<Estado> listaEstados;
	private ArrayList<String> listaLogradouros;
	private ArrayList<Cidade> listaCidades;
	private boolean statusComboCidade = true;

	public ClienteBacking() {
		limparCampos();
		pesquisarInicial();
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

	public String getNomePesquisar() {
		return nomePesquisar;
	}

	public void setNomePesquisar(String nomePesquisar) {
		this.nomePesquisar = nomePesquisar;
	}

	public Cliente getClienteSelecionado() {
		return clienteSelecionado;
	}

	public void setClienteSelecionado(Cliente clienteSelecionado) {
		this.clienteSelecionado = clienteSelecionado;
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

	public ArrayList<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(ArrayList<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

	public ArrayList<String> getListaPerfil() {
		return listaPerfil;
	}

	public void setListaPerfil(ArrayList<String> listaPerfil) {
		this.listaPerfil = listaPerfil;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
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
	 * metodo que captura a acao do botao CADASTRAR na tela cad-cliente.jsp
	 */
	public void cadastrar() {

		if (validar()) {

			cliente = new Cliente();
			contato = new Contato();
			endereco = new Endereco();

			contato = getObjContato();
			endereco = getObjEndereco();
			cliente = getCliente();

			new ContatoController().salvar(contato);
			new EnderecoController().salvar(endereco);

			try {
				new ClienteController().salvar(cliente);
				limparCampos();
				JSFUtil.addInfoMessage(Titulo.CADASTRO_CLIENTE, Mensagem.CLIENTE_SALVO);
			} catch (Exception e) {
				JSFUtil.addErrorMessage(Titulo.CADASTRO_CLIENTE, Mensagem.CLIENTE_ERRO_SALVO);
			}
		}

	}

	public void alterarCliente() {

		if (validaAlterar()) {

			try {
				getClienteAlterar();

				new ContatoController().salvar(contato);
				new EnderecoController().salvar(endereco);
				limparCampos();
				JSFUtil.addInfoMessage(Titulo.CADASTRO_CLIENTE, Mensagem.CLIENTE_SALVO);
			} catch (Exception e) {
				JSFUtil.addErrorMessage(Titulo.CADASTRO_CLIENTE, Mensagem.CLIENTE_ERRO_SALVO);
			}

		}

	}

	private boolean validar() {

		if (Valida.isEmptyOrNull(nome)) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_CLIENTE, Mensagem.NOME_VAZIO);
			return false;
		}

		if (cpf.length() != 14) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_CLIENTE, Mensagem.CPF_VAZIO);
			return false;
		}

		if (rg.length() != 12) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_CLIENTE, Mensagem.RG_VAZIO);
			return false;
		}

		if (dataNascimento.length() != 10) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_CLIENTE, Mensagem.DATA_NASCIMENTO_VAZIO);
			return false;
		}

		if (!Valida.isInteger(idade)) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_CLIENTE, Mensagem.IDADE_VAZIO);
			return false;
		} else if (Valida.isIntZero(Integer.parseInt(idade))) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_CLIENTE, Mensagem.IDADE_INVALIDA);
			return false;
		}
		if (Valida.isEmptyOrNull(sexo)) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_CLIENTE, Mensagem.SEXO_VAZIO);
			return false;
		}

		if (celular.length() != 15) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_CLIENTE, Mensagem.CELULAR_VAZIO);
			return false;
		}

		if (Valida.isEmptyOrNull(email)) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_CLIENTE, Mensagem.EMAIL_VAZIO);
			return false;
		}

		if (Valida.isComboInvalida(estado)) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_CLIENTE, Mensagem.ESTADO_VAZIO);
			return false;
		}

		if (Valida.isComboInvalida(cidade)) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_CLIENTE, Mensagem.CIDADE_VAZIO);
			return false;
		}

		if (Valida.isEmptyOrNull(tipoLogradouro)) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_CLIENTE, Mensagem.TIPO_LOGRADOURO_VAZIO);
			return false;
		}

		if (Valida.isEmptyOrNull(nomeEndereco)) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_CLIENTE, Mensagem.NOME_ENDERECO_VAZIO);
			return false;
		}

		if (Valida.isEmptyOrNull(numero)) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_CLIENTE, Mensagem.NUMERO_ENDERECO_VAZIO);
			return false;
		}

		if (Valida.isEmptyOrNull(bairro)) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_CLIENTE, Mensagem.BAIRRO_VAZIO);
			return false;
		}

		if (cep.length() != 9) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_CLIENTE, Mensagem.CEP_VAZIO);
			return false;
		}
		return true;
	}

	private boolean validaAlterar() {

		if (!Valida.isInteger(idade)) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_CLIENTE, Mensagem.IDADE_VAZIO);
			return false;
		} else if (Valida.isIntZero(Integer.parseInt(idade))) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_CLIENTE, Mensagem.IDADE_INVALIDA);
			return false;
		}
		if (Valida.isEmptyOrNull(sexo)) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_CLIENTE, Mensagem.SEXO_VAZIO);
			return false;
		}

		if (celular.length() != 15) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_CLIENTE, Mensagem.CELULAR_VAZIO);
			return false;
		}

		if (Valida.isEmptyOrNull(email)) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_CLIENTE, Mensagem.EMAIL_VAZIO);
			return false;
		}

		if (Valida.isComboInvalida(estado)) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_CLIENTE, Mensagem.ESTADO_VAZIO);
			return false;
		}

		if (Valida.isComboInvalida(cidade)) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_CLIENTE, Mensagem.CIDADE_VAZIO);
			return false;
		}

		if (Valida.isEmptyOrNull(tipoLogradouro)) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_CLIENTE, Mensagem.TIPO_LOGRADOURO_VAZIO);
			return false;
		}

		if (Valida.isEmptyOrNull(nomeEndereco)) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_CLIENTE, Mensagem.NOME_ENDERECO_VAZIO);
			return false;
		}

		if (Valida.isEmptyOrNull(numero)) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_CLIENTE, Mensagem.NUMERO_ENDERECO_VAZIO);
			return false;
		}

		if (Valida.isEmptyOrNull(bairro)) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_CLIENTE, Mensagem.BAIRRO_VAZIO);
			return false;
		}

		if (cep.length() != 9) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_CLIENTE, Mensagem.CEP_VAZIO);
			return false;
		}

		return true;
	}

	/*
	 * metodo que captura a acao do botao CANCELAR na tela cad-cliente.jsp
	 */
	public void cancelar() {
		limparCampos();
		voltarIndex();
		listaCidades = null;
	}

	/*
	 * metodo que captura a acao do botao SAIR na tela cad-cliente.jsp
	 */
	public void sair() {
		try {
			limparCampos();
			FacesContext.getCurrentInstance().getExternalContext().redirect("index.xhtml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void sairDetalhar() {
		try {
			limparCampos();
			FacesContext.getCurrentInstance().getExternalContext().redirect("list-cliente.xhtml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*
	 * metodo para abrir a tela de cadastro
	 */
	public String cadastroCliente() {
		limparCampos();
		return "";
	}

	/*
	 * m�todo para abrir a tela de consulta
	 */
	public String consultarCliente() {
		nomePesquisar = null;
		listaClientes = null;
		return "";
	}

	/*
	 * metodo para retornar um objeto Cliente
	 */
	private Cliente getCliente() {

		cliente.setNome(nome);
		cliente.setCpf(cpf);
		cliente.setRg(rg);
		cliente.setDataNascimento(dataNascimento);
		cliente.setIdade(Integer.parseInt(idade));
		cliente.setSexo(sexo);

		return cliente;
	}

	/*
	 * metodo para retornar um objeto Contato
	 */
	private Contato getObjContato() {

		contato.setTelefone(telefone);
		contato.setCelular(celular);
		contato.setEmail(email);

		cliente.setContatoIdContato(contato);

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

		cliente.setEnderecoIdEndereco(endereco);

		return endereco;
	}

	private void getClienteAlterar() {
		cliente = clienteSelecionado;

		cliente.setNome(nome);
		cliente.setCpf(cpf);
		cliente.setRg(rg);
		cliente.setDataNascimento(dataNascimento);
		cliente.setIdade(Integer.parseInt(idade));
		cliente.setSexo(sexo);

		cliente.setEnderecoIdEndereco(endereco);

		contato.setTelefone(telefone);
		contato.setCelular(celular);
		contato.setEmail(email);

		cliente.setContatoIdContato(contato);

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

	/*
	 * metodo para pesquisar clientes
	 */
	public String pesquisar() {

		try {
			listaClientes = new ClienteController().buscarPorNome(nomePesquisar);
		} catch (Exception e) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_CLIENTE, Mensagem.CLIENTE_ERRO_PESQUISA);
		}

		return "";

	}
	
	public String pesquisarInicial() {

		try {
			listaClientes = new ClienteController().buscarTodos();
		} catch (Exception e) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_CLIENTE, Mensagem.CLIENTE_ERRO_PESQUISA);
		}

		return "";

	}
	
	public void comumAlteraDetalha() {
		nome = clienteSelecionado.getNome();
		cpf = clienteSelecionado.getCpf();
		rg = clienteSelecionado.getRg();
		dataNascimento = clienteSelecionado.getDataNascimento();
		idade = clienteSelecionado.getIdade() + "";
		sexo = clienteSelecionado.getSexo();

		telefone = clienteSelecionado.getContatoIdContato().getTelefone();
		celular = clienteSelecionado.getContatoIdContato().getCelular();
		email = clienteSelecionado.getContatoIdContato().getEmail();

		contato = clienteSelecionado.getContatoIdContato();

		tipoLogradouro = clienteSelecionado.getEnderecoIdEndereco().getTipoLogradouro();
		nomeEndereco = clienteSelecionado.getEnderecoIdEndereco().getEndereco();
		numero = clienteSelecionado.getEnderecoIdEndereco().getNumero() + "";
		complemento = clienteSelecionado.getEnderecoIdEndereco().getComplemento();
		bairro = clienteSelecionado.getEnderecoIdEndereco().getBairro();
		cep = clienteSelecionado.getEnderecoIdEndereco().getCep();
		
		carregarEstado();
		estado = clienteSelecionado.getEnderecoIdEndereco().getCidadeIdCidade().getEstadoIdEstado().getIdEstado();
		
		carregarCidade();
		cidade = clienteSelecionado.getEnderecoIdEndereco().getCidadeIdCidade().getIdCidade();

		endereco = clienteSelecionado.getEnderecoIdEndereco();
	}
	

	public void alterar() {
		comumAlteraDetalha();
		try {
			FacesContext.getCurrentInstance().getExternalContext().redirect("alt-cliente.xhtml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void detalhar() {
		comumAlteraDetalha();
		try {
			FacesContext.getCurrentInstance().getExternalContext().redirect("det-cliente.xhtml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void excluir() {

		try {
			new ClienteController().excluir(clienteSelecionado);
			new EnderecoController().excluir(clienteSelecionado.getEnderecoIdEndereco());
			new ContatoController().excluir(clienteSelecionado.getContatoIdContato());
			pesquisar();
			JSFUtil.addInfoMessage(Titulo.CADASTRO_CLIENTE, Mensagem.CLIENTE_EXCLUIDO);
		} catch (Exception e) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_CLIENTE, Mensagem.CLIENTE_ERRO_EXCLUIDO);
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
		UIComponent componente = viewRoot.findComponent("formCadCliente:tbCliente");
		TabView tabView = (TabView) componente;
		tabView.setActiveIndex(0);
	}
	
	/*
	 * Metodo para redirecionar a pagina 
	 */
	private void redirectTo(String args) {
		try {
			FacesContext.getCurrentInstance().getExternalContext().redirect(args);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
