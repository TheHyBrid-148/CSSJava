package gui;

import javax.swing.*;
import java.awt.*;

public class Menu extends JFrame {
    public Menu() {
        setTitle("Real Estate Sales & Management System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1, 10, 10));

        JButton searchButton = new JButton("Search Lots");
        JButton reserveButton = new JButton("Reserve a Lot");
        JButton sellButton = new JButton("Sell a Lot");
        JButton reportButton = new JButton("View Reports");
        JButton exitButton = new JButton("Exit");

        searchButton.addActionListener(e -> new Search().setVisible(true));
        reserveButton.addActionListener(e -> new Reserver().setVisible(true));
        sellButton.addActionListener(e -> new Search().setVisible(true));
        reportButton.addActionListener(e -> new Search().setVisible(true));
        exitButton.addActionListener(e -> System.exit(0));

        panel.add(searchButton);
        panel.add(reserveButton);
        panel.add(sellButton);
        panel.add(reportButton);
        panel.add(exitButton);

        add(panel);
    }

    public static void main(String[] arge) {
        SwingUtilities.invokeLater(() -> {
            new Menu().setVisible(true);
        });
    }
    
}
