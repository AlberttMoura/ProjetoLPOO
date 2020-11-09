package br.com.poli.melhorlig4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIMenu extends GUI{
    private JPanel mainPanel;
    private JButton créditosButton;
    private JButton sairButton;
    private JButton instruçõesButton;
    private JButton jogarButton;
    GUIFormu guiFormu = new GUIFormu();
    //JFrame janela = new JFrame();

    public GUIMenu(){
        jogarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Jogar");
                mainPanel.removeAll();
                mainPanel.revalidate();
                mainPanel.repaint();
                GUIController.origin.removeAll();
                GUIController.origin.revalidate();
                GUIController.origin.add(guiFormu.getMainPanel());

            }
        });
        sairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public JPanel getMainPanel(){
        return mainPanel;
    }
}
