package br.com.poli.melhorlig4.GUI;

import br.com.poli.melhorlig4.GUIController;
import br.com.poli.melhorlig4.Jogador;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIFormu extends GUIController {
    private JTextField textField1;
    private JTextField textField2;
    private JButton confirmarButton;
    private JPanel mainPanel;
    private GUIController guiController = new GUIController();//permite a troca de telas

    // GUIFormu é o formulario que vai cadastrar os jogadores no sistema e iniciar o GUIPartida
    public GUIFormu() {
        confirmarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { ;
                Jogador jog1 = new Jogador(textField1.getText(), 1);
                Jogador jog2 = new Jogador(textField2.getText(), 2);
                GUIPartida guiPartida = new GUIPartida(jog1, jog2);
                guiController.trocarTela(guiPartida.getMainPanel());
            }
        });
    }

    public JPanel getMainPanel(){
        return mainPanel;
    }


}
