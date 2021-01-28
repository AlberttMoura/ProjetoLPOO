package br.com.poli.melhorlig4;

public class Jogador extends Pessoa {
    private final int id;//Número de identificação do Jogador
    private int score;//Score do Jogador

    //CONSTRUCTORS
    public Jogador(String nome, int id)
    {
        super(nome);
        this.id = id;
    }
    public Jogador(int id){
        this.id = id;
    }

    //GETTERS
    public int getId(){
        return this.id;
    }

    public int getScore(){
        return this.score;
    }

    //SETTERS
    public void setScore(int score){
        this.score = score;
    }

    @Override
    public String toString(){
        return ("Jogador " + this.id + " - " + super.toString());
    }
}
