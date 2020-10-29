package br.com.poli.melhorlig4;
import java.util.Scanner;
public class Menu {
    Jogador jog1;
    Jogador jog2;
    Tabuleiro tabuleiro = new Tabuleiro();
    Partida partida = new Partida();
    boolean continuar = false;
    int continuacao=0;
    Scanner leitor = new Scanner(System.in);

    public Menu(Jogador jog1, Jogador jog2)
    {
        this.jog1 = jog1;
        this.jog2 = jog2;
    }
    public void menuDeJogadores()
    {
        System.out.println("Jogador 1- favor inserir seu nome: ");
        jog1.setNome(leitor.next());
        System.out.println("Jogador 2 - favor inserir seu nome: ");
        jog2.setNome(leitor.next());
    }

    public boolean jogarNovamente()
    {

        while(continuacao != 1 && continuacao != 2) {
            System.out.println("Deseja jogar novamente?");
            System.out.println("| 2 (não) | 1 (sim) |");
            continuacao = leitor.nextInt();
        }
        continuar = continuacao == 2;

        return continuar;
    }

}
