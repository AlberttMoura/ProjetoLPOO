package br.com.poli.melhorlig4.GUI;

import br.com.poli.melhorlig4.GUIController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUICreditos extends GUIController {
    private JPanel mainPanel;
    private JButton voltarAoMenuButton;
    private GUIController guiController = new GUIController();

    //instancia um botao que ao ser clicado cria um objeto GUIMenu, o menu do jogo e vai para a tela de menu
    public GUICreditos() {
        voltarAoMenuButton.addActionListener(new ActionListener() {
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
