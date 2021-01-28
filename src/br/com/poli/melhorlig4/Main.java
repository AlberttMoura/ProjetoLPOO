package br.com.poli.melhorlig4;

import br.com.poli.melhorlig4.GUI.GUIMenu;

public class Main {
    public static void main(String[] args) {

        GUIMenu guiMenu = new GUIMenu();//o objeto guiMenu cria o painel de menu com suas funcionalidades
        GUIController guiController = new GUIController(1);//guiController cria a janela e
        guiController.trocarTela(guiMenu.getMainPanel());

    }
}
