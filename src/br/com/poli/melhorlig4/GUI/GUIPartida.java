package br.com.poli.melhorlig4.GUI;

import br.com.poli.melhorlig4.GUIController;
import br.com.poli.melhorlig4.Jogador;
import br.com.poli.melhorlig4.Partida;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIPartida extends GUIController {
    /*
    * Legenda
    * buttons: botoes do tabuleiro
    * p: posicoes inicialmente vazias do tabuleiro
    * c: colunas do tabuleiro (as colunas contém 6 "ps" cada)
    * */
    private JPanel mainPanel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JLabel turno;
    private JLabel p1;
    private JLabel p2;
    private JLabel p3;
    private JLabel p4;
    private JLabel p5;
    private JLabel p6;
    private JLabel p7;
    private JLabel p8;
    private JLabel p9;
    private JLabel p10;
    private JLabel p11;
    private JLabel p12;
    private JLabel p13;
    private JLabel p14;
    private JLabel p15;
    private JLabel p16;
    private JLabel p17;
    private JLabel p18;
    private JLabel p19;
    private JLabel p20;
    private JLabel p21;
    private JLabel p22;
    private JLabel p23;
    private JLabel p24;
    private JLabel p25;
    private JLabel p26;
    private JLabel p27;
    private JLabel p28;
    private JLabel p29;
    private JLabel p30;
    private JLabel p31;
    private JLabel p32;
    private JLabel p33;
    private JLabel p34;
    private JLabel p35;
    private JLabel p36;
    private JLabel p37;
    private JLabel p38;
    private JLabel p39;
    private JLabel p40;
    private JLabel p41;
    private JLabel p42;
    private JButton menu;//botao para voltar ao menu
    private JLabel turnoLabel;//indica de quem é a vez de jogar
    private JLabel roundLabel;//indica quantas jogadas foram feitas ao todo
    private JPanel c1;
    private JPanel c2;
    private JPanel c3;
    private JPanel c4;
    private JPanel c5;
    private JPanel c6;
    private JPanel c7;
    Jogador jog1;
    Jogador jog2;
    Partida partida;
    ImageIcon bPiece;//peça azul
    ImageIcon rPiece;//peça vermelha
    ImageIcon bMargin;//imagem da casa vazia no tabuleiro
    ImageIcon bTurnoPiece;//imagem que fica na barra de cima indicando o jogador azul
    ImageIcon rTurnoPiece;//imagem que fica na barra de cima indicando o jogador vermelho
    JLabel[][] slots = new JLabel[6][7]; //o tabuleiro a ser preenchido pelos JLabels p
    private final GUIController guiController = new GUIController();//o controlador que faz a mudanca entre os manels

    public GUIPartida(Jogador jog1, Jogador jog2) {
        /*
        * O construtor:
        *  recebe os 2 objetos Jogadores e inicia uma Partida
        * define os ícones da peça azul e da peça vermelha
        * chama a funcao de preencheSlots, que define os Jlabels na matriz um a um e os da a imagem da casa vazia no tabuleiro
        * define os icones da barra de status do jogo
        * */
        this.jog1 = jog1;
        this.jog2 = jog2;
        partida = new Partida(jog1, jog2);
        turno.setText("Vez do " + jog1.toString());
        bPiece = new ImageIcon(new ImageIcon("src/br/com/poli/melhorlig4/images/bPiece.png").getImage().getScaledInstance(100, 100,0));
        rPiece = new ImageIcon(new ImageIcon("src/br/com/poli/melhorlig4/images/rPiece.png").getImage().getScaledInstance(100, 100,0));
        bMargin = new ImageIcon(new ImageIcon("src/br/com/poli/melhorlig4/images/bMargin.png").getImage().getScaledInstance(100, 100,0));
        preencherSlots();
        bTurnoPiece = new ImageIcon(new ImageIcon("src/br/com/poli/melhorlig4/images/bPiece.png").getImage().getScaledInstance(16, 16,0));
        rTurnoPiece = new ImageIcon(new ImageIcon("src/br/com/poli/melhorlig4/images/rPiece.png").getImage().getScaledInstance(16, 16,0));
        turnoLabel.setIcon(rTurnoPiece);

        /*
        * cada botão dispara uma ação que chama o método jogada com a posição correspondente ao botão
        * */
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jogada(1);

            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jogada(2);
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jogada(3);
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jogada(4);
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jogada(5);
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jogada(6);
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jogada(7);
            }
        });

        //o botão de menu cria um objeto GUIMenu, que é o JPanel referente ao menu
        //esse objeto é usado na função troca de tela, que apaga a tela atual e imprime a tela que foi passada
        menu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUIMenu guiMenu = new GUIMenu();
                guiController.trocarTela(guiMenu.getMainPanel());
            }
        });
    }

    //essa função retorna o painel principal, onde toda parte gráfica do jogo se encontra
    public JPanel getMainPanel(){
        return mainPanel;
    }

    //o método jogada recebe a posição que vai de 1 a 7 no tabuleiro gráfico
    private void jogada(int pos){
        //como o array da matriz vai de 0 a 6 fazemos pos-1 para equivaler a matriz
        //caso a apartida não tenha acabado ou empatado o slot vazio é trocado pelo icone do jogador atual
        if(!partida.getAcabou() && !partida.getEmpate()) {
            //partida faz a jogada com pos equivalendo ao "eixo x"
            partida.fazerJogada(pos - 1);
            //caso seja o jogador 1, o slot fica azul caso seja o 2 o slot fica vermelho
            if (partida.jogadorAtual().getId() == 1) {
                slots[partida.getY()][pos - 1].setIcon(bPiece);
            } else {
                slots[partida.getY()][pos - 1].setIcon(rPiece);
            }
        }

        //caso empate seja true
        if (partida.getEmpate()) {
            turno.setText("Empate!");
            turnoLabel.setIcon(null);
            terminar(0); //terminar recebe 0 para mostrar que nenhum jogador venceu, encerrando o jogo
            // deixando o tabuleito fica verde
        }

        //se a partida acaba sem gerar empate
        else if(partida.getAcabou()) {
            turno.setText(partida.vencedor.toString() + " Venceu!");
            terminar(partida.vencedor.getId());//turno recebe o id referente ao jogador vencedor, encerrando o jogo
            //e deixando o tabuleiro da cor referente ao jogador
        }

        //se não houver empate ou vencedor a partida continua
        else {
            turno.setText("Vez do " + partida.jogadorAtual().toString());
            if(partida.jogadorAtual().getId() == 1)
                turnoLabel.setIcon(rTurnoPiece);
            else {
                turnoLabel.setIcon(bTurnoPiece);
            }
            if(partida.getCont() < 10)
                roundLabel.setText("Round: 0" + partida.getCont());
            else
                roundLabel.setText("Round : " + partida.getCont());
        }
    }

    //cada slot recebe um JLabel para mostrar as peças, inicialmente todas brancas (vazias), do tabuleiro
    private void preencherSlots(){
        slots[0][0] = p1;
        slots[1][0] = p2;
        slots[2][0] = p3;
        slots[3][0] = p4;
        slots[4][0] = p5;
        slots[5][0] = p6;

        slots[0][1] = p7;
        slots[1][1] = p8;
        slots[2][1] = p9;
        slots[3][1] = p10;
        slots[4][1] = p11;
        slots[5][1] = p12;

        slots[0][2] = p13;
        slots[1][2] = p14;
        slots[2][2] = p15;
        slots[3][2] = p16;
        slots[4][2] = p17;
        slots[5][2] = p18;

        slots[0][3] = p19;
        slots[1][3] = p20;
        slots[2][3] = p21;
        slots[3][3] = p22;
        slots[4][3] = p23;
        slots[5][3] = p24;

        slots[0][4] = p25;
        slots[1][4] = p26;
        slots[2][4] = p27;
        slots[3][4] = p28;
        slots[4][4] = p29;
        slots[5][4] = p30;

        slots[0][5] = p31;
        slots[1][5] = p32;
        slots[2][5] = p33;
        slots[3][5] = p34;
        slots[4][5] = p35;
        slots[5][5] = p36;

        slots[0][6] = p37;
        slots[1][6] = p38;
        slots[2][6] = p39;
        slots[3][6] = p40;
        slots[4][6] = p41;
        slots[5][6] = p42;


        //todos os JLabels tem a mesma imagem no começo(pecas brancas)
        for(int linha = 0; linha < slots.length; linha ++){
            for(int coluna = 0; coluna < slots[0].length; coluna++){
                slots[linha][coluna].setIcon(bMargin);
            }
        }

    }

    //terminar receve 0, 1 ou 2 dependendo se houve empate ou vitória
    private void terminar(int id){
        Color azul = new Color(115, 129, 255 );
        Color vermelho = new Color(255, 84, 84 );
        Color verde = new Color(84, 255, 87);
        //caso o id seja 1, significa que o jogador 1 venceu, as colunas ficam da cor azul
        if(id == 1) {
            for(int i = 0; i <= 3; i++) {
                c1.setBackground(vermelho);
                c2.setBackground(vermelho);
                c3.setBackground(vermelho);
                c4.setBackground(vermelho);
                c5.setBackground(vermelho);
                c6.setBackground(vermelho);
                c7.setBackground(vermelho);
            }
        }

        //caso o id seja 2, o jogador 2 ganhou e as colunas ficam vermelhas
        else if(id == 2){
            c1.setBackground(azul);
            c2.setBackground(azul);
            c3.setBackground(azul);
            c4.setBackground(azul);
            c5.setBackground(azul);
            c6.setBackground(azul);
            c7.setBackground(azul);
        }
        //caso nao haja vencedores, as colunas ficam verdes
        else{
            c1.setBackground(verde);
            c2.setBackground(verde);
            c3.setBackground(verde);
            c4.setBackground(verde);
            c5.setBackground(verde);
            c6.setBackground(verde);
            c7.setBackground(verde);
        }
    }


}
