// 5a. Swing program using JList to display countries
// and print selected country on console

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class SwingJListExample {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Country List");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Countries array
        String[] countries = {
            "USA", "India", "Vietnam", "Canada", "Denmark",
            "France", "Great Britain", "Japan", "Africa",
            "Greenland", "Singapore"
        };

        // JList
        JList<String> list = new JList<>(countries);

        
        JScrollPane scroll = new JScrollPane(list);

        // Event handling
        list.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {

                // Prevent duplicate firing
                if (!e.getValueIsAdjusting()) {
                    String selected = list.getSelectedValue();
                    System.out.println(selected + " is selected");
                }
            }
        });

        frame.add(scroll);
        frame.setVisible(true);
    }
}