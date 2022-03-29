package util;

/**
 * Classe auxiliar para armazenar métodos de conversão de dados
 * @author Willian Carlos Gomes
 * @since 9 de mar. de 2021
 * @version 1.0
 */

public class Util {
	/*
	 * método para converter uma String em inteiro
	 */
	public static Integer getInt(String args) {
		return Integer.parseInt(args);
	}
	
	/*
	 * método para converter uma String em Double
	 */
	public static Double getDouble(String args) {
		return Double.parseDouble(args);
	}
	/* 
	 * método para converter String para Boolean
	 */
	public static boolean getBoolean(String args) {
        return Boolean.parseBoolean(args);
    }
	
	
}

