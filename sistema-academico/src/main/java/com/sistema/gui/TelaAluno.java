package com.sistema.gui;

import com.sistema.model.Aluno;

import javax.swing.*;

public class TelaAluno extends JFrame {

    public TelaAluno(Aluno aluno) {
        setTitle("Área do Aluno");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JLabel welcomeLabel = new JLabel("Bem-vindo, " + aluno.getNome());
        welcomeLabel.setBounds(50, 50, 200, 25);
        add(welcomeLabel);

        setVisible(true);
    }
}
