import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuFrame extends JFrame {
    private JButton searchButton;
    private JButton reserveButton;
    private JButton sellButton;
    private JButton reportButton;
    private JLabel titleLabel;

    public MenuFrame() {
        setTitle("Real Estate Management System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        titleLabel = new JLabel("Main Menu", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));

        searchButton = new JButton("Search Lot");
        reserveButton = new JButton("Reserve Lot");
        sellButton = new JButton("Sell Lot");
        reportButton = new JButton("Generate Report");

        setLayout(new BorderLayout());
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 1, 10, 10)); 

        buttonPanel.add(searchButton);
        buttonPanel.add(reserveButton);
        buttonPanel.add(sellButton);
        buttonPanel.add(reportButton);

        add(titleLabel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openSearchFrame();
            }
        });

        reserveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openReservationFrame();
            }
        });

        sellButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openSalesFrame();
            }
        });

        reportButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openReportFrame();
            }
        });
    }

    private void openSearchFrame() {
        SearchFrame searchFrame = new SearchFrame();
        searchFrame.setVisible(true);
        this.dispose(); 
    }

    private void openReservationFrame() {
        ReservationFrame reservationFrame = new ReservationFrame();
        reservationFrame.setVisible(true);
        this.dispose(); 
    }

    private void openSalesFrame() {
        SalesFrame salesFrame = new SalesFrame();
        salesFrame.setVisible(true);
        this.dispose(); 
    }

    private void openReportFrame() {
        ReportFrame reportFrame = new ReportFrame();
        reportFrame.setVisible(true);
        this.dispose(); 
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MenuFrame menuFrame = new MenuFrame();
                menuFrame.setVisible(true);
            }
        });
    }
}
