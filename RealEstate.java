import javax.swing.*;

public class Main {
    private Subdivision subdivision;
    private LotManager lotManager;
    private ReportGenerator reportGenerator;
    private DataHandler dataHandler;

    public Main() {
        subdivision = new Subdivision();
        lotManager = new LotManager(subdivision);
        reportGenerator = new ReportGenerator(subdivision);
        dataHandler = new DataHandler();
    }

    public void launchGUI() {
        SwingUtilities.invokeLater(() -> {
            new MainMenuFrame().setVisible(true);
        });
    }

    public static void main(String[] args) {
        Main app = new Main();
        app.launchGUI();
    }
}
