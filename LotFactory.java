/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author acer nitro v 15
 */
public class LotFactory {
    
    public static Lot createLot(int id, double size, double price, String location, String status) {
        
        Lot lot = new Lot();
        
        
        lot.setId(id);
        lot.setSize(size);
        lot.setPrice(price);
        lot.setLocation(location);
        lot.setStatus(status);
        
        
        return lot;
    }
}
