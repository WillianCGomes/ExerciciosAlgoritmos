package model;

/**
 * Classe para armazenar os atributos e métodos do objeto data
 * @author Willian Carlos Gomes
 * @since 18 de fev. de 2021
 */
public class Data {

	// Método construtor da classe
	public Data() {
	}
	
	// Declarando os atributos
	private int dia;
	private int mes;
	private int ano;
	
	//Métodos getters e setters para acesso aos atributos
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	@Override
	public String toString() {
		return (dia + "/" + mes + "/" + ano);
	}
	
	
}//Fim da classe
