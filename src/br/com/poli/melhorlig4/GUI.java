package br.com.poli.melhorlig4;


import javax.swing.*;
import java.awt.*;

public class GUI {

    public GUI() {
        JFrame janela = new JFrame();
        janela.setLayout(new GridLayout(5, 1));
        janela.setTitle("Melhor Lig4");
        janela.setSize(400, 400);//defibne o tamanho da janela

        Jogo jogo = new Jogo(janela);
        jogo.menu();


        janela.setVisible(true);//torna a janela visivel
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//para de rodar a aplicacao ao fechar a janela

    }

}