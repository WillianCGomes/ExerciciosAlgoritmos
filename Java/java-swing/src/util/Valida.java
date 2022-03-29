package util;

/**
 * Classe responsável por armazenar os métodos de validação do sistema
 * @author Willian Carlos Gomes
 * @since 3 de mar. de 2021
 * @version 1.0
 */
public class Valida {

	//método para retornar se o valor String está preenchido
	public static boolean isEmptyOrNull(String args) {
		return (args.trim().equals("")||args == null);
	}
	
}
