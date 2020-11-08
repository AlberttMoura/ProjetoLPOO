package br.com.poli.melhorlig4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Scanner;



public class Jogo {

    JFrame janela;
    Jogador jog1 = new Jogador(1) ;
    Jogador jog2 = new Jogador(2);
    Partida partida = new Partida(jog1, jog2);
    JTextField nomeJog1;
    JTextField nomeJog2;

    public Jogo(JFrame frame){
        this.janela = frame;
    }

    public void menu(){

        Click clicar = new Click();

        //botoes do menu
        JButton btJogar = new JButton("Jogar");
        btJogar.setActionCommand("jogar");
        btJogar.addActionListener(clicar);

        JButton btInstrucoes = new JButton("Instrucoes");
        btInstrucoes.setActionCommand("instrucoes");
        btInstrucoes.addActionListener(clicar);

        JButton btCredito = new JButton("Creditos");
        btCredito.setActionCommand("creditos");
        btCredito.addActionListener(clicar);

        JButton btSair = new JButton("Sair");
        btSair.setActionCommand("sair");
        btSair.addActionListener(clicar);

        //adicionando botoes a janela
        janela.add(btJogar);
        janela.add(btInstrucoes);
        janela.add(btCredito);
        janela.add(btSair);


    }



    public void comecaJogo(){
        Click clicar = new Click();

        janela.getContentPane().removeAll();//limpando a janela para comecar o jogo
        janela.repaint();


        JButton comecar = new JButton("Comecar");
        comecar.setActionCommand("comecar");


        JPanel nome1 = new JPanel();
        nome1.add(new JLabel("Jogador 1: "));
        nomeJog1 = new JTextField(15);//adicionando caixa de txt para o nome


        JPanel nome2 = new JPanel();
        nome2.add(new JLabel("Jogador 2: "));
        nomeJog2 = new JTextField(15);

        janela.add(nome1);
        janela.add(nomeJog1);
        janela.add(nome2);
        janela.add(nomeJog2);
        janela.add(comecar);

        comecar.addActionListener(clicar);

        janela.setLayout(new FlowLayout());
        janela.setVisible(true);

    }

    public void iniciarJogo(){

        Scanner scam = new Scanner(System.in);

        int x = 0;

        while(!partida.acabou)
        {
            partida.fazerJogada(x);
            x = scam.nextInt();
        }
        scam.close();
    }

    public void tabuleitoGUI(){

    }


    public void instrucoes(){
        JOptionPane.showMessageDialog(null, "O jogo consiste em um tabuleiro 6 x 7 e é jogado por 2 jogadores. Cada jogador possui discos de uma\n" +
                "cor, e tem como objetivo formar 4 discos seguidos na horizontal, vertical ou nas diagonais. Os\n" +
                "jogadores alternam a jogada por turno, tendo que esperar a jogada do jogador atual terminar, para\n" +
                "realizar a sua jogada. O jogador atual deve escolher alguma coluna que ainda tenha espaço\n" +
                "disponível e colocar o disco de sua cor na coluna que irá deslizar até chegar no fundo do tabuleiro,\n" +
                "ou até atingir uma peça que já esteja na coluna. A partida termina se não existe mais nenhuma\n" +
                "posição disponível no tabuleiro ou se algum jogador conseguir enfileira 4 discos de mesma cor na\n" +
                "horizontal, vertical ou diagonais.");
    }


    public void creditos(){
        JOptionPane.showMessageDialog(null, "Jogo criado por fernanada e alberto");
    }



    //faz as acoes de clicar o mouse funcionarem
    public class Click extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equals("sair")){
                System.exit(1);
            }
            else if(e.getActionCommand().equals("instrucoes")) {
                instrucoes();
            }
            else if(e.getActionCommand().equals("creditos")){
                creditos();
            }
            else if(e.getActionCommand().equals("jogar")){
                comecaJogo();
            }
            else if(e.getActionCommand().equals("comecar")){
                jog1.setNome(nomeJog1.getText());
                jog2.setNome(nomeJog2.getText());
                iniciarJogo();
            }
        }
    }

}


