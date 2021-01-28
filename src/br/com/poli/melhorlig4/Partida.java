package br.com.poli.melhorlig4;
import java.util.Scanner;

public class Partida {
    private boolean acabou;//Status da partida
    private boolean empate;//Caso dê empate
    public Jogador vencedor;//Indica o vencedor
    private Jogador jog1;
    private Jogador jog2;
    private Jogador jogAtual;//Jogador atual
    private Tabuleiro tabuleiro;
    private int cont = 1;//Contador de jogadas. Inicando no 0(Partida de exibição)
    private Scanner leitor = new Scanner(System.in);

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
        if(tabuleiro.verificarColuna(pos) != -1) {
            tabuleiro.preencherTabuleiro(pos, jogAtual.getId());//Recebe o id do jogador atual e sua coluna de jogada
            acabou = tabuleiro.verificarVitoria(jogAtual);//Verfica na vez do jogador atual se a jogada foi vitoriosa
            if (acabou)//se acabou, o jogador atual sai como vencedor
                vencedor = jogAtual;
            else if (cont == 42) {
                acabou = true;
                empate = true;
            }

            alternarJogador();//alternamos o jogador
            cont++;
        }
    }

    //Exibe as jogadas
    private void alternarJogador(){
        if(jogAtual.getId() == 1) jogAtual = jog2;
        else jogAtual = jog1;
    }

    public Jogador jogadorAtual(){
        return jogAtual;
    }//Retorna o jogador atual para a interface

    public int getY(){
        return tabuleiro.getYpos();
    }//Retorna a linha em que a peça ficou, para ser usada pela interface

    public int getCont(){
        return cont;
    }//Retorna o número da jogada da vez. Usa o cont como Round

    public boolean getEmpate(){
        return empate;
    }//Retorna se a partida empatou

    public boolean getAcabou(){
        return acabou;
    }//Retorna se a partida acaobu. Seja por empate, seja por vitória

    public int colunaCheia(int pos) {
        return tabuleiro.verificarColuna(pos);
    }
}
