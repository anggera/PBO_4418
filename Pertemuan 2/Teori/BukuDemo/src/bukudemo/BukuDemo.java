/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bukudemo;

class Buku {
    String judul, pengarang, penerbit;
    int tahun;
    
    void cetakBuku(String judul, String pengarang, String penerbit, int tahun) {
        System.out.println("Judul \t\t: "+judul);
        System.out.println("Pengarang \t: "+pengarang);
        System.out.println("Penerbit \t: "+penerbit);
        System.out.println("Tahun terbit \t: "+tahun);
    }
}

/**
 *
 * @author ACER
 */
public class BukuDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Buku bukuku = new Buku();
        bukuku.cetakBuku("Pemrograman Berbasis Objek dengan Java", "Indrajani" , "Elexmedia Komputindo", 2007);
        bukuku.cetakBuku("Dasar Pemrograman Java", "Abdul Kadir", "Andi Offset", 2004);
    }
    
}
