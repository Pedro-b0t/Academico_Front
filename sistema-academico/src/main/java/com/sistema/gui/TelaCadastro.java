package com.sistema.gui;

import com.sistema.dao.AlunoDAO;
import com.sistema.model.Aluno;

import javax.swing.*;

public class TelaCadastro extends JFrame {
    private JTextField nomeField, matriculaField, cursoField;
    private JPasswordField senhaField;

    public TelaCadastro() {
        setTitle("Cadastro de Aluno");
        setSize(600, 450);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(null);

        JLabel nomeLabel = new JLabel("Nome:");
        nomeLabel.setBounds(30, 30, 100, 25);
        add(nomeLabel);

        nomeField = new JTextField();
        nomeField.setBounds(130, 30, 150, 25);
        add(nomeField);

        JLabel matriculaLabel = new JLabel("Matrícula:");
        matriculaLabel.setBounds(30, 70, 100, 25);
        add(matriculaLabel);

        matriculaField = new JTextField();
        matriculaField.setBounds(130, 70, 150, 25);
        add(matriculaField);

        JLabel cursoLabel = new JLabel("Curso:");
        cursoLabel.setBounds(30, 110, 100, 25);
        add(cursoLabel);

        cursoField = new JTextField();
        cursoField.setBounds(130, 110, 150, 25);
        add(cursoField);

        JLabel senhaLabel = new JLabel("Senha:");
        senhaLabel.setBounds(30, 150, 100, 25);
        add(senhaLabel);

        senhaField = new JPasswordField();
        senhaField.setBounds(130, 150, 150, 25);
        add(senhaField);

        JButton cadastrarBtn = new JButton("Cadastrar");
        cadastrarBtn.setBounds(100, 200, 120, 30);
        add(cadastrarBtn);

        cadastrarBtn.addActionListener(e -> {
            Aluno aluno = new Aluno();
            aluno.setNome(nomeField.getText());
            aluno.setMatricula(matriculaField.getText());
            aluno.setCurso(cursoField.getText());
            aluno.setSenha(new String(senhaField.getPassword()));

            new AlunoDAO().adicionarAluno(aluno);
            JOptionPane.showMessageDialog(this, "Aluno cadastrado com sucesso!");
            dispose();
        });

        setVisible(true);
    }
}
