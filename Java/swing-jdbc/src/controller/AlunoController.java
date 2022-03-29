package controller;

import com.mysql.jdbc.Connection;
import dao.AlunoDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Aluno;
import util.Conexao;
import util.Mensagem;
import util.Titulo;
import util.Util;
import util.Valida;
import view.AlunoView;

/**
 * Classe responsável por armazenar a inteligência de todos os processos de
 * controle de tela e banco de dados do Aluno
 *
 * @author Willian Carlos Gomes
 * @since 16/03/2021
 * @version 1.0
 */
public class AlunoController {

    // atributo de conexão com o banco de dados
    private Connection conexao = Conexao.getConexao();

    //atributo para manipular a tela de cadastro
    private AlunoView tela;

    //lista de alunos para preencher tabela, alterar e excluir
    private ArrayList<Aluno> listaAlunos;

    //objeto Aluno para incluir ou alterar
    private Aluno aluno;

    //flag para controlar a opção de incluir ou alterar
    private boolean alterar = false;

    //construtor vazio
    public AlunoController() {
    }

    //construtor para valorizar o objeto de tela
    public AlunoController(AlunoView tela) {
        this.tela = tela;
    }

    /*
     * método para acessar a classe DAO e inserir um registro na tabela aluno
     */
    public void inserir(Aluno aluno) {

        //objeto DAO para manipular um registro
        AlunoDAO dao = new AlunoDAO(conexao);

        try {
            //inserindo um registro na tabela
            dao.inserir(aluno);

            //mensagem de sucesso            
            JOptionPane.showMessageDialog(null, Mensagem.inserir_ok, Titulo.inserir_aluno, 1);

        } catch (SQLException ex) {
            Logger.getLogger(AlunoController.class.getName()).log(Level.SEVERE, null, ex);

            //mensagem de erro
            JOptionPane.showMessageDialog(null, Mensagem.inserir_n_ok, Titulo.inserir_aluno, 0);

        }

    }//fim do método inserir

    /*
     * método para acessar a classe DAO e alterar um registro na tabela Aluno
     */
    public void alterar(Aluno aluno) {

        //objeto DAO para manipular um registro
        AlunoDAO dao = new AlunoDAO(conexao);

        try {
            //alterando um registro na tabela
            dao.alterar(aluno);

            //mensagem de sucesso            
            JOptionPane.showMessageDialog(null, Mensagem.alterar_ok, Titulo.alterar_aluno, 1);

        } catch (SQLException ex) {
            Logger.getLogger(AlunoController.class.getName()).log(Level.SEVERE, null, ex);

            //mensagem de erro
            JOptionPane.showMessageDialog(null, Mensagem.alterar_n_ok, Titulo.alterar_aluno, 0);

        }

    }//fim do método alterar

    /*
     * método para acessar a classe DAO e excluir um registro na tabela Aluno
     */
    public void excluir(Aluno aluno) {

        //objeto DAO para manipular um registro
        AlunoDAO dao = new AlunoDAO(conexao);

        try {
            //excluindo um registro na tabela
            dao.excluir(aluno);

            //mensagem de sucesso            
            JOptionPane.showMessageDialog(null, Mensagem.excluir_ok, Titulo.excluir_aluno, 1);

        } catch (SQLException ex) {
            Logger.getLogger(AlunoController.class.getName()).log(Level.SEVERE, null, ex);

            //mensagem de erro
            JOptionPane.showMessageDialog(null, Mensagem.excluir_n_ok, Titulo.excluir_aluno, 0);

        }

    } //fim do método excluir

    /*
     * método para acessar a classe DAO e consultar os registros na tabela aluno
     */
    public ArrayList<Aluno> buscarTodos() {
        //lista auxiliar para retornar no método
        ArrayList<Aluno> retorno = null;

        try {
            //acessando a classe DAO e efetuando a consulta
            retorno = new AlunoDAO(conexao).buscarTodos();

        } catch (SQLException ex) {
            Logger.getLogger(AlunoController.class.getName()).log(Level.SEVERE, null, ex);
            //mensagem de erro
            JOptionPane.showMessageDialog(null, Mensagem.consultar_n_ok, Titulo.consultar_aluno, 0);
        }

        return retorno;
    } // fim do método buscarTodos

    /*
     * método para controlar a ação do botão NOVO
     */
    public void botaoNovo() {
        //bloqueando botões de opção
        tela.getBtNoto().setEnabled(false);
        tela.getBtAlterar().setEnabled(false);
        tela.getBtExcluir().setEnabled(false);
        tela.getBtSair().setEnabled(false);

        //habilitando os textFields
        tela.getTfNome().setEditable(true);
        tela.getTfIdade().setEditable(true);
        tela.getTfCidade().setEditable(true);

        //habilitando os botões
        tela.getBtSalvar().setEnabled(true);
        tela.getBtCancelar().setEnabled(true);
        //alterando a flag de controle
        alterar = false;
        //instanciando um novo objeto de Aluno
        aluno = new Aluno();
    }//fim do método botaoNovo

    /*
     * método para controlar a ação do botão ALTERAR
     */
    public void botaoAlterar() {
        //alterando a flag de controle
        alterar = true;
        //verificando se o usuário selecionou algum registro
        if (tela.getTabela().getSelectedRow() < 0) {
            //exibindo a mensagem de erro
            JOptionPane.showMessageDialog(null, Mensagem.selecione_aluno, Titulo.alterar_aluno, 0);
        } else {
            //inicializando o objeto Aluno com o aluno da tabela
            aluno = listaAlunos.get(tela.getTabela().getSelectedRow());
            carregarTela(aluno);
            //bloqueando a tela
            bloqueioAlterar();
        }

    }//fim do método botaoAlterar

    /*
     * método para controlar a ação do botão EXCLUIR
     */
    public void botaoExcluir() {
  //verificando se o usuário selecionou algum registro
        if (tela.getTabela().getSelectedRow() < 0) {
            //exibindo a mensagem de erro
            JOptionPane.showMessageDialog(null, Mensagem.selecione_aluno, Titulo.excluir_aluno, 0);
        } else {
            //inicializando o objeto Aluno com o aluno da tabela
            aluno = listaAlunos.get(tela.getTabela().getSelectedRow());
            
            //verificando a exclusão do aluno
            int opcao = JOptionPane.showConfirmDialog(null, Mensagem.excluir_aluno, Titulo.excluir_aluno, JOptionPane.YES_OPTION, JOptionPane.CANCEL_OPTION);
       
            if (opcao == JOptionPane.YES_OPTION) {
                //excluindo registro
                excluir(aluno);        
                //carregando a tabela
                carregarTabela();
            }
        
        }
        
    }//fim do método botaoExcluir

    /*
     * método para controlar a ação do botão SAIR
     */
    public void botaoSair() throws SQLException {
        conexao.close();
        System.exit(0);
    }//fim do método botaoSair

    /*
     * método para controlar a ação do botão SALVAR
     */
    public void botaoSalvar() {
        //verificando a opção de incluir ou alterar
        if (alterar) {
            //procedimentos de alteração
            if (validarAlterar()) {
                //alterando o registro na tabela
                alterar(getAlunoAlterar());
                //limpando a tela e bloqueando os campos
                botaoCancelar();
                //carregando a tabela 
                carregarTabela();
            }
        } else {
            //procedimentos de inclusão
            if (validarIncluir()) {
                //omseromdp p registro na tabela
                inserir(getAlunoInserir());
                //limpando a tela e bloqueando os campos
                botaoCancelar();
                //carregando a tabela
                carregarTabela();
            }
        }

    }//fim do método botaoSalvar

    /*
     * método para controlar a ação do botão CANCELAR
     */
    public void botaoCancelar() {
        //desbloqueando botões de opção
        tela.getBtNoto().setEnabled(true);
        tela.getBtAlterar().setEnabled(true);
        tela.getBtExcluir().setEnabled(true);
        tela.getBtSair().setEnabled(true);

        //desabilitando os textFields
        tela.getTfNome().setEditable(false);
        tela.getTfIdade().setEditable(false);
        tela.getTfCidade().setEditable(false);

        //desabilitando os botões
        tela.getBtSalvar().setEnabled(false);
        tela.getBtCancelar().setEnabled(false);
        //limpando os campos da tela
        limparTela();
    }//fim do método botaoCancelar

    /*
     * método para bloqueio inicial dos objetos
     */
    public void bloqueioInicial() {
        //desabilitando os textFields
        tela.getTfNome().setEditable(false);
        tela.getTfIdade().setEditable(false);
        tela.getTfCidade().setEditable(false);

        //desabilitando os botões
        tela.getBtSalvar().setEnabled(false);
        tela.getBtCancelar().setEnabled(false);
    }// fim do método bloqueioInicial

    /*
     * método para limpar os campos da tela
     */
    private void limparTela() {
        tela.getTfNome().setText(null);
        tela.getTfIdade().setText(null);
        tela.getTfCidade().setText(null);

    }//fim do método limpar tela

    /*
     * método para carregar a tabela de alunos cadastrados
     */
    public void carregarTabela() {

        //capturando o modelo da tabela atual
        DefaultTableModel modelo = (DefaultTableModel) tela.getTabela().getModel();
        //inicializando as linhas da tabela
        modelo.setRowCount(0);
        //carregando a lista de alunos para preencher a tabela
        listaAlunos = buscarTodos();
        //laço de repetição para preencher as linhas da tabela
        for (Aluno aluno : listaAlunos) {
            modelo.addRow(new String[]{aluno.getNome(), aluno.getIdade() + "", aluno.getCidade()});
        }
    } //fim do método carregarTabela

    /*
     * método para validar os campos da inclusão
     */
    private boolean validarIncluir() {
        //verificando se o campo nome está preenchido
        if (Valida.isEmptyOrNull(tela.getTfNome().getText())) {
            JOptionPane.showMessageDialog(null, Mensagem.nome_n_ok, Titulo.inserir_aluno, 0);
            tela.getTfNome().grabFocus();
            return false;
        }
        // verificando se o campo idade está preenchido
        if (!Valida.isInteger(tela.getTfIdade().getText())) {
            JOptionPane.showMessageDialog(null, Mensagem.idade_n_ok, Titulo.inserir_aluno, 0);
            tela.getTfIdade().grabFocus();
            return false;
        }
        //verificando se o campo cidade está preenchido
        if (Valida.isEmptyOrNull(tela.getTfCidade().getText())) {
            JOptionPane.showMessageDialog(null, Mensagem.cidade_n_ok, Titulo.inserir_aluno, 0);
            tela.getTfCidade().grabFocus();
            return false;
        }

        return true;
    }// fim do método validaIncluir

    /*
     * método para validar os campos da alteração
     */
    private boolean validarAlterar() {
        //verificando se o campo cidade está preenchido
        if (Valida.isEmptyOrNull(tela.getTfCidade().getText())) {
            JOptionPane.showMessageDialog(null, Mensagem.cidade_n_ok, Titulo.alterar_aluno, 0);
            return false;
        }
        return true;
    }

    /*
     * método para retornar um objeto Aluno para inclusão
     */
    private Aluno getAlunoInserir() {
        aluno.setNome(tela.getTfNome().getText());
        aluno.setIdade(Util.getInteger(tela.getTfIdade().getText()));
        aluno.setCidade(tela.getTfCidade().getText());
        return aluno;
    }//fim do método getAlunoInserir

    /*
     * método para carregar os campos da tela
     */
    private void carregarTela(Aluno aluno) {
        tela.getTfNome().setText(aluno.getNome());
        tela.getTfIdade().setText(aluno.getIdade() + "");
        tela.getTfCidade().setText(aluno.getCidade());
    }// fim do método carregarTela

    /*
     * método para bloquear os campos na opção alterar
     */
    private void bloqueioAlterar() {
        //bloqueando botões de opção
        tela.getBtNoto().setEnabled(false);
        tela.getBtAlterar().setEnabled(false);
        tela.getBtExcluir().setEnabled(false);
        tela.getBtSair().setEnabled(false);

        //habilitando os textFields
        tela.getTfCidade().setEditable(true);

        //habilitando os botões
        tela.getBtSalvar().setEnabled(true);
        tela.getBtCancelar().setEnabled(true);
        tela.getTfCidade().grabFocus();
    }// fim do método bloqueioAlterar
    
    /*
    * método para retornar o objeto Aluno para alteração
    */
    private Aluno getAlunoAlterar() {
        aluno.setCidade(tela.getTfCidade().getText());
        
        return aluno;
    }
} //fim da classe
