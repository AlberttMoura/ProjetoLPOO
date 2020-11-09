package br.com.poli.melhorlig4;

import javafx.scene.image.Image;
import java.util.concurrent.TimeUnit;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIPartida extends GUI{
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
    private JButton menu;
    private JLabel turnoLabel;
    private JLabel roundLabel;
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
    ImageIcon bPiece;
    ImageIcon rPiece;
    ImageIcon bMargin;
    ImageIcon bTurnoPiece;
    ImageIcon rTurnoPiece;
    JLabel[][] slots = new JLabel[6][7];

    public GUIPartida(Jogador jog1, Jogador jog2) {
        this.jog1 = jog1;
        this.jog2 = jog2;
        partida = new Partida(jog1, jog2);
        turno.setText("Vez do " + jog1.toString());
        bPiece = new ImageIcon(new ImageIcon("bPiece.png").getImage().getScaledInstance(100, 100,0));
        rPiece = new ImageIcon(new ImageIcon("rPiece.png").getImage().getScaledInstance(100, 100,0));
        bMargin = new ImageIcon(new ImageIcon("bMargin.png").getImage().getScaledInstance(100, 100,0));
        preencherSlots();
        bTurnoPiece = new ImageIcon(new ImageIcon("bPiece.png").getImage().getScaledInstance(16, 16,0));
        rTurnoPiece = new ImageIcon(new ImageIcon("rPiece.png").getImage().getScaledInstance(16, 16,0));
        turnoLabel.setIcon(rTurnoPiece);

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
        menu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUIMenu guiMenu = new GUIMenu();
                GUIController.origin.removeAll();
                GUIController.origin.revalidate();
                GUIController.origin.add(guiMenu.getMainPanel());
            }
        });
    }

    public JPanel getMainPanel(){
        return mainPanel;
    }

    private void jogada(int pos){
        if(partida.validaJogada(pos-1) != -1 && !partida.acabou && !partida.empate) {
            partida.fazerJogada(pos - 1);
            if (partida.jogadorAtual().getId() == 1) {
                slots[partida.getY()][pos - 1].setIcon(bPiece);
                slots[partida.getY()][pos - 1].revalidate();
                slots[partida.getY()][pos - 1].repaint();
            } else {
                slots[partida.getY()][pos - 1].setIcon(rPiece);
                slots[partida.getY()][pos - 1].revalidate();
                slots[partida.getY()][pos - 1].repaint();
            }
        }
        if (partida.empate) {
            turno.setText("Empate!");
            turnoLabel.setIcon(null);
            terminar(0);
        }
        else if(partida.acabou) {
            turno.setText(partida.vencedor.toString() + " Venceu!");
            terminar(partida.vencedor.getId());
        }


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



        for(int linha = 0; linha < slots.length; linha ++){
            for(int coluna = 0; coluna < slots[0].length; coluna++){
                slots[linha][coluna].setIcon(bMargin);
            }
        }

    }

    private void terminar(int id){
        Color cor = new Color(255,198,114);
        if(id == 1) {
            for(int i = 0; i <= 3; i++) {
                c1.setBackground(Color.red);
                c2.setBackground(Color.red);
                c3.setBackground(Color.red);
                c4.setBackground(Color.red);
                c5.setBackground(Color.red);
                c6.setBackground(Color.red);
                c7.setBackground(Color.red);
            }
        }
        else if(id == 2){
            c1.setBackground(Color.blue);
            c2.setBackground(Color.blue);
            c3.setBackground(Color.blue);
            c4.setBackground(Color.blue);
            c5.setBackground(Color.blue);
            c6.setBackground(Color.blue);
            c7.setBackground(Color.blue);
        }
        else{
            c1.setBackground(Color.green);
            c2.setBackground(Color.green);
            c3.setBackground(Color.green);
            c4.setBackground(Color.green);
            c5.setBackground(Color.green);
            c6.setBackground(Color.green);
            c7.setBackground(Color.green);
        }
    }
    private void delay(int mili){
        try {
            Thread.sleep(mili);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }


}
