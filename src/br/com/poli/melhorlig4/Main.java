//ALUNOS: FERNANDA BARBOSA DE PINHO E JOSÉ ALBERTO OLIVEIRA MOURA FILHO

package br.com.poli.melhorlig4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Jogador jog1 = new Jogador(1);
        Jogador jog2 = new Jogador(2);
        Partida partida = new Partida(jog1, jog2);
        Menu menu = new Menu(jog1, jog2, partida);
        Scanner pos = new Scanner(System.in);
        int x = 0;

        while(menu.continuar){
            menu.outroMenu();
            while(!partida.acabou)
            {
                partida.fazerJogada(x);
                x = pos.nextInt();
            }
            menu.jogarNovamente();
        }
        pos.close();

    }
}
