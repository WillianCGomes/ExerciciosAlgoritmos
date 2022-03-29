package model;

/**
 * Classe responsável os atributos do objeto aluno
 * @author willian Carlos Gomes
 * @since 10/03/2021
 * @version 1.0
 */
public class Aluno {
    
    //declarando os atributos
    private int idAluno; //auto incremento
    private String nome;
    private int idade;
    private String cidade;

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    
}
