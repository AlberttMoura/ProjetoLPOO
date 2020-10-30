//ALUNOS: FERNANDA BARBOSA DE PINHO E JOSÉ ALBERTO OLIVEIRA MOURA FILHO

package br.com.poli.melhorlig4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scam = new Scanner(System.in);
        System.out.print("Nome do Jogador 1: ");
        Jogador jog1 = new Jogador(scam.nextLine(),1);
        System.out.print("Nome do Jogador 2: ");
        Jogador jog2 = new Jogador(scam.nextLine(),2);
        Partida partida = new Partida(jog1, jog2);
        int x = 0;
        while(!partida.acabou)
        {
            partida.fazerJogada(x);
            x = scam.nextInt();
        }
        scam.close();
    }
}
