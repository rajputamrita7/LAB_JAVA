// 4b Swing program using JButton and ActionListener

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingButtons {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Button Event Example");
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JButton btnIndia = new JButton("India");
        JButton btnSrilanka = new JButton("Srilanka");

        panel.add(btnIndia);
        panel.add(btnSrilanka);

        JLabel label = new JLabel("Click a button", JLabel.CENTER);
        label.setFont(new Font("Arial", Font.PLAIN, 20));

        btnIndia.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("India is pressed");
            }
        });

        btnSrilanka.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Srilanka is pressed");
            }
        });

        frame.setLayout(new BorderLayout());
        frame.add(panel, BorderLayout.NORTH);
        frame.add(label, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}