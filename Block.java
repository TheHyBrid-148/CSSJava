/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author acer nitro v 15
 */
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author acer nitro v 15
 */
public class Block {
    private int blockNumber; 
    private List<Lot> lots;  

    
    public Block(int blockNumber) {
        this.blockNumber = blockNumber;
        this.lots = new ArrayList<>();
    }

    
    public int getBlockNumber() {
        return blockNumber;
    }

    
    public void setBlockNumber(int blockNumber) {
        this.blockNumber = blockNumber;
    }

    
    public List<Lot> getLots() {
        return lots;
    }

    
    public void setLots(List<Lot> lots) {
        this.lots = (lots != null) ? lots : new ArrayList<>(); 
        if (this.lots.isEmpty()) {
            for (int i = 0; i < 20; i++) {
                
                Lot newLot = LotFactory.createLot(101 + i, 500.0, 100000.0, "Unknown", "Available");
                this.lots.add(newLot); 
            }
        }
    }

    
    public void addLot(int id, double size, double price, String location, String status) {
        
        Lot newLot = LotFactory.createLot(id, size, price, location, status);
        if (newLot != null) {
            lots.add(newLot);
            System.out.println("Lot " + newLot.getId() + " added to Block " + blockNumber);
        } else {
            System.out.println("Cannot add a null lot.");
        }
    }

    
    public void sellLot(int id) {
        for (Lot lot : lots) {
            if (lot.getId() == id) {
                if (!lot.getStatus().equalsIgnoreCase("sold")) {
                    lot.setStatus("sold");
                    System.out.println("Lot " + id + " in Block " + blockNumber + " has been sold.");
                } else {
                    System.out.println("Lot " + id + " is already sold.");
                }
                return;
            }
        }
        System.out.println("Lot " + id + " not found in Block " + blockNumber);
    }

    
    public void reserveLot(int id) {
        for (Lot lot : lots) {
            if (lot.getId() == id) {
                if (!lot.getStatus().equalsIgnoreCase("reserved")) {
                    lot.setStatus("reserved");
                    System.out.println("Lot " + id + " in Block " + blockNumber + " has been reserved.");
                } else {
                    System.out.println("Lot " + id + " is already reserved.");
                }
                return;
            }
        }
        System.out.println("Lot " + id + " not found in Block " + blockNumber);
    }
}
    
