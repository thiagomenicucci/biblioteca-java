package com.biblioteca.main;

import com.biblioteca.view.ConsoleView;

/**
 * Classe principal da aplicação.
 * Ponto de entrada do sistema de gerenciamento de biblioteca.
 */
public class Main {
    public static void main(String[] args) {
        ConsoleView consoleView = new ConsoleView();
        consoleView.iniciar();
    }
}

