package actionListeners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputTextListener implements ActionListener { private JTextArea textArea;
    private JTextField textField;

    public InputTextListener(JTextArea textArea, JTextField textField) {
        this.textArea = textArea;
        this.textField = textField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        StringBuilder sb = new StringBuilder(textArea.getText());
        sb.append("\n").append(textField.getText());
        textArea.setText(sb.toString());
        textField.setText("");
    }
}