// 5d. Swing program using JTabbedPane to show CYAN, MAGENTA, YELLOW panels

import javax.swing.*;
import java.awt.*;

public class SwingTabbedPaneCMY {
    public static void main(String[] args) {

        JFrame frame = new JFrame("CMY Tabbed Pane");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // TabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();

        // CYAN panel
        JPanel cyanPanel = new JPanel();
        cyanPanel.setBackground(Color.CYAN);

        // MAGENTA panel
        JPanel magentaPanel = new JPanel();
        magentaPanel.setBackground(Color.MAGENTA);

        // YELLOW panel
        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.YELLOW);

        // Add tabs
        tabbedPane.addTab("CYAN", cyanPanel);
        tabbedPane.addTab("MAGENTA", magentaPanel);
        tabbedPane.addTab("YELLOW", yellowPanel);

        frame.add(tabbedPane);
        frame.setVisible(true);
    }
}
