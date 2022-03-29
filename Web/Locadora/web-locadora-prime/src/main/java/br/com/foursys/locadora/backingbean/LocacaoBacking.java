package br.com.foursys.locadora.backingbean;

import java.io.IOException;
import java.io.Serializable;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.com.foursys.locadora.bean.Cliente;
import br.com.foursys.locadora.bean.Filme;
import br.com.foursys.locadora.bean.FormaPagamento;
import br.com.foursys.locadora.bean.Locacao;
import br.com.foursys.locadora.bean.LocacaoFilme;
import br.com.foursys.locadora.controller.ClienteController;
import br.com.foursys.locadora.controller.FilmeController;
import br.com.foursys.locadora.controller.FormaPagamentoController;
import br.com.foursys.locadora.controller.LocacaoController;
import br.com.foursys.locadora.controller.LocacaoFilmeController;
import br.com.foursys.locadora.util.JSFUtil;
import br.com.foursys.locadora.util.Mensagem;
import br.com.foursys.locadora.util.Titulo;
import br.com.foursys.locadora.util.Valida;

/**
 * Classe responsavel por controlar o componentes do front-end Locacao
 * 
 * @author Willian Carlos Gomes
 * @since 05/05/2021
 * @version 1.0
 */
@ManagedBean(name = "locacaoBacking")
@SessionScoped
public class LocacaoBacking implements Serializable {

	private static final long serialVersionUID = 1L;
	// atributos da tela de cadastro
	private int comboCliente;
	private int filmeCombo;
	private String valor;
	private String dataLocacao;
	private Date dataDevolucao;
	private int formaPagamentoCombo;
	
	private Date minDate;
	private Date maxDate;

	private double valorTotal;
	private boolean bloqueio;

	private Locacao locacao;
	private Filme filmeSelecionado;
	private Locacao locacaoSelecionada;
	private String clientePesquisar;

	private ArrayList<Cliente> listaClientes;
	private ArrayList<Filme> listaFilmes;
	private ArrayList<Filme> listaFilmesLocacao;
	private ArrayList<FormaPagamento> listaFormaPagamento;
	private ArrayList<Locacao> listaLocacoes;
	private ArrayList<Locacao> listaLocacoesGeralFiltro;

	private String nomeCliente;
	private String nomeFuncionario;
	private String dataDevolucaoLocacao;
	private String dataDevolucaoAtual;
	private String idLocacao;

	private boolean carregado;

	private Locacao devolucao;

	///////////////////////

	public LocacaoBacking() {
		carregarData();
		carregarClientes();
		carregarFilmes();
		carregarFormaPagamentos();
		carregarDataLocacao();
		listaFilmesLocacao = new ArrayList<Filme>();
		setValor(NumberFormat.getCurrencyInstance().format(0.0));
		setBloqueio(true);
		carregarLocacoes();
	}

	/////////////////////////
	
	public ArrayList<Locacao> getListaLocacoesGeralFiltro() {
		
		return listaLocacoesGeralFiltro;
	}

	public Date getMinDate() {
		return minDate;
	}

	public void setMinDate(Date minDate) {
		this.minDate = minDate;
	}

	public Date getMaxDate() {
		return maxDate;
	}

	public void setMaxDate(Date maxDate) {
		this.maxDate = maxDate;
	}

	public void setListaLocacoesGeralFiltro(ArrayList<Locacao> listaLocacoesGeralFiltro) {
		this.listaLocacoesGeralFiltro = listaLocacoesGeralFiltro;
	}

	public String getIdLocacao() {
		return idLocacao;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public String getDataDevolucaoLocacao() {
		return dataDevolucaoLocacao;
	}

	public void setDataDevolucaoLocacao(String dataDevolucaoLocacao) {
		this.dataDevolucaoLocacao = dataDevolucaoLocacao;
	}

	public String getDataDevolucaoAtual() {
		return dataDevolucaoAtual;
	}

	public void setDataDevolucaoAtual(String dataDevolucaoAtual) {
		this.dataDevolucaoAtual = dataDevolucaoAtual;
	}

	public boolean isCarregado() {
		return carregado;
	}

	public void setCarregado(boolean carregado) {
		this.carregado = carregado;
	}

	public Locacao getDevolucao() {
		return devolucao;
	}

	public void setDevolucao(Locacao devolucao) {
		this.devolucao = devolucao;
	}

	public void setIdLocacao(String idLocacao) {
		this.idLocacao = idLocacao;
	}

	public Locacao getLocacaoSelecionada() {
		return locacaoSelecionada;
	}

	public void setLocacaoSelecionada(Locacao locacaoSelecionada) {
		this.locacaoSelecionada = locacaoSelecionada;
	}

	public String getClientePesquisar() {
		return clientePesquisar;
	}

	public void setClientePesquisar(String clientePesquisar) {
		this.clientePesquisar = clientePesquisar;
	}

	public ArrayList<Locacao> getListaLocacoes() {
		 listaLocacoes = new LocacaoController().buscarTodos();
		return listaLocacoes;
	}

	public void setListaLocacoes(ArrayList<Locacao> listaLocacoes) {
		this.listaLocacoes = listaLocacoes;
	}

	public int getComboCliente() {
		return comboCliente;
	}

	public void setComboCliente(int comboCliente) {
		this.comboCliente = comboCliente;
	}

	public int getFilmeCombo() {
		return filmeCombo;
	}

	public void setFilmeCombo(int filmeCombo) {
		this.filmeCombo = filmeCombo;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getDataLocacao() {
		return dataLocacao;
	}

	public void setDataLocacao(String dataLocacao) {
		this.dataLocacao = dataLocacao;
	}

	public Date getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public int getFormaPagamentoCombo() {
		return formaPagamentoCombo;
	}

	public void setFormaPagamentoCombo(int formaPagamentoCombo) {
		this.formaPagamentoCombo = formaPagamentoCombo;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public boolean isBloqueio() {
		return bloqueio;
	}

	public void setBloqueio(boolean bloqueio) {
		this.bloqueio = bloqueio;
	}

	public void setLocacao(Locacao locacao) {
		this.locacao = locacao;
	}

	public Filme getFilmeSelecionado() {
		return filmeSelecionado;
	}

	public void setFilmeSelecionado(Filme filmeSelecionado) {
		this.filmeSelecionado = filmeSelecionado;
	}

	public ArrayList<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(ArrayList<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

	public ArrayList<Filme> getListaFilmes() {
		return listaFilmes;
	}

	public void setListaFilmes(ArrayList<Filme> listaFilmes) {
		this.listaFilmes = listaFilmes;
	}

	public ArrayList<Filme> getListaFilmesLocacao() {
		return listaFilmesLocacao;
	}

	public void setListaFilmesLocacao(ArrayList<Filme> listaFilmesLocacao) {
		this.listaFilmesLocacao = listaFilmesLocacao;
	}

	public ArrayList<FormaPagamento> getListaFormaPagamento() {
		return listaFormaPagamento;
	}

	public void setListaFormaPagamento(ArrayList<FormaPagamento> listaFormaPagamento) {
		this.listaFormaPagamento = listaFormaPagamento;
	}

	/*
	 * método para carregar a lista de clientes
	 */
	private void carregarClientes() {
		try {
			listaClientes = new ClienteController().buscarTodos();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * método para carregar a lista de filmes
	 */
	private void carregarFilmes() {
		try {
			listaFilmes = new FilmeController().buscarDisponivel("Sim");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * metodo que captura a acao do botao Adicionar na tela cad-locacao.jsp
	 */
	public void salvar() {

		if (validar()) {
			try {
				getLocacao();
				new LocacaoController().salvar(locacao);

				salvarLocacaoFilmes();

				cancelar();
				JSFUtil.addInfoMessage(Titulo.CADASTRO_LOCACAO, Mensagem.LOCACAO_SALVO);
			} catch (Exception e) {
				JSFUtil.addErrorMessage(Titulo.CADASTRO_LOCACAO, Mensagem.LOCACAO_ERRO_SALVO);
			}

		}

	}

	private void getLocacao() {
		locacao = new Locacao();

		locacao.setDataLocacao(dataLocacao);
		locacao.setDataDevolucao(getDateToString());

		locacao.setValor(valorTotal);
		locacao.setDevolvido("Não");

		locacao.setFuncionarioIdFuncionario(LoginBacking.funcionarioLogado);
		locacao.setFormaPagamentoIdFormaPagamento(getFormaPagamentoLista());
		locacao.setClienteIdCliente(getClienteLista());

	}

	private boolean validar() {

		if (Valida.isIntZero(comboCliente)) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_LOCACAO, Mensagem.CLIENTE_VAZIO);
			return false;
		}

		if (Valida.isIntZero(listaFilmesLocacao.size())) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_LOCACAO, Mensagem.FILME_VAZIO);
			return false;
		}

		if (Valida.isIntZero(formaPagamentoCombo)) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_LOCACAO, Mensagem.FORMA_PAGAMENTO_VAZIO);
			return false;
		}

		if (Valida.isDateNull(dataDevolucao)) {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_LOCACAO, Mensagem.DATA_DEVOLUCAO_VAZIO);
			return false;
		}

		return true;
	}

	public void desbloqueiaFilmes() {
		if (comboCliente > 0) {
			setBloqueio(false);
		} else {
			setBloqueio(true);
		}
		limparCampos();
	}

	private void limparCampos() {
		carregarFilmes();
		setFilmeCombo(0);
		listaFilmesLocacao = new ArrayList<Filme>();
		setFormaPagamentoCombo(0);
		setDataDevolucao(null);
		valorTotal = 0.0;
		setValor(NumberFormat.getCurrencyInstance().format(0.0));
	}

	private void carregarFormaPagamentos() {
		try {
			listaFormaPagamento = new FormaPagamentoController().buscarTodos();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * metodo que captura a acao do botao CANCELAR na tela cad-locacao.jsp
	 */
	public void cancelar() {
		setComboCliente(0);
		setBloqueio(true);
		limparCampos();
	}

	/*
	 * metodo que captura a acao do botao SAIR na tela cad-locacao.jsp
	 */
	public void sair() {
		try {
			FacesContext.getCurrentInstance().getExternalContext().redirect("index.xhtml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void carregarDataLocacao() {
		Date data = new Date();
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		dataLocacao = formatador.format(data);
	}

	private String getDateToString() {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		return format.format(dataDevolucao);
	}

	public void adicionar() {
		if (filmeCombo > 0) {
			int index = listaFilmes.indexOf(new Filme(filmeCombo));
			Filme filme = listaFilmes.get(index);

			if (filme.getFaixaEtaria() > getClienteLista().getIdade()) {
				JSFUtil.addErrorMessage(Titulo.CADASTRO_LOCACAO, Mensagem.FILME_NAO_PERMITIDO);
			} else {
				listaFilmesLocacao.add(filme);
				listaFilmes.remove(filme);

				Collections.sort(listaFilmesLocacao, Filme.FilmeComparator);

				if (filme.getPromocao().equals("Sim")) {
					valorTotal += filme.getValorPromocao();
				} else {
					valorTotal += filme.getValor();
				}
				valor = NumberFormat.getCurrencyInstance().format(valorTotal);
			}

		} else {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_LOCACAO, Mensagem.FILME_NAO_SELECIONADO);
		}

	}

	public void excluirLocacao() {
		listaFilmesLocacao.remove(filmeSelecionado);
		listaFilmes.add(filmeSelecionado);

		Collections.sort(listaFilmes, Filme.FilmeComparator);

		if (filmeSelecionado.getPromocao().equals("Sim")) {
			valorTotal -= filmeSelecionado.getValorPromocao();
		} else {
			valorTotal -= filmeSelecionado.getValor();
		}
		valor = NumberFormat.getCurrencyInstance().format(valorTotal);

	}

	private void salvarLocacaoFilmes() {
		for (Filme filme : listaFilmesLocacao) {
			try {
				LocacaoFilme locacaoFilme = new LocacaoFilme();
				locacaoFilme.setFilmeIdFilme(filme);
				locacaoFilme.setLocacaoIdLocacao(locacao);

				new LocacaoFilmeController().salvar(locacaoFilme);

				filme.setDisponivel("Não");
				new FilmeController().salvar(filme);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private FormaPagamento getFormaPagamentoLista() {
		int indFormaPagamento = listaFormaPagamento.indexOf(new FormaPagamento(formaPagamentoCombo));
		return listaFormaPagamento.get(indFormaPagamento);
	}

	private Cliente getClienteLista() {
		int indCliente = listaClientes.indexOf(new Cliente(comboCliente));
		return listaClientes.get(indCliente);
	}

	private void carregarLocacoes() {
		try {
			listaLocacoes = new LocacaoController().buscarTodos();
			// setBloqueio(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void detalhar() {
		locacao = locacaoSelecionada;
		carregarTela();

		try {
			FacesContext.getCurrentInstance().getExternalContext().redirect("list-locacaoDetalhada.xhtml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void carregarTela() {
		listaFilmes = new ArrayList<Filme>();
		setIdLocacao(locacao.getIdLocacao() + "");
		setNomeCliente(locacao.getClienteIdCliente().getNome());
		setNomeFuncionario(locacao.getFuncionarioIdFuncionario().getNome());
		setDataLocacao(locacao.getDataLocacao());
		setDataDevolucaoLocacao(locacao.getDataDevolucao());
		setDataDevolucaoAtual(getDataAtual());

		for (LocacaoFilme locacaoFilme : new LocacaoFilmeController().buscarPorLocacao(locacao)) {
			listaFilmes.add(locacaoFilme.getFilmeIdFilme());
		}

		setBloqueio(true);
		setCarregado(true);
	}

	private String getDataAtual() {
		return new SimpleDateFormat("dd/MM/yyyy").format(new Date());
	}

	/*
	 * metodo que captura a acao do botao Retornar na tela list-locacaoDetalhada.jsp
	 */
	public void retornar() {
		try {
			FacesContext.getCurrentInstance().getExternalContext().redirect("list-locacao.xhtml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void carregarData() {
		setMinDate(dataAtual());
		setMaxDate(maiorData(30));
	}
	
	public static Date maiorData(int dias) {
		Calendar currentDate = Calendar.getInstance();
		currentDate.add(Calendar.DATE, dias);
		return currentDate.getTime();
	}
	
	public static Date dataAtual() {
		Calendar currentDate = Calendar.getInstance();
		return currentDate.getTime();
	}

}
