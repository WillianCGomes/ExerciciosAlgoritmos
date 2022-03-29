package estoque;

/**
 * Classe para armazenar os atributos e métodos do objeto Modelo
 * 
 * @author Willian Carlos Gomes
 * @since 17 de fev. de 2021
 */
public class Modelo {

	// Método construtor da classe
	public Modelo() {

	}

	// Declarando os atributos
	private String nome;
	private Marca marca;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

}
