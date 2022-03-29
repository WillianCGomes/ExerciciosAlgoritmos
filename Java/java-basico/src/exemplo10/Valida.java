package exemplo10;

/**
 * Classe responsável por armazenar os métodos de validação de dados
 * 
 * @author 
 * @since 23 de fev. de 2021
 */
public class Valida {

	// Método para verificar String vazia ou nula
	public static boolean isStringVazio(String args) {
		// Comando TRIM tira os espaços da variável String
		if (args.trim().equals("")) {
			return true;
		} else {
			return false;
		}
	}// Fim do método

	// Método para verificar String Válida
	public static boolean isStringValida(String args) {
		if (!args.matches("[0-9]*")) {
			return true;
		} else {
			return false;
		}
	} // Fim do método

	//Método para verificar se é número
	public static boolean isNumber(String args) {
	try {
		int numero = Integer.parseInt(args);
		return true;
	} catch (Exception e) {
		// TODO: handle exception
		return false;
	}
		
		
	} // fim do método
	
	
	
	
}
