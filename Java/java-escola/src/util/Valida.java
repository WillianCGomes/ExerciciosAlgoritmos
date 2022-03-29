package util;

/**
 * Classe responsavel por validar os dados inputados pelo usuario
 *
 * @author Willian Carlos Gomes
 * @since 23 de fev. de 2021
 */
public class Valida {
	
	// verificando se o valor � nulo ou vazio
	public static boolean isEmptyOrNull(String string) {
		return (string == null || string.trim().equals(""));
	}
	
	//verificando se o valor informado � zero
	public static boolean isIntZero(int args) {
		return args == 0;
	}
	
	public static boolean isDoubleZero(double args) {
		return args == 0;
	}
}
