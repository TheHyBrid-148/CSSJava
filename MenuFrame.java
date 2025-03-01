import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuFrame extends JFrame {

    public MenuFrame() {
        setTitle("Real Estate Management System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1, 10, 10)); 

        JButton searchButton = new JButton("Search Lots");
        JButton reserveButton = new JButton("Reserve Lot");
        JButton sellButton = new JButton("Sell Lot");
        JButton reportsButton = new JButton("Generate Reports");

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SearchFrame().setVisible(true); 
            }
        });

        reserveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ReservationFrame().setVisible(true); 
            }
        });

        sellButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SalesFrame().setVisible(true);
            }
        });

        reportsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ReportFrame().setVisible(true); 
            }
        });

        panel.add(searchButton);
        panel.add(reserveButton);
        panel.add(sellButton);
        panel.add(reportsButton);

        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MenuFrame();
            }
        });
    }
}