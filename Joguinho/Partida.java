//ALUNOS: FERNANDA BARBOSA DE PINHO E JOSÉ ALBERTO OLIVEIRA MOURA FILHO

package Joguinho;
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

    public Partida(Jogador jogador1, Jogador jogador2, Tabuleiro tab)
    {
        jog1 = jogador1;
        jog2 = jogador2;
        jogAtual = jog1;//Inicia o jogador atual como o 1
        tabuleiro = tab;
    }
    

    //Faz as jogadas dos jogadores
    public void fazerJogada(int pos)
    {
        //validando as jogadas, o jogador jogará novamente caso a jogada seja inválida ou a coluna esteja preenchida
        while(validaJogada(pos) == -1 && tabuleiro.verificarColuna(pos) == -1)
        {
            System.out.println("Jogada invalida ou coluna cheia, favor tentar novamente ");
            pos = leitor.nextInt();
        }

        System.out.println("y:" + (tabuleiro.getYpos()+1) + " x: " + pos);
        //Cont começa em 0, pois é um turno inicial em que o método fazerJogada apenas imprime o tabuleiro e dirá de quem é a vez
        if(cont !=0)
        {
            System.out.println("O jogador " + jogAtual + " jogou na coluna " + pos + "\n");
            tabuleiro.preencherTabuleiro(pos, jogAtual.getId());
            alternarJogador();
        }
        System.out.println("\nJogador "+ jogAtual + ", sua vez!");
        //Caso o número máximo de casas seja alcançado
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
}
