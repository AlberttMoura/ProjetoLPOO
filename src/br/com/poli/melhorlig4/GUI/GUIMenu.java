package br.com.poli.melhorlig4.GUI;

import br.com.poli.melhorlig4.GUIController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIMenu{
    private JPanel mainPanel;
    private JButton créditosButton;
    private JButton sairButton;
    private JButton instruçõesButton;
    private JButton jogarButton;
    private GUIController guiController = new GUIController();


    public GUIMenu(){
        jogarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUIFormu guiFormu = new GUIFormu();
                guiController.trocarTela(guiFormu.getMainPanel());
                //GUIController.origin.removeAll();
                //GUIController.origin.revalidate();
                //GUIController.origin.add(guiFormu.getMainPanel());

            }
        });
        sairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        créditosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUICreditos guiCreditos = new GUICreditos();
                guiController.trocarTela(guiCreditos.getMainPanel());
                //GUIController.origin.removeAll();
                //GUIController.origin.revalidate();
                //GUIController.origin.add(guiCreditos.getMainPanel());
            }
        });
        instruçõesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUIInstrucoes guiInstrucoes = new GUIInstrucoes();
                guiController.trocarTela(guiInstrucoes.getMainPanel());
                //GUIController.origin.removeAll();
                //GUIController.origin.revalidate();
                //GUIController.origin.add(guiCreditos.getMainPanel());
            }
        });
    }

    public JPanel getMainPanel(){
        return mainPanel;
    }
}
