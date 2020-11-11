//ALUNOS: FERNANDA BARBOSA DE PINHO E JOSÉ ALBERTO OLIVEIRA MOURA FILHO

package br.com.poli.melhorlig4;
import java.util.Scanner;

public class Partida {
    private boolean acabou;//Status da partida
    private boolean empate;
    public Jogador vencedor;//Indica se há vencedor
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
        //validando as jogadas, o jogador jogará novamente caso a jogada seja inválida ou a coluna esteja preenchida
        while(validaJogada(pos) == -1 || tabuleiro.verificarColuna(pos) == -1)
        {
            pos = leitor.nextInt();
        }

        tabuleiro.preencherTabuleiro(pos, jogAtual.getId());//Recebe o id do jogador atual e sua coluna de jogada
        acabou = tabuleiro.verificarVitoria(jogAtual);//Verfica na vez do jogador atual se a jogada foi vitoriosa
        if(acabou)
            vencedor = jogAtual;
        else if(cont == 42)
        {
            acabou = true;
            empate = true;
        }

        alternarJogador();
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
        if(casa >= 0 && casa <= 6 && tabuleiro.verificarColuna(casa) != -1)
        {
            return 0;
        }
        return -1;
        
    }


    public Jogador jogadorAtual(){
        return jogAtual;
    }

    public int getY(){
        return tabuleiro.getYpos();
    }

    public int getCont(){
        //System.out.println(cont + "oii");
        return cont;
    }

    public boolean getEmpate(){
        return empate;
    }

    public boolean getAcabou(){
        return acabou;
    }

}
