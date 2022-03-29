package model;


/**
 * Classe para armazenar os dados relacionados a data ao projeto locadora
 * @author Willian Carlos Gomes
 * @since 4 de mar. de 2021
 */
public class Data {
	//atributos da classe
	private int dia;
	private int mes;
	private int ano;
	
	
	//método construtor da classe
	public Data() {
	}

	//Getters and Setters
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
	
	//método para exibir a data
	@Override
	public String toString() {
		return (dia + "/" + mes + "/" + ano);
	}
	

}//fim da classe
