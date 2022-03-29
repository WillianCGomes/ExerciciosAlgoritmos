package teste;

import controller.AlunoController;
import model.Aluno;

/**
 * Classe responsável por testar a alteração do objeto Aluno no banco de dados
 * @author Willian Gomes
 * @since 16/03/2021
 * @version 1.0
 */
public class TesteAlterar {
   //Método principal para executar a classe
    public static void main(String[] args) {
   
        //objeto Aluno auxiliar
        Aluno aluno = new Aluno();
        
        //valorizando os atributos que serão valorizados do UPDATE
        aluno.setCidade("São José");
        aluno.setIdAluno(1);
        
        //acessando o objeto de controle
        new AlunoController().alterar(aluno);
        
    }
    
}
