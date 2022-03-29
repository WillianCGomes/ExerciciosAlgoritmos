package br.com.foursys.locadora.util;

/**
 * Classe responsável por armazenar os métodos de validação de dados
 *
 * @author Willian Carlos Gomes
 * @since 27/04/2021
 * @version 1.0
 */
public class Valida {

    /*
     * método para verificar se o campo é diferente de vazio ou nulo
     */
    public static boolean isEmptyOrNull(String args) {
        return (args.trim().equals("") || (args == null));
    }

    /*
     * método para verificar se o campo é inteiro
     */
    public static boolean isInteger(String args) {
        try {
            Integer.parseInt(args);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    /*
     * método para verificar se o campo é double
     */
    public static boolean isDouble(String args) {
        try {
            Double.parseDouble(args);
            return true;
        } catch (Exception e) {
            return false;
        }

    }
    
    public static boolean isDoubleZero(double num) {
    	if (num==0) {
    		return true;
    	}
    	return false;
    }
    
    public static boolean isIntZero(int num) {
    	if (num==0) {
    		return true;
    	}
    	return false;
    }
    
}
