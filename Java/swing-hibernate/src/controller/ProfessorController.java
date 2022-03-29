package controller;

import dao.ProfessorDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Professor;
import util.Mensagem;
import util.Titulo;
import util.Util;
import util.Valida;
import view.ProfessorView;

/**
 * Classe responsável por armazenar a inteligência de todos os processos de
 * controle de tela e banco de dados do Professor
 *
 * @author Willian Carlos Gomes
 * @since 17/03/2021
 * @version 1.0
 */
public class ProfessorController {

    //atributo para manipular a tela de cadastro
    private ProfessorView tela;

    //lista de alunos para preencher tabela, alterar e excluir
    private ArrayList<Professor> listaProfessores;

    //objeto Aluno para incluir ou alterar
    private Professor professor;

    //flag para controlar a opção de incluir ou alterar
    private boolean alterar = false;

    //construtor vazio
    public ProfessorController() {
    }

    public ProfessorController(ProfessorView tela) {
        this.tela = tela;
    }

    /*
     * método para acessar a classe DAO e inserir um registro na tabela Professor
     */
    public void inserir(Professor professor) {

        //objeto DAO para manipular um registro
        ProfessorDAO dao = new ProfessorDAO();

        try {
            //inserindo um registro na tabela
            dao.salvar(professor);

            //mensagem de sucesso            
            JOptionPane.showMessageDialog(null, Mensagem.professor_inserir_ok, Titulo.inserir_professor, 1);

        } catch (Exception ex) {
            Logger.getLogger(ProfessorController.class.getName()).log(Level.SEVERE, null, ex);

            //mensagem de erro
            JOptionPane.showMessageDialog(null, Mensagem.professor_inserir_n_ok, Titulo.inserir_professor, 0);

        }

    }//fim do método inserir

    /*
     * método para acessar a classe DAO e alterar um registro na tabela Professor
     */
    public void alterar(Professor professor) {

        //objeto DAO para manipular um registro
        ProfessorDAO dao = new ProfessorDAO();

        try {
            //alterando um registro na tabela
            dao.salvar(professor);

            //mensagem de sucesso            
            JOptionPane.showMessageDialog(null, Mensagem.professor_alterar_ok, Titulo.alterar_professor, 1);

        } catch (Exception ex) {
            Logger.getLogger(ProfessorController.class.getName()).log(Level.SEVERE, null, ex);

            //mensagem de erro
            JOptionPane.showMessageDialog(null, Mensagem.professor_alterar_n_ok, Titulo.alterar_professor, 0);

        }

    }//fim do método alterar

    /*
     * método para acessar a classe DAO e excluir um registro na tabela Professor
     */
    public void excluir(Professor professor) {

        //objeto DAO para manipular um registro
        ProfessorDAO dao = new ProfessorDAO();

        try {
            //excluindo um registro na tabela
            dao.excluir(professor);

            //mensagem de sucesso            
            JOptionPane.showMessageDialog(null, Mensagem.professor_excluir_ok, Titulo.excluir_professor, 1);

        } catch (Exception ex) {
            Logger.getLogger(ProfessorController.class.getName()).log(Level.SEVERE, null, ex);

            //mensagem de erro
            JOptionPane.showMessageDialog(null, Mensagem.professor_excluir_n_ok, Titulo.excluir_professor, 0);

        }

    } //fim do método excluir

    /*
     * método para acessar a classe DAO e consultar os registros na tabela professor
     */
    public ArrayList<Professor> buscarTodos() {
        //lista auxiliar para retornar no método
        ArrayList<Professor> retorno = null;

        try {
            //acessando a classe DAO e efetuando a consulta
            retorno = new ProfessorDAO().buscarTodos();

        } catch (Exception ex) {
            Logger.getLogger(ProfessorController.class.getName()).log(Level.SEVERE, null, ex);
            //mensagem de erro
            JOptionPane.showMessageDialog(null, Mensagem.professor_consultar_n_ok, Titulo.consultar_professor, 0);
        }

        return retorno;
    } // fim do método buscarTodos

    /*
     * método para controlar a ação do botão NOVO
     */
    public void botaoNovo() {
        //bloqueando botões de opção
        tela.getBtNovo().setEnabled(false);
        tela.getBtAlterar().setEnabled(false);
        tela.getBtExcluir().setEnabled(false);
        tela.getBtSair().setEnabled(false);

        //habilitando os textFields
        tela.getTfNome().setEditable(true);
        tela.getTfIdade().setEditable(true);
        tela.getTfCidade().setEditable(true);
        tela.getTfDataNasc().setEditable(true);
        
        //habilitando os RadioButtons
        tela.getGrpSexo().clearSelection();
        tela.getRbMasculino().setEnabled(true);
        tela.getRbFeminino().setEnabled(true);

        //habilitando os botões
        tela.getBtSalvar().setEnabled(true);
        tela.getBtCancelar().setEnabled(true);
        //alterando a flag de controle
        alterar = false;
        //instanciando um novo objeto de Aluno
        professor = new Professor();
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
            JOptionPane.showMessageDialog(null, Mensagem.selecione_professor, Titulo.alterar_professor, 0);
        } else {
            //inicializando o objeto Professor com o aluno da tabela
            professor = listaProfessores.get(tela.getTabela().getSelectedRow());
            carregarTela(professor);
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
            JOptionPane.showMessageDialog(null, Mensagem.selecione_professor, Titulo.excluir_professor, 0);
        } else {
            //inicializando o objeto Aluno com o aluno da tabela
            professor = listaProfessores.get(tela.getTabela().getSelectedRow());

            //verificando a exclusão do aluno
            int opcao = JOptionPane.showConfirmDialog(null, Mensagem.excluir_pergunta, Titulo.excluir_professor, JOptionPane.YES_OPTION, JOptionPane.CANCEL_OPTION);

            if (opcao == JOptionPane.YES_OPTION) {
                //excluindo registro
                excluir(professor);
                //carregando a tabela
                carregarTabela();
            }

        }

    }//fim do método botaoExcluir

    /*
     * método para controlar a ação do botão SAIR
     */
    public void botaoSair() throws SQLException {
        tela.dispose();
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
                alterar(getProfessorAlterar());
                //limpando a tela e bloqueando os campos
                botaoCancelar();
                //carregando a tabela 
                carregarTabela();
            }
        } else {
            //procedimentos de inclusão
            if (validarIncluir()) {
                //omseromdp p registro na tabela
                inserir(getProfessorInserir());
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
        tela.getBtNovo().setEnabled(true);
        tela.getBtAlterar().setEnabled(true);
        tela.getBtExcluir().setEnabled(true);
        tela.getBtSair().setEnabled(true);

        //desabilitando os textFields
        tela.getTfNome().setEditable(false);
        tela.getTfIdade().setEditable(false);
        tela.getTfCidade().setEditable(false);
        tela.getTfDataNasc().setEditable(false);

        //desabilitando os Radio Buttons
        tela.getGrpSexo().clearSelection();
        tela.getRbMasculino().setEnabled(false);
        tela.getRbFeminino().setEnabled(false);
        

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
        tela.getTfDataNasc().setEditable(false);

        //desabilitando os Radio Buttons
        tela.getRbMasculino().setEnabled(false);
        tela.getRbFeminino().setEnabled(false);

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
        tela.getTfDataNasc().setText(null);
        tela.getRbMasculino().setSelected(false);
        tela.getRbFeminino().setSelected(false);

    }//fim do método limpar tela

    /*
     * método para carregar a tabela de professores cadastrados
     */
    public void carregarTabela() {

        //capturando o modelo da tabela atual
        DefaultTableModel modelo = (DefaultTableModel) tela.getTabela().getModel();
        //inicializando as linhas da tabela
        modelo.setRowCount(0);
        //carregando a lista de alunos para preencher a tabela
        listaProfessores = buscarTodos();
        //laço de repetição para preencher as linhas da tabela
        for (Professor professor : listaProfessores) {
            modelo.addRow(new String[]{professor.getNome(), professor.getIdade() + "", professor.getCidade()});
        }
    } //fim do método carregarTabela

    /*
     * método para validar os campos da inclusão
     */
    private boolean validarIncluir() {
        //verificando se o campo nome está preenchido
        if (Valida.isEmptyOrNull(tela.getTfNome().getText())) {
            JOptionPane.showMessageDialog(null, Mensagem.nome_n_ok, Titulo.inserir_professor, 0);
            tela.getTfNome().grabFocus();
            return false;
        }
        // verificando se o campo idade está preenchido
        if (!Valida.isInteger(tela.getTfIdade().getText())) {
            JOptionPane.showMessageDialog(null, Mensagem.idade_n_ok, Titulo.inserir_professor, 0);
            tela.getTfIdade().grabFocus();
            return false;
        }
        //verificando se o campo cidade está preenchido
        if (Valida.isEmptyOrNull(tela.getTfCidade().getText())) {
            JOptionPane.showMessageDialog(null, Mensagem.cidade_n_ok, Titulo.inserir_professor, 0);
            tela.getTfCidade().grabFocus();
            return false;
        }
        //verificando se o campo Data de nascimento está preenchido
        if (Valida.isEmptyOrNull(tela.getTfDataNasc().getText())) {
            JOptionPane.showMessageDialog(null, Mensagem.datanasc_n_ok, Titulo.inserir_professor, 0);
            tela.getTfDataNasc().grabFocus();
            return false;
        }

        //verificando se algum radio button de sexo foi selecionado
        if (!tela.getRbMasculino().isSelected() && !tela.getRbFeminino().isSelected()) {
            JOptionPane.showMessageDialog(null, Mensagem.sexo_n_ok, Titulo.inserir_professor, 0);
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
            JOptionPane.showMessageDialog(null, Mensagem.cidade_n_ok, Titulo.alterar_professor, 0);
            return false;
        }
        return true;
    }

    /*
     * método para retornar um objeto Aluno para inclusão
     */
    private Professor getProfessorInserir() {

        professor.setNome(tela.getTfNome().getText());
        professor.setIdade(Util.getInteger(tela.getTfIdade().getText()));
        professor.setCidade(tela.getTfCidade().getText());
        professor.setDataNascimento(tela.getTfDataNasc().getText());

        //condicional que captura a seleção
        if (tela.getRbMasculino().isSelected()) {
            professor.setSexo("Masculino");

        } else if (tela.getRbFeminino().isSelected()) {
            professor.setSexo("Feminino");
        }

        return professor;
    }//fim do método getProfessorInserir

    /*
     * método para carregar os campos da tela
     */
    private void carregarTela(Professor professor) {
        tela.getTfNome().setText(professor.getNome());
        tela.getTfIdade().setText(professor.getIdade() + "");
        tela.getTfCidade().setText(professor.getCidade());
        tela.getTfDataNasc().setText(professor.getDataNascimento());
        
        // deixando o sexo do professor visível
        if (professor.getSexo().equals("Masculino")) {
            tela.getRbMasculino().setSelected(true);}
        else {tela.getRbFeminino().setSelected(true);
        
        }

    }// fim do método carregarTela

    /*
     * método para bloquear os campos na opção alterar
     */
    private void bloqueioAlterar() {
        //bloqueando botões de opção
        tela.getBtNovo().setEnabled(false);
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
    private Professor getProfessorAlterar() {
        professor.setCidade(tela.getTfCidade().getText());

        return professor;
    }

}// fim da classe 
