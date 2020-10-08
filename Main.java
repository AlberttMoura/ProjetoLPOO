//ALUNOS: FERNANDA BARBOSA DE PINHO E JOSÉ ALBERTO OLIVEIRA MOURA FILHO
public class Main {
    public static void main(String[] args) {
        Jogador jog1 = new Jogador("Auberto", 1);
        Jogador jog2 = new Jogador("Frenanda", 2);
        Partida partida = new Partida(jog1, jog2);
        Tabuleiro tabuleiro = new Tabuleiro();
        while(!partida.acabou)
        {
            partida.fazerJogada(tabuleiro);
        }
    }
<<<<<<< HEAD
=======
    //Tomate
    //Abacate
>>>>>>> 283115a8173c8a1b9e03f05cf1eb76fcca68d131
}
