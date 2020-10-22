//ALUNOS: FERNANDA BARBOSA DE PINHO E JOSÉ ALBERTO OLIVEIRA MOURA FILHO

package br.com.poli.melhorlig4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Jogador jog1 = new Jogador("Auberto", 1);
        Jogador jog2 = new Jogador("Frenanda", 2);
        Partida partida = new Partida(jog1, jog2);
        Scanner pos = new Scanner(System.in);
        int x = 0;
        //tabuleiro.desenharTabuleiro();
        while(!partida.acabou)
        {
            partida.fazerJogada(x);
            x = pos.nextInt();
        }
        pos.close();
        //ABACATE
        //TOMATE
    }
}
