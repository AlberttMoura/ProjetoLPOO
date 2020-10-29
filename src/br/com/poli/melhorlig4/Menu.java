package br.com.poli.melhorlig4;
import java.util.Scanner;
public class Menu {
    Partida partida = new Partida();
    boolean continuar = true;
    int continuacao;
    Scanner leitor = new Scanner(System.in);

    public Menu(Jogador jog1, Jogador jog2, Partida partida)
    {
        this.partida = partida;
    }

    public void outroMenu()
    {
        int opcao=0;
        while(opcao<1 || opcao>4) {
            System.out.println("===LIG4===");
            System.out.println("1- jogar");
            System.out.println("2- instrucoes");
            System.out.println("3- configuracoes");
            System.out.println("4- creditos");
            opcao = leitor.nextInt();
        }
        switch (opcao)
        {
            case 1:
                menuDeJogadores();
                break;

            case 2:
                instrucoes();
                outroMenu();;
                break;

            case 3:
                System.out.println("nao temos configuracoes no momento\n");
                outroMenu();
                break;

            case 4:
                System.out.println("Este jogo é um Projeto da cadeira de Programação Orientada a Objeto \n" +
                        "dos estudantes de Engenharia da Computacao José Abacate Moura e Fernanda Barbosa de Pinho\n");

                outroMenu();
                break;

        }

    }

    public void instrucoes()
    {
        System.out.println("O jogo consiste em um tabuleiro 6 x 7 e é jogado por 2 jogadores. Cada jogador possui discos de uma\n" +
                "cor, e tem como objetivo formar 4 discos seguidos na horizontal, vertical ou nas diagonais. Os\n" +
                "jogadores alternam a jogada por turno, tendo que esperar a jogada do jogador atual terminar, para\n" +
                "realizar a sua jogada. O jogador atual deve escolher alguma coluna que ainda tenha espaço\n" +
                "disponível e colocar o disco de sua cor na coluna que irá deslizar até chegar no fundo do tabuleiro,\n" +
                "ou até atingir uma peça que já esteja na coluna. A partida termina se não existe mais nenhuma\n" +
                "posição disponível no tabuleiro ou se algum jogador conseguir enfileira 4 discos de mesma cor na\n" +
                "horizontal, vertical ou diagonais.\n");
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
        continuacao =0;
        while(continuacao != 1 && continuacao != 2) {
            System.out.println("Deseja jogar novamente?");
            System.out.println("| 2 (não) | 1 (sim) |");
            continuacao = leitor.nextInt();
        }
        if(continuacao == 2)
        {
            encerrarPartida();
        }
        else{
            zerarPartida();
        }
    }

    public void encerrarPartida()
    {
        continuar = false;
        partida.acabou = true;
    }

    public void zerarPartida()
    {
        continuar = true;
        partida.acabou = false;
        partida.cont =0;
        partida.tabuleiro.zerarTabuleiro();//zerando tabuleiro para caso haja proxima rodada
    }

}
