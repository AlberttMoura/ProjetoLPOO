//ALUNOS: FERNANDA BARBOSA DE PINHO E JOSÉ ALBERTO OLIVEIRA MOURA FILHO
package ProjetoLPOO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Jogador jog1 = new Jogador("Auberto", 1);
        Jogador jog2 = new Jogador("Frenanda", 2);
        Tabuleiro tabuleiro = new Tabuleiro();
        Partida partida = new Partida(jog1, jog2, tabuleiro);
        Scanner pos = new Scanner(System.in);
        int x = 0;
        //tabuleiro.desenharTabuleiro();
        while(!partida.acabou)
        {
            partida.fazerJogada(x);
            x = pos.nextInt() - 1;
        }
    }
}
