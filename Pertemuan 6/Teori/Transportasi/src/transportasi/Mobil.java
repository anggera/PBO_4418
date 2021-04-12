/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportasi;

/**
 *
 * @author ACER
 */
public class Mobil {
    private boolean seatbelt = false;
    
    public Mobil () {
    }
    
    public void setSeatBelt(boolean seatbelt) {
        this.seatbelt = seatbelt;
    }
    
    public boolean getSeatBelt() {
        return seatbelt;
    }
}
