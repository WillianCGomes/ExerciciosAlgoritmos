package exemplo09;

/**
 * Classe para instanciar o objeto Secretaria e exibir
 * 
 * @author Willian Carlos Gomes
 * @since 23 de fev. de 2021
 */
public class TestaSecretaria {

	/*
	 * método principal para executar a classe
	 */
	public static void main(String[] args) {

		// instanciando o objeto do tipo Secretária
		Secretaria maria = new Secretaria();
		maria.setNome("Maria de Paula Souza");
		maria.setCpf("321.321.321.32");
		maria.setSalario(950.00);
		maria.setRamal(123);

		maria.mostrarDados();
	}

}
