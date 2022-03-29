package model;

import java.util.ArrayList;

/**
 * Classe responsavel por armazenar atributos e m�todos do professor
 *
 * @author Willian Carlos Gomes
 * @since 23 de fev. de 2021
 */
public class Professor extends Funcionario{
	
	//declarando os atributos do objeto professor
	private ArrayList<Materia> listaMaterias;
	
	// m�todos acessores
	public ArrayList<Materia> getListaMaterias() {
		return listaMaterias;
	}
	public void setListaMaterias(ArrayList<Materia> listaMaterias) {
		this.listaMaterias = listaMaterias;
	}
	
	
	
}
