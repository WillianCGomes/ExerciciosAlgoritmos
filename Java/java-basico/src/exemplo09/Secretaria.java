package exemplo09;

/**
 * 
 * Classe para armazenar os atributos e métodos do objeto Secretária e herdar de
 * Funcionário
 * 
 * @author Willian Carlos Gomes
 * @since 23 de fev. de 2021
 */

public class Secretaria extends Funcionario {

	// atributos de secretaria
	private int ramal;

	// métodos para acessar o atributo
	public int getRamal() {
		return ramal;
	}

	public void setRamal(int ramal) {
		this.ramal = ramal;
	}

	// Método para exibir os dados
	public void mostrarDados() {
		super.mostrarDados();
		System.out.println("Ramal: " + ramal);
	}

}
