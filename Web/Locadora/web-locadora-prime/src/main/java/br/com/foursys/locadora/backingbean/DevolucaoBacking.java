package br.com.foursys.locadora.backingbean;

import java.io.IOException;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.com.foursys.locadora.bean.Filme;
import br.com.foursys.locadora.bean.Locacao;
import br.com.foursys.locadora.bean.LocacaoFilme;
import br.com.foursys.locadora.controller.FilmeController;
import br.com.foursys.locadora.controller.LocacaoController;
import br.com.foursys.locadora.controller.LocacaoFilmeController;
import br.com.foursys.locadora.util.JSFUtil;
import br.com.foursys.locadora.util.Mensagem;
import br.com.foursys.locadora.util.Titulo;

/**
 * Classe responsavel por controlar o componentes do front-end Devolucao
 * 
 * @author Willian Carlos Gomes
 * @since 05/05/2021
 * @version 1.0
 */

@ManagedBean(name = "devolucaoBacking")
@ViewScoped
public class DevolucaoBacking implements Serializable {

	private static final long serialVersionUID = 1L;

	private int locacao;
	private ArrayList<Locacao> listaLocacoes;

	private String nomeCliente;
	private String nomeFuncionario;
	private String dataLocacao;
	private String dataDevolucaoLocacao;
	private String dataDevolucaoAtual;

	private ArrayList<Filme> listaFilmes;

	private boolean bloqueio;
	private boolean carregado;

	private Locacao devolucao;
	
	

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public DevolucaoBacking() {
		carregarLocacoes();
		setDataDevolucaoAtual(getDataAtual());
	}

	public int getLocacao() {
		return locacao;
	}

	public void setLocacao(int locacao) {
		this.locacao = locacao;
	}

	public ArrayList<Locacao> getListaLocacoes() {
		return listaLocacoes;
	}

	public void setListaLocacoes(ArrayList<Locacao> listaLocacoes) {
		this.listaLocacoes = listaLocacoes;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getDataLocacao() {
		return dataLocacao;
	}

	public void setDataLocacao(String dataLocacao) {
		this.dataLocacao = dataLocacao;
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

	public ArrayList<Filme> getListaFilmes() {
		return listaFilmes;
	}

	public void setListaFilmes(ArrayList<Filme> listaFilmes) {
		this.listaFilmes = listaFilmes;
	}

	public boolean isBloqueio() {
		return bloqueio;
	}

	public void setBloqueio(boolean bloqueio) {
		this.bloqueio = bloqueio;
	}

	public boolean isCarregado() {
		return carregado;
	}

	public void setCarregado(boolean carregado) {
		this.carregado = carregado;
	}

	public void carregarLocacao() {
		if (locacao > 0) {
			carregarTela();
		} else {
			JSFUtil.addErrorMessage(Titulo.CADASTRO_DEVOLUCAO, "Selecione uma loca????o!");
		}
	}

	public void salvar() {

		if (validar()) {

			try {
				getDevolucao();
				new LocacaoController().salvar(devolucao);

				alterarFilmesLocacao();
				JSFUtil.addInfoMessage(Titulo.CADASTRO_DEVOLUCAO, Mensagem.DEVOLUCAO_SALVO);
				cancelar();
				carregarLocacoes();
			} catch (Exception e) {
				JSFUtil.addErrorMessage(Titulo.CADASTRO_DEVOLUCAO, Mensagem.DEVOLUCAO_ERRO_SALVO);
			}
		}
	}

	private boolean validar() {

		return true;
	}

	public void cancelar() {
		setLocacao(0);
		limparCampos();
		setBloqueio(true);
		setCarregado(false);
	}

	public void sair() {
		try {
			FacesContext.getCurrentInstance().getExternalContext().redirect("index.xhtml");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void limparCampos() {
		setNomeCliente(null);
		setNomeFuncionario(null);
		setDataLocacao(null);
		setDataDevolucaoLocacao(null);
	//	setDataDevolucaoAtual(null);
		listaFilmes = new ArrayList<Filme>();
	}

	private void carregarLocacoes() {
		try {
			listaLocacoes = new LocacaoController().buscarDevolvido("N??o");
			setBloqueio(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void carregarTela() {
		listaFilmes = new ArrayList<Filme>();
		devolucao = getLocacaoLista();
		setNomeCliente(devolucao.getClienteIdCliente().getNome());
		setNomeFuncionario(devolucao.getFuncionarioIdFuncionario().getNome());
		setDataLocacao(devolucao.getDataLocacao());
		setDataDevolucaoLocacao(devolucao.getDataDevolucao());
		setDataDevolucaoAtual(getDataAtual());

		for (LocacaoFilme locacaoFilme : new LocacaoFilmeController().buscarPorLocacao(devolucao)) {
			listaFilmes.add(locacaoFilme.getFilmeIdFilme());
		}

		setBloqueio(true);
		setCarregado(true);
	}

	private void getDevolucao() {
		devolucao.setDevolvido("Sim");
		if (!dataDevolucaoLocacao.equals(dataDevolucaoAtual)) {
			devolucao.setDataDevolucao(dataDevolucaoAtual);
		}
	}

	private void alterarFilmesLocacao() {
		for (Filme filme : listaFilmes) {
			filme.setDisponivel("Sim");

			try {
				new FilmeController().salvar(filme);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private Locacao getLocacaoLista() {
		int indLocacao = listaLocacoes.indexOf(new Locacao(locacao));
		return listaLocacoes.get(indLocacao);
	}

	public void desbloqueioDevolucao() {
		if (locacao > 0) {
			setBloqueio(false);
		} else {
			setBloqueio(true);
		}
		limparCampos();
	}

	private String getDataAtual() {
		return new SimpleDateFormat("dd/MM/yyyy").format(new Date());
	}
	
	
	

}