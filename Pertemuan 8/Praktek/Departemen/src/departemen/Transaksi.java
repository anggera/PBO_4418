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
public class Transaksi{
    int nomorTransaksi;
    int jumlahProduk;
    int hargaProduk;
    int total;
    int bonusKaryawan;
    
    public Transaksi(){
    }
    
    public Transaksi(int jumlahProduk, int hargaProduk,int bonusKaryawan, int total){
        this.jumlahProduk = jumlahProduk;
        this.hargaProduk = hargaProduk;
        this.bonusKaryawan = bonusKaryawan;
        this.total = total;
    }
    
    public void nomorTransaksi(int nomorTransaksi){
        this.nomorTransaksi = nomorTransaksi;
        System.out.println("No. Transaksi           : " +nomorTransaksi);
    }
    
    public void jumlahProduk(int jumlahProduk){
        this.jumlahProduk = jumlahProduk;
        System.out.println("Jumlah produk           : " +jumlahProduk);
    }
    
    public void hargaProduk(int hargaProduk){
        this.hargaProduk = hargaProduk;
        System.out.println("Harga Produk            : Rp " +hargaProduk);
    }
    
    public void totalHarga(){
        total = (hargaProduk * jumlahProduk);
        System.out.println("Total Harga             : Rp " +total);
    }
    
    public void bonusKaryawan(){
        bonusKaryawan = (total * 1 / 10);
        System.out.println("Bonus karyawan          : Rp " +bonusKaryawan);   
    }
    

}
