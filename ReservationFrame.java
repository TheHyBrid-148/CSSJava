import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReservationFrame extends JFrame {
    private JTextField lotIdField;
    private JButton reserveButton;
    private JTextArea resultArea;
    private Subdivision subdivision;

    public ReservationFrame(Subdivision subdivision) {
        this.subdivision = subdivision;
        setTitle("Reserve a Lot");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1, 10, 10));

        lotIdField = new JTextField();
        reserveButton = new JButton("Reserve Lot");
        resultArea = new JTextArea();
        resultArea.setEditable(false);

        reserveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reserveLot();
            }
        });

        panel.add(new JLabel("Enter Lot ID to Reserve:"));
        panel.add(lotIdField);
        panel.add(reserveButton);
        
        add(panel, BorderLayout.NORTH);
        add(new JScrollPane(resultArea), BorderLayout.CENTER);
    }

    private void reserveLot() {
        try {
            int lotId = Integer.parseInt(lotIdField.getText());
            Lot lot = subdivision.searchLot(lotId);
            if (lot != null && lot.getStatus().equalsIgnoreCase("available")) {
                lot.setStatus("reserved");
                resultArea.setText("Lot " + lotId + " has been reserved successfully.");
            } else {
                resultArea.setText("Lot not found or already reserved/sold.");
            }
        } catch (NumberFormatException ex) {
            resultArea.setText("Please enter a valid lot ID.");
        }
    }
}
