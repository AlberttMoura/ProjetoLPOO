//ALUNOS: FERNANDA BARBOSA DE PINHO E JOSÉ ALBERTO OLIVEIRA MOURA FILHO

package br.com.poli.melhorlig4;
public class Pessoa {
    private String nome;

    public Pessoa(){}
    public Pessoa(String nome)
    {
        this.nome = nome;
    }
    //GETTERS
    public String getNome(){
        return this.nome;
    }

    //SETTERS
    public void setNome(String nome){
        this.nome = nome;
    }

    public String toString(){
        return this.nome;
    }
}