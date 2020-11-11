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
    private GUIController guiController = new GUIController();//responsável por trocar os JPanels referente a cada tela

    //GUIMenu é o menu do jogo, onde o app inicia
    //cada botao ao ser clicado cria um objeto para as outras telas de instrução, céditos, jogo ou encerra o programa
    public GUIMenu(){
        jogarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUIFormu guiFormu = new GUIFormu();
                guiController.trocarTela(guiFormu.getMainPanel());
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
            }
        });
        instruçõesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUIInstrucoes guiInstrucoes = new GUIInstrucoes();
                guiController.trocarTela(guiInstrucoes.getMainPanel());
            }
        });
    }

    //todos os GUI tem esta função para serem chamados pelo metodo trocarTela de GUIControler
    public JPanel getMainPanel(){
        return mainPanel;
    }
}
