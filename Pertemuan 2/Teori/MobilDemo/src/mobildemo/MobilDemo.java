/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobildemo;

class Mobil {
    String warna;
    int tahunProduksi;
    boolean hidup;
    boolean mati;
    int gigi;

    void hidupkanMobil() {
        hidup = true;
        System.out.println("Mobil nyala : "+hidup);
    }
    
    void matikanMobil() {
        mati = false;
        System.out.println("Mobil nyala : "+mati);
    }
    
    void ubahGigi(int newGigi) {
        gigi = newGigi;
        System.out.println("Gigi : "+gigi);
    }
}

/**
 *
 * @author ACER
 */
public class MobilDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mobil mobilku = new Mobil();
        
        mobilku.warna = "Hitam";
        mobilku.tahunProduksi = 2006;
        System.out.println("Warna : "+mobilku.warna);
        System.out.println("Tahun : "+mobilku.tahunProduksi);
        
        mobilku.hidupkanMobil();
        mobilku.ubahGigi(3);
        mobilku.matikanMobil();     
    }
    
}