package br.com.poli.melhorlig4;

import javax.swing.*;
import java.awt.*;
/*
* Esta classe é responsavel por criar a janela do jogo, unica em todo app
* e trocar entre os JPanels de cada "tela" diferente ao decorrer do app*/
public class GUIController{
    private final JFrame janela = new JFrame();
    public static JPanel origin = new JPanel(new GridLayout(1,1));

    //o contrutor vazio permite que os objetos sejam criados sem que cada um deles instancie uma janela JFrame nova
    public GUIController(){}

    public GUIController(int i){
        janela.setTitle("Melhor Lig4");
        janela.setExtendedState(JFrame.MAXIMIZED_BOTH);
        janela.setUndecorated(true);
        janela.setResizable(false);//impede que seja alterado o tamanho da tela
        janela.add(origin);//adiciona o painel original a janela. É ele que os painéis contendo o jogo sobrepõem
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//encerra o app ao fechar
        janela.setVisible(true);//torna a janela amostra
    }

    public void trocarTela(JPanel mainPanel){
        origin.removeAll();//remove os paineis porcima no painel original
        origin.revalidate();//remove o codigo referente ao peinel anterior
        origin.add(mainPanel);//adiciona o painel recebido sobre o painel original
    }
}
