// 5b. Swing program using JTabbedPane to show RED, BLUE, GREEN panels

import javax.swing.*;
import java.awt.*;

public class SwingTabbedPaneExample {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Tabbed Pane Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create TabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();

        // RED Panel
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);

        // BLUE Panel
        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);

        // GREEN Panel
        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);

        // Add tabs
        tabbedPane.addTab("RED", redPanel);
        tabbedPane.addTab("BLUE", bluePanel);
        tabbedPane.addTab("GREEN", greenPanel);

        // Add to frame
        frame.add(tabbedPane);

        frame.setVisible(true);
    }
}