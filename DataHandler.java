import java.io.*;

public class DataHandler {
    public void saveData(Subdivision subdivision, String filePath) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(subdivision); 
            System.out.println("Data saved successfully to " + filePath);
        } catch (IOException e) {
            System.err.println("Error saving data: " + e.getMessage());
        }
    }

    public Subdivision loadData(String filePath) {
        Subdivision subdivision = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            subdivision = (Subdivision) ois.readObject(); 
            System.out.println("Data loaded successfully from " + filePath);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error loading data: " + e.getMessage());
        }
        return subdivision;
    }
}
