//ALUNOS: FERNANDA BARBOSA DE PINHO E JOSÉ ALBERTO OLIVEIRA MOURA FILHO
package ProjetoLPOO;

public class Pessoa {
    private final String nome;

    //CONSTRUCTOR
    public Pessoa(String nome){
        this.nome = nome;
    }


    //GETTERS
    public String getNome(){
        return this.nome;
    }

    //
    public String toString(){
        return ("O nome do jogador é" + this.nome);
    }
}
