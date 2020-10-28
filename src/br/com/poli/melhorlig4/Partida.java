//ALUNOS: FERNANDA BARBOSA DE PINHO E JOSÉ ALBERTO OLIVEIRA MOURA FILHO

package br.com.poli.melhorlig4;

import java.util.Scanner;



public class Partida {
    boolean acabou;//Status da partida
    boolean vencedor;//Índica se há vencedor
    Jogador jog1;
    Jogador jog2;
    Jogador jogAtual;//Jogador atual
    Tabuleiro tabuleiro;
    int cont = 0;//Contador de jogadas. Inicando no 0(Partida de exibição)
    Scanner leitor = new Scanner(System.in);

    public Partida(Jogador jogador1, Jogador jogador2)
    {
        jog1 = jogador1;
        jog2 = jogador2;
        jogAtual = jog1;//Inicia o jogador atual como o 1
        tabuleiro = new Tabuleiro();
    }
    

    //Faz as jogadas dos jogadores
    public void fazerJogada(int pos)
    {
        //validando as jogadas, o jogador jogará novamente caso a jogada seja inválida ou a coluna esteja preenchida
        while(validaJogada(pos) == -1 || tabuleiro.verificarColuna(pos) == -1)
        {
            System.out.println("Jogada inválida ou coluna cheia. Favor tentar novamente ");
            pos = leitor.nextInt();
        }

        System.out.println("y:" + (tabuleiro.getYpos()) + " x: " + pos);
        //Cont começa em 0, pois é um turno inicial em que o método fazerJogada apenas imprime o tabuleiro e dirá de quem é a vez
        if(cont !=0)
        {
            System.out.println(jogAtual + " jogou na coluna " + pos + "\n");
            tabuleiro.preencherTabuleiro(pos, jogAtual.getId());
            jogadaVencedora(pos);
            alternarJogador();
        }
        System.out.println("\n" + jogAtual + ", sua vez!");

        //Caso o número máximo de casas seja alcançado
        //EMPATE
        if(cont == 42)
        {
            System.out.println("Fim de jogo");
            acabou = true;
        }
        tabuleiro.desenharTabuleiro();
        cont++;
    }

    //Exibe as jogadas
    private void alternarJogador(){
        if(jogAtual.getId() == 1) jogAtual = jog2;
        else jogAtual = jog1;
    }

    //Validação de jogada
    public int validaJogada(int casa)
    {
        if(casa < 0 || casa >6)
        {
            return -1;
        }
        return 1;
        
    }

    //Verifica se a jogada feita acarretou em vitoria
    public void jogadaVencedora(int posX)
    {
        /*
        int liga = 0; //numero de ligacoes feitas
        //vitoria vertical
        if(tabuleiro.getYpos()<=3)
        {
            for(int i = 1; i<4; i++)
            {
                if(tabuleiro.valorCasa(posX, tabuleiro.getYpos()+i) == jogAtual.getId())
                {
                    liga++;
                    System.out.println("fiz algo");
                }
                else break;
            }
        if(liga == 3)
        {
            System.out.println(jogAtual.getNome() + " voce venceu!");
            System.out.println("FIM DE JOGO");
            acabou = true;
        }*/

        try
        {
            if(tabuleiro.valorCasa(posX, tabuleiro.getYpos()+1) == jogAtual.getId() && tabuleiro.valorCasa(posX, tabuleiro.getYpos()+2) == jogAtual.getId() && tabuleiro.valorCasa(posX, tabuleiro.getYpos()+3) == jogAtual.getId() && tabuleiro.valorCasa(posX, tabuleiro.getYpos()+4) == jogAtual.getId())
            {
                System.out.println("Voce venceu " + jogAtual.getNome());
            }
        }
        catch(Exception e)
        {
        }
    }

}
