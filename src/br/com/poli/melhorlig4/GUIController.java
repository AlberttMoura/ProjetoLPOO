package br.com.poli.melhorlig4;

import javax.swing.*;
import java.awt.*;

public class GUIController{
    static JFrame janela = new JFrame();
    static JPanel origin = new JPanel(new GridLayout(1,1));

    //GUIs
    GUIMenu guiMenu = new GUIMenu();

    public GUIController(){ janela.setTitle("Melhor Lig4");
        //janela.setSize(900,700);
        janela.setExtendedState(janela.MAXIMIZED_BOTH);
        janela.setUndecorated(true);
        janela.setResizable(false);
        janela.add(origin);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }

    public void start(){
        origin.add(guiMenu.getMainPanel());
    }
}
