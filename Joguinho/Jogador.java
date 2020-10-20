//ALUNOS: FERNANDA BARBOSA DE PINHO E JOSÉ ALBERTO OLIVEIRA MOURA FILHO
package Joguinho;

public class Jogador extends Pessoa {
    private final int id;//Número de identificação do Jogador
    private int score;//Score do Jogador

    //CONSTRUCTOR
    public Jogador(String nome, int id)
    {
        super(nome);
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
        return ("O nome do jogador é " + this.getNome());
    }
}
