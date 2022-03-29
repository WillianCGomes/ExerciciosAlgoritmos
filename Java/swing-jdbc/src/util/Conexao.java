package util;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Classe responsável por conectar com a base de dados (banco de dados)
 *
 * @author Willian Carlos Gomes
 * @since 10/03/2021
 * @version 1.0
 */
public class Conexao {

    /*
     * método para criar a conexão com a base de dados (banco de dados)
     */
    public static Connection getConexao() {

// Driver utilizado na conexão com o banco
        final String drive = "com.mysql.jdbc.Driver";
// Local de conexão - nome do banco de dados
        final String local = "jdbc:mysql://localhost/dtb-escola";
// Usuario de conexão
        final String login = "root";
// Senha de conexão
        final String senha = "root";

        // atributo auxiliar para retornar no método
        Connection conexao = null;

        try {
            // informando o drive utilizado na conexão com o banco de dados
            Class.forName(drive);
            
            // Iniciando um aconexão com o banco de dados
            conexao = (Connection) DriverManager.getConnection(local, login, senha);
        
           
                    
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro ao carregar o drive");
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            System.out.println("Erro ao efetuar a conexão");
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }

        //retornando a conexão do método
        return conexao;

    }//fim do método

} //fim da classe
