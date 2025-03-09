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
        System.out.println("Searching for lot with ID: " + id);
        return new Lot(id); 
    }

    public void reserveLot(int id) {
        System.out.println("Reserving lot with ID: " + id);
    }

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

class Lot {
    private int id;

    public Lot(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
