package com.sistema.gui;

import com.sistema.model.Professor;

import javax.swing.*;

public class TelaProfessor extends JFrame {

    public TelaProfessor(Professor professor) {
        setTitle("Área do Professor");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JLabel welcomeLabel = new JLabel("Olá, Prof. " + professor.getNome());
        welcomeLabel.setBounds(50, 50, 200, 25);
        add(welcomeLabel);

        setVisible(true);
    }
}
