package frames;

import panels.BottomPanel;
import panels.CenterPanel;
import panels.TopPanel;

import javax.swing.*;
import java.awt.*;

public class ChatFrame extends JFrame {


    public ChatFrame() {
        setTitle("Chat");
        setBounds(new Rectangle(50, 50, 1000, 600));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        JTextArea lines = new JTextArea();
        lines.setEditable(false);

        JPanel top = new TopPanel().getPanel();
        CenterPanel centerPanel = new CenterPanel();
        JPanel center = centerPanel.getPanel();
        JPanel bottom = new BottomPanel(centerPanel.getMainTextArea()).getPanel();

        add(center, BorderLayout.CENTER);
        add(top, BorderLayout.NORTH);
        add(bottom, BorderLayout.SOUTH);

        setVisible(true);
    }





}
