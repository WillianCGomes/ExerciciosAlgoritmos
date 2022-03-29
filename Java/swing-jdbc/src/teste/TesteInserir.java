package teste;

import controller.AlunoController;
import model.Aluno;

/**
 * Classe responsável por testar o método inserir do projeto
 * @author Willian Carlos Gomes
 * @since 16/03/2021
 * @version 1.0
 */
public class TesteInserir {
 
    // método principal para executar a classe
    public static void main(String[] args) {
    
        //objeto auxiliar para inserir na tabela
        Aluno aluno = new Aluno();
        
        //valorizando os atributos
        aluno.setNome("Willian Gomes");
        aluno.setIdade(19);
        aluno.setCidade("Curitiba");
        
        //inserindo um registro na tabela
        new AlunoController().inserir(aluno);
        
        
    }
}
