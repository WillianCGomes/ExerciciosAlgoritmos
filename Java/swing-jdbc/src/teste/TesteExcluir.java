package teste;

import controller.AlunoController;
import model.Aluno;

/*
 * Classe responsável por excluir o objeto Aluno no banco de dados
 * @author Willian Gomes
 * @since 16/03/2021
 * @version 1.0
 */
public class TesteExcluir {
   //Método principal para executar a classe
    public static void main(String[] args) {
   
        //objeto Aluno auxiliar
        Aluno aluno = new Aluno();
        
        //valorizando o campo id
        aluno.setIdAluno(2);
        
        //acessando o objeto de controle
        new AlunoController().excluir(aluno);
        
    }
}
