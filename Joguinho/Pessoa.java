package Joguinho;
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
