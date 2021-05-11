/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package departemen;

/**
 *
 * @author ACER
 */
public class Departemen {
    String nama;
    String alamat;
    String noTelepon;
    
    public Departemen(){
    }
    
    public Departemen(String nama, String alamat, String noTelepon){
        this.nama = nama;
        this.alamat = alamat;
        this.noTelepon = noTelepon;
    }
    
    public void nama(String nama){
        this.nama = nama;
    }
    
    
    public void alamat(String alamat){
        this.alamat = alamat;
    }
    
    
    public void noTelepon(String noTelepon){
        this.noTelepon = noTelepon;
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Transaksi transaksi = new Transaksi();
        Karyawan karyawan = new Karyawan();
        Pembeli pembeli = new Pembeli();
        Sedan sedan = new Sedan();
        Minibus minibus = new Minibus();
        
    
        
        transaksi.nomorTransaksi(674385936);
        karyawan.kodeKaryawan("AA890");
        karyawan.nama("Didi Setiadi");
        karyawan.alamat("Semarang");
        karyawan.noTelepon("081785934934");
        pembeli.addPembeliIndividu("Adnan Husein");
        System.out.println("Nama Pembeli            : " +pembeli.pembeliIndividu.get(0));
        pembeli.alamat("Semarang");
        pembeli.noTelepon("089448225769");
        sedan.kodeProduk();
        sedan.namaProduk();
        transaksi.jumlahProduk(1);
        transaksi.hargaProduk(315000000);
        transaksi.totalHarga();
        transaksi.bonusKaryawan();
        System.out.println("");
        
        transaksi.nomorTransaksi(674385937);
        karyawan.kodeKaryawan("KO677");
        karyawan.nama("Aprillia Mia");
        karyawan.alamat("Semarang");
        karyawan.noTelepon("082786356480");
        pembeli.addPembeliBorongan("Agam Travel");
        System.out.println("Nama Pembeli            : " +pembeli.pembeliBorongan.get(0));
        pembeli.alamat("Kudus");
        pembeli.noTelepon("081356542970");
        minibus.kodeProduk();
        minibus.namaProduk();
        transaksi.jumlahProduk(5);
        transaksi.hargaProduk(398000000);
        transaksi.totalHarga();
        transaksi.bonusKaryawan();
        System.out.println("");
        
        transaksi.nomorTransaksi(674385937);
        karyawan.kodeKaryawan("AA890");
        karyawan.nama("Didi Setiadi");
        karyawan.alamat("Semarang");
        karyawan.noTelepon("081785934934");
        pembeli.addPembeliIndividu("Amanda Jida");
        System.out.println("Nama Pembeli            : " +pembeli.pembeliIndividu.get(1));
        pembeli.alamat("Demak");
        pembeli.noTelepon("082485098167");
        sedan.kodeProduk();
        sedan.namaProduk();
        transaksi.jumlahProduk(1);
        transaksi.hargaProduk(315000000);
        transaksi.totalHarga();
        transaksi.bonusKaryawan();
        System.out.println("");
        
        transaksi.nomorTransaksi(674385937);
        karyawan.kodeKaryawan("KO677");
        karyawan.nama("Aprillia Mia");
        karyawan.alamat("Semarang");
        karyawan.noTelepon("082786356480");
        pembeli.addPembeliBorongan("Harapan Jaya");
        System.out.println("Nama Pembeli            : " +pembeli.pembeliBorongan.get(1));
        pembeli.alamat("Semarang");
        pembeli.noTelepon("087394527092");
        minibus.kodeProduk();
        minibus.namaProduk();
        transaksi.jumlahProduk(3);
        transaksi.hargaProduk(1750000000);
        transaksi.totalHarga();
        transaksi.bonusKaryawan();
        System.out.println("");
        
        pembeli.getAllPembeliIndividu();
        pembeli.getAllPembeliBorongan();
    }
    
}
