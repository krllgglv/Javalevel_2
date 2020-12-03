package panels;

import actionListeners.MenuCloseListener;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class TopPanel {
    private JPanel jPanel;

    public TopPanel() {
        this.jPanel = new JPanel();
        init();
    }

    public JPanel getPanel() {
        return jPanel;
    }

    private void init() {
//        jPanel.setBorder(new LineBorder(new Color(0, 0, 0), 2));

        jPanel.setLayout(new BorderLayout());

        jPanel.add(initBarMenu(),BorderLayout.WEST);





    }

    private JMenuBar initBarMenu() {
        JMenuBar menuBar = new JMenuBar();

        JMenu about = new JMenu("О программе");
        JMenuItem exit = new JMenuItem("Выход");
        exit.addActionListener(new MenuCloseListener());
        about.add(exit);
        menuBar.add(about);


        return menuBar;
    }
}
