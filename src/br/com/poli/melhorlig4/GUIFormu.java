package br.com.poli.melhorlig4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIFormu extends GUI{
    private JTextField textField1;
    private JTextField textField2;
    private JButton confirmarButton;
    private JPanel mainPanel;

    public GUIFormu() {
        confirmarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Confirmar");
                mainPanel.removeAll();
                mainPanel.revalidate();
                mainPanel.repaint();
                Jogador jog1 = new Jogador(textField1.getText(), 1);
                Jogador jog2 = new Jogador(textField2.getText(), 2);
                GUIPartida guiPartida = new GUIPartida(jog1, jog2);
                GUIController.origin.removeAll();
                GUIController.origin.revalidate();
                GUIController.origin.add(guiPartida.getMainPanel());
            }
        });
    }

    public JPanel getMainPanel(){
        return mainPanel;
    }


}
