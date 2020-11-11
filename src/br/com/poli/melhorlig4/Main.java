//ALUNOS: FERNANDA BARBOSA DE PINHO E JOSÉ ALBERTO OLIVEIRA MOURA FILHO

package br.com.poli.melhorlig4;

import br.com.poli.melhorlig4.GUI.GUIMenu;

public class Main {
    public static void main(String[] args) {
        GUIMenu guiMenu = new GUIMenu();
        GUIController guiController = new GUIController(1);
        guiController.trocarTela(guiMenu.getMainPanel());
    }
}
