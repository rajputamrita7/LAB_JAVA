// 4a. Basic hello program of Swing displaying the message
// "Hello! VI C , Welcome to Swing Programming" in Blue color,
// plain font with font size 32 using JFrame and JLabel

import javax.swing.*;
import java.awt.*;

public class SwingHello {
    public static void main(String[] args) {

        // Create frame
        JFrame frame = new JFrame("Swing Hello Program");
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create label
        JLabel label = new JLabel("Hello! VI C , Welcome to Swing Programming");

        // Set font (plain, size 32)
        label.setFont(new Font("Arial", Font.PLAIN, 32));

        // Set text color (Blue)
        label.setForeground(Color.BLUE);

        // Center alignment
        label.setHorizontalAlignment(JLabel.CENTER);

        // Add label to frame
        frame.add(label);

        // Make frame visible
        frame.setVisible(true);
    }
}