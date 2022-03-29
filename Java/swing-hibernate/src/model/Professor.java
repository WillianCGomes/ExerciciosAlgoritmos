package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Classe responsável por armazenar os atributos, métodos e mapeamento do objeto Professor
 * @author Willian Carlos Gomes
 * @since 17/03/2021
 * @version 1.0
 */

@Entity
@Table(name = "professor")
public class Professor implements Serializable {
    
    @Id
    @GeneratedValue
    @Column(name = "id_professor")
    private int idProfessor;
    
    @Column(name = "nome")
    @Basic(optional = false)
    private String nome;
    
    @Column(name = "idade")
    @Basic(optional = false)
    private int idade;
    
     @Column(name = "cidade")
     @Basic(optional = false)
    private String cidade;
     
     @Column(name = "sexo")
     @Basic(optional = false)
    private String sexo;
     
     @Column(name = "data_nascimento")
     @Basic(optional = false)
    private String dataNascimento;

    
     
     public int getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public boolean getSexo(String masculino) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
     
     
}
