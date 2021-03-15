/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematikademo;

class Matematika {
    int angka1, angka2;
    int tambah, kurang, kali, bagi;
    
    void pertambahan(int angka1, int angka2) {
        tambah = angka1 + angka2;
        System.out.println("Hasil pertambahan = " +tambah);
    }
    
    void pengurangan(int angka1, int angka2) {
        kurang = angka1 - angka2;
        System.out.println("Hasil pengurangan = "+kurang);
    }
    
    void perkalian(int angka1, int angka2) {
        kali = angka1 * angka2;
        System.out.println("Hasil perkalian = "+kali);
    }
    
    void pembagian(int angka1, int angka2) {
        bagi = angka1 / angka2;
        System.out.println("Hasil pembagian = "+bagi);
    }
}


/**
 *
 * @author ACER
 */
public class MatematikaDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Matematika mat = new Matematika();
        
        mat.pertambahan(10, 10);
        mat.pengurangan(10, 5);
        mat.perkalian(10, 20);
        mat.pembagian(20, 2);
    }
    
}
