package util;

/**
 * Classe responsável por armazenar os métodos de validação de dados
 *
 * @author Willian Carlos Gomes
 * @since 17/03/2021
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
}
