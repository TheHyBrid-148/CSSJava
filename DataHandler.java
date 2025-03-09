import java.io.*;

public class DataHandler {
    public void saveData(Subdivision subdivision, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(subdivision);
            System.out.println("Data saved successfully to " + filename);
        } catch (IOException e) {
            System.err.println("Error saving data: " + e.getMessage());
        }
    }

    public Subdivision loadData(String filename) {
        Subdivision subdivision = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            subdivision = (Subdivision) ois.readObject();
            System.out.println("Data loaded successfully from " + filename);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error loading data: " + e.getMessage());
        }
        return subdivision;
    }
}
