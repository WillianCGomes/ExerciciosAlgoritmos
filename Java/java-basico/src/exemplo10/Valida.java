package exemplo10;

/**
 * Classe respons�vel por armazenar os m�todos de valida��o de dados
 * 
 * @author 
 * @since 23 de fev. de 2021
 */
public class Valida {

	// M�todo para verificar String vazia ou nula
	public static boolean isStringVazio(String args) {
		// Comando TRIM tira os espa�os da vari�vel String
		if (args.trim().equals("")) {
			return true;
		} else {
			return false;
		}
	}// Fim do m�todo

	// M�todo para verificar String V�lida
	public static boolean isStringValida(String args) {
		if (!args.matches("[0-9]*")) {
			return true;
		} else {
			return false;
		}
	} // Fim do m�todo

	//M�todo para verificar se � n�mero
	public static boolean isNumber(String args) {
	try {
		int numero = Integer.parseInt(args);
		return true;
	} catch (Exception e) {
		// TODO: handle exception
		return false;
	}
		
		
	} // fim do m�todo
	
	
	
	
}
