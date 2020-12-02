package panels;

import actionListeners.InputTextListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class BottomPanel {
    private JPanel panel;

    private JTextArea textArea;
    public BottomPanel(JTextArea textArea) {
        this.textArea = textArea;
        panel = new JPanel();
        init();
    }

    public JPanel getPanel() {
        return panel;
    }

    private void init() {
        panel.setLayout(new BorderLayout());
        JTextField textField = new JTextField();
        JButton send = new JButton("send");
        panel.setLayout(new BorderLayout());
        panel.add(textField,BorderLayout.CENTER);
        panel.add(send,BorderLayout.EAST);

        ActionListener inputTextListener = new InputTextListener(textArea, textField);
        send.addActionListener(inputTextListener);
        textField.addActionListener(inputTextListener);
    }
}
