//ALUNOS: FERNANDA BARBOSA DE PINHO E JOSÉ ALBERTO OLIVEIRA MOURA FILHO

import java.util.Scanner;

public class Partida {
    boolean acabou;//Status da partida
    boolean vencedor;//Índica se há vencedor
    Jogador jog1;
    Jogador jog2;
    Jogador jogAtual;//Jogador atual
    int cont = 1;//Contador de jogadas. Inicando no 1

    public Partida(Jogador jogador1, Jogador jogador2)
    {
        jog1 = jogador1;
        jog2 = jogador2;
        jogAtual = jog1;//Inicia o jogador atual como o 1
    }

    //Pega a jogada dos jogadores
    public int pegarJogada(){
        Scanner pos = new Scanner(System.in);
        return pos.nextInt();
    }

    //Faz as jogadas dos jogadores
    public void fazerJogada(Tabuleiro tabuleiro)
    {
        System.out.print("\nJogador "+ jogAtual.getId() + ", sua vez!");
        int pos = pegarJogada() - 1;
        exibirJogada(pos);
        //Caso o número máximo de casas seja alcançado
        if(cont == 42)
        {
            System.out.println("Fim de jogo");
            acabou = true;
        }
        cont++;
        tabuleiro.preencherTabuleiro(pos, jogAtual.getId());
        tabuleiro.desenharTabuleiro();
    }

    //Exibe as jogadas
    public void exibirJogada(int casa){
        System.out.println("O jogador " + jogAtual.getId() + " fez jogada " + casa);
        if(jogAtual.getId() == 1) jogAtual = jog2;
        else jogAtual = jog1;
    }
}
