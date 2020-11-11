package br.com.poli.melhorlig4;

import javax.swing.*;
import java.awt.*;

public class GUIController{
    private JFrame janela = new JFrame();
    public static JPanel origin = new JPanel(new GridLayout(1,1));

    public GUIController(){}

    public GUIController(int i){
        janela.setTitle("Melhor Lig4");
        //janela.setSize(900,700);
        janela.setExtendedState(janela.MAXIMIZED_BOTH);
        janela.setUndecorated(true);
        janela.setResizable(false);
        janela.add(origin);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }

    public void trocarTela(JPanel mainPanel){
        origin.removeAll();
        origin.revalidate();
        origin.add(mainPanel);
    }
}
