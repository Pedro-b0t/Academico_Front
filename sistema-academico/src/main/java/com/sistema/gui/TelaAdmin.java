package com.sistema.gui;

import javax.swing.*;

public class TelaAdmin extends JFrame {

    public TelaAdmin() {
        setTitle("Área Administrativa");
        setSize(800, 600);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JTabbedPane abas = new JTabbedPane();

        abas.add("Cadastrar Aluno", new TelaCadastroAluno());
        abas.add("Cadastrar Professor", new TelaCadastroProfessor());
        abas.add("Cadastrar Curso", new TelaCadastroCurso());

        add(abas);
    }
}
