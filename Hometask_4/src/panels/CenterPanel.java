package panels;

import javax.swing.*;
import java.awt.*;

public class CenterPanel {
    private JPanel panel;
    private JTextArea mainTextArea = new JTextArea();

    public CenterPanel() {
        panel = new JPanel();
        initPanel();
    }

    public JTextArea getMainTextArea() {
        return mainTextArea;
    }

    public JPanel getPanel() {
        return panel;
    }




    private void initPanel() {

        panel.setLayout(new GridLayout());
//        mainTextArea =
        mainTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(mainTextArea);
        panel.add(scrollPane, BorderLayout.CENTER);

    }
}
