package br.com.foursys.locadora.util;

public enum Pagamentos {
	DINHEIRO("Dinheiro"),
	DEBITO("Débito"),
	CREDITO("Crédito"),
	PIX("Pix");

	private String descricao;
	
	Pagamentos(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}