package dao;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Aluno;

/**
 * Classe responsável por amazenar os métodos CRUD (Inserir, consultar, alterar
 * e excluir)
 *
 * @author Willian Carlos Gomes
 * @since 16/03/2021
 * @version 1.0
 */
public class AlunoDAO {

    //declarando o atributo de conexão com o banco de dados
    private Connection conexao;

    //método construtor da classe que recebe uma conexão com o banco de dados
    public AlunoDAO(Connection conexao) {
        this.conexao = conexao;
    }

    /*
     * método para inserir um Aluno na tabela aluno no bando de dados dtb-escola
     */
    public void inserir(Aluno aluno) throws SQLException {
        // comando SQL INSERT
        String sql = "INSERT INTO aluno (nome, idade, cidade) VALUES (?,?,?)";
        //classe auxiliar para comunicar com o banco de dados e executar a isntrução SQL
        PreparedStatement comando = (PreparedStatement) this.conexao.prepareStatement(sql);
        // valorizar o campo nome da instrução SQL
        comando.setString(1, aluno.getNome());
        // valorizar o campo idade da instrução SQL
        comando.setInt(2, aluno.getIdade());
        // valorizar o campo cidade da instrução SQL
        comando.setString(3, aluno.getCidade());
        //Executando o comando SQL com a conexão
        comando.execute();
    } // fim do método inserir

    /*
     * método para alterar um Aluno na tabela aluno no banco de dados dtb-escola
     */
    public void alterar(Aluno aluno) throws SQLException {
        //comando SQL UPDATE
        String sql = "UPDATE aluno SET cidade = ? WHERE id_aluno = ?";
        //classe auxiliar para comunicar com o banco de dados e executar a isntrução SQL
        PreparedStatement comando = (PreparedStatement) this.conexao.prepareStatement(sql);
        //valorizando a cidade da instrução SQL
        comando.setString(1, aluno.getCidade());
        //valorizando o id_aluno da instrução SQL
        comando.setInt(2, aluno.getIdAluno());
        //executando o comando SQL com a conexão
        comando.execute();

    } // fim do método alterar

    /*
     * método para excluir um Aluno na tabela aluno no banco de dados dtb-escola
     */
    public void excluir(Aluno aluno) throws SQLException {
        //comando SQL DELETE
        String sql = "DELETE FROM aluno WHERE id_aluno = ?";
        //classe auxiliar para comunicar com o banco de dados e executar a isntrução SQL
        PreparedStatement comando = (PreparedStatement) this.conexao.prepareStatement(sql);
        //valorizando o id_aluno da instrução SQL
        comando.setInt(1, aluno.getIdAluno());
        //executando o comando SQL com a conexão
        comando.execute();

    } // fim do método excluir

    /*
     * método para consultar os alunos cadastrados na tabela
     */
    public ArrayList<Aluno> buscarTodos() throws SQLException {
        //comando SQL SELECT
        String sql = "SELECT * FROM aluno ORDER BY nome";
        //classe auxiliar para comunicar com o banco de dados e executar a isntrução SQL
        PreparedStatement comando = (PreparedStatement) this.conexao.prepareStatement(sql);
        // clase auxiliar para armazenar o resultado do comando SELECT
        ResultSet cursor = comando.executeQuery(); //executando o comando SQL
        //lista para retornar no método
        ArrayList<Aluno> alunos = new ArrayList<>();

        //laço de repetição para varrer o cursor de dados
        while (cursor.next()) {
            //objeto Aluno auxiliar
            Aluno aluno = new Aluno();
            //valorizando os atributos do aluno com os dados resultados do SELECT
            aluno.setIdAluno(cursor.getInt("id_aluno"));
            aluno.setNome(cursor.getString("nome"));
            aluno.setIdade(cursor.getInt("idade"));
            aluno.setCidade(cursor.getString("cidade"));

            //adicionando o objeto na lista de retorno
            alunos.add(aluno);

        }//fim do while

        //retornando a lista de alunos
        return alunos;

    } //fim do método buscarTodos

}//fim da classe
