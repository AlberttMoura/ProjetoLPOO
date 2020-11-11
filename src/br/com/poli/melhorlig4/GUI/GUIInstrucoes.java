package br.com.poli.melhorlig4.GUI;

import br.com.poli.melhorlig4.GUIController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIInstrucoes {

    private JPanel mainPanel;
    private JButton menuButton;

    private GUIController guiController = new GUIController();


        public GUIInstrucoes() {
            menuButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    GUIMenu guiMenu = new GUIMenu();
                    guiController.trocarTela(guiMenu.getMainPanel());

                }
            });
        }

        public JPanel getMainPanel(){
            return mainPanel;
        }
}
