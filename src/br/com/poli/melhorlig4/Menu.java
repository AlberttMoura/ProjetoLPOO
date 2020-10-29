package br.com.poli.melhorlig4;
import java.util.Scanner;
public class Menu {
    Partida partida = new Partida();
    boolean continuar = true;
    int continuacao=0;
    Scanner leitor = new Scanner(System.in);

    public Menu(Jogador jog1, Jogador jog2, Partida partida)
    {
        this.partida = partida;
    }
    public void menuDeJogadores()
    {
        System.out.println("Jogador 1- favor inserir seu nome: ");
        partida.jog1.setNome(leitor.next());
        System.out.println("Jogador 2 - favor inserir seu nome: ");
        partida.jog2.setNome(leitor.next());
    }

    public void jogarNovamente()
    {

        while(continuacao != 1 && continuacao != 2) {
            System.out.println("Deseja jogar novamente?");
            System.out.println("| 2 (não) | 1 (sim) |");
            continuacao = leitor.nextInt();
        }
        if(continuacao == 2)
        {
            continuar = false;
            partida.acabou = true;
        }
        else{
            continuar = true;
            partida.acabou = false;
            partida.cont =0;
            partida.tabuleiro.zerarTabuleiro();//zerando tabuleiro para caso haja proxima rodada
        }
    }

}
