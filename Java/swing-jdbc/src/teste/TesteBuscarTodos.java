package teste;

import controller.AlunoController;
import model.Aluno;

/**
 * Classe responsável por testar a consulta na tabela Aluno
 * @author Willian Crlos Gomes
 * @since 18/03/2021
 * @version 1.0
 */
public class TesteBuscarTodos {
    
   //método principal para executar a classe
    public static void main(String[] args) {
        
        //laço de repetição para exibir os dados da consulta
        for (Aluno aluno: new AlunoController().buscarTodos()) {
            System.out.println("Id do Aluno: " + aluno.getIdAluno());
            System.out.println("Nome do Aluno: " + aluno.getNome());
            System.out.println("Idade do Aluno: " + aluno.getIdade());
            System.out.println("Cidade do Aluno: " + aluno.getCidade());
            System.out.println("\n");
        }
        
        
    }
    
}
