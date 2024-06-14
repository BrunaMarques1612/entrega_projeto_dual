/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author andre
 */
import com.mycompany.pilha.Pilha;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PilhaGUI<T> extends JFrame {
    private Pilha<T> pilha;
    private JTextField textField;
    private JTextArea textArea;

    public PilhaGUI() {
        pilha = new Pilha<>();
        textField = new JTextField(20);
        textArea = new JTextArea(10, 20);
        JButton pushButton = new JButton("Push");
        JButton popButton = new JButton("Pop");

        pushButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = textField.getText();
                pilha.push((T) input);
                updateStackDisplay();
            }
        });

        popButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    T popped = pilha.pop();
                    JOptionPane.showMessageDialog(null, "Elemento removido: " + popped);
                    updateStackDisplay();
                } catch (IllegalStateException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });

        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Elemento:"));
        inputPanel.add(textField);
        inputPanel.add(pushButton);
        inputPanel.add(popButton);

        JScrollPane scrollPane = new JScrollPane(textArea);

        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(inputPanel, BorderLayout.NORTH);
        contentPane.add(scrollPane, BorderLayout.CENTER);

        setTitle("Pilha GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void updateStackDisplay() {
        textArea.setText("");
        Pilha<T> tempPilha = new Pilha<>();
        while (!pilha.isEmpty()) {
            T elemento = pilha.pop();
            textArea.append(elemento.toString() + "\n");
            tempPilha.push(elemento);
        }
        while (!tempPilha.isEmpty()) {
            pilha.push(tempPilha.pop());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new PilhaGUI<>();
            }
        });
    }
}
