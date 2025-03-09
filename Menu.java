package gui;

import javax.swing.*;
import java.awt.*;

public class Menu extends JFrame {
    public Menu() {
        setTitle("Real Estate Sales & Management System");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("Real Estate Sales & Management System", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        add(titleLabel, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JButton searchButton = new JButton("Search Lots");
        JButton reserveButton = new JButton("Reserve a Lot");
        JButton sellButton = new JButton("Sell a Lot");
        JButton reportButton = new JButton("View Reports");
        JButton registerButton = new JButton("Register");
        JButton exitButton = new JButton("Exit");

        searchButton.setFont(new Font("Arial", Font.PLAIN, 14));
        reserveButton.setFont(new Font("Arial", Font.PLAIN, 14));
        sellButton.setFont(new Font("Arial", Font.PLAIN, 14));
        reportButton.setFont(new Font("Arial", Font.PLAIN, 14));
        registerButton.setFont(new Font("Arial", Font.PLAIN, 14));
        exitButton.setFont(new Font("Arial", Font.PLAIN, 14));

        searchButton.addActionListener(e -> new Search().setVisible(true));
        reserveButton.addActionListener(e -> new Reserver().setVisible(true));
        sellButton.addActionListener(e -> new Sales().setVisible(true));
        reportButton.addActionListener(e -> new Report().setVisible(true));
        registerButton.addActionListener(e -> new Register().setVisible(true));
        exitButton.addActionListener(e -> System.exit(0));

        panel.add(searchButton);
        panel.add(reserveButton);
        panel.add(sellButton);
        panel.add(reportButton);
        panel.add(registerButton);
        panel.add(exitButton);

        add(panel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Menu().setVisible(true);
        });
    }
    
}
