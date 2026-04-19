// 5c. Swing program using JList to display countries
// and print corresponding capital on console

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.HashMap;

public class SwingCountryCapital {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Country & Capital List");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Countries
        String[] countries = {
            "USA", "India", "Vietnam", "Canada", "Denmark",
            "France", "Great Britain", "Japan", "Africa",
            "Greenland", "Singapore"
        };

        // Map for capitals
        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("USA", "Washington D.C.");
        capitals.put("India", "New Delhi");
        capitals.put("Vietnam", "Hanoi");
        capitals.put("Canada", "Ottawa");
        capitals.put("Denmark", "Copenhagen");
        capitals.put("France", "Paris");
        capitals.put("Great Britain", "London");
        capitals.put("Japan", "Tokyo");
        capitals.put("Africa", "Not Applicable");
        capitals.put("Greenland", "Nuuk");
        capitals.put("Singapore", "Singapore");

        // JList
        JList<String> list = new JList<>(countries);
        JScrollPane scroll = new JScrollPane(list);

        // Event
        list.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    String selected = list.getSelectedValue();
                    String capital = capitals.get(selected);

                    System.out.println(selected + " → " + capital);
                }
            }
        });

        frame.add(scroll);
        frame.setVisible(true);
    }
}