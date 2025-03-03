/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyLib;

/**
 *
 * @author kento
 */
public class User {
    private String name;
    private String userType;

    public User(String name, String userType) {
        this.name = name;
        this.userType = userType;
    }

    public Lot searchLot(int id) {
        // Placeholder implementation
        System.out.println("Searching for lot with ID: " + id);
        return new Lot(id); // Assuming Lot has a constructor that takes an ID
    }

    public void reserveLot(int id) {
        // Placeholder implementation
        System.out.println("Reserving lot with ID: " + id);
    }

    // Getters and setters (if needed)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}

// Assuming a Lot class exists
class Lot {
    private int id;

    public Lot(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
