package util;

/**
 * Classe auxiliar para armazenar m�todos de convers�o de dados
 * @author Willian Carlos Gomes
 * @since 9 de mar. de 2021
 * @version 1.0
 */

public class Util {
	/*
	 * m�todo para converter uma String em inteiro
	 */
	public static Integer getInt(String args) {
		return Integer.parseInt(args);
	}
	
	/*
	 * m�todo para converter uma String em Double
	 */
	public static Double getDouble(String args) {
		return Double.parseDouble(args);
	}
	/* 
	 * m�todo para converter String para Boolean
	 */
	public static boolean getBoolean(String args) {
        return Boolean.parseBoolean(args);
    }
	
	
}

