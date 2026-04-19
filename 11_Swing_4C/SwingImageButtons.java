// 4c. Swing program with image buttons and event handling (NO OVERLAP VERSION)

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingImageButtons {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Image Button Example");
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Panel with spacing
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 20));

        // 🔥 Load + resize images
        ImageIcon clockIcon = new ImageIcon("clock.png");
        Image clockImg = clockIcon.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        JButton btnClock = new JButton(new ImageIcon(clockImg));

        ImageIcon hourglassIcon = new ImageIcon("hourglass.png");
        Image hgImg = hourglassIcon.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        JButton btnHourglass = new JButton(new ImageIcon(hgImg));

        // Clean button look
        btnClock.setBorderPainted(false);
        btnHourglass.setBorderPainted(false);

        panel.add(btnClock);
        panel.add(btnHourglass);

        // Label
        JLabel label = new JLabel("Click an image", JLabel.CENTER);
        label.setFont(new Font("Arial", Font.PLAIN, 20));

        // Event handling
        btnClock.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Digital Clock is pressed");
            }
        });

        btnHourglass.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Hour Glass is pressed");
            }
        });

        // Layout
        frame.setLayout(new BorderLayout());
        frame.add(panel, BorderLayout.NORTH);
        frame.add(label, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}