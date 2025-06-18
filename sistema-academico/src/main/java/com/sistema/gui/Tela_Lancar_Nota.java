package com.sistema.gui;

import com.sistema.dao.NotaDAO;
import com.sistema.model.Nota;

import javax.swing.*;
import java.awt.*;

public class Tela_Lancar_Nota extends JFrame {

    private JTextField alunoIdField;
    private JTextField cursoIdField;
    private JTextField notaField;
    private JTextArea observacaoArea;
    private JButton lancarNotaButton;
    private int professorId;

    public Tela_Lancar_Nota(int professorId) {
       setTitle("Lancar Nota");
       setSize(400,300);
       setDefaultCloseOperation(DISPOSE_ON_CLOSE);
       setLocationRelativeTo(null);
       
       JLabel label = new JLabel("Lancar notas - Professor ID: " + professorId);
       add(label);
       setVisible(true);
       
       
        alunoIdField = new JTextField();
        cursoIdField = new JTextField();
        notaField = new JTextField();
        observacaoArea = new JTextArea(3, 20);
        lancarNotaButton = new JButton("Lançar Nota");

        add(new JLabel("ID do Aluno:"));
        add(alunoIdField);
        add(new JLabel("ID do Curso:"));
        add(cursoIdField);
        add(new JLabel("Nota:"));
        add(notaField);
        add(new JLabel("Observações:"));
        add(new JScrollPane(observacaoArea));
        add(new JLabel());
        add(lancarNotaButton);

        lancarNotaButton.addActionListener(e -> lancarNota());
    }

    private void lancarNota() {
        try {
            int alunoId = Integer.parseInt(alunoIdField.getText());
            int cursoId = Integer.parseInt(cursoIdField.getText());
            double notaValor = Double.parseDouble(notaField.getText());
            String observacao = observacaoArea.getText();

            Nota nota = new Nota();
            nota.setAlunoId(alunoId);
            nota.setCursoId(cursoId);
            nota.setProfessorId(professorId);
            nota.setNota(notaValor);
            nota.setObservacao(observacao);

            new NotaDAO().lancarNota(nota);

            JOptionPane.showMessageDialog(this, "Nota lançada com sucesso!");
            alunoIdField.setText("");
            cursoIdField.setText("");
            notaField.setText("");
            observacaoArea.setText("");

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Insira valores válidos.");
        }
    }
}
